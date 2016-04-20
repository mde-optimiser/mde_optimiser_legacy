package uk.ac.kcl.MDEOptimise.tests.models.packages;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.interpreter.FitnessFunction;

/**
 * Counts the number of empty packages.
 */
@SuppressWarnings("all")
public class MinimizeEmptyPackages implements FitnessFunction {
  @Override
  public double computeFitness(final EObject model) {
    double _xblockexpression = (double) 0;
    {
      final EClass modelClass = model.eClass();
      final EStructuralFeature packages = modelClass.getEStructuralFeature("packages");
      EClassifier _eType = packages.getEType();
      final EClass packageClass = ((EClass) _eType);
      final EStructuralFeature packagedClasses = packageClass.getEStructuralFeature("classes");
      Object _eGet = model.eGet(packages);
      final Function1<EObject, Boolean> _function = (EObject p) -> {
        Object _eGet_1 = p.eGet(packagedClasses);
        int _size = ((EList<EObject>) _eGet_1).size();
        return Boolean.valueOf((_size == 0));
      };
      Iterable<EObject> _filter = IterableExtensions.<EObject>filter(((EList<EObject>) _eGet), _function);
      int _size = IterableExtensions.size(_filter);
      _xblockexpression = ((-1.0) * _size);
    }
    return _xblockexpression;
  }
}
