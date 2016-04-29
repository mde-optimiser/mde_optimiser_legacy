package uk.ac.kcl.MDEOptimise.tests.ttc.implementation;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.interpreter.FitnessFunction;

@SuppressWarnings("all")
public class MinimiseClasslessFeatures implements FitnessFunction {
  @Override
  public double computeFitness(final EObject model) {
    double _xblockexpression = (double) 0;
    {
      final EClass modelClass = model.eClass();
      final EStructuralFeature features = modelClass.getEStructuralFeature("features");
      EClassifier _eType = features.getEType();
      final EClass featuresClass = ((EClass) _eType);
      final EStructuralFeature isEncapsulatedBy = featuresClass.getEStructuralFeature("isEncapsulatedBy");
      Object _eGet = model.eGet(features);
      final Function1<EObject, Boolean> _function = (EObject feature) -> {
        Object _eGet_1 = feature.eGet(isEncapsulatedBy);
        return Boolean.valueOf(Objects.equal(_eGet_1, null));
      };
      Iterable<EObject> _filter = IterableExtensions.<EObject>filter(((EList<EObject>) _eGet), _function);
      int _size = IterableExtensions.size(_filter);
      double fitness = ((-1.0) * _size);
      _xblockexpression = fitness;
    }
    return _xblockexpression;
  }
}
