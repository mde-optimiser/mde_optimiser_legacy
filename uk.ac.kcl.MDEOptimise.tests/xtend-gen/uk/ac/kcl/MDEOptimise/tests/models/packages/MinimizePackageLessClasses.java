package uk.ac.kcl.MDEOptimise.tests.models.packages;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import uk.ac.kcl.interpreter.FitnessFunction;

/**
 * Counts the number of classes without a package.
 */
@SuppressWarnings("all")
public class MinimizePackageLessClasses implements FitnessFunction {
  @Override
  public double computeFitness(final EObject model) {
    double _xblockexpression = (double) 0;
    {
      final EClass modelClass = model.eClass();
      final EStructuralFeature topLevelClasses = modelClass.getEStructuralFeature("classes");
      Object _eGet = model.eGet(topLevelClasses);
      int _size = ((EList<EObject>) _eGet).size();
      _xblockexpression = ((-1.0) * _size);
    }
    return _xblockexpression;
  }
}
