/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.Return#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends ControlStatement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.mancoosi.packagemm.ReturnStatementValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see it.univaq.mancoosi.packagemm.ReturnStatementValue
	 * @see #setValue(ReturnStatementValue)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getReturn_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ReturnStatementValue getValue();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Return#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see it.univaq.mancoosi.packagemm.ReturnStatementValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ReturnStatementValue value);

} // Return
