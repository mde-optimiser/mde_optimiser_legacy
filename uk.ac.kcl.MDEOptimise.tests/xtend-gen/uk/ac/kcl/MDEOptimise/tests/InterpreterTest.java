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
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("metamodel <ABC>");
      _builder.newLine();
      _builder.append("fitness \"uk.ac.kcl.MDEOptimise.tests.models.zoo.ZooFitnessFunction\"");
      _builder.newLine();
      _builder.append("evolve using <src/uk/ac/kcl/MDEOptimise/tests/models/zoo/zoo_evolution.henshin>");
      _builder.newLine();
      final Optimisation model = this.parser.parse(_builder);
      Assert.assertNotNull(model);
      RandomHillClimbing _randomHillClimbing = new RandomHillClimbing(1);
      ZooModelProvider _zooModelProvider = new ZooModelProvider();
      final OptimisationInterpreter interpreter = new OptimisationInterpreter(model, _randomHillClimbing, _zooModelProvider);
      interpreter.execute();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
