package uk.ac.kcl.MDEOptimise.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.kcl.MDEOptimise.tests.models.zoo.ZooModelProvider
import uk.ac.kcl.interpreter.OptimisationInterpreter
import uk.ac.kcl.interpreter.algorithms.RandomHillClimbing
import uk.ac.kcl.mDEOptimise.Optimisation

import static org.junit.Assert.*

@InjectWith(FullTestInjector)
@RunWith(XtextRunner)
class InterpreterTest {
	@Inject ParseHelper<Optimisation> parser

	@Test
	def void testBasicInterpreter() {
		// Testing the basic case
		genericZooInterpreterImpl(1)
	}
	
	@Test
	def void testReactionToEvolveFail() {
		// Running a second round to test what happens when no evolver is applicable
		genericZooInterpreterImpl(2)
	}
	
	def void genericZooInterpreterImpl (int maxIterations) {
		val model = parser.parse ('''
			basepath <src/uk/ac/kcl/MDEOptimise/tests/models/zoo/>
			metamodel <zoo.ecore>
			fitness "uk.ac.kcl.MDEOptimise.tests.models.zoo.ZooFitnessFunction"
			evolve using <zoo_evolution.henshin> unit "MoveAnimal"
		''')
		assertNotNull(model)
		
		val mp = new ZooModelProvider
		
		val interpreter = new OptimisationInterpreter(model, new RandomHillClimbing (maxIterations), mp)
		val optimiserOutcome = interpreter.execute().head;
		
		val expectedOutcome = mp.loadModel("src/uk/ac/kcl/MDEOptimise/tests/models/zoo/SimpleZoo_expected.xmi")
		
		assertTrue (EcoreUtil.equals (expectedOutcome, optimiserOutcome))
	}
}