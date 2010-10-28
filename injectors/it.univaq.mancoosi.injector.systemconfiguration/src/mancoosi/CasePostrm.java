/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Postrm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.CasePostrm#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getCasePostrm()
 * @model
 * @generated
 */
public interface CasePostrm extends Case {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.CasePostrmCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getCasePostrm_Conditions()
	 * @model type="mancoosi.CasePostrmCondition" containment="true" ordered="false"
	 * @generated
	 */
	EList getConditions();

} // CasePostrm
