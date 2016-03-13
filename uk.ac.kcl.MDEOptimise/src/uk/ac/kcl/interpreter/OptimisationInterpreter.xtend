package uk.ac.kcl.interpreter

import java.util.ArrayList
import java.util.Iterator
import java.util.List
import java.util.Random
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl
import org.eclipse.emf.henshin.model.Unit
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet
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
	// TODO Eventually want to be able to inject this from a launch configuration or similar
	private OptimisationAlgorithm optimisationStrategy

	/**
	 * Strategy for generating initial models
	 */
	// TODO Eventually want to be able to inject this from a launch configuration or similar
	private ModelProvider initalModelProvider

	private HenshinResourceSet henshinResourceSet = null

	private EPackage theMetamodel = null
	
	/**
	 * The list of Henshin rules used as evolvers
	 */
	private List<Unit> henshinEvolvers = null

	/**
	 * Cache for the fitness function object
	 */
	private FitnessFunction fitnessFunction = null

	new(Optimisation model, OptimisationAlgorithm algorithm, ModelProvider initalModelProvider) {
		this.model = model
		optimisationStrategy = algorithm
		this.initalModelProvider = initalModelProvider
	}

	public def execute() {
		optimisationStrategy.execute(this)
	}

	/**
	 * This will produce a lazy iteration of possible initial solutions
	 */
	def Iterator<EObject> getInitialSolutions() {
		initalModelProvider.initialModels(metamodel)
	}

	/**
	 * This will compute the fitness for the given candidate solution
	 */
	def double fitness(EObject candidateSolution) {
		if (fitnessFunction == null) {
			val Class<? extends FitnessFunction> fitnessClass = Class.forName(
				model.getFitness.class_) as Class<? extends FitnessFunction>
			fitnessFunction = fitnessClass.newInstance
		}

		fitnessFunction.computeFitness(candidateSolution)
	}

	/**
	 * Produce a new solution from the given one using one of the evolvers defined in the optimisation model. 
	 * This will try evolvers until one of them can be applied or all evolvers have been tried. If no evolver was applicable, returns <code>null</code>, 
	 * otherwise returns the result of the first randomly picked evolver that was applicable. 
	 */
	def EObject evolve(EObject object) {
		// Extract Henshin evolvers if necessary
		if (henshinEvolvers == null) {
			val hrs = resourceSet
			henshinEvolvers = model.evolvers.map [ e |
				hrs.getModule(URI.createURI(e.rule_location), false).getUnit(e.unit) 
			]
		}

		// Make a copy of the evolvers list so that we can keep track of which evolvers we have already tried.
		val evolversToTry = new ArrayList(henshinEvolvers.toList)
		
		do {
			// 1. Pick an evolver
			val evolver = evolversToTry.remove(new Random().nextInt(evolversToTry.size))
			
			// 2. Make a copy of the current candidate solution
			// Doing this here just in case unsuccessfully applying an evolver has already made changes
			val candidateSolution = EcoreUtil.copy (object)
			
			// 3. Apply the transformation
			// TODO: Some of these objects we may actually be able to reuse across evolver calls.
			val graph = new EGraphImpl(candidateSolution)
			val engine = new EngineImpl
			val runner = new UnitApplicationImpl(engine)
			runner.EGraph = graph
			
			runner.unit = evolver
			if (runner.execute(null)) {
				// 4. Return the transformed solution
				return graph.roots.head
			}	
		} while (!evolversToTry.empty)
		
		// We didn't find any applicable evolvers...
		null
	}

	def getResourceSet() {
		if (henshinResourceSet == null) {
			henshinResourceSet = new HenshinResourceSet(model.basepath.location)
		}
		
		henshinResourceSet
	}
	
	def getMetamodel() {
		if (theMetamodel == null) {
			theMetamodel = resourceSet.registerDynamicEPackages(model.metamodel.location).head
		}
		
		theMetamodel
	}
}