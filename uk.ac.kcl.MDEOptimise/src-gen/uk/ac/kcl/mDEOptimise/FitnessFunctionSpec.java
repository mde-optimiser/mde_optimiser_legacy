/**
 */
package uk.ac.kcl.mDEOptimise;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fitness Function Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mDEOptimise.FitnessFunctionSpec#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.mDEOptimise.MDEOptimisePackage#getFitnessFunctionSpec()
 * @model
 * @generated
 */
public interface FitnessFunctionSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(String)
   * @see uk.ac.kcl.mDEOptimise.MDEOptimisePackage#getFitnessFunctionSpec_Class()
   * @model
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mDEOptimise.FitnessFunctionSpec#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
  void setClass(String value);

} // FitnessFunctionSpec
