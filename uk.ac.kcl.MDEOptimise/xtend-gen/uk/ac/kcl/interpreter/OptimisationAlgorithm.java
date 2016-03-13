package uk.ac.kcl.interpreter;

import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import uk.ac.kcl.interpreter.OptimisationInterpreter;

/**
 * A specific optimisation algorithm
 */
@SuppressWarnings("all")
public interface OptimisationAlgorithm {
  /**
   * Run the optimisation algorithm and return its results (this may be a single solution or a
   * Pareto set).
   */
  public abstract Set<EObject> execute(final OptimisationInterpreter interpreter);
}
