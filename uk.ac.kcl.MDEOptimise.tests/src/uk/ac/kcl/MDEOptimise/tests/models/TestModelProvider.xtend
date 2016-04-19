package uk.ac.kcl.MDEOptimise.tests.models

import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import uk.ac.kcl.interpreter.ModelProvider

abstract class TestModelProvider implements ModelProvider {

	val ResourceSet resourceSet = new ResourceSetImpl

	override initialModels(EPackage metamodel) {
		resourceSet.packageRegistry.put(metamodel.nsURI, metamodel)

		modelPaths.map [p | 
			loadModel (p)
		].iterator
	}

	def loadModel(String path) {
		val resource = resourceSet.createResource(URI.createURI(path))
		resource.load(Collections.EMPTY_MAP)
		resource.allContents.head
	}
	
	abstract def List<String> getModelPaths()
}