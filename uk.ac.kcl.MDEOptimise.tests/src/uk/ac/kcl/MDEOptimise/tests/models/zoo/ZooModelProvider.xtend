package uk.ac.kcl.MDEOptimise.tests.models.zoo

import uk.ac.kcl.MDEOptimise.tests.models.TestModelProvider

/**
 * Mock implementation simply providing a number of pre-defined zoo models.
 */
class ZooModelProvider extends TestModelProvider {

	override getModelPaths() {
		#["src/uk/ac/kcl/MDEOptimise/tests/models/zoo/SimpleZoo.xmi"]
	}
}