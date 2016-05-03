package uk.ac.kcl.MDEOptimise.tests.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * An EqualityHelper that considers orderedness of references
 */
@SuppressWarnings("all")
public class ECoreComparator extends EcoreUtil.EqualityHelper {
  private static class EObjectComparator implements Comparator<EObject> {
    private List<EAttribute> attributes;
    
    public EObjectComparator(final List<EAttribute> attributes) {
      this.attributes = attributes;
    }
    
    @Override
    public int compare(final EObject o1, final EObject o2) {
      final Function2<Integer, EAttribute, Integer> _function = (Integer acc, EAttribute attr) -> {
        Object _eGet = o1.eGet(attr);
        int _hashCode = _eGet.hashCode();
        Object _eGet_1 = o2.eGet(attr);
        int _hashCode_1 = _eGet_1.hashCode();
        return Integer.valueOf(Integer.valueOf(_hashCode).compareTo(Integer.valueOf(_hashCode_1)));
      };
      return (int) IterableExtensions.<EAttribute, Integer>fold(this.attributes, Integer.valueOf(0), _function);
    }
  }
  
  @Override
  protected boolean haveEqualReference(final EObject eObject1, final EObject eObject2, final EReference reference) {
    boolean _or = false;
    boolean _isOrdered = reference.isOrdered();
    if (_isOrdered) {
      _or = true;
    } else {
      boolean _isMany = reference.isMany();
      boolean _not = (!_isMany);
      _or = _not;
    }
    if (_or) {
      return super.haveEqualReference(eObject1, eObject2, reference);
    }
    Object _eGet = eObject1.eGet(reference);
    final List<EObject> value1 = ((List<EObject>) _eGet);
    Object _eGet_1 = eObject2.eGet(reference);
    final List<EObject> value2 = ((List<EObject>) _eGet_1);
    Comparator<EObject> comparator = null;
    EList<EAttribute> _eKeys = reference.getEKeys();
    boolean _isEmpty = _eKeys.isEmpty();
    if (_isEmpty) {
      EClass _eReferenceType = reference.getEReferenceType();
      EList<EAttribute> _eAllAttributes = _eReferenceType.getEAllAttributes();
      ECoreComparator.EObjectComparator _eObjectComparator = new ECoreComparator.EObjectComparator(_eAllAttributes);
      comparator = _eObjectComparator;
    } else {
      EList<EAttribute> _eKeys_1 = reference.getEKeys();
      ECoreComparator.EObjectComparator _eObjectComparator_1 = new ECoreComparator.EObjectComparator(_eKeys_1);
      comparator = _eObjectComparator_1;
    }
    final ArrayList<EObject> list1 = new ArrayList<EObject>(value1);
    final ArrayList<EObject> list2 = new ArrayList<EObject>(value2);
    Collections.<EObject>sort(list1, comparator);
    Collections.<EObject>sort(list2, comparator);
    return this.equals(list1, list2);
  }
}
