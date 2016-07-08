package uk.ac.kcl.interpreter

import java.util.ArrayList
import java.util.HashMap
import java.util.Iterator
import java.util.LinkedList
import java.util.List
import java.util.Random
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.henshin.interpreter.Match
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl
import org.eclipse.emf.henshin.model.Rule
import org.eclipse.emf.henshin.model.Unit
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet
import uk.ac.kcl.mDEOptimise.Optimisation

/**
 * An interpreter for optimisation specifications. This class provides the basic functionality 
 * for interpreting optimisation scripts, but does not actually contain a concrete optimisation 
 * algorithm. Such algorithms are provided separately through a strategy object.
 */
// TODO: Add a combine method to support cross-over like steps for multi-objective optimisers. Use something like EMF Diff/Merge for implementation (see {@see http://wiki.eclipse.org/EMF_DiffMerge/Programmatic_Usage}).
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
	private List<FitnessFunction> fitnessFunctions = null

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
	def List<Double> fitness(EObject candidateSolution) {
		if (candidateSolution == null) {
			throw new NullPointerException();
		}

		if (fitnessFunctions == null) {
			fitnessFunctions = new LinkedList(model.fitness.map [ f |
				val Class<? extends FitnessFunction> fitnessClass = Class.forName(
					f.class_) as Class<? extends FitnessFunction>
				fitnessClass.newInstance
			])
		}

		fitnessFunctions.map[f|f.computeFitness(candidateSolution)]
	}

	/**
	 * The single instance of the Henshin engine we are going to use throughout. 
	 */
	private static val engine = new EngineImpl

	/**
	 * Produce a new solution from the given one using one of the evolvers defined in the optimisation model. 
	 * This will try evolvers until one of them can be applied or all evolvers have been tried. If no evolver was applicable, returns <code>null</code>, 
	 * otherwise returns the result of the first randomly picked evolver that was applicable. 
	 */
	def EObject evolve(EObject object) {
		// Extract Henshin evolvers if necessary
		if (henshinEvolvers == null) {
			val hrs = resourceSet
			// Explicitly creating a list here to make sure the map is only invoked once not every time we try and evolve a model
			henshinEvolvers = new ArrayList(model.evolvers.map [ e |
				hrs.getModule(URI.createURI(e.rule_location), false).getUnit(e.unit)
			])
		}

		val candidateSolution = EcoreUtil.copy(object)

		// Get all matches
		val graph = new EGraphImpl(candidateSolution)
		val matchesView = henshinEvolvers.map [ evolver |
			engine.findMatches(evolver as Rule, graph, null).map[m | new Pair<Rule, Match>(evolver as Rule, m)]
		].flatten

		val matches = new ArrayList<Pair<Rule, Match>>(matchesView.toList)

		if (!matches.empty) {
			// Randomly pick one match
			val matchToUse = matches.get(new Random().nextInt(matches.size))

			// Apply the match
			val runner = new RuleApplicationImpl(engine)
			runner.EGraph = graph
			runner.unit = matchToUse.key
			runner.partialMatch = matchToUse.value
			
			if (runner.execute(null)) {
				return graph.roots.head
			}
		} 
		
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

	/**
	 * Pareto-rank the provided solutions and return at most targetPopulationSize many starting with the top ranked ones. 
	 */
	def Pair<List<EObject>, List<List<Double>>> getTopRanked(int targetPopulationSize, List<EObject> solutions,
		List<List<Double>> fitnesses) {
		// TODO Not a very efficient implementation. Eventually to be shifted to some other framework
		// Build up the domination order
		val dominators = new HashMap<EObject, List<EObject>>()

		solutions.forEach [ s, idx |
			dominators.put(s, new LinkedList<EObject>())
			solutions.forEach [ s2, idx2 |
				if (fitnesses.get(idx2).dominates(fitnesses.get(idx))) {
					dominators.get(s).add(s2)
				}
			]
		]

		// Iterate through the ranks until we've found enough elements
		val tentativeResult = new Pair<List<EObject>, List<List<Double>>>(new LinkedList<EObject>(),
			new LinkedList<List<Double>>())
		val adjustedTgtSize = Math.min(targetPopulationSize, solutions.size)
		while (tentativeResult.key.size < adjustedTgtSize) {
			// Find top ranked solutions
			val undominatedSolutions = dominators.keySet.filter[cs|dominators.get(cs).size == 0].toList

			// Remove them from domination matrix
			undominatedSolutions.forEach[s|dominators.remove(s)]
			dominators.values.forEach[lDominators|lDominators.removeAll(undominatedSolutions)]

			// Add them to solution population
			tentativeResult.key.addAll(undominatedSolutions.take(adjustedTgtSize - tentativeResult.key.size))
			tentativeResult.value.addAll(
				undominatedSolutions.map[cs|fitnesses.get(solutions.indexOf(cs))].take(adjustedTgtSize -
					tentativeResult.value.size))
		}

		tentativeResult
	}

	/**
	 * Check domination between two fitness vectors. Returns true if fitness1 dominates fitness2
	 */
	def boolean dominates(List<Double> fitness1, List<Double> fitness2) {
		(0 ..< fitness1.size).forall[i|fitness1.get(i) >= fitness2.get(i)] && (0 ..< fitness1.size).exists [ i |
			fitness1.get(i) > fitness2.get(i)
		]
	}
}
