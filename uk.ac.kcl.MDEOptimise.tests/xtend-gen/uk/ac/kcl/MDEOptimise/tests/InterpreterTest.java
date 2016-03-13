package uk.ac.kcl.MDEOptimise.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.ac.kcl.MDEOptimiseInjectorProvider;
import uk.ac.kcl.mDEOptimise.Optimisation;

@InjectWith(MDEOptimiseInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class InterpreterTest {
  @Inject
  private ParseHelper<Optimisation> parser;
  
  @Test
  public void testBasicInterpreter() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method head is undefined for the type InterpreterTest"
      + "\nType mismatch: type void is not applicable at this location");
  }
}
