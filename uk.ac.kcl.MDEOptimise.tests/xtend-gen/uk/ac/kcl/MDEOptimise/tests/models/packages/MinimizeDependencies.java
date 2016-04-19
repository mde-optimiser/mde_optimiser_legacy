package uk.ac.kcl.MDEOptimise.tests.models.packages;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.interpreter.FitnessFunction;

/**
 * Counts the number of dependencies between packages.
 */
@SuppressWarnings("all")
public class MinimizeDependencies implements FitnessFunction {
  @Override
  public double computeFitness(final EObject model) {
    double _xblockexpression = (double) 0;
    {
      final EClass modelClass = model.eClass();
      final EStructuralFeature packages = modelClass.getEStructuralFeature("packages");
      EClassifier _eType = packages.getEType();
      final EClass packageClass = ((EClass) _eType);
      final EStructuralFeature packagedClasses = packageClass.getEStructuralFeature("classes");
      EClassifier _eType_1 = packagedClasses.getEType();
      final EClass clazzClass = ((EClass) _eType_1);
      final EStructuralFeature dependsOn = clazzClass.getEStructuralFeature("dependsOn");
      Object _eGet = model.eGet(packages);
      final Function2<Double, EObject, Double> _function = (Double pCnt, EObject p) -> {
        Object _eGet_1 = p.eGet(packagedClasses);
        final Function2<Double, EObject, Double> _function_1 = (Double clsCnt, EObject cl) -> {
          Object _eGet_2 = cl.eGet(dependsOn);
          final Function1<EObject, Boolean> _function_2 = (EObject cl2) -> {
            EObject _eContainer = cl2.eContainer();
            return Boolean.valueOf((!Objects.equal(_eContainer, p)));
          };
          Iterable<EObject> _filter = IterableExtensions.<EObject>filter(((EList<EObject>) _eGet_2), _function_2);
          int _size = IterableExtensions.size(_filter);
          return Double.valueOf(((clsCnt).doubleValue() + _size));
        };
        Double _fold = IterableExtensions.<EObject, Double>fold(((EList<EObject>) _eGet_1), Double.valueOf(0.0), _function_1);
        return Double.valueOf(DoubleExtensions.operator_plus(pCnt, _fold));
      };
      Double _fold = IterableExtensions.<EObject, Double>fold(((EList<EObject>) _eGet), Double.valueOf(0.0), _function);
      _xblockexpression = ((-1.0) * (_fold).doubleValue());
    }
    return _xblockexpression;
  }
}
