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
 * A representation of the model object '<em><b>And Inv</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.AndInv#getLeft <em>Left</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.AndInv#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getAndInv()
 * @model
 * @generated
 */
public interface AndInv extends EObject {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Invariant)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getAndInv_Left()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Invariant getLeft();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.AndInv#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Invariant value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Invariant)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getAndInv_Right()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Invariant getRight();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.AndInv#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Invariant value);

} // AndInv
