package uk.ac.kcl.interpreter

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
import org.eclipse.emf.henshin.model.Module
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
	private List<Module> henshinEvolvers = null

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
	 */
	def EObject evolve(EObject object) {
		// Extract Henshin evolvers if necessary
		if (henshinEvolvers == null) {
			val hrs = resourceSet
			henshinEvolvers = model.evolvers.map [ e |
				// TODO: I suspect that I should actually be fixing the imports here.
				// However, unfortunately, this is implemented so that it doesn't forgive if no correction is necessary 
				var m = hrs.getModule(URI.createURI(e.rule_location), false)
				// TODO: Not sure I actually need this.
				m.imports.forEach[ep | EcoreUtil.resolveAll(ep)]
				m
			]
		}

		// 1. Pick an evolver
		val evolver = henshinEvolvers.get(new Random().nextInt(henshinEvolvers.size))
		
		// 2. Make a copy of the current candidate solution
		val candidateSolution = EcoreUtil.copy (object)
		
		// 3. Apply the transformation
		val graph = new EGraphImpl(candidateSolution)
		val engine = new EngineImpl
		val runner = new UnitApplicationImpl(engine)
		runner.EGraph = graph
		
		// TODO: Allow unit to be selected from the model. For now we're just taking the first one that we come across
		runner.unit = evolver.units.head
		if (!runner.execute(null)) {
			// TODO: Improve error messages
			// FIXME: Actually, we probably want to try with another evolver unless we have run out of evolvers to try.
			throw new IllegalArgumentException("Error running evolver...")
		}
		
		// 4. Return the transformed solution
		graph.roots.head
	}

	def getResourceSet() {
		if (henshinResourceSet == null) {
			henshinResourceSet = new HenshinResourceSet()
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