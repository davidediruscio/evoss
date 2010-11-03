/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Conflict#getAndConflict <em>And Conflict</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Conflict#getOrConflict <em>Or Conflict</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Conflict#getSingleConflict <em>Single Conflict</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Conflict#getPkg <em>Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getConflict()
 * @model abstract="true"
 * @generated
 */
public interface Conflict extends EObject {
	/**
	 * Returns the value of the '<em><b>And Conflict</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.AndConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And Conflict</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And Conflict</em>' containment reference.
	 * @see #setAndConflict(AndConflict)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getConflict_AndConflict()
	 * @see it.univaq.mancoosi.mancoosimm.AndConflict#getConflict
	 * @model opposite="conflict" containment="true"
	 * @generated
	 */
	AndConflict getAndConflict();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Conflict#getAndConflict <em>And Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And Conflict</em>' containment reference.
	 * @see #getAndConflict()
	 * @generated
	 */
	void setAndConflict(AndConflict value);

	/**
	 * Returns the value of the '<em><b>Or Conflict</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.OrConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or Conflict</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or Conflict</em>' containment reference.
	 * @see #setOrConflict(OrConflict)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getConflict_OrConflict()
	 * @see it.univaq.mancoosi.mancoosimm.OrConflict#getConflict
	 * @model opposite="conflict" containment="true"
	 * @generated
	 */
	OrConflict getOrConflict();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Conflict#getOrConflict <em>Or Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or Conflict</em>' containment reference.
	 * @see #getOrConflict()
	 * @generated
	 */
	void setOrConflict(OrConflict value);

	/**
	 * Returns the value of the '<em><b>Single Conflict</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.SingleConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Conflict</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Conflict</em>' containment reference.
	 * @see #setSingleConflict(SingleConflict)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getConflict_SingleConflict()
	 * @see it.univaq.mancoosi.mancoosimm.SingleConflict#getConflict
	 * @model opposite="conflict" containment="true"
	 * @generated
	 */
	SingleConflict getSingleConflict();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Conflict#getSingleConflict <em>Single Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Conflict</em>' containment reference.
	 * @see #getSingleConflict()
	 * @generated
	 */
	void setSingleConflict(SingleConflict value);

	/**
	 * Returns the value of the '<em><b>Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' reference.
	 * @see #setPkg(it.univaq.mancoosi.mancoosimm.Package)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getConflict_Pkg()
	 * @model required="true"
	 * @generated
	 */
	it.univaq.mancoosi.mancoosimm.Package getPkg();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Conflict#getPkg <em>Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' reference.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(it.univaq.mancoosi.mancoosimm.Package value);

} // Conflict
