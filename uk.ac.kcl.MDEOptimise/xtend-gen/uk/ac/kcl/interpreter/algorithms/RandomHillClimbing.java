package uk.ac.kcl.interpreter.algorithms;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import uk.ac.kcl.interpreter.OptimisationAlgorithm;
import uk.ac.kcl.interpreter.OptimisationInterpreter;

/**
 * A strategy implementing random hill climbing over models.
 */
@SuppressWarnings("all")
public class RandomHillClimbing implements OptimisationAlgorithm {
  /**
   * Maximum number of iterations to run for
   */
  private int maxIterations;
  
  public RandomHillClimbing(final int maxIterations) {
    this.maxIterations = maxIterations;
  }
  
  @Override
  public Set<EObject> execute(final OptimisationInterpreter interpreter) {
    Set<EObject> _xblockexpression = null;
    {
      Iterator<EObject> _initialSolutions = interpreter.getInitialSolutions();
      EObject currentSolution = IteratorExtensions.<EObject>head(_initialSolutions);
      double currentFitness = interpreter.fitness(currentSolution);
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, this.maxIterations, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          final EObject candidateSolution = interpreter.evolve(currentSolution);
          final double candidateFitness = interpreter.fitness(candidateSolution);
          if ((candidateFitness >= currentFitness)) {
            currentSolution = candidateSolution;
            currentFitness = candidateFitness;
          }
        }
      }
      _xblockexpression = Collections.<EObject>unmodifiableSet(CollectionLiterals.<EObject>newHashSet(currentSolution));
    }
    return _xblockexpression;
  }
}
