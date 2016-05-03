package uk.ac.kcl.MDEOptimise.tests;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.ac.kcl.MDEOptimise.tests.FullTestInjector;
import uk.ac.kcl.MDEOptimise.tests.models.ECoreComparator;
import uk.ac.kcl.MDEOptimise.tests.models.packages.PackagesModelProvider;
import uk.ac.kcl.interpreter.OptimisationInterpreter;
import uk.ac.kcl.interpreter.algorithms.SimpleMO;
import uk.ac.kcl.mDEOptimise.Optimisation;

/**
 * A test suite for problems with multiple optimisation objectives.
 */
@InjectWith(FullTestInjector.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class MOInterpreterTest {
  @Inject
  private ParseHelper<Optimisation> parser;
  
  @Test
  public void testMOInterpreter() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("basepath <src/uk/ac/kcl/MDEOptimise/tests/models/packages/>");
      _builder.newLine();
      _builder.append("metamodel <packages.ecore>");
      _builder.newLine();
      _builder.append("fitness \"uk.ac.kcl.MDEOptimise.tests.models.packages.MinimizeDependencies\"");
      _builder.newLine();
      _builder.append("fitness \"uk.ac.kcl.MDEOptimise.tests.models.packages.MinimizeEmptyPackages\"");
      _builder.newLine();
      _builder.append("fitness \"uk.ac.kcl.MDEOptimise.tests.models.packages.MinimizePackageLessClasses\"");
      _builder.newLine();
      _builder.append("evolve using <packageAllocation.henshin> unit \"CreatePackage\"");
      _builder.newLine();
      _builder.append("evolve using <packageAllocation.henshin> unit \"AllocateUnallocatedClass\"");
      _builder.newLine();
      _builder.append("evolve using <packageAllocation.henshin> unit \"MoveClass\"");
      _builder.newLine();
      final Optimisation model = this.parser.parse(_builder);
      Assert.assertNotNull(model);
      final PackagesModelProvider mp = new PackagesModelProvider();
      SimpleMO _simpleMO = new SimpleMO(50, 10);
      final OptimisationInterpreter interpreter = new OptimisationInterpreter(model, _simpleMO, mp);
      final Set<EObject> optimiserOutcome = interpreter.execute();
      final EObject expectedOutcome = mp.loadModel("src/uk/ac/kcl/MDEOptimise/tests/models/packages/OneTestSetupResult.xmi");
      final Function1<EObject, Boolean> _function = (EObject m) -> {
        ECoreComparator _eCoreComparator = new ECoreComparator();
        return Boolean.valueOf(_eCoreComparator.equals(expectedOutcome, m));
      };
      boolean _exists = IterableExtensions.<EObject>exists(optimiserOutcome, _function);
      Assert.assertTrue(_exists);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
