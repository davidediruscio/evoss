/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Prerm Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.CasePrermCondition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getCasePrermCondition()
 * @model
 * @generated
 */
public interface CasePrermCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link mancoosi.CasePrermConditionValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see mancoosi.CasePrermConditionValue
	 * @see #setValue(CasePrermConditionValue)
	 * @see mancoosi.MancoosiPackage#getCasePrermCondition_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	CasePrermConditionValue getValue();

	/**
	 * Sets the value of the '{@link mancoosi.CasePrermCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see mancoosi.CasePrermConditionValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CasePrermConditionValue value);

} // CasePrermCondition
