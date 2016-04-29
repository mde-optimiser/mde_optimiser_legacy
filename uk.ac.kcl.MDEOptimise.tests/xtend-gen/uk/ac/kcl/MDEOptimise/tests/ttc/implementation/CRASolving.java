package uk.ac.kcl.MDEOptimise.tests.ttc.implementation;

import com.google.inject.Inject;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
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
      final Consumer<EObject> _function = (EObject omodel) -> {
        double _random = Math.random();
        String _plus = ("gen/models/test" + Double.valueOf(_random));
        String _plus_1 = (_plus + ".xmi");
        ((CRAModelProvider) modelProvider).writeModel(omodel, _plus_1);
      };
      optimiserOutcome.forEach(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
