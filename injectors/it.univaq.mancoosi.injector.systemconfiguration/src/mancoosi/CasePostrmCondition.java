/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Postrm Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.CasePostrmCondition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getCasePostrmCondition()
 * @model
 * @generated
 */
public interface CasePostrmCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link mancoosi.CasePostrmConditionValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see mancoosi.CasePostrmConditionValue
	 * @see #setValue(CasePostrmConditionValue)
	 * @see mancoosi.MancoosiPackage#getCasePostrmCondition_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	CasePostrmConditionValue getValue();

	/**
	 * Sets the value of the '{@link mancoosi.CasePostrmCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see mancoosi.CasePostrmConditionValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CasePostrmConditionValue value);

} // CasePostrmCondition
