package uk.ac.kcl.interpreter;

import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;
import uk.ac.kcl.interpreter.OptimisationAlgorithm;
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
  
  public OptimisationInterpreter(final Optimisation model, final OptimisationAlgorithm algorithm) {
    this.model = model;
    this.optimisationStrategy = algorithm;
  }
  
  public void execute() {
    this.optimisationStrategy.execute(this);
  }
  
  /**
   * This will produce a lazy iteration of possible initial solutions
   */
  public Iterator<EObject> getInitialSolutions() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  /**
   * This will compute the fitness for the given candidate solution
   */
  public double fitness(final EObject candidateSolution) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  /**
   * Produce a new solution from the given one using one of the evolvers defined in the optimisation model.
   */
  public EObject evolve(final EObject object) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
