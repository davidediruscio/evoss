/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.EnumerationIterator#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.EnumerationIterator#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getEnumerationIterator()
 * @model
 * @generated
 */
public interface EnumerationIterator extends Iterator {
	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' reference.
	 * @see #setEnumeration(Enumeration)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getEnumerationIterator_Enumeration()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Enumeration getEnumeration();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.EnumerationIterator#getEnumeration <em>Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getEnumerationIterator_Statements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Statement> getStatements();

} // EnumerationIterator
