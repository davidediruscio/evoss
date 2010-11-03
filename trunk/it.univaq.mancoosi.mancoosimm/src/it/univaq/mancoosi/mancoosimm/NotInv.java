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
 * A representation of the model object '<em><b>Not Inv</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.NotInv#getElem <em>Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getNotInv()
 * @model
 * @generated
 */
public interface NotInv extends EObject {
	/**
	 * Returns the value of the '<em><b>Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elem</em>' reference.
	 * @see #setElem(Invariant)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getNotInv_Elem()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Invariant getElem();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.NotInv#getElem <em>Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem</em>' reference.
	 * @see #getElem()
	 * @generated
	 */
	void setElem(Invariant value);

} // NotInv
