package uk.ac.kcl.MDEOptimise.tests;

import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.ac.kcl.MDEOptimiseInjectorProvider;
import uk.ac.kcl.mDEOptimise.Optimisation;

@InjectWith(MDEOptimiseInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class SyntaxTest {
  @Inject
  private ParseHelper<Optimisation> parser;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  /**
   * A basic test that should pass to demonstrate basic parsing functionality.
   */
  @Test
  public void testBasicParsing() {
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
      _builder.append("method \"cde\"");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("evolve using <ABC>");
      _builder.newLine();
      _builder.append("evolve using <CDE>");
      _builder.newLine();
      final Optimisation model = this.parser.parse(_builder);
      Assert.assertNotNull(model);
      this._validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
