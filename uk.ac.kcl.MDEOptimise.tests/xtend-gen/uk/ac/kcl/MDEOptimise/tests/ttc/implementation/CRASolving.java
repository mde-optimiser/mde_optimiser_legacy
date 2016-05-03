package uk.ac.kcl.MDEOptimise.tests.ttc.implementation;

import com.google.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.ac.kcl.MDEOptimise.tests.FullTestInjector;
import uk.ac.kcl.MDEOptimise.tests.models.DebuggableSimpleMO;
import uk.ac.kcl.MDEOptimise.tests.ttc.implementation.CRAModelProvider;
import uk.ac.kcl.interpreter.OptimisationInterpreter;
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
      DebuggableSimpleMO _debuggableSimpleMO = new DebuggableSimpleMO(50, 10, pathPrefix, modelProvider);
      final OptimisationInterpreter interpreter = new OptimisationInterpreter(model, _debuggableSimpleMO, modelProvider);
      final Set<EObject> optimiserOutcome = interpreter.execute();
      modelProvider.storeModels(optimiserOutcome, (pathPrefix + "/final"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
