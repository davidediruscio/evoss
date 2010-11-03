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
 * A representation of the model object '<em><b>Case Postrm Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.CasePostrmCondition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getCasePostrmCondition()
 * @model
 * @generated
 */
public interface CasePostrmCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.CasePostrmConditionValue}.
	 * The literals are from the enumeration {@link it.univaq.mancoosi.packagemm.CasePostrmConditionValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see it.univaq.mancoosi.packagemm.CasePostrmConditionValue
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getCasePostrmCondition_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<CasePostrmConditionValue> getValue();

} // CasePostrmCondition
