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
 * A representation of the model object '<em><b>Or Inv</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.OrInv#getLeft <em>Left</em>}</li>
 *   <li>{@link mancoosi.OrInv#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getOrInv()
 * @model
 * @generated
 */
public interface OrInv extends EObject {
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
	 * @see mancoosi.MancoosiPackage#getOrInv_Left()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Invariant getLeft();

	/**
	 * Sets the value of the '{@link mancoosi.OrInv#getLeft <em>Left</em>}' reference.
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
	 * @see mancoosi.MancoosiPackage#getOrInv_Right()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Invariant getRight();

	/**
	 * Sets the value of the '{@link mancoosi.OrInv#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Invariant value);

} // OrInv
