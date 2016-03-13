package uk.ac.kcl.MDEOptimise.tests;

import javax.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method basepath is undefined for the type SyntaxTest"
      + "\nlocation cannot be resolved");
  }
}
