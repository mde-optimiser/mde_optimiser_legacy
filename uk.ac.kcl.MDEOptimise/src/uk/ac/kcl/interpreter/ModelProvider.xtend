package uk.ac.kcl.interpreter

import java.util.Iterator
import org.eclipse.emf.ecore.EObject

/**
 * Strategy for generating initial models.
 */
interface ModelProvider {
	/**
	 * Lazily generate initial models given a metamodel URI 
	 */
	public def Iterator<EObject> initialModels (String metamodelURI) 
}