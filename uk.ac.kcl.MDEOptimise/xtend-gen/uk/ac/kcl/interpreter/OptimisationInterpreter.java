package uk.ac.kcl.interpreter;

import com.google.common.base.Objects;
import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import uk.ac.kcl.interpreter.FitnessFunction;
import uk.ac.kcl.interpreter.ModelProvider;
import uk.ac.kcl.interpreter.OptimisationAlgorithm;
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
  
  /**
   * Cache for the fitness function object
   */
  private FitnessFunction fitnessFunction = null;
  
  public OptimisationInterpreter(final Optimisation model, final OptimisationAlgorithm algorithm, final ModelProvider initalModelProvider) {
    this.model = model;
    this.optimisationStrategy = algorithm;
    this.initalModelProvider = initalModelProvider;
  }
  
  public void execute() {
    this.optimisationStrategy.execute(this);
  }
  
  /**
   * This will produce a lazy iteration of possible initial solutions
   */
  public Iterator<EObject> getInitialSolutions() {
    MetaModelSpec _metamodel = this.model.getMetamodel();
    String _location = _metamodel.getLocation();
    return this.initalModelProvider.initialModels(_location);
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
   */
  public EObject evolve(final EObject object) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
