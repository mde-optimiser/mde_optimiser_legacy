package uk.ac.kcl.interpreter;

import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * Strategy for generating initial models.
 */
@SuppressWarnings("all")
public interface ModelProvider {
  /**
   * Lazily generate initial models given a meta-model. This has to make sure that all models returned are instances of the given meta-model (in particular for dynamic model instances!).
   */
  public abstract Iterator<EObject> initialModels(final EPackage metamodel);
}
