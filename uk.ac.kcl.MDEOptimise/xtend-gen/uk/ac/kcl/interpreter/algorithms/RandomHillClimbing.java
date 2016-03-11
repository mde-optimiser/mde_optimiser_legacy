package uk.ac.kcl.interpreter.algorithms;

import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;
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
  
  /**
   * The current best solution found
   */
  private EObject currentSolution;
  
  /**
   * The fitness of the current best solution found
   */
  private double currentFitness;
  
  public RandomHillClimbing(final int maxIterations) {
    this.maxIterations = maxIterations;
  }
  
  @Override
  public void execute(final OptimisationInterpreter interpreter) {
    Iterator<EObject> _initialSolutions = interpreter.getInitialSolutions();
    EObject _head = IteratorExtensions.<EObject>head(_initialSolutions);
    this.currentSolution = _head;
    double _fitness = interpreter.fitness(this.currentSolution);
    this.currentFitness = _fitness;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, this.maxIterations, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final EObject candidateSolution = interpreter.evolve(this.currentSolution);
        final double candidateFitness = interpreter.fitness(candidateSolution);
        if ((candidateFitness >= this.currentFitness)) {
          this.currentSolution = candidateSolution;
          this.currentFitness = candidateFitness;
        }
      }
    }
  }
}
