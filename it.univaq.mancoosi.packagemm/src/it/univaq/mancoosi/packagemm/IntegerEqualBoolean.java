/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Equal Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.IntegerEqualBoolean#getFirstOp <em>First Op</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.IntegerEqualBoolean#getSecondOp <em>Second Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getIntegerEqualBoolean()
 * @model
 * @generated
 */
public interface IntegerEqualBoolean extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>First Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Op</em>' attribute.
	 * @see #setFirstOp(int)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getIntegerEqualBoolean_FirstOp()
	 * @model required="true"
	 * @generated
	 */
	int getFirstOp();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.IntegerEqualBoolean#getFirstOp <em>First Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Op</em>' attribute.
	 * @see #getFirstOp()
	 * @generated
	 */
	void setFirstOp(int value);

	/**
	 * Returns the value of the '<em><b>Second Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Op</em>' attribute.
	 * @see #setSecondOp(int)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getIntegerEqualBoolean_SecondOp()
	 * @model required="true"
	 * @generated
	 */
	int getSecondOp();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.IntegerEqualBoolean#getSecondOp <em>Second Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Op</em>' attribute.
	 * @see #getSecondOp()
	 * @generated
	 */
	void setSecondOp(int value);

} // IntegerEqualBoolean
