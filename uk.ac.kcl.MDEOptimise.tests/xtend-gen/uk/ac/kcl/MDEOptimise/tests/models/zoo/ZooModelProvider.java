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
import org.eclipse.emf.ecore.util.EcoreUtil;
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
  @Override
  public Iterator<EObject> initialModels(final EPackage metamodel) {
    Iterator<EObject> _xblockexpression = null;
    {
      final ResourceSet resourceSet = new ResourceSetImpl();
      EPackage.Registry _packageRegistry = resourceSet.getPackageRegistry();
      String _nsURI = metamodel.getNsURI();
      _packageRegistry.put(_nsURI, metamodel);
      final List<String> modelPaths = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("src/uk/ac/kcl/MDEOptimise/tests/models/zoo/SimpleZoo.xmi"));
      final Function1<String, EObject> _function = (String p) -> {
        try {
          EObject _xblockexpression_1 = null;
          {
            URI _createURI = URI.createURI(p);
            final Resource resource = resourceSet.createResource(_createURI);
            resource.load(Collections.EMPTY_MAP);
            EcoreUtil.resolveAll(resource);
            TreeIterator<EObject> _allContents = resource.getAllContents();
            _xblockexpression_1 = IteratorExtensions.<EObject>head(_allContents);
          }
          return _xblockexpression_1;
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      List<EObject> _map = ListExtensions.<String, EObject>map(modelPaths, _function);
      _xblockexpression = _map.iterator();
    }
    return _xblockexpression;
  }
}
