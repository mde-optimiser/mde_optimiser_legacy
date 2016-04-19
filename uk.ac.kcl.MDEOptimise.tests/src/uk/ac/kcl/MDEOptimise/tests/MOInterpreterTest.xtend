package uk.ac.kcl.MDEOptimise.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.kcl.MDEOptimise.tests.models.packages.PackagesModelProvider
import uk.ac.kcl.interpreter.OptimisationInterpreter
import uk.ac.kcl.interpreter.algorithms.RandomHillClimbing
import uk.ac.kcl.mDEOptimise.Optimisation

import static org.junit.Assert.*

/**
 * A test suite for problems with multiple optimisation objectives.
 */
@InjectWith(FullTestInjector)
@RunWith(XtextRunner)
class MOInterpreterTest {
	@Inject ParseHelper<Optimisation> parser

	@Test
	def void testMOInterpreter() {
		val model = parser.parse ('''
			basepath <src/uk/ac/kcl/MDEOptimise/tests/models/packages/>
			metamodel <packages.ecore>
			fitness "uk.ac.kcl.MDEOptimise.tests.models.packages.MinimizeDependencies"
			fitness "uk.ac.kcl.MDEOptimise.tests.models.packages.MinimizePackageLessClasses"
			evolve using <packageAllocation.henshin> unit "CreatePackage"
			evolve using <packageAllocation.henshin> unit "AllocateUnallocatedClass"
			evolve using <packageAllocation.henshin> unit "MoveClass"
		''')
		assertNotNull(model)
		
		val mp = new PackagesModelProvider
		
		val interpreter = new OptimisationInterpreter(model, new RandomHillClimbing (10), mp)
		val optimiserOutcome = interpreter.execute().head;
		
		//val expectedOutcome = mp.loadModel("src/uk/ac/kcl/MDEOptimise/tests/models/zoo/SimpleZoo_expected.xmi")
		
		//assertTrue (EcoreUtil.equals (expectedOutcome, optimiserOutcome))
	}
}