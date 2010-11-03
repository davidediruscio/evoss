/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.Assignment#getAssigned <em>Assigned</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Assignment#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends NeutralStatement {
	/**
	 * Returns the value of the '<em><b>Assigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned</em>' attribute.
	 * @see #setAssigned(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getAssignment_Assigned()
	 * @model
	 * @generated
	 */
	String getAssigned();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Assignment#getAssigned <em>Assigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned</em>' attribute.
	 * @see #getAssigned()
	 * @generated
	 */
	void setAssigned(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getAssignment_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Assignment#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // Assignment
