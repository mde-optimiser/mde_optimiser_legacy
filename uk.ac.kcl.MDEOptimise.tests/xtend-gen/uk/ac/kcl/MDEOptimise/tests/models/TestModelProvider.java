package uk.ac.kcl.MDEOptimise.tests.models;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import uk.ac.kcl.interpreter.ModelProvider;

@SuppressWarnings("all")
public abstract class TestModelProvider implements ModelProvider {
  private final ResourceSet resourceSet = new ResourceSetImpl();
  
  @Override
  public Iterator<EObject> initialModels(final EPackage metamodel) {
    Iterator<EObject> _xblockexpression = null;
    {
      EPackage.Registry _packageRegistry = this.resourceSet.getPackageRegistry();
      String _nsURI = metamodel.getNsURI();
      _packageRegistry.put(_nsURI, metamodel);
      List<String> _modelPaths = this.getModelPaths();
      final Function1<String, EObject> _function = (String p) -> {
        return this.loadModel(p);
      };
      List<EObject> _map = ListExtensions.<String, EObject>map(_modelPaths, _function);
      _xblockexpression = _map.iterator();
    }
    return _xblockexpression;
  }
  
  public EObject loadModel(final String path) {
    try {
      EObject _xblockexpression = null;
      {
        URI _createURI = URI.createURI(path);
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
  
  public void writeModel(final EObject model, final String path) {
    try {
      URI _createURI = URI.createURI(path);
      final Resource resource = this.resourceSet.createResource(_createURI);
      boolean _isLoaded = resource.isLoaded();
      if (_isLoaded) {
        EList<EObject> _contents = resource.getContents();
        _contents.clear();
      }
      EList<EObject> _contents_1 = resource.getContents();
      _contents_1.add(model);
      resource.save(Collections.EMPTY_MAP);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void storeModel(final EObject model, final String pathPrefix) {
    int _hashCode = model.hashCode();
    String _format = String.format("%08X", Integer.valueOf(_hashCode));
    String _plus = ((pathPrefix + "/") + _format);
    String _plus_1 = (_plus + ".xmi");
    this.writeModel(model, _plus_1);
  }
  
  public void storeModels(final Collection<EObject> models, final String pathPrefix) {
    final Consumer<EObject> _function = (EObject m) -> {
      this.storeModel(m, pathPrefix);
    };
    models.forEach(_function);
  }
  
  public abstract List<String> getModelPaths();
}
