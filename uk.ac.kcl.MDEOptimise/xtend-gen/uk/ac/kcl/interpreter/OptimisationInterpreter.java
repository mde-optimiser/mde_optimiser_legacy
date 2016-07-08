package uk.ac.kcl.interpreter;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
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
  private List<FitnessFunction> fitnessFunctions = null;
  
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
  public List<Double> fitness(final EObject candidateSolution) {
    List<Double> _xblockexpression = null;
    {
      boolean _equals = Objects.equal(candidateSolution, null);
      if (_equals) {
        throw new NullPointerException();
      }
      boolean _equals_1 = Objects.equal(this.fitnessFunctions, null);
      if (_equals_1) {
        EList<FitnessFunctionSpec> _fitness = this.model.getFitness();
        final Function1<FitnessFunctionSpec, FitnessFunction> _function = (FitnessFunctionSpec f) -> {
          try {
            FitnessFunction _xblockexpression_1 = null;
            {
              String _class_ = f.getClass_();
              Class<?> _forName = Class.forName(_class_);
              final Class<? extends FitnessFunction> fitnessClass = ((Class<? extends FitnessFunction>) _forName);
              _xblockexpression_1 = fitnessClass.newInstance();
            }
            return _xblockexpression_1;
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        List<FitnessFunction> _map = ListExtensions.<FitnessFunctionSpec, FitnessFunction>map(_fitness, _function);
        LinkedList<FitnessFunction> _linkedList = new LinkedList<FitnessFunction>(_map);
        this.fitnessFunctions = _linkedList;
      }
      final Function1<FitnessFunction, Double> _function_1 = (FitnessFunction f) -> {
        return Double.valueOf(f.computeFitness(candidateSolution));
      };
      _xblockexpression = ListExtensions.<FitnessFunction, Double>map(this.fitnessFunctions, _function_1);
    }
    return _xblockexpression;
  }
  
  /**
   * The single instance of the Henshin engine we are going to use throughout.
   */
  private final static EngineImpl engine = new EngineImpl();
  
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
        ArrayList<Unit> _arrayList = new ArrayList<Unit>(_map);
        this.henshinEvolvers = _arrayList;
      }
      final EObject candidateSolution = EcoreUtil.<EObject>copy(object);
      final EGraphImpl graph = new EGraphImpl(candidateSolution);
      final Function1<Unit, Iterable<Pair<Rule, Match>>> _function_1 = (Unit evolver) -> {
        Iterable<Match> _findMatches = OptimisationInterpreter.engine.findMatches(((Rule) evolver), graph, null);
        final Function1<Match, Pair<Rule, Match>> _function_2 = (Match m) -> {
          return new Pair<Rule, Match>(((Rule) evolver), m);
        };
        return IterableExtensions.<Match, Pair<Rule, Match>>map(_findMatches, _function_2);
      };
      List<Iterable<Pair<Rule, Match>>> _map_1 = ListExtensions.<Unit, Iterable<Pair<Rule, Match>>>map(this.henshinEvolvers, _function_1);
      final Iterable<Pair<Rule, Match>> matches = Iterables.<Pair<Rule, Match>>concat(_map_1);
      boolean _isEmpty = IterableExtensions.isEmpty(matches);
      boolean _not = (!_isEmpty);
      if (_not) {
        Random _random = new Random();
        int _size = IterableExtensions.size(matches);
        int _nextInt = _random.nextInt(_size);
        final Pair<Rule, Match> matchToUse = ((Pair<Rule, Match>[])Conversions.unwrapArray(matches, Pair.class))[_nextInt];
        final RuleApplicationImpl runner = new RuleApplicationImpl(OptimisationInterpreter.engine);
        runner.setEGraph(graph);
        Rule _key = matchToUse.getKey();
        runner.setUnit(_key);
        Match _value = matchToUse.getValue();
        runner.setPartialMatch(_value);
        boolean _execute = runner.execute(null);
        if (_execute) {
          List<EObject> _roots = graph.getRoots();
          return IterableExtensions.<EObject>head(_roots);
        }
      }
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
  
  /**
   * Pareto-rank the provided solutions and return at most targetPopulationSize many starting with the top ranked ones.
   */
  public Pair<List<EObject>, List<List<Double>>> getTopRanked(final int targetPopulationSize, final List<EObject> solutions, final List<List<Double>> fitnesses) {
    Pair<List<EObject>, List<List<Double>>> _xblockexpression = null;
    {
      final HashMap<EObject, List<EObject>> dominators = new HashMap<EObject, List<EObject>>();
      final Procedure2<EObject, Integer> _function = (EObject s, Integer idx) -> {
        LinkedList<EObject> _linkedList = new LinkedList<EObject>();
        dominators.put(s, _linkedList);
        final Procedure2<EObject, Integer> _function_1 = (EObject s2, Integer idx2) -> {
          List<Double> _get = fitnesses.get((idx2).intValue());
          List<Double> _get_1 = fitnesses.get((idx).intValue());
          boolean _dominates = this.dominates(_get, _get_1);
          if (_dominates) {
            List<EObject> _get_2 = dominators.get(s);
            _get_2.add(s2);
          }
        };
        IterableExtensions.<EObject>forEach(solutions, _function_1);
      };
      IterableExtensions.<EObject>forEach(solutions, _function);
      LinkedList<EObject> _linkedList = new LinkedList<EObject>();
      LinkedList<List<Double>> _linkedList_1 = new LinkedList<List<Double>>();
      final Pair<List<EObject>, List<List<Double>>> tentativeResult = new Pair<List<EObject>, List<List<Double>>>(_linkedList, _linkedList_1);
      int _size = solutions.size();
      final int adjustedTgtSize = Math.min(targetPopulationSize, _size);
      while ((tentativeResult.getKey().size() < adjustedTgtSize)) {
        {
          Set<EObject> _keySet = dominators.keySet();
          final Function1<EObject, Boolean> _function_1 = (EObject cs) -> {
            List<EObject> _get = dominators.get(cs);
            int _size_1 = _get.size();
            return Boolean.valueOf((_size_1 == 0));
          };
          Iterable<EObject> _filter = IterableExtensions.<EObject>filter(_keySet, _function_1);
          final List<EObject> undominatedSolutions = IterableExtensions.<EObject>toList(_filter);
          final Consumer<EObject> _function_2 = (EObject s) -> {
            dominators.remove(s);
          };
          undominatedSolutions.forEach(_function_2);
          Collection<List<EObject>> _values = dominators.values();
          final Consumer<List<EObject>> _function_3 = (List<EObject> lDominators) -> {
            lDominators.removeAll(undominatedSolutions);
          };
          _values.forEach(_function_3);
          List<EObject> _key = tentativeResult.getKey();
          List<EObject> _key_1 = tentativeResult.getKey();
          int _size_1 = _key_1.size();
          int _minus = (adjustedTgtSize - _size_1);
          Iterable<EObject> _take = IterableExtensions.<EObject>take(undominatedSolutions, _minus);
          Iterables.<EObject>addAll(_key, _take);
          List<List<Double>> _value = tentativeResult.getValue();
          final Function1<EObject, List<Double>> _function_4 = (EObject cs) -> {
            int _indexOf = solutions.indexOf(cs);
            return fitnesses.get(_indexOf);
          };
          List<List<Double>> _map = ListExtensions.<EObject, List<Double>>map(undominatedSolutions, _function_4);
          List<List<Double>> _value_1 = tentativeResult.getValue();
          int _size_2 = _value_1.size();
          int _minus_1 = (adjustedTgtSize - _size_2);
          Iterable<List<Double>> _take_1 = IterableExtensions.<List<Double>>take(_map, _minus_1);
          Iterables.<List<Double>>addAll(_value, _take_1);
        }
      }
      _xblockexpression = tentativeResult;
    }
    return _xblockexpression;
  }
  
  /**
   * Check domination between two fitness vectors. Returns true if fitness1 dominates fitness2
   */
  public boolean dominates(final List<Double> fitness1, final List<Double> fitness2) {
    boolean _and = false;
    int _size = fitness1.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    final Function1<Integer, Boolean> _function = (Integer i) -> {
      Double _get = fitness1.get((i).intValue());
      Double _get_1 = fitness2.get((i).intValue());
      return Boolean.valueOf((_get.compareTo(_get_1) >= 0));
    };
    boolean _forall = IterableExtensions.<Integer>forall(_doubleDotLessThan, _function);
    if (!_forall) {
      _and = false;
    } else {
      int _size_1 = fitness1.size();
      ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
      final Function1<Integer, Boolean> _function_1 = (Integer i) -> {
        Double _get = fitness1.get((i).intValue());
        Double _get_1 = fitness2.get((i).intValue());
        return Boolean.valueOf((_get.compareTo(_get_1) > 0));
      };
      boolean _exists = IterableExtensions.<Integer>exists(_doubleDotLessThan_1, _function_1);
      _and = _exists;
    }
    return _and;
  }
}
