package uk.ac.kcl.MDEOptimise.tests.models.packages

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.interpreter.FitnessFunction

/**
 * Counts the number of classes without a package.
 */
class MinimizePackageLessClasses implements FitnessFunction {

	override computeFitness(EObject model) {
		val modelClass = model.eClass
		val topLevelClasses = modelClass.getEStructuralFeature("classes");

		-1.0 * (model.eGet(topLevelClasses) as EList<EObject>).size
	}
}