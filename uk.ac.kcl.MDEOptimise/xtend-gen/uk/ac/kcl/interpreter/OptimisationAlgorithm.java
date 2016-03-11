package uk.ac.kcl.interpreter;

import uk.ac.kcl.interpreter.OptimisationInterpreter;
import uk.ac.kcl.interpreter.Population;

/**
 * A specific optimisation algorithm
 */
@SuppressWarnings("all")
public interface OptimisationAlgorithm {
  /**
   * Produce an initial population
   */
  public abstract Population initialPopulation(final OptimisationInterpreter interpreter);
  
  /**
   * Return true if the algorithm should run for another generation
   */
  public abstract boolean runAgain();
  
  /**
   * Compute the next generation, given the current generation population.
   * 
   * @param currentGeneration the current generation from which to produce the new generation
   * @param interpreter the model interpreter providing callbacks for computing new individuals
   *                    and for computing fitness.
   */
  public abstract Population computeNextGeneration(final Population currentGeneration, final OptimisationInterpreter interpreter);
}
