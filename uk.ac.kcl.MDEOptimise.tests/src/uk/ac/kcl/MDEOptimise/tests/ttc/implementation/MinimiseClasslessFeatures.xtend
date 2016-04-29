package uk.ac.kcl.MDEOptimise.tests.ttc.implementation

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.interpreter.FitnessFunction

class MinimiseClasslessFeatures implements FitnessFunction {
	
	override computeFitness(EObject model) {
		
		val modelClass = model.eClass
		val features = modelClass.getEStructuralFeature("features")
		val featuresClass = features.EType as EClass
		val isEncapsulatedBy = featuresClass.getEStructuralFeature("isEncapsulatedBy");
		
		var fitness = -1.0 * (model.eGet(features) as EList<EObject>).filter[feature | feature.eGet(isEncapsulatedBy) == null].size;
		fitness;

	}	
}