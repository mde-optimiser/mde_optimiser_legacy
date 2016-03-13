/**
 */
package uk.ac.kcl.mDEOptimise.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.mDEOptimise.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDEOptimiseFactoryImpl extends EFactoryImpl implements MDEOptimiseFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MDEOptimiseFactory init()
  {
    try
    {
      MDEOptimiseFactory theMDEOptimiseFactory = (MDEOptimiseFactory)EPackage.Registry.INSTANCE.getEFactory(MDEOptimisePackage.eNS_URI);
      if (theMDEOptimiseFactory != null)
      {
        return theMDEOptimiseFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MDEOptimiseFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDEOptimiseFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MDEOptimisePackage.OPTIMISATION: return createOptimisation();
      case MDEOptimisePackage.BASEPATH_SPEC: return createBasepathSpec();
      case MDEOptimisePackage.META_MODEL_SPEC: return createMetaModelSpec();
      case MDEOptimisePackage.FITNESS_FUNCTION_SPEC: return createFitnessFunctionSpec();
      case MDEOptimisePackage.EVOLVER_SPEC: return createEvolverSpec();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Optimisation createOptimisation()
  {
    OptimisationImpl optimisation = new OptimisationImpl();
    return optimisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasepathSpec createBasepathSpec()
  {
    BasepathSpecImpl basepathSpec = new BasepathSpecImpl();
    return basepathSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaModelSpec createMetaModelSpec()
  {
    MetaModelSpecImpl metaModelSpec = new MetaModelSpecImpl();
    return metaModelSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FitnessFunctionSpec createFitnessFunctionSpec()
  {
    FitnessFunctionSpecImpl fitnessFunctionSpec = new FitnessFunctionSpecImpl();
    return fitnessFunctionSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvolverSpec createEvolverSpec()
  {
    EvolverSpecImpl evolverSpec = new EvolverSpecImpl();
    return evolverSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDEOptimisePackage getMDEOptimisePackage()
  {
    return (MDEOptimisePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MDEOptimisePackage getPackage()
  {
    return MDEOptimisePackage.eINSTANCE;
  }

} //MDEOptimiseFactoryImpl
