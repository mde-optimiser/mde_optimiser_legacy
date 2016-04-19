package uk.ac.kcl.interpreter.algorithms;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import uk.ac.kcl.interpreter.OptimisationAlgorithm;
import uk.ac.kcl.interpreter.OptimisationInterpreter;

/**
 * A strategy implementing random hill climbing over models.
 * This is single objective only, using only the objective function named first in the specification.
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
      List<Double> _fitness = interpreter.fitness(currentSolution);
      Double currentFitness = IterableExtensions.<Double>head(_fitness);
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, this.maxIterations, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          final EObject candidateSolution = interpreter.evolve(currentSolution);
          List<Double> _fitness_1 = interpreter.fitness(candidateSolution);
          final Double candidateFitness = IterableExtensions.<Double>head(_fitness_1);
          boolean _greaterEqualsThan = (candidateFitness.compareTo(currentFitness) >= 0);
          if (_greaterEqualsThan) {
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
