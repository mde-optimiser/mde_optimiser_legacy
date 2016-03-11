package uk.ac.kcl.interpreter

import uk.ac.kcl.mDEOptimise.Optimisation

/**
 * An interpreter for optimisation specifications. This class provides the basic functionality 
 * for interpreting optimisation scripts, but does not actually contain a concrete optimisation 
 * algorithm. Such algorithms are provided separately through a strategy object.
 */
class OptimisationInterpreter {

	/**
	 * The model describing the optimisation problem and evolution operators
	 */
	private Optimisation model
	
	/**
	 * Strategy object for optimisation algorithms. 
	 */
	 //TODO Eventually want to be able to inject this from a launch configuration or similar
	private OptimisationAlgorithm optimisationStrategy

	new(Optimisation model, OptimisationAlgorithm algorithm) {
		this.model = model
		optimisationStrategy = algorithm
	}

	public def void execute() { 
		optimisationStrategy.execute (this)
	}
}