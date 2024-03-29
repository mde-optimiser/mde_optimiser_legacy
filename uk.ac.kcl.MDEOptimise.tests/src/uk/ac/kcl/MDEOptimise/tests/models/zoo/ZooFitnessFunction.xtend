package uk.ac.kcl.MDEOptimise.tests.models.zoo

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.interpreter.FitnessFunction

/**
 * Fitness function for zoo models. The fitness is given by the number of empty cages: The more cages are left empty, the 
 * higher the fitness of the model.
 */
class ZooFitnessFunction implements FitnessFunction {
	
	/**
	 * We expect the model to be an instance of the Zoo meta-class and will count the number of empty cages.
	 */
	override computeFitness(EObject model) {
		val zooClass = model.eClass		
		val cages = zooClass.getEStructuralFeature("cages")
		val cageClass = (cages.EType as EClass)
		val cagedAnimals = cageClass.getEStructuralFeature("animals")
		
		(model.eGet(cages) as EList<EObject>).fold(0.0, [cnt, cage |
			if ((cage.eGet(cagedAnimals)as EList<EObject>).empty) {
				cnt + 1
			} else {
				cnt
			}
		])
	}
	
}