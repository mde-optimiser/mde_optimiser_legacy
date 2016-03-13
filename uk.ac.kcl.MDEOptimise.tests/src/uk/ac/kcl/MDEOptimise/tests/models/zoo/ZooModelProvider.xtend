package uk.ac.kcl.MDEOptimise.tests.models.zoo

import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import uk.ac.kcl.interpreter.ModelProvider

/**
 * Mock implementation simply providing a number of pre-defined zoo models.
 */
class ZooModelProvider implements ModelProvider {
	
	override initialModels(EPackage metamodel) {
		val ResourceSet resourceSet = new ResourceSetImpl
		
		//val mm = resourceSet.createResource(URI.createURI("src/uk/ac/kcl/MDEOptimise/tests/models/zoo/zoo.ecore"))
		//mm.load (null)
		//resourceSet.packageRegistry.put("http://inf.kcl.ac.uk/zoo/2016", mm.allContents.head)
		resourceSet.packageRegistry.put(metamodel.nsURI, metamodel)
		
		val modelPaths = #["src/uk/ac/kcl/MDEOptimise/tests/models/zoo/SimpleZoo.xmi"]
		
		modelPaths.map[p | 
			val resource = resourceSet.createResource(URI.createURI(p))
			resource.load (Collections.EMPTY_MAP)
			// TODO Probably not actually needed!
			EcoreUtil.resolveAll (resource)
			resource.allContents.head
		].iterator
	}
	
}