package uk.ac.kcl.MDEOptimise.tests;

import uk.ac.kcl.interpreter.OptimisationAlgorithm;
import uk.ac.kcl.interpreter.OptimisationInterpreter;
import uk.ac.kcl.interpreter.Population;

@SuppressWarnings("all")
public class BasicOptimisationAlgorithm implements OptimisationAlgorithm {
  @Override
  public Population initialPopulation(final OptimisationInterpreter interpreter) {
    return null;
  }
  
  @Override
  public boolean runAgain() {
    return false;
  }
  
  @Override
  public Population computeNextGeneration(final Population currentGeneration, final OptimisationInterpreter interpreter) {
    return currentGeneration;
  }
}
