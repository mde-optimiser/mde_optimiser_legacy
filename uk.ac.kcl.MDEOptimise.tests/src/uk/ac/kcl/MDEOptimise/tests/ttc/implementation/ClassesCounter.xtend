package uk.ac.kcl.MDEOptimise.tests.ttc.implementation

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.interpreter.FitnessFunction

class ClassesCounter implements FitnessFunction {
	
	override computeFitness(EObject model) {
		
		val modelClass = model.eClass
		val classes = modelClass.getEStructuralFeature("classes")
		val classesClass = classes.EType as EClass
		val encapsulates = classesClass.getEStructuralFeature("encapsulates");
		
		var fitness = -1.0 * (model.eGet(classes) as EList<EObject>).filter[class | (class.eGet(encapsulates) as EList<EObject>).empty].size;
		fitness;
	}	
}