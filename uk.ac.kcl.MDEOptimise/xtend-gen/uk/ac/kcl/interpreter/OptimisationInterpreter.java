package uk.ac.kcl.interpreter;

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
}
