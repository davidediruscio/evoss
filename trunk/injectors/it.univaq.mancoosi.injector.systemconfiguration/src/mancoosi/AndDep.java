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
 * A representation of the model object '<em><b>And Dep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.AndDep#getOps <em>Ops</em>}</li>
 *   <li>{@link mancoosi.AndDep#getDependence <em>Dependence</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getAndDep()
 * @model
 * @generated
 */
public interface AndDep extends Dependence {
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
	 * @see mancoosi.MancoosiPackage#getAndDep_Ops()
	 * @model type="mancoosi.Dependence" containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList getOps();

	/**
	 * Returns the value of the '<em><b>Dependence</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Dependence#getAndDep <em>And Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependence</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependence</em>' container reference.
	 * @see #setDependence(Dependence)
	 * @see mancoosi.MancoosiPackage#getAndDep_Dependence()
	 * @see mancoosi.Dependence#getAndDep
	 * @model opposite="andDep" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Dependence getDependence();

	/**
	 * Sets the value of the '{@link mancoosi.AndDep#getDependence <em>Dependence</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependence</em>' container reference.
	 * @see #getDependence()
	 * @generated
	 */
	void setDependence(Dependence value);

} // AndDep
