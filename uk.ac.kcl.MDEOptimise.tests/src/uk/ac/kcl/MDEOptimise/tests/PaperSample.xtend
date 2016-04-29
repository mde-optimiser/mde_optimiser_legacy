package uk.ac.kcl.MDEOptimise.tests

import java.util.Set
import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.interpreter.ModelProvider
import uk.ac.kcl.interpreter.OptimisationInterpreter
import uk.ac.kcl.interpreter.algorithms.RandomHillClimbing
import uk.ac.kcl.mDEOptimise.Optimisation


class PaperSample {
	def Set<EObject> runSearch (Optimisation model, ModelProvider mp) {		
		val interpreter = new OptimisationInterpreter(model, new RandomHillClimbing (10), mp)
		return interpreter.execute();
	}
}

