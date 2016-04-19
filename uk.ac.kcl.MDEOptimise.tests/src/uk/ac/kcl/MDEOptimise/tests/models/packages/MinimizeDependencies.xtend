package uk.ac.kcl.MDEOptimise.tests.models.packages

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.interpreter.FitnessFunction

/**
 * Counts the number of dependencies between packages.
 */
class MinimizeDependencies implements FitnessFunction {

	override computeFitness(EObject model) {
		val modelClass = model.eClass
		val packages = modelClass.getEStructuralFeature("packages")
		val packageClass = packages.EType as EClass
		val packagedClasses = packageClass.getEStructuralFeature("classes")
		val clazzClass = packagedClasses.EType as EClass
		val dependsOn = clazzClass.getEStructuralFeature("dependsOn");

		-1.0 * (model.eGet(packages) as EList<EObject>).fold (0.0, [pCnt, p |
			pCnt + 
			(p.eGet(packagedClasses) as EList<EObject>).fold (0.0, [clsCnt, cl |
				clsCnt + 
				(cl.eGet(dependsOn) as EList<EObject>).filter[cl2 |
					cl2.eContainer != p
				].size
			])
		])
	}

}