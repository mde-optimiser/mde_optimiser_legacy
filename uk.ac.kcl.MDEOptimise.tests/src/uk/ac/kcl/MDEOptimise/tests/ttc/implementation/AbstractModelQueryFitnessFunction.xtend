package uk.ac.kcl.MDEOptimise.tests.ttc.implementation

import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.interpreter.FitnessFunction

abstract class AbstractModelQueryFitnessFunction implements FitnessFunction {
	/**
	 * Helper function getting the value of the named feature (if it exists) for the given EObject.
	 */
	def getFeature (EObject o, String feature) {
		o.eGet (o.eClass.getEStructuralFeature(feature))
	}
	
	/**
	 * Helper method returning true if the given EObject is an instance of the named EClass.
	 */
	def isOfClass (EObject o, String className) {
		o.eClass.name.equals (className)
	}
}