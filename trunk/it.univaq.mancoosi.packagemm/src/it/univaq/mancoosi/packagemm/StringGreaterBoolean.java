/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Greater Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.StringGreaterBoolean#getFirstOp <em>First Op</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.StringGreaterBoolean#getSecondOp <em>Second Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getStringGreaterBoolean()
 * @model
 * @generated
 */
public interface StringGreaterBoolean extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>First Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Op</em>' attribute.
	 * @see #setFirstOp(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getStringGreaterBoolean_FirstOp()
	 * @model required="true"
	 * @generated
	 */
	String getFirstOp();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.StringGreaterBoolean#getFirstOp <em>First Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Op</em>' attribute.
	 * @see #getFirstOp()
	 * @generated
	 */
	void setFirstOp(String value);

	/**
	 * Returns the value of the '<em><b>Second Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Op</em>' attribute.
	 * @see #setSecondOp(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getStringGreaterBoolean_SecondOp()
	 * @model required="true"
	 * @generated
	 */
	String getSecondOp();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.StringGreaterBoolean#getSecondOp <em>Second Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Op</em>' attribute.
	 * @see #getSecondOp()
	 * @generated
	 */
	void setSecondOp(String value);

} // StringGreaterBoolean
