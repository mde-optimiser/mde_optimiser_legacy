/**
 */
package uk.ac.kcl.mDEOptimise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optimisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mDEOptimise.Optimisation#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link uk.ac.kcl.mDEOptimise.Optimisation#getFitness <em>Fitness</em>}</li>
 *   <li>{@link uk.ac.kcl.mDEOptimise.Optimisation#getEvolvers <em>Evolvers</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.mDEOptimise.MDEOptimisePackage#getOptimisation()
 * @model
 * @generated
 */
public interface Optimisation extends EObject
{
  /**
   * Returns the value of the '<em><b>Metamodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel</em>' containment reference.
   * @see #setMetamodel(MetaModelSpec)
   * @see uk.ac.kcl.mDEOptimise.MDEOptimisePackage#getOptimisation_Metamodel()
   * @model containment="true"
   * @generated
   */
  MetaModelSpec getMetamodel();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mDEOptimise.Optimisation#getMetamodel <em>Metamodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metamodel</em>' containment reference.
   * @see #getMetamodel()
   * @generated
   */
  void setMetamodel(MetaModelSpec value);

  /**
   * Returns the value of the '<em><b>Fitness</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fitness</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fitness</em>' containment reference.
   * @see #setFitness(FitnessFunctionSpec)
   * @see uk.ac.kcl.mDEOptimise.MDEOptimisePackage#getOptimisation_Fitness()
   * @model containment="true"
   * @generated
   */
  FitnessFunctionSpec getFitness();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mDEOptimise.Optimisation#getFitness <em>Fitness</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fitness</em>' containment reference.
   * @see #getFitness()
   * @generated
   */
  void setFitness(FitnessFunctionSpec value);

  /**
   * Returns the value of the '<em><b>Evolvers</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.mDEOptimise.EvolverSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evolvers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evolvers</em>' containment reference list.
   * @see uk.ac.kcl.mDEOptimise.MDEOptimisePackage#getOptimisation_Evolvers()
   * @model containment="true"
   * @generated
   */
  EList<EvolverSpec> getEvolvers();

} // Optimisation
