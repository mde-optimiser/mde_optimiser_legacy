package uk.ac.kcl.MDEOptimise.tests;

import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
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
import uk.ac.kcl.mDEOptimise.EvolverSpec;
import uk.ac.kcl.mDEOptimise.MetaModelSpec;
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
      _builder.append("fitness \"ABC\"");
      _builder.newLine();
      _builder.append("evolve using <ABC>");
      _builder.newLine();
      _builder.append("evolve using <CDE>");
      _builder.newLine();
      final Optimisation model = this.parser.parse(_builder);
      Assert.assertNotNull(model);
      this._validationTestHelper.assertNoIssues(model);
      MetaModelSpec _metamodel = model.getMetamodel();
      String _location = _metamodel.getLocation();
      Assert.assertEquals("ABC", _location);
      EList<EvolverSpec> _evolvers = model.getEvolvers();
      EvolverSpec _get = _evolvers.get(0);
      String _rule_location = _get.getRule_location();
      Assert.assertEquals("ABC", _rule_location);
      EList<EvolverSpec> _evolvers_1 = model.getEvolvers();
      EvolverSpec _get_1 = _evolvers_1.get(1);
      String _rule_location_1 = _get_1.getRule_location();
      Assert.assertEquals("CDE", _rule_location_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
