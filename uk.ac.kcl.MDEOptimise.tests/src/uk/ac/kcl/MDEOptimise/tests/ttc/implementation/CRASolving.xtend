package uk.ac.kcl.MDEOptimise.tests.ttc.implementation

import com.google.inject.Inject
import java.text.SimpleDateFormat
import java.util.Date
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.kcl.MDEOptimise.tests.FullTestInjector
import uk.ac.kcl.MDEOptimise.tests.models.DebuggableSimpleMO
import uk.ac.kcl.interpreter.OptimisationInterpreter
import uk.ac.kcl.mDEOptimise.Optimisation

@InjectWith(FullTestInjector)
@RunWith(XtextRunner)
class CRASolving {

	@Inject
	ParseHelper<Optimisation> parser

	@Test
	def void run() {
		val pathPrefix = "gen/models/ttc/" + new SimpleDateFormat("yyMMdd-HHmmss").format(new Date())
		val model = parser.parse('''
			basepath <src/uk/ac/kcl/MDEOptimise/tests/ttc/models>
			metamodel <architectureCRA.ecore>
			fitness "uk.ac.kcl.MDEOptimise.tests.ttc.implementation.MinimiseClasslessFeatures"
			fitness "uk.ac.kcl.MDEOptimise.tests.ttc.implementation.ClassesCounter"			
			evolve using <craEvolvers.henshin> unit "createClass"
			evolve using <craEvolvers.henshin> unit "assignFeature"
		''')

		val modelProvider = new CRAModelProvider()

		val interpreter = new OptimisationInterpreter(model, new DebuggableSimpleMO(50, 10, pathPrefix, modelProvider), modelProvider)

		val optimiserOutcome = interpreter.execute()

		modelProvider.storeModels (optimiserOutcome, pathPrefix + "/final")
	}
}