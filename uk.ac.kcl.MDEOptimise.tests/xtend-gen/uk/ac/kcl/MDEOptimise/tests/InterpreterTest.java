package uk.ac.kcl.MDEOptimise.tests;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.ac.kcl.MDEOptimise.tests.models.zoo.ZooModelProvider;
import uk.ac.kcl.MDEOptimiseInjectorProvider;
import uk.ac.kcl.interpreter.OptimisationInterpreter;
import uk.ac.kcl.interpreter.algorithms.RandomHillClimbing;
import uk.ac.kcl.mDEOptimise.Optimisation;

@InjectWith(MDEOptimiseInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class InterpreterTest {
  @Inject
  private ParseHelper<Optimisation> parser;
  
  @Test
  public void testBasicInterpreter() {
    this.genericZooInterpreterImpl(1);
  }
  
  @Test
  public void testReactionToEvolveFail() {
    this.genericZooInterpreterImpl(2);
  }
  
  public void genericZooInterpreterImpl(final int maxIterations) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("basepath <src/uk/ac/kcl/MDEOptimise/tests/models/zoo/>");
      _builder.newLine();
      _builder.append("metamodel <zoo.ecore>");
      _builder.newLine();
      _builder.append("fitness \"uk.ac.kcl.MDEOptimise.tests.models.zoo.ZooFitnessFunction\"");
      _builder.newLine();
      _builder.append("evolve using <zoo_evolution.henshin> unit \"MoveAnimal\"");
      _builder.newLine();
      final Optimisation model = this.parser.parse(_builder);
      Assert.assertNotNull(model);
      final ZooModelProvider mp = new ZooModelProvider();
      RandomHillClimbing _randomHillClimbing = new RandomHillClimbing(maxIterations);
      final OptimisationInterpreter interpreter = new OptimisationInterpreter(model, _randomHillClimbing, mp);
      Set<EObject> _execute = interpreter.execute();
      final EObject optimiserOutcome = IterableExtensions.<EObject>head(_execute);
      final EObject expectedOutcome = mp.loadModel("src/uk/ac/kcl/MDEOptimise/tests/models/zoo/SimpleZoo_expected.xmi");
      boolean _equals = EcoreUtil.equals(expectedOutcome, optimiserOutcome);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
