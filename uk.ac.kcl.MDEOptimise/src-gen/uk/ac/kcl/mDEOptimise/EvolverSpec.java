/**
 */
package uk.ac.kcl.mDEOptimise;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evolver Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mDEOptimise.EvolverSpec#getRule_location <em>Rule location</em>}</li>
 *   <li>{@link uk.ac.kcl.mDEOptimise.EvolverSpec#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.mDEOptimise.MDEOptimisePackage#getEvolverSpec()
 * @model
 * @generated
 */
public interface EvolverSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Rule location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule location</em>' attribute.
   * @see #setRule_location(String)
   * @see uk.ac.kcl.mDEOptimise.MDEOptimisePackage#getEvolverSpec_Rule_location()
   * @model
   * @generated
   */
  String getRule_location();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mDEOptimise.EvolverSpec#getRule_location <em>Rule location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule location</em>' attribute.
   * @see #getRule_location()
   * @generated
   */
  void setRule_location(String value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see #setUnit(String)
   * @see uk.ac.kcl.mDEOptimise.MDEOptimisePackage#getEvolverSpec_Unit()
   * @model
   * @generated
   */
  String getUnit();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mDEOptimise.EvolverSpec#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see #getUnit()
   * @generated
   */
  void setUnit(String value);

} // EvolverSpec
