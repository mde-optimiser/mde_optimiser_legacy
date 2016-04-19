package uk.ac.kcl.MDEOptimise.tests.models.packages

import uk.ac.kcl.MDEOptimise.tests.models.TestModelProvider

/**
 * Mock implementation simply providing a number of pre-defined packages models.
 */
class PackagesModelProvider extends TestModelProvider {

	override getModelPaths() {
		#["src/uk/ac/kcl/MDEOptimise/tests/models/packages/TestSetup.xmi"]
	}
}