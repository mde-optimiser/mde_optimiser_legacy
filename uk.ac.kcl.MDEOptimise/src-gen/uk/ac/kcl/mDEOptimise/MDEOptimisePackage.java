/**
 */
package uk.ac.kcl.mDEOptimise;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.mDEOptimise.MDEOptimiseFactory
 * @model kind="package"
 * @generated
 */
public interface MDEOptimisePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mDEOptimise";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/kcl/MDEOptimise";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mDEOptimise";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MDEOptimisePackage eINSTANCE = uk.ac.kcl.mDEOptimise.impl.MDEOptimisePackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.kcl.mDEOptimise.impl.OptimisationImpl <em>Optimisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.mDEOptimise.impl.OptimisationImpl
   * @see uk.ac.kcl.mDEOptimise.impl.MDEOptimisePackageImpl#getOptimisation()
   * @generated
   */
  int OPTIMISATION = 0;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIMISATION__METAMODEL = 0;

  /**
   * The feature id for the '<em><b>Fitness</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIMISATION__FITNESS = 1;

  /**
   * The feature id for the '<em><b>Evolvers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIMISATION__EVOLVERS = 2;

  /**
   * The number of structural features of the '<em>Optimisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIMISATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.mDEOptimise.impl.MetaModelSpecImpl <em>Meta Model Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.mDEOptimise.impl.MetaModelSpecImpl
   * @see uk.ac.kcl.mDEOptimise.impl.MDEOptimisePackageImpl#getMetaModelSpec()
   * @generated
   */
  int META_MODEL_SPEC = 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_MODEL_SPEC__LOCATION = 0;

  /**
   * The number of structural features of the '<em>Meta Model Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_MODEL_SPEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.mDEOptimise.impl.FitnessFunctionSpecImpl <em>Fitness Function Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.mDEOptimise.impl.FitnessFunctionSpecImpl
   * @see uk.ac.kcl.mDEOptimise.impl.MDEOptimisePackageImpl#getFitnessFunctionSpec()
   * @generated
   */
  int FITNESS_FUNCTION_SPEC = 2;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FITNESS_FUNCTION_SPEC__CLASS = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FITNESS_FUNCTION_SPEC__METHOD = 1;

  /**
   * The number of structural features of the '<em>Fitness Function Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FITNESS_FUNCTION_SPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.mDEOptimise.impl.EvolverSpecImpl <em>Evolver Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.mDEOptimise.impl.EvolverSpecImpl
   * @see uk.ac.kcl.mDEOptimise.impl.MDEOptimisePackageImpl#getEvolverSpec()
   * @generated
   */
  int EVOLVER_SPEC = 3;

  /**
   * The feature id for the '<em><b>Rule location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVOLVER_SPEC__RULE_LOCATION = 0;

  /**
   * The number of structural features of the '<em>Evolver Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVOLVER_SPEC_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link uk.ac.kcl.mDEOptimise.Optimisation <em>Optimisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optimisation</em>'.
   * @see uk.ac.kcl.mDEOptimise.Optimisation
   * @generated
   */
  EClass getOptimisation();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.mDEOptimise.Optimisation#getMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metamodel</em>'.
   * @see uk.ac.kcl.mDEOptimise.Optimisation#getMetamodel()
   * @see #getOptimisation()
   * @generated
   */
  EReference getOptimisation_Metamodel();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.mDEOptimise.Optimisation#getFitness <em>Fitness</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fitness</em>'.
   * @see uk.ac.kcl.mDEOptimise.Optimisation#getFitness()
   * @see #getOptimisation()
   * @generated
   */
  EReference getOptimisation_Fitness();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.mDEOptimise.Optimisation#getEvolvers <em>Evolvers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Evolvers</em>'.
   * @see uk.ac.kcl.mDEOptimise.Optimisation#getEvolvers()
   * @see #getOptimisation()
   * @generated
   */
  EReference getOptimisation_Evolvers();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.mDEOptimise.MetaModelSpec <em>Meta Model Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Model Spec</em>'.
   * @see uk.ac.kcl.mDEOptimise.MetaModelSpec
   * @generated
   */
  EClass getMetaModelSpec();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.mDEOptimise.MetaModelSpec#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see uk.ac.kcl.mDEOptimise.MetaModelSpec#getLocation()
   * @see #getMetaModelSpec()
   * @generated
   */
  EAttribute getMetaModelSpec_Location();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.mDEOptimise.FitnessFunctionSpec <em>Fitness Function Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fitness Function Spec</em>'.
   * @see uk.ac.kcl.mDEOptimise.FitnessFunctionSpec
   * @generated
   */
  EClass getFitnessFunctionSpec();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.mDEOptimise.FitnessFunctionSpec#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see uk.ac.kcl.mDEOptimise.FitnessFunctionSpec#getClass_()
   * @see #getFitnessFunctionSpec()
   * @generated
   */
  EAttribute getFitnessFunctionSpec_Class();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.mDEOptimise.FitnessFunctionSpec#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see uk.ac.kcl.mDEOptimise.FitnessFunctionSpec#getMethod()
   * @see #getFitnessFunctionSpec()
   * @generated
   */
  EAttribute getFitnessFunctionSpec_Method();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.mDEOptimise.EvolverSpec <em>Evolver Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evolver Spec</em>'.
   * @see uk.ac.kcl.mDEOptimise.EvolverSpec
   * @generated
   */
  EClass getEvolverSpec();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.mDEOptimise.EvolverSpec#getRule_location <em>Rule location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule location</em>'.
   * @see uk.ac.kcl.mDEOptimise.EvolverSpec#getRule_location()
   * @see #getEvolverSpec()
   * @generated
   */
  EAttribute getEvolverSpec_Rule_location();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MDEOptimiseFactory getMDEOptimiseFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.kcl.mDEOptimise.impl.OptimisationImpl <em>Optimisation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.mDEOptimise.impl.OptimisationImpl
     * @see uk.ac.kcl.mDEOptimise.impl.MDEOptimisePackageImpl#getOptimisation()
     * @generated
     */
    EClass OPTIMISATION = eINSTANCE.getOptimisation();

    /**
     * The meta object literal for the '<em><b>Metamodel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIMISATION__METAMODEL = eINSTANCE.getOptimisation_Metamodel();

    /**
     * The meta object literal for the '<em><b>Fitness</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIMISATION__FITNESS = eINSTANCE.getOptimisation_Fitness();

    /**
     * The meta object literal for the '<em><b>Evolvers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIMISATION__EVOLVERS = eINSTANCE.getOptimisation_Evolvers();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.mDEOptimise.impl.MetaModelSpecImpl <em>Meta Model Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.mDEOptimise.impl.MetaModelSpecImpl
     * @see uk.ac.kcl.mDEOptimise.impl.MDEOptimisePackageImpl#getMetaModelSpec()
     * @generated
     */
    EClass META_MODEL_SPEC = eINSTANCE.getMetaModelSpec();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_MODEL_SPEC__LOCATION = eINSTANCE.getMetaModelSpec_Location();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.mDEOptimise.impl.FitnessFunctionSpecImpl <em>Fitness Function Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.mDEOptimise.impl.FitnessFunctionSpecImpl
     * @see uk.ac.kcl.mDEOptimise.impl.MDEOptimisePackageImpl#getFitnessFunctionSpec()
     * @generated
     */
    EClass FITNESS_FUNCTION_SPEC = eINSTANCE.getFitnessFunctionSpec();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FITNESS_FUNCTION_SPEC__CLASS = eINSTANCE.getFitnessFunctionSpec_Class();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FITNESS_FUNCTION_SPEC__METHOD = eINSTANCE.getFitnessFunctionSpec_Method();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.mDEOptimise.impl.EvolverSpecImpl <em>Evolver Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.mDEOptimise.impl.EvolverSpecImpl
     * @see uk.ac.kcl.mDEOptimise.impl.MDEOptimisePackageImpl#getEvolverSpec()
     * @generated
     */
    EClass EVOLVER_SPEC = eINSTANCE.getEvolverSpec();

    /**
     * The meta object literal for the '<em><b>Rule location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVOLVER_SPEC__RULE_LOCATION = eINSTANCE.getEvolverSpec_Rule_location();

  }

} //MDEOptimisePackage
