/**
 */
package uk.ac.kcl.mDEOptimise.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.mDEOptimise.EvolverSpec;
import uk.ac.kcl.mDEOptimise.MDEOptimisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evolver Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mDEOptimise.impl.EvolverSpecImpl#getRule_location <em>Rule location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvolverSpecImpl extends MinimalEObjectImpl.Container implements EvolverSpec
{
  /**
   * The default value of the '{@link #getRule_location() <em>Rule location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule_location()
   * @generated
   * @ordered
   */
  protected static final String RULE_LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRule_location() <em>Rule location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule_location()
   * @generated
   * @ordered
   */
  protected String rule_location = RULE_LOCATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvolverSpecImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MDEOptimisePackage.Literals.EVOLVER_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRule_location()
  {
    return rule_location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule_location(String newRule_location)
  {
    String oldRule_location = rule_location;
    rule_location = newRule_location;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MDEOptimisePackage.EVOLVER_SPEC__RULE_LOCATION, oldRule_location, rule_location));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MDEOptimisePackage.EVOLVER_SPEC__RULE_LOCATION:
        return getRule_location();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MDEOptimisePackage.EVOLVER_SPEC__RULE_LOCATION:
        setRule_location((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MDEOptimisePackage.EVOLVER_SPEC__RULE_LOCATION:
        setRule_location(RULE_LOCATION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MDEOptimisePackage.EVOLVER_SPEC__RULE_LOCATION:
        return RULE_LOCATION_EDEFAULT == null ? rule_location != null : !RULE_LOCATION_EDEFAULT.equals(rule_location);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (rule_location: ");
    result.append(rule_location);
    result.append(')');
    return result.toString();
  }

} //EvolverSpecImpl
