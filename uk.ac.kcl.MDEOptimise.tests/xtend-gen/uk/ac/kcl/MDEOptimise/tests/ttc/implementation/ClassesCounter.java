package uk.ac.kcl.MDEOptimise.tests.ttc.implementation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.MDEOptimise.tests.ttc.implementation.AbstractModelQueryFitnessFunction;

@SuppressWarnings("all")
public class ClassesCounter extends AbstractModelQueryFitnessFunction {
  @Override
  public double computeFitness(final EObject model) {
    double _xblockexpression = (double) 0;
    {
      Object _feature = this.getFeature(model, "classes");
      final Function1<EObject, Boolean> _function = (EObject class_) -> {
        Object _feature_1 = this.getFeature(class_, "encapsulates");
        return Boolean.valueOf(((EList<EObject>) _feature_1).isEmpty());
      };
      Iterable<EObject> _filter = IterableExtensions.<EObject>filter(((EList<EObject>) _feature), _function);
      int _size = IterableExtensions.size(_filter);
      double fitness = ((-1.0) * _size);
      _xblockexpression = fitness;
    }
    return _xblockexpression;
  }
}
