package uk.ac.kcl.MDEOptimise.tests.models

import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper

/**
 * An EqualityHelper that considers orderedness of references
 */
class ECoreComparator extends EqualityHelper {
	private static class EObjectComparator implements Comparator<EObject> {
		private List<EAttribute> attributes
		
		new (List<EAttribute> attributes) {
			this.attributes = attributes	
		}
		
		override int compare(EObject o1, EObject o2) {
			attributes.fold(0, [acc, attr |
				o1.eGet (attr).hashCode.compareTo(o2.eGet(attr).hashCode)
			])
		}
	}
	
	protected override boolean haveEqualReference(EObject eObject1, EObject eObject2, EReference reference) {
		if (reference.isOrdered || !reference.isMany) {
			return super.haveEqualReference(eObject1, eObject2, reference)
		}
		
		val value1 = eObject1.eGet(reference) as List<EObject>
		val value2 = eObject2.eGet(reference) as List<EObject>
		
		var Comparator<EObject> comparator = null
		if (reference.EKeys.empty) {
			comparator = new EObjectComparator(reference.EReferenceType.EAllAttributes)
		} else {
			comparator = new EObjectComparator(reference.EKeys)			
		}
        val list1 = new ArrayList<EObject>(value1);
        val list2 = new ArrayList<EObject>(value2);
        Collections.sort(list1, comparator);
        Collections.sort(list2, comparator);
		
		return equals(list1, list2)
    }
}