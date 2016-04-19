/**
 */
package uk.ac.kcl.mDEOptimise.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.mDEOptimise.BasepathSpec;
import uk.ac.kcl.mDEOptimise.EvolverSpec;
import uk.ac.kcl.mDEOptimise.FitnessFunctionSpec;
import uk.ac.kcl.mDEOptimise.MDEOptimisePackage;
import uk.ac.kcl.mDEOptimise.MetaModelSpec;
import uk.ac.kcl.mDEOptimise.Optimisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mDEOptimise.impl.OptimisationImpl#getBasepath <em>Basepath</em>}</li>
 *   <li>{@link uk.ac.kcl.mDEOptimise.impl.OptimisationImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link uk.ac.kcl.mDEOptimise.impl.OptimisationImpl#getFitness <em>Fitness</em>}</li>
 *   <li>{@link uk.ac.kcl.mDEOptimise.impl.OptimisationImpl#getEvolvers <em>Evolvers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptimisationImpl extends MinimalEObjectImpl.Container implements Optimisation
{
  /**
   * The cached value of the '{@link #getBasepath() <em>Basepath</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasepath()
   * @generated
   * @ordered
   */
  protected BasepathSpec basepath;

  /**
   * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodel()
   * @generated
   * @ordered
   */
  protected MetaModelSpec metamodel;

  /**
   * The cached value of the '{@link #getFitness() <em>Fitness</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFitness()
   * @generated
   * @ordered
   */
  protected EList<FitnessFunctionSpec> fitness;

  /**
   * The cached value of the '{@link #getEvolvers() <em>Evolvers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvolvers()
   * @generated
   * @ordered
   */
  protected EList<EvolverSpec> evolvers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptimisationImpl()
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
    return MDEOptimisePackage.Literals.OPTIMISATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasepathSpec getBasepath()
  {
    return basepath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasepath(BasepathSpec newBasepath, NotificationChain msgs)
  {
    BasepathSpec oldBasepath = basepath;
    basepath = newBasepath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MDEOptimisePackage.OPTIMISATION__BASEPATH, oldBasepath, newBasepath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasepath(BasepathSpec newBasepath)
  {
    if (newBasepath != basepath)
    {
      NotificationChain msgs = null;
      if (basepath != null)
        msgs = ((InternalEObject)basepath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MDEOptimisePackage.OPTIMISATION__BASEPATH, null, msgs);
      if (newBasepath != null)
        msgs = ((InternalEObject)newBasepath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MDEOptimisePackage.OPTIMISATION__BASEPATH, null, msgs);
      msgs = basicSetBasepath(newBasepath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MDEOptimisePackage.OPTIMISATION__BASEPATH, newBasepath, newBasepath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaModelSpec getMetamodel()
  {
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetamodel(MetaModelSpec newMetamodel, NotificationChain msgs)
  {
    MetaModelSpec oldMetamodel = metamodel;
    metamodel = newMetamodel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MDEOptimisePackage.OPTIMISATION__METAMODEL, oldMetamodel, newMetamodel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetamodel(MetaModelSpec newMetamodel)
  {
    if (newMetamodel != metamodel)
    {
      NotificationChain msgs = null;
      if (metamodel != null)
        msgs = ((InternalEObject)metamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MDEOptimisePackage.OPTIMISATION__METAMODEL, null, msgs);
      if (newMetamodel != null)
        msgs = ((InternalEObject)newMetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MDEOptimisePackage.OPTIMISATION__METAMODEL, null, msgs);
      msgs = basicSetMetamodel(newMetamodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MDEOptimisePackage.OPTIMISATION__METAMODEL, newMetamodel, newMetamodel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FitnessFunctionSpec> getFitness()
  {
    if (fitness == null)
    {
      fitness = new EObjectContainmentEList<FitnessFunctionSpec>(FitnessFunctionSpec.class, this, MDEOptimisePackage.OPTIMISATION__FITNESS);
    }
    return fitness;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EvolverSpec> getEvolvers()
  {
    if (evolvers == null)
    {
      evolvers = new EObjectContainmentEList<EvolverSpec>(EvolverSpec.class, this, MDEOptimisePackage.OPTIMISATION__EVOLVERS);
    }
    return evolvers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MDEOptimisePackage.OPTIMISATION__BASEPATH:
        return basicSetBasepath(null, msgs);
      case MDEOptimisePackage.OPTIMISATION__METAMODEL:
        return basicSetMetamodel(null, msgs);
      case MDEOptimisePackage.OPTIMISATION__FITNESS:
        return ((InternalEList<?>)getFitness()).basicRemove(otherEnd, msgs);
      case MDEOptimisePackage.OPTIMISATION__EVOLVERS:
        return ((InternalEList<?>)getEvolvers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MDEOptimisePackage.OPTIMISATION__BASEPATH:
        return getBasepath();
      case MDEOptimisePackage.OPTIMISATION__METAMODEL:
        return getMetamodel();
      case MDEOptimisePackage.OPTIMISATION__FITNESS:
        return getFitness();
      case MDEOptimisePackage.OPTIMISATION__EVOLVERS:
        return getEvolvers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MDEOptimisePackage.OPTIMISATION__BASEPATH:
        setBasepath((BasepathSpec)newValue);
        return;
      case MDEOptimisePackage.OPTIMISATION__METAMODEL:
        setMetamodel((MetaModelSpec)newValue);
        return;
      case MDEOptimisePackage.OPTIMISATION__FITNESS:
        getFitness().clear();
        getFitness().addAll((Collection<? extends FitnessFunctionSpec>)newValue);
        return;
      case MDEOptimisePackage.OPTIMISATION__EVOLVERS:
        getEvolvers().clear();
        getEvolvers().addAll((Collection<? extends EvolverSpec>)newValue);
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
      case MDEOptimisePackage.OPTIMISATION__BASEPATH:
        setBasepath((BasepathSpec)null);
        return;
      case MDEOptimisePackage.OPTIMISATION__METAMODEL:
        setMetamodel((MetaModelSpec)null);
        return;
      case MDEOptimisePackage.OPTIMISATION__FITNESS:
        getFitness().clear();
        return;
      case MDEOptimisePackage.OPTIMISATION__EVOLVERS:
        getEvolvers().clear();
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
      case MDEOptimisePackage.OPTIMISATION__BASEPATH:
        return basepath != null;
      case MDEOptimisePackage.OPTIMISATION__METAMODEL:
        return metamodel != null;
      case MDEOptimisePackage.OPTIMISATION__FITNESS:
        return fitness != null && !fitness.isEmpty();
      case MDEOptimisePackage.OPTIMISATION__EVOLVERS:
        return evolvers != null && !evolvers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OptimisationImpl
