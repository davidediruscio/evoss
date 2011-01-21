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
 * A representation of the model object '<em><b>Basic Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.BasicCase#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getBasicCase()
 * @model
 * @generated
 */
public interface BasicCase extends ControlStatement {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.BasicCaseCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getBasicCase_Conditions()
	 * @model type="mancoosi.BasicCaseCondition" containment="true" ordered="false"
	 * @generated
	 */
	EList getConditions();

} // BasicCase
