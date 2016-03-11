package uk.ac.kcl.MDEOptimise.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.ac.kcl.MDEOptimiseInjectorProvider;
import uk.ac.kcl.interpreter.OptimisationInterpreter;
import uk.ac.kcl.mDEOptimise.Optimisation;

@InjectWith(MDEOptimiseInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class InterpreterTest {
  @Inject
  private ParseHelper<Optimisation> parser;
  
  @Test
  public void testBasicInterpreter() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("metamodel <ABC>");
      _builder.newLine();
      _builder.append("fitness {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class \"ABC\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("method \"def\"");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("evolve using <ABC>");
      _builder.newLine();
      final Optimisation model = this.parser.parse(_builder);
      Assert.assertNotNull(model);
      final OptimisationInterpreter interpreter = new OptimisationInterpreter(model);
      interpreter.execute();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
