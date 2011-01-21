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
 * A representation of the model object '<em><b>Input Parameter Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.InputParameterIterator#getInputParameters <em>Input Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getInputParameterIterator()
 * @model
 * @generated
 */
public interface InputParameterIterator extends Iterator {
	/**
	 * Returns the value of the '<em><b>Input Parameters</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.InputParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameters</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getInputParameterIterator_InputParameters()
	 * @model type="mancoosi.InputParameter" required="true" ordered="false"
	 * @generated
	 */
	EList getInputParameters();

} // InputParameterIterator
