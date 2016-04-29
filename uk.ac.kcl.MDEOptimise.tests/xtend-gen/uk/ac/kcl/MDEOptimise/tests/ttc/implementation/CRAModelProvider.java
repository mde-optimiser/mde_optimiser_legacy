package uk.ac.kcl.MDEOptimise.tests.ttc.implementation;

import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import uk.ac.kcl.MDEOptimise.tests.models.TestModelProvider;

/**
 * Mock implementation simply providing a number of pre-defined packages models.
 */
@SuppressWarnings("all")
public class CRAModelProvider extends TestModelProvider {
  @Override
  public List<String> getModelPaths() {
    return Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("src/uk/ac/kcl/MDEOptimise/tests/ttc/models/TTC_InputRDG_A.xmi"));
  }
}
