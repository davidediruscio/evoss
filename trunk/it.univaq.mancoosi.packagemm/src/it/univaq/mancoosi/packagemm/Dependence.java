/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.Dependence#getAndDep <em>And Dep</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Dependence#getOrDep <em>Or Dep</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Dependence#getSingleDep <em>Single Dep</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Dependence#getPkg <em>Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getDependence()
 * @model abstract="true"
 * @generated
 */
public interface Dependence extends EObject {
	/**
	 * Returns the value of the '<em><b>And Dep</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.AndDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And Dep</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And Dep</em>' containment reference.
	 * @see #setAndDep(AndDep)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getDependence_AndDep()
	 * @see it.univaq.mancoosi.packagemm.AndDep#getDependence
	 * @model opposite="dependence" containment="true" ordered="false"
	 * @generated
	 */
	AndDep getAndDep();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Dependence#getAndDep <em>And Dep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And Dep</em>' containment reference.
	 * @see #getAndDep()
	 * @generated
	 */
	void setAndDep(AndDep value);

	/**
	 * Returns the value of the '<em><b>Or Dep</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.OrDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or Dep</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or Dep</em>' containment reference.
	 * @see #setOrDep(OrDep)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getDependence_OrDep()
	 * @see it.univaq.mancoosi.packagemm.OrDep#getDependence
	 * @model opposite="dependence" containment="true" ordered="false"
	 * @generated
	 */
	OrDep getOrDep();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Dependence#getOrDep <em>Or Dep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or Dep</em>' containment reference.
	 * @see #getOrDep()
	 * @generated
	 */
	void setOrDep(OrDep value);

	/**
	 * Returns the value of the '<em><b>Single Dep</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.SingleDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Dep</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Dep</em>' containment reference.
	 * @see #setSingleDep(SingleDep)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getDependence_SingleDep()
	 * @see it.univaq.mancoosi.packagemm.SingleDep#getDependence
	 * @model opposite="dependence" containment="true" required="true" ordered="false"
	 * @generated
	 */
	SingleDep getSingleDep();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Dependence#getSingleDep <em>Single Dep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Dep</em>' containment reference.
	 * @see #getSingleDep()
	 * @generated
	 */
	void setSingleDep(SingleDep value);

	/**
	 * Returns the value of the '<em><b>Pkg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' attribute.
	 * @see #setPkg(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getDependence_Pkg()
	 * @model
	 * @generated
	 */
	String getPkg();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Dependence#getPkg <em>Pkg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' attribute.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(String value);

} // Dependence
