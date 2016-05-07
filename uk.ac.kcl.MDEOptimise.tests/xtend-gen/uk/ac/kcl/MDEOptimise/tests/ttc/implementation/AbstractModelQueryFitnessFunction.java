package uk.ac.kcl.MDEOptimise.tests.ttc.implementation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import uk.ac.kcl.interpreter.FitnessFunction;

@SuppressWarnings("all")
public abstract class AbstractModelQueryFitnessFunction implements FitnessFunction {
  /**
   * Helper function getting the value of the named feature (if it exists) for the given EObject.
   */
  public Object getFeature(final EObject o, final String feature) {
    EClass _eClass = o.eClass();
    EStructuralFeature _eStructuralFeature = _eClass.getEStructuralFeature(feature);
    return o.eGet(_eStructuralFeature);
  }
  
  /**
   * Helper method returning true if the given EObject is an instance of the named EClass.
   */
  public boolean isOfClass(final EObject o, final String className) {
    EClass _eClass = o.eClass();
    String _name = _eClass.getName();
    return _name.equals(className);
  }
}
