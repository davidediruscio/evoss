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
 * A representation of the model object '<em><b>Case Postinst Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.CasePostinstCondition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getCasePostinstCondition()
 * @model
 * @generated
 */
public interface CasePostinstCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.CasePostinstConditionValue}.
	 * The literals are from the enumeration {@link it.univaq.mancoosi.packagemm.CasePostinstConditionValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see it.univaq.mancoosi.packagemm.CasePostinstConditionValue
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getCasePostinstCondition_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<CasePostinstConditionValue> getValue();

} // CasePostinstCondition
