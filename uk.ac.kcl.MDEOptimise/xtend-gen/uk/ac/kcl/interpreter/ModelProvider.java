package uk.ac.kcl.interpreter;

import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;

/**
 * Strategy for generating initial models.
 */
@SuppressWarnings("all")
public interface ModelProvider {
  /**
   * Lazily generate initial models given a metamodel URI
   */
  public abstract Iterator<EObject> initialModels(final String metamodelURI);
}
