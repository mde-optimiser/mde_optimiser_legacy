package uk.ac.kcl.interpreter;

import org.eclipse.emf.ecore.EObject;

/**
 * This interface defines the contract for fitness functions.
 */
@SuppressWarnings("all")
public interface FitnessFunction {
  /**
   * Return the fitness of the given model. Higher fitness values are better.
   */
  public abstract double computeFitness(final EObject model);
}
