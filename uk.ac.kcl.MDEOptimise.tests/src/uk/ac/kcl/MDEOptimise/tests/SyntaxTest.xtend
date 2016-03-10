package uk.ac.kcl.MDEOptimise.tests

import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.kcl.MDEOptimiseInjectorProvider
import uk.ac.kcl.mDEOptimise.Optimisation

import static org.junit.Assert.*
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

@InjectWith(MDEOptimiseInjectorProvider)
@RunWith(XtextRunner)
class SyntaxTest {
	@Inject ParseHelper<Optimisation> parser
	@Inject extension ValidationTestHelper
	
	/**
	 * A basic test that should pass to demonstrate basic parsing functionality.
	 */
	@Test
	def void testBasicParsing() {
		val model = parser.parse('''
			metamodel <ABC>
			fitness {
				class "ABC"
				method "cde"
			}
			evolve using <ABC>
			evolve using <CDE>
		''')
		assertNotNull(model)
		model.assertNoIssues
	}
}