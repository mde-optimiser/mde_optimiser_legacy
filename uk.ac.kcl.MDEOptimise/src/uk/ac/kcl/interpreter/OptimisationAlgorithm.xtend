package uk.ac.kcl.interpreter

/**
 * A specific optimisation algorithm
 */
interface OptimisationAlgorithm {
	
	/**
	 * Produce an initial population
	 */
	def Population initialPopulation(OptimisationInterpreter interpreter)
	
	/**
	 * Return true if the algorithm should run for another generation
	 */
	def boolean runAgain()
	
	/**
	 * Compute the next generation, given the current generation population.
	 * 
	 * @param currentGeneration the current generation from which to produce the new generation
	 * @param interpreter the model interpreter providing callbacks for computing new individuals 
	 *                    and for computing fitness.
	 */	
	def Population computeNextGeneration(Population currentGeneration,
										 OptimisationInterpreter interpreter)
	
	
}