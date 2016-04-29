package uk.ac.kcl.MDEOptimise.tests.ttc.implementation

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.kcl.MDEOptimise.tests.FullTestInjector
import uk.ac.kcl.interpreter.OptimisationInterpreter
import uk.ac.kcl.interpreter.algorithms.SimpleMO
import uk.ac.kcl.mDEOptimise.Optimisation

@InjectWith(FullTestInjector)
@RunWith(XtextRunner)
class CRASolving {

	@Inject
	ParseHelper<Optimisation> parser

	@Test
	def void run() {
		val model = parser.parse('''
			basepath <src/uk/ac/kcl/MDEOptimise/tests/ttc/models>
			metamodel <architectureCRA.ecore>
			fitness "uk.ac.kcl.MDEOptimise.tests.ttc.implementation.MinimiseClasslessFeatures"
			fitness "uk.ac.kcl.MDEOptimise.tests.ttc.implementation.ClassesCounter"			
			evolve using <craEvolvers.henshin> unit "createClass"
			evolve using <craEvolvers.henshin> unit "assignFeature"
		''')

		val modelProvider = new CRAModelProvider()

		val interpreter = new OptimisationInterpreter(model, new SimpleMO(50, 10), modelProvider)

		val optimiserOutcome = interpreter.execute()

		optimiserOutcome.forEach [ omodel |
			(modelProvider as CRAModelProvider).writeModel(omodel, "gen/models/test" + Math.random + ".xmi")
		]
	}
}