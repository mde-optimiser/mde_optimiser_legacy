package uk.ac.kcl.interpreter;

import uk.ac.kcl.interpreter.OptimisationInterpreter;

/**
 * A specific optimisation algorithm
 */
@SuppressWarnings("all")
public interface OptimisationAlgorithm {
  /**
   * Run the optimisation algorithm
   */
  public abstract void execute(final OptimisationInterpreter interpreter);
}
