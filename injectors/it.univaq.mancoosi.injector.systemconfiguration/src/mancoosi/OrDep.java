/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Dep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.OrDep#getOps <em>Ops</em>}</li>
 *   <li>{@link mancoosi.OrDep#getDependence <em>Dependence</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getOrDep()
 * @model
 * @generated
 */
public interface OrDep extends Dependence {
	/**
	 * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.Dependence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ops</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getOrDep_Ops()
	 * @model type="mancoosi.Dependence" containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList getOps();

	/**
	 * Returns the value of the '<em><b>Dependence</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Dependence#getOrDep <em>Or Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependence</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependence</em>' container reference.
	 * @see #setDependence(Dependence)
	 * @see mancoosi.MancoosiPackage#getOrDep_Dependence()
	 * @see mancoosi.Dependence#getOrDep
	 * @model opposite="orDep" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Dependence getDependence();

	/**
	 * Sets the value of the '{@link mancoosi.OrDep#getDependence <em>Dependence</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependence</em>' container reference.
	 * @see #getDependence()
	 * @generated
	 */
	void setDependence(Dependence value);

} // OrDep
