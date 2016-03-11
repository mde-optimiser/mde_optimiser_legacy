/**
 */
package uk.ac.kcl.mDEOptimise.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.mDEOptimise.EvolverSpec;
import uk.ac.kcl.mDEOptimise.FitnessFunctionSpec;
import uk.ac.kcl.mDEOptimise.MDEOptimiseFactory;
import uk.ac.kcl.mDEOptimise.MDEOptimisePackage;
import uk.ac.kcl.mDEOptimise.MetaModelSpec;
import uk.ac.kcl.mDEOptimise.Optimisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDEOptimisePackageImpl extends EPackageImpl implements MDEOptimisePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optimisationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaModelSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fitnessFunctionSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evolverSpecEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.mDEOptimise.MDEOptimisePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MDEOptimisePackageImpl()
  {
    super(eNS_URI, MDEOptimiseFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MDEOptimisePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MDEOptimisePackage init()
  {
    if (isInited) return (MDEOptimisePackage)EPackage.Registry.INSTANCE.getEPackage(MDEOptimisePackage.eNS_URI);

    // Obtain or create and register package
    MDEOptimisePackageImpl theMDEOptimisePackage = (MDEOptimisePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MDEOptimisePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MDEOptimisePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMDEOptimisePackage.createPackageContents();

    // Initialize created meta-data
    theMDEOptimisePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMDEOptimisePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MDEOptimisePackage.eNS_URI, theMDEOptimisePackage);
    return theMDEOptimisePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptimisation()
  {
    return optimisationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptimisation_Metamodel()
  {
    return (EReference)optimisationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptimisation_Fitness()
  {
    return (EReference)optimisationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptimisation_Evolvers()
  {
    return (EReference)optimisationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaModelSpec()
  {
    return metaModelSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaModelSpec_Location()
  {
    return (EAttribute)metaModelSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFitnessFunctionSpec()
  {
    return fitnessFunctionSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFitnessFunctionSpec_Class()
  {
    return (EAttribute)fitnessFunctionSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvolverSpec()
  {
    return evolverSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvolverSpec_Rule_location()
  {
    return (EAttribute)evolverSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDEOptimiseFactory getMDEOptimiseFactory()
  {
    return (MDEOptimiseFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    optimisationEClass = createEClass(OPTIMISATION);
    createEReference(optimisationEClass, OPTIMISATION__METAMODEL);
    createEReference(optimisationEClass, OPTIMISATION__FITNESS);
    createEReference(optimisationEClass, OPTIMISATION__EVOLVERS);

    metaModelSpecEClass = createEClass(META_MODEL_SPEC);
    createEAttribute(metaModelSpecEClass, META_MODEL_SPEC__LOCATION);

    fitnessFunctionSpecEClass = createEClass(FITNESS_FUNCTION_SPEC);
    createEAttribute(fitnessFunctionSpecEClass, FITNESS_FUNCTION_SPEC__CLASS);

    evolverSpecEClass = createEClass(EVOLVER_SPEC);
    createEAttribute(evolverSpecEClass, EVOLVER_SPEC__RULE_LOCATION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(optimisationEClass, Optimisation.class, "Optimisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptimisation_Metamodel(), this.getMetaModelSpec(), null, "metamodel", null, 0, 1, Optimisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptimisation_Fitness(), this.getFitnessFunctionSpec(), null, "fitness", null, 0, 1, Optimisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptimisation_Evolvers(), this.getEvolverSpec(), null, "evolvers", null, 0, -1, Optimisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaModelSpecEClass, MetaModelSpec.class, "MetaModelSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetaModelSpec_Location(), ecorePackage.getEString(), "location", null, 0, 1, MetaModelSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fitnessFunctionSpecEClass, FitnessFunctionSpec.class, "FitnessFunctionSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFitnessFunctionSpec_Class(), ecorePackage.getEString(), "class", null, 0, 1, FitnessFunctionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evolverSpecEClass, EvolverSpec.class, "EvolverSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvolverSpec_Rule_location(), ecorePackage.getEString(), "rule_location", null, 0, 1, EvolverSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MDEOptimisePackageImpl
