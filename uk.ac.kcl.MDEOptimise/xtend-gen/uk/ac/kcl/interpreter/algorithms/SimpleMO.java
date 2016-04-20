package uk.ac.kcl.interpreter.algorithms;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import uk.ac.kcl.interpreter.OptimisationAlgorithm;
import uk.ac.kcl.interpreter.OptimisationInterpreter;

/**
 * A simple multi-objective optimisation algorithm.
 */
@SuppressWarnings("all")
public class SimpleMO implements OptimisationAlgorithm {
  /**
   * Maximum number of iterations to run for
   */
  private int maxIterations;
  
  /**
   * Maximum size of populations to keep around
   */
  private int maxPopulationSize;
  
  public SimpleMO(final int maxIterations, final int maxPopulationSize) {
    this.maxIterations = maxIterations;
    this.maxPopulationSize = maxPopulationSize;
  }
  
  @Override
  public Set<EObject> execute(final OptimisationInterpreter interpreter) {
    Set<EObject> _xblockexpression = null;
    {
      Iterator<EObject> _initialSolutions = interpreter.getInitialSolutions();
      List<EObject> currentPareto = IteratorExtensions.<EObject>toList(_initialSolutions);
      final Function1<EObject, List<Double>> _function = (EObject cs) -> {
        return interpreter.fitness(cs);
      };
      List<List<Double>> currentFitnesses = ListExtensions.<EObject, List<Double>>map(currentPareto, _function);
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, this.maxIterations, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          final Function1<EObject, EObject> _function_1 = (EObject cs) -> {
            return interpreter.evolve(cs);
          };
          List<EObject> _map = ListExtensions.<EObject, EObject>map(currentPareto, _function_1);
          final Function1<EObject, Boolean> _function_2 = (EObject cs) -> {
            return Boolean.valueOf((!Objects.equal(cs, null)));
          };
          Iterable<EObject> _filter = IterableExtensions.<EObject>filter(_map, _function_2);
          List<EObject> _list = IterableExtensions.<EObject>toList(_filter);
          final ArrayList<EObject> newSolutions = new ArrayList<EObject>(_list);
          final Function1<EObject, List<Double>> _function_3 = (EObject cs) -> {
            return interpreter.fitness(cs);
          };
          List<List<Double>> _map_1 = ListExtensions.<EObject, List<Double>>map(newSolutions, _function_3);
          final ArrayList<List<Double>> newFitnesses = new ArrayList<List<Double>>(_map_1);
          final ArrayList<EObject> combinedSolutions = new ArrayList<EObject>();
          combinedSolutions.addAll(currentPareto);
          combinedSolutions.addAll(newSolutions);
          final ArrayList<List<Double>> combinedFitnesses = new ArrayList<List<Double>>();
          combinedFitnesses.addAll(currentFitnesses);
          combinedFitnesses.addAll(newFitnesses);
          final Pair<List<EObject>, List<List<Double>>> newGeneration = interpreter.getTopRanked(this.maxPopulationSize, combinedSolutions, combinedFitnesses);
          List<EObject> _key = newGeneration.getKey();
          currentPareto = _key;
          List<List<Double>> _value = newGeneration.getValue();
          currentFitnesses = _value;
        }
      }
      _xblockexpression = IterableExtensions.<EObject>toSet(currentPareto);
    }
    return _xblockexpression;
  }
}
