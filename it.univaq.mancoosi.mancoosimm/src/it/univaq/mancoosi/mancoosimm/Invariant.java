/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Invariant#getAtomEl <em>Atom El</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Invariant#getAnd <em>And</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Invariant#getOr <em>Or</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Invariant#getNot <em>Not</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInvariant()
 * @model
 * @generated
 */
public interface Invariant extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Atom El</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atom El</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atom El</em>' reference.
	 * @see #setAtomEl(Atom)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInvariant_AtomEl()
	 * @model ordered="false"
	 * @generated
	 */
	Atom getAtomEl();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Invariant#getAtomEl <em>Atom El</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atom El</em>' reference.
	 * @see #getAtomEl()
	 * @generated
	 */
	void setAtomEl(Atom value);

	/**
	 * Returns the value of the '<em><b>And</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' reference.
	 * @see #setAnd(AndInv)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInvariant_And()
	 * @model ordered="false"
	 * @generated
	 */
	AndInv getAnd();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Invariant#getAnd <em>And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And</em>' reference.
	 * @see #getAnd()
	 * @generated
	 */
	void setAnd(AndInv value);

	/**
	 * Returns the value of the '<em><b>Or</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' reference.
	 * @see #setOr(OrInv)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInvariant_Or()
	 * @model ordered="false"
	 * @generated
	 */
	OrInv getOr();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Invariant#getOr <em>Or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' reference.
	 * @see #getOr()
	 * @generated
	 */
	void setOr(OrInv value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' reference.
	 * @see #setNot(NotInv)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInvariant_Not()
	 * @model ordered="false"
	 * @generated
	 */
	NotInv getNot();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Invariant#getNot <em>Not</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(NotInv value);

} // Invariant
