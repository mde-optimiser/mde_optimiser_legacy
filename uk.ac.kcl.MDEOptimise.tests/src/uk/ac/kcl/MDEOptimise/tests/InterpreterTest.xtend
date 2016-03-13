package uk.ac.kcl.MDEOptimise.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.kcl.MDEOptimise.tests.models.zoo.ZooModelProvider
import uk.ac.kcl.MDEOptimiseInjectorProvider
import uk.ac.kcl.interpreter.OptimisationInterpreter
import uk.ac.kcl.interpreter.algorithms.RandomHillClimbing
import uk.ac.kcl.mDEOptimise.Optimisation

import static org.junit.Assert.*

@InjectWith(MDEOptimiseInjectorProvider)
@RunWith(XtextRunner)
class InterpreterTest {
	@Inject ParseHelper<Optimisation> parser

	// FIXME: Currently, can only run one of the interpreter tests at a time as there is some issue with XText removing Henshin from the local 
	// registry between runs. Need to look into how I need to change the configuration to avoid this.
	//@Test
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
		
		// TODO: Compare the two models
		//assertEquals(expectedOutcome, optimiserOutcome)
	}
}