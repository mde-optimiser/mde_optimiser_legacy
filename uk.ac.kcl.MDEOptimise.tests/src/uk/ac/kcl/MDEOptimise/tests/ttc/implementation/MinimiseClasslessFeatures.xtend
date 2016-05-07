package uk.ac.kcl.MDEOptimise.tests.ttc.implementation

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject

class MinimiseClasslessFeatures extends AbstractModelQueryFitnessFunction {
	
	override computeFitness(EObject model) {
		/*
		val modelClass = model.eClass
		val features = modelClass.getEStructuralFeature("features")
		val featuresClass = features.EType as EClass
		val isEncapsulatedBy = featuresClass.getEStructuralFeature("isEncapsulatedBy");
		
		// -1 * model.features.filter[f | f.isEncapsulatedBy == null].size
		var fitness = -1.0 * (model.eGet(features) as EList<EObject>).filter[feature | feature.eGet(isEncapsulatedBy) == null].size;
		*/
		var fitness = -1.0 * (model.getFeature("features") as EList<EObject>).filter[feature | feature.getFeature("isEncapsulatedBy") == null].size;
		fitness;
	}
}