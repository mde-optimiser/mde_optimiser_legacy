package uk.ac.kcl.MDEOptimise.tests.ttc.implementation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.interpreter.FitnessFunction;

@SuppressWarnings("all")
public class ClassesCounter implements FitnessFunction {
  @Override
  public double computeFitness(final EObject model) {
    double _xblockexpression = (double) 0;
    {
      final EClass modelClass = model.eClass();
      final EStructuralFeature classes = modelClass.getEStructuralFeature("classes");
      EClassifier _eType = classes.getEType();
      final EClass classesClass = ((EClass) _eType);
      final EStructuralFeature encapsulates = classesClass.getEStructuralFeature("encapsulates");
      Object _eGet = model.eGet(classes);
      final Function1<EObject, Boolean> _function = (EObject class_) -> {
        Object _eGet_1 = class_.eGet(encapsulates);
        return Boolean.valueOf(((EList<EObject>) _eGet_1).isEmpty());
      };
      Iterable<EObject> _filter = IterableExtensions.<EObject>filter(((EList<EObject>) _eGet), _function);
      int _size = IterableExtensions.size(_filter);
      double fitness = ((-1.0) * _size);
      _xblockexpression = fitness;
    }
    return _xblockexpression;
  }
}
