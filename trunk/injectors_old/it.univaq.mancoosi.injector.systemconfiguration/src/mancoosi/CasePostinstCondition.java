/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Postinst Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.CasePostinstCondition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getCasePostinstCondition()
 * @model
 * @generated
 */
public interface CasePostinstCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link mancoosi.CasePostinstConditionValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see mancoosi.CasePostinstConditionValue
	 * @see #setValue(CasePostinstConditionValue)
	 * @see mancoosi.MancoosiPackage#getCasePostinstCondition_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	CasePostinstConditionValue getValue();

	/**
	 * Sets the value of the '{@link mancoosi.CasePostinstCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see mancoosi.CasePostinstConditionValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CasePostinstConditionValue value);

} // CasePostinstCondition
