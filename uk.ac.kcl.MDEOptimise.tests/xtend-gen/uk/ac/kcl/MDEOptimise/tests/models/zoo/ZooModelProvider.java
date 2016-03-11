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
  @Override
  public Iterator<EObject> initialModels(final String metamodelURI) {
    try {
      Iterator<EObject> _xblockexpression = null;
      {
        final ResourceSet resourceSet = new ResourceSetImpl();
        URI _createURI = URI.createURI("src/uk/ac/kcl/MDEOptimise/tests/models/zoo/zoo.ecore");
        final Resource mm = resourceSet.createResource(_createURI);
        mm.load(null);
        EPackage.Registry _packageRegistry = resourceSet.getPackageRegistry();
        TreeIterator<EObject> _allContents = mm.getAllContents();
        EObject _head = IteratorExtensions.<EObject>head(_allContents);
        _packageRegistry.put("http://inf.kcl.ac.uk/zoo/2016", _head);
        final List<String> modelPaths = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("src/uk/ac/kcl/MDEOptimise/tests/models/zoo/SimpleZoo.xmi"));
        final Function1<String, EObject> _function = (String p) -> {
          try {
            EObject _xblockexpression_1 = null;
            {
              URI _createURI_1 = URI.createURI(p);
              final Resource resource = resourceSet.createResource(_createURI_1);
              resource.load(Collections.EMPTY_MAP);
              TreeIterator<EObject> _allContents_1 = resource.getAllContents();
              _xblockexpression_1 = IteratorExtensions.<EObject>head(_allContents_1);
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
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
