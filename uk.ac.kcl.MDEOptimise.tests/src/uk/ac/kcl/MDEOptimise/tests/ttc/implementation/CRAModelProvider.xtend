package uk.ac.kcl.MDEOptimise.tests.ttc.implementation

import uk.ac.kcl.MDEOptimise.tests.models.TestModelProvider

/**
 * Mock implementation simply providing a number of pre-defined packages models.
 */
class CRAModelProvider extends TestModelProvider {

	override getModelPaths() {
		#["src/uk/ac/kcl/MDEOptimise/tests/ttc/models/TTC_InputRDG_A.xmi"]
	}
}