package uk.ac.kcl.interpreter

/**
 * A specific optimisation algorithm
 */
interface OptimisationAlgorithm {
	
	/**
	 * Run the optimisation algorithm
	 */
	def void execute(OptimisationInterpreter interpreter)
}