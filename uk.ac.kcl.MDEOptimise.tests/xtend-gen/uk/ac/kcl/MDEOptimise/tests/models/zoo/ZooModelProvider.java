package uk.ac.kcl.MDEOptimise.tests.models.zoo;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import uk.ac.kcl.interpreter.ModelProvider;

/**
 * Mock implementation simply providing a number of pre-defined zoo models.
 */
@SuppressWarnings("all")
public class ZooModelProvider implements ModelProvider {
  private final ResourceSet resourceSet = new ResourceSetImpl();
  
  @Override
  public Iterator<EObject> initialModels(final EPackage metamodel) {
    Iterator<EObject> _xblockexpression = null;
    {
      EPackage.Registry _packageRegistry = this.resourceSet.getPackageRegistry();
      String _nsURI = metamodel.getNsURI();
      _packageRegistry.put(_nsURI, metamodel);
      final List<String> modelPaths = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("src/uk/ac/kcl/MDEOptimise/tests/models/zoo/SimpleZoo.xmi"));
      final Function1<String, EObject> _function = (String p) -> {
        return this.loadModel(p);
      };
      List<EObject> _map = ListExtensions.<String, EObject>map(modelPaths, _function);
      _xblockexpression = _map.iterator();
    }
    return _xblockexpression;
  }
  
  public EObject loadModel(final String relativePath) {
    try {
      EObject _xblockexpression = null;
      {
        URI _createURI = URI.createURI(relativePath);
        final Resource resource = this.resourceSet.createResource(_createURI);
        resource.load(Collections.EMPTY_MAP);
        TreeIterator<EObject> _allContents = resource.getAllContents();
        _xblockexpression = IteratorExtensions.<EObject>head(_allContents);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
