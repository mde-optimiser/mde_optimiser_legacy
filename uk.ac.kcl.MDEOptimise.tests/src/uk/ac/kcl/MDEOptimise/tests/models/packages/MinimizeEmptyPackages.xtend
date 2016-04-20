package uk.ac.kcl.MDEOptimise.tests.models.packages

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.interpreter.FitnessFunction

/**
 * Counts the number of empty packages.
 */
class MinimizeEmptyPackages implements FitnessFunction {

	override computeFitness(EObject model) {
		val modelClass = model.eClass
		val packages = modelClass.getEStructuralFeature("packages")
		val packageClass = packages.EType as EClass
		val packagedClasses = packageClass.getEStructuralFeature("classes");
		
		-1.0 * (model.eGet(packages) as EList<EObject>).filter[p |
			(p.eGet(packagedClasses) as EList<EObject>).size == 0
		].size
	}

}