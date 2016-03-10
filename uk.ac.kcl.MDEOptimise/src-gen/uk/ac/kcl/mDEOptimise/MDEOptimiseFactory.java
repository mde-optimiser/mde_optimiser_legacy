/**
 */
package uk.ac.kcl.mDEOptimise;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.mDEOptimise.MDEOptimisePackage
 * @generated
 */
public interface MDEOptimiseFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MDEOptimiseFactory eINSTANCE = uk.ac.kcl.mDEOptimise.impl.MDEOptimiseFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Optimisation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optimisation</em>'.
   * @generated
   */
  Optimisation createOptimisation();

  /**
   * Returns a new object of class '<em>Meta Model Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta Model Spec</em>'.
   * @generated
   */
  MetaModelSpec createMetaModelSpec();

  /**
   * Returns a new object of class '<em>Fitness Function Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fitness Function Spec</em>'.
   * @generated
   */
  FitnessFunctionSpec createFitnessFunctionSpec();

  /**
   * Returns a new object of class '<em>Evolver Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evolver Spec</em>'.
   * @generated
   */
  EvolverSpec createEvolverSpec();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MDEOptimisePackage getMDEOptimisePackage();

} //MDEOptimiseFactory
