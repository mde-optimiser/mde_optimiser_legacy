package uk.ac.kcl.MDEOptimise.tests.models.zoo

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import uk.ac.kcl.interpreter.ModelProvider
import java.util.Collections
import org.eclipse.emf.common.util.URI

/**
 * Mock implementation simply providing a number of pre-defined zoo models.
 */
class ZooModelProvider implements ModelProvider {
	
	override initialModels(String metamodelURI) {
		val ResourceSet resourceSet = new ResourceSetImpl
		
		val mm = resourceSet.createResource(URI.createURI("src/uk/ac/kcl/MDEOptimise/tests/models/zoo/zoo.ecore"))
		mm.load (null)
		resourceSet.packageRegistry.put("http://inf.kcl.ac.uk/zoo/2016", mm.allContents.head)
		
		val modelPaths = #["src/uk/ac/kcl/MDEOptimise/tests/models/zoo/SimpleZoo.xmi"]
		
		modelPaths.map[p | 
			val resource = resourceSet.createResource(URI.createURI(p))
			resource.load (Collections.EMPTY_MAP)
			resource.allContents.head
		].iterator
	}
	
}