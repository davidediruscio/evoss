/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.Dependence#getAndDep <em>And Dep</em>}</li>
 *   <li>{@link mancoosi.Dependence#getOrDep <em>Or Dep</em>}</li>
 *   <li>{@link mancoosi.Dependence#getSingleDep <em>Single Dep</em>}</li>
 *   <li>{@link mancoosi.Dependence#getPkg <em>Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getDependence()
 * @model abstract="true"
 * @generated
 */
public interface Dependence extends EObject {
	/**
	 * Returns the value of the '<em><b>And Dep</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.AndDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And Dep</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And Dep</em>' containment reference.
	 * @see #setAndDep(AndDep)
	 * @see mancoosi.MancoosiPackage#getDependence_AndDep()
	 * @see mancoosi.AndDep#getDependence
	 * @model opposite="dependence" containment="true" ordered="false"
	 * @generated
	 */
	AndDep getAndDep();

	/**
	 * Sets the value of the '{@link mancoosi.Dependence#getAndDep <em>And Dep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And Dep</em>' containment reference.
	 * @see #getAndDep()
	 * @generated
	 */
	void setAndDep(AndDep value);

	/**
	 * Returns the value of the '<em><b>Or Dep</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.OrDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or Dep</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or Dep</em>' containment reference.
	 * @see #setOrDep(OrDep)
	 * @see mancoosi.MancoosiPackage#getDependence_OrDep()
	 * @see mancoosi.OrDep#getDependence
	 * @model opposite="dependence" containment="true" ordered="false"
	 * @generated
	 */
	OrDep getOrDep();

	/**
	 * Sets the value of the '{@link mancoosi.Dependence#getOrDep <em>Or Dep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or Dep</em>' containment reference.
	 * @see #getOrDep()
	 * @generated
	 */
	void setOrDep(OrDep value);

	/**
	 * Returns the value of the '<em><b>Single Dep</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.SingleDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Dep</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Dep</em>' containment reference.
	 * @see #setSingleDep(SingleDep)
	 * @see mancoosi.MancoosiPackage#getDependence_SingleDep()
	 * @see mancoosi.SingleDep#getDependence
	 * @model opposite="dependence" containment="true" required="true" ordered="false"
	 * @generated
	 */
	SingleDep getSingleDep();

	/**
	 * Sets the value of the '{@link mancoosi.Dependence#getSingleDep <em>Single Dep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Dep</em>' containment reference.
	 * @see #getSingleDep()
	 * @generated
	 */
	void setSingleDep(SingleDep value);

	/**
	 * Returns the value of the '<em><b>Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' reference.
	 * @see #setPkg(InstalledPackage)
	 * @see mancoosi.MancoosiPackage#getDependence_Pkg()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InstalledPackage getPkg();

	/**
	 * Sets the value of the '{@link mancoosi.Dependence#getPkg <em>Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' reference.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(InstalledPackage value);

} // Dependence
