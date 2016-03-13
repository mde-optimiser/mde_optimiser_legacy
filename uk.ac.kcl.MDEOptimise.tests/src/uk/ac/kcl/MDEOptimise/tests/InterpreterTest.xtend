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

	@Test
	def void testBasicInterpreter() {
		val model = parser.parse ('''
			basepath <src/uk/ac/kcl/MDEOptimise/tests/models/zoo/>
			metamodel <zoo.ecore>
			fitness "uk.ac.kcl.MDEOptimise.tests.models.zoo.ZooFitnessFunction"
			evolve using <zoo_evolution.henshin>
		''')
		assertNotNull(model)
		
		val interpreter = new OptimisationInterpreter(model, new RandomHillClimbing (1), new ZooModelProvider)
		interpreter.execute();	
	}
}