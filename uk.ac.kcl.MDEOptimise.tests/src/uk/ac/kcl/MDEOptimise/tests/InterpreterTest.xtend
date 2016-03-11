package uk.ac.kcl.MDEOptimise.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.kcl.MDEOptimiseInjectorProvider
import uk.ac.kcl.interpreter.OptimisationInterpreter
import uk.ac.kcl.mDEOptimise.Optimisation

import static org.junit.Assert.*
import uk.ac.kcl.interpreter.OptimisationAlgorithm
import uk.ac.kcl.interpreter.Population

@InjectWith(MDEOptimiseInjectorProvider)
@RunWith(XtextRunner)
class InterpreterTest {
	@Inject ParseHelper<Optimisation> parser

	@Test
	def void testBasicInterpreter() {
		val model = parser.parse ('''
			metamodel <ABC>
			fitness {
				class "ABC"
				method "def"
			}
			evolve using <ABC>
		''')
		assertNotNull(model)
		
		val interpreter = new OptimisationInterpreter(model, new BasicOptimisationAlgorithm)
		interpreter.execute();	
	}
}

class BasicOptimisationAlgorithm implements OptimisationAlgorithm {
	
	override initialPopulation(OptimisationInterpreter interpreter) {
		null
	}
	
	override runAgain() {
		false
	}
	
	override computeNextGeneration(Population currentGeneration, OptimisationInterpreter interpreter) {
		currentGeneration
	}
	
}