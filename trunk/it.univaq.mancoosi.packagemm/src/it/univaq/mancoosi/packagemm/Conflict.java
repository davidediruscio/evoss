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
 * A representation of the model object '<em><b>Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.Conflict#getAndConflict <em>And Conflict</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Conflict#getOrConflict <em>Or Conflict</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Conflict#getSingleConflict <em>Single Conflict</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Conflict#getPkg <em>Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getConflict()
 * @model abstract="true"
 * @generated
 */
public interface Conflict extends EObject {
	/**
	 * Returns the value of the '<em><b>And Conflict</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.AndConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And Conflict</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And Conflict</em>' containment reference.
	 * @see #setAndConflict(AndConflict)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getConflict_AndConflict()
	 * @see it.univaq.mancoosi.packagemm.AndConflict#getConflict
	 * @model opposite="conflict" containment="true"
	 * @generated
	 */
	AndConflict getAndConflict();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Conflict#getAndConflict <em>And Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And Conflict</em>' containment reference.
	 * @see #getAndConflict()
	 * @generated
	 */
	void setAndConflict(AndConflict value);

	/**
	 * Returns the value of the '<em><b>Or Conflict</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.OrConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or Conflict</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or Conflict</em>' containment reference.
	 * @see #setOrConflict(OrConflict)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getConflict_OrConflict()
	 * @see it.univaq.mancoosi.packagemm.OrConflict#getConflict
	 * @model opposite="conflict" containment="true"
	 * @generated
	 */
	OrConflict getOrConflict();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Conflict#getOrConflict <em>Or Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or Conflict</em>' containment reference.
	 * @see #getOrConflict()
	 * @generated
	 */
	void setOrConflict(OrConflict value);

	/**
	 * Returns the value of the '<em><b>Single Conflict</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.SingleConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Conflict</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Conflict</em>' containment reference.
	 * @see #setSingleConflict(SingleConflict)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getConflict_SingleConflict()
	 * @see it.univaq.mancoosi.packagemm.SingleConflict#getConflict
	 * @model opposite="conflict" containment="true"
	 * @generated
	 */
	SingleConflict getSingleConflict();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Conflict#getSingleConflict <em>Single Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Conflict</em>' containment reference.
	 * @see #getSingleConflict()
	 * @generated
	 */
	void setSingleConflict(SingleConflict value);

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
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getConflict_Pkg()
	 * @model
	 * @generated
	 */
	String getPkg();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Conflict#getPkg <em>Pkg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' attribute.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(String value);

} // Conflict
