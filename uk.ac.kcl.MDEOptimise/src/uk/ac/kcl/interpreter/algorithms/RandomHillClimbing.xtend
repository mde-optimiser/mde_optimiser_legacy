package uk.ac.kcl.interpreter.algorithms

import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.interpreter.OptimisationAlgorithm
import uk.ac.kcl.interpreter.OptimisationInterpreter

/**
 * A strategy implementing random hill climbing over models.
 */
class RandomHillClimbing implements OptimisationAlgorithm {
	
	/**
	 * Maximum number of iterations to run for
	 */
	private int maxIterations
	
	/**
	 * The current best solution found
	 */
	private EObject currentSolution
	
	/**
	 * The fitness of the current best solution found
	 */
	private double currentFitness
	
	public new (int maxIterations) {
		this.maxIterations = maxIterations
	}
	
	override execute(OptimisationInterpreter interpreter) {
		currentSolution = interpreter.initialSolutions.head
		currentFitness = interpreter.fitness (currentSolution) 
		
		for (i: 0 ..< maxIterations) {
			val candidateSolution = interpreter.evolve (currentSolution)
			val candidateFitness = interpreter.fitness (candidateSolution)
			if (candidateFitness >= currentFitness) {
				currentSolution = candidateSolution
				currentFitness = candidateFitness
			}
		}
	}
}