package uk.ac.kcl.MDEOptimise.tests.ttc.implementation;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.ac.kcl.MDEOptimise.tests.FullTestInjector;
import uk.ac.kcl.MDEOptimise.tests.ttc.implementation.CRAModelProvider;
import uk.ac.kcl.interpreter.OptimisationInterpreter;
import uk.ac.kcl.interpreter.algorithms.SimpleMO;
import uk.ac.kcl.mDEOptimise.Optimisation;

@InjectWith(FullTestInjector.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class CRASolving {
  @Inject
  private ParseHelper<Optimisation> parser;
  
  @Test
  public void run() {
    try {
      SimpleDateFormat _simpleDateFormat = new SimpleDateFormat("yyMMdd-HHmmss");
      Date _date = new Date();
      String _format = _simpleDateFormat.format(_date);
      final String pathPrefix = ("gen/models/ttc/" + _format);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("basepath <src/uk/ac/kcl/MDEOptimise/tests/ttc/models>");
      _builder.newLine();
      _builder.append("metamodel <architectureCRA.ecore>");
      _builder.newLine();
      _builder.append("fitness \"uk.ac.kcl.MDEOptimise.tests.ttc.implementation.MinimiseClasslessFeatures\"");
      _builder.newLine();
      _builder.append("fitness \"uk.ac.kcl.MDEOptimise.tests.ttc.implementation.ClassesCounter\"\t\t\t");
      _builder.newLine();
      _builder.append("evolve using <craEvolvers.henshin> unit \"createClass\"");
      _builder.newLine();
      _builder.append("evolve using <craEvolvers.henshin> unit \"assignFeature\"");
      _builder.newLine();
      final Optimisation model = this.parser.parse(_builder);
      final CRAModelProvider modelProvider = new CRAModelProvider();
      SimpleMO _simpleMO = new SimpleMO(50, 10);
      final OptimisationInterpreter interpreter = new OptimisationInterpreter(model, _simpleMO, modelProvider);
      final Set<EObject> optimiserOutcome = interpreter.execute();
      final Function1<EObject, EList<EObject>> _function = (EObject cm) -> {
        Object _feature = this.getFeature(cm, "classes");
        return ((EList<EObject>) _feature);
      };
      Iterable<EList<EObject>> _map = IterableExtensions.<EObject, EList<EObject>>map(optimiserOutcome, _function);
      Iterable<EObject> _flatten = Iterables.<EObject>concat(_map);
      final Procedure2<EObject, Integer> _function_1 = (EObject cl, Integer i) -> {
        this.setFeature(cl, "name", ("NewClass" + i));
      };
      IterableExtensions.<EObject>forEach(_flatten, _function_1);
      modelProvider.storeModels(optimiserOutcome, (pathPrefix + "/final"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object getFeature(final EObject o, final String feature) {
    EClass _eClass = o.eClass();
    EStructuralFeature _eStructuralFeature = _eClass.getEStructuralFeature(feature);
    return o.eGet(_eStructuralFeature);
  }
  
  public void setFeature(final EObject o, final String feature, final Object value) {
    EClass _eClass = o.eClass();
    EStructuralFeature _eStructuralFeature = _eClass.getEStructuralFeature(feature);
    o.eSet(_eStructuralFeature, value);
  }
}
