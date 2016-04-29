package uk.ac.kcl.MDEOptimise.tests;

import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import uk.ac.kcl.interpreter.ModelProvider;
import uk.ac.kcl.interpreter.OptimisationInterpreter;
import uk.ac.kcl.interpreter.algorithms.RandomHillClimbing;
import uk.ac.kcl.mDEOptimise.Optimisation;

@SuppressWarnings("all")
public class PaperSample {
  public Set<EObject> runSearch(final Optimisation model, final ModelProvider mp) {
    RandomHillClimbing _randomHillClimbing = new RandomHillClimbing(10);
    final OptimisationInterpreter interpreter = new OptimisationInterpreter(model, _randomHillClimbing, mp);
    return interpreter.execute();
  }
}
