package uk.ac.kcl.interpreter;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import uk.ac.kcl.interpreter.FitnessFunction;
import uk.ac.kcl.interpreter.ModelProvider;
import uk.ac.kcl.interpreter.OptimisationAlgorithm;
import uk.ac.kcl.mDEOptimise.BasepathSpec;
import uk.ac.kcl.mDEOptimise.EvolverSpec;
import uk.ac.kcl.mDEOptimise.FitnessFunctionSpec;
import uk.ac.kcl.mDEOptimise.MetaModelSpec;
import uk.ac.kcl.mDEOptimise.Optimisation;

/**
 * An interpreter for optimisation specifications. This class provides the basic functionality
 * for interpreting optimisation scripts, but does not actually contain a concrete optimisation
 * algorithm. Such algorithms are provided separately through a strategy object.
 */
@SuppressWarnings("all")
public class OptimisationInterpreter {
  /**
   * The model describing the optimisation problem and evolution operators
   */
  private Optimisation model;
  
  /**
   * Strategy object for optimisation algorithms.
   */
  private OptimisationAlgorithm optimisationStrategy;
  
  /**
   * Strategy for generating initial models
   */
  private ModelProvider initalModelProvider;
  
  private HenshinResourceSet henshinResourceSet = null;
  
  private EPackage theMetamodel = null;
  
  /**
   * The list of Henshin rules used as evolvers
   */
  private List<Unit> henshinEvolvers = null;
  
  /**
   * Cache for the fitness function object
   */
  private FitnessFunction fitnessFunction = null;
  
  public OptimisationInterpreter(final Optimisation model, final OptimisationAlgorithm algorithm, final ModelProvider initalModelProvider) {
    this.model = model;
    this.optimisationStrategy = algorithm;
    this.initalModelProvider = initalModelProvider;
  }
  
  public Set<EObject> execute() {
    return this.optimisationStrategy.execute(this);
  }
  
  /**
   * This will produce a lazy iteration of possible initial solutions
   */
  public Iterator<EObject> getInitialSolutions() {
    EPackage _metamodel = this.getMetamodel();
    return this.initalModelProvider.initialModels(_metamodel);
  }
  
  /**
   * This will compute the fitness for the given candidate solution
   */
  public double fitness(final EObject candidateSolution) {
    try {
      double _xblockexpression = (double) 0;
      {
        boolean _equals = Objects.equal(this.fitnessFunction, null);
        if (_equals) {
          FitnessFunctionSpec _fitness = this.model.getFitness();
          String _class_ = _fitness.getClass_();
          Class<?> _forName = Class.forName(_class_);
          final Class<? extends FitnessFunction> fitnessClass = ((Class<? extends FitnessFunction>) _forName);
          FitnessFunction _newInstance = fitnessClass.newInstance();
          this.fitnessFunction = _newInstance;
        }
        _xblockexpression = this.fitnessFunction.computeFitness(candidateSolution);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Produce a new solution from the given one using one of the evolvers defined in the optimisation model.
   * This will try evolvers until one of them can be applied or all evolvers have been tried. If no evolver was applicable, returns <code>null</code>,
   * otherwise returns the result of the first randomly picked evolver that was applicable.
   */
  public EObject evolve(final EObject object) {
    Object _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.henshinEvolvers, null);
      if (_equals) {
        final HenshinResourceSet hrs = this.getResourceSet();
        EList<EvolverSpec> _evolvers = this.model.getEvolvers();
        final Function1<EvolverSpec, Unit> _function = (EvolverSpec e) -> {
          String _rule_location = e.getRule_location();
          URI _createURI = URI.createURI(_rule_location);
          Module _module = hrs.getModule(_createURI, false);
          String _unit = e.getUnit();
          return _module.getUnit(_unit);
        };
        List<Unit> _map = ListExtensions.<EvolverSpec, Unit>map(_evolvers, _function);
        this.henshinEvolvers = _map;
      }
      List<Unit> _list = IterableExtensions.<Unit>toList(this.henshinEvolvers);
      final ArrayList<Unit> evolversToTry = new ArrayList<Unit>(_list);
      do {
        {
          Random _random = new Random();
          int _size = evolversToTry.size();
          int _nextInt = _random.nextInt(_size);
          final Unit evolver = evolversToTry.remove(_nextInt);
          final EObject candidateSolution = EcoreUtil.<EObject>copy(object);
          final EGraphImpl graph = new EGraphImpl(candidateSolution);
          final EngineImpl engine = new EngineImpl();
          final UnitApplicationImpl runner = new UnitApplicationImpl(engine);
          runner.setEGraph(graph);
          runner.setUnit(evolver);
          boolean _execute = runner.execute(null);
          if (_execute) {
            List<EObject> _roots = graph.getRoots();
            return IterableExtensions.<EObject>head(_roots);
          }
        }
      } while((!evolversToTry.isEmpty()));
      _xblockexpression = null;
    }
    return ((EObject)_xblockexpression);
  }
  
  public HenshinResourceSet getResourceSet() {
    HenshinResourceSet _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.henshinResourceSet, null);
      if (_equals) {
        BasepathSpec _basepath = this.model.getBasepath();
        String _location = _basepath.getLocation();
        HenshinResourceSet _henshinResourceSet = new HenshinResourceSet(_location);
        this.henshinResourceSet = _henshinResourceSet;
      }
      _xblockexpression = this.henshinResourceSet;
    }
    return _xblockexpression;
  }
  
  public EPackage getMetamodel() {
    EPackage _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.theMetamodel, null);
      if (_equals) {
        HenshinResourceSet _resourceSet = this.getResourceSet();
        MetaModelSpec _metamodel = this.model.getMetamodel();
        String _location = _metamodel.getLocation();
        List<EPackage> _registerDynamicEPackages = _resourceSet.registerDynamicEPackages(_location);
        EPackage _head = IterableExtensions.<EPackage>head(_registerDynamicEPackages);
        this.theMetamodel = _head;
      }
      _xblockexpression = this.theMetamodel;
    }
    return _xblockexpression;
  }
}
