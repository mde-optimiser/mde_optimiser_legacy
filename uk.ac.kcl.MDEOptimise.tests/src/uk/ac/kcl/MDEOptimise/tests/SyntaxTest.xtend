package uk.ac.kcl.MDEOptimise.tests

import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.kcl.mDEOptimise.Optimisation

import static org.junit.Assert.*

@InjectWith(FullTestInjector)
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
			basepath <ABC>
			metamodel <ABC>
			fitness "ABC"
			evolve using <ABC> unit "XYZ"
			evolve using <CDE> unit "LMN"
		''')
		assertNotNull(model)
		
		model.assertNoIssues
		
		assertEquals("ABC", model.basepath.location)
		assertEquals("ABC", model.metamodel.location)
		assertEquals("ABC", model.evolvers.get(0).rule_location)
		assertEquals("CDE", model.evolvers.get(1).rule_location)
	} 

	/**
	 * A test with multiple fitness functions that should pass to demonstrate basic parsing functionality.
	 */
	@Test
	def void testMultiObjectiveParsing() {
		val model = parser.parse('''
			basepath <ABC>
			metamodel <ABC>
			fitness "ABC"
			fitness "DEF"
			evolve using <ABC> unit "XYZ"
			evolve using <CDE> unit "LMN"
		''')
		assertNotNull(model)
		
		model.assertNoIssues
		
		assertEquals("ABC", model.basepath.location)
		assertEquals("ABC", model.metamodel.location)
		assertEquals("ABC", model.evolvers.get(0).rule_location)
		assertEquals("CDE", model.evolvers.get(1).rule_location)
	} 
}