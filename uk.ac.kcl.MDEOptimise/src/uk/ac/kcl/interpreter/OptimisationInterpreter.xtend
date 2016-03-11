package uk.ac.kcl.interpreter

import java.util.Iterator
import org.eclipse.emf.ecore.EObject
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
	
	/**
	 * Strategy for generating initial models
	 */
	//TODO Eventually want to be able to inject this from a launch configuration or similar
	private ModelProvider initalModelProvider

	/**
	 * Cache for the fitness function object
	 */
	private FitnessFunction fitnessFunction = null

	new(Optimisation model, OptimisationAlgorithm algorithm, ModelProvider initalModelProvider) {
		this.model = model
		optimisationStrategy = algorithm
		this.initalModelProvider = initalModelProvider
	}

	public def void execute() { 
		optimisationStrategy.execute (this)
	}
	
	/**
	 * This will produce a lazy iteration of possible initial solutions
	 */
	def Iterator<EObject> getInitialSolutions() {
		initalModelProvider.initialModels(model.metamodel.location)
	}
	
	
	/**
	 * This will compute the fitness for the given candidate solution
	 */
	def double fitness(EObject candidateSolution) {
		if (fitnessFunction == null) {
			val Class<? extends FitnessFunction> fitnessClass = Class.forName(model.getFitness.class_) as Class<? extends FitnessFunction>
			fitnessFunction = fitnessClass.newInstance
		}
		
		fitnessFunction.computeFitness(candidateSolution)
	}
	
	/**
	 * Produce a new solution from the given one using one of the evolvers defined in the optimisation model.
	 */
	def EObject evolve(EObject object) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}