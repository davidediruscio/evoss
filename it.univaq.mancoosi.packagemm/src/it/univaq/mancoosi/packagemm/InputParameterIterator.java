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
 * A representation of the model object '<em><b>Input Parameter Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.InputParameterIterator#getInputParameters <em>Input Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getInputParameterIterator()
 * @model
 * @generated
 */
public interface InputParameterIterator extends Iterator {
	/**
	 * Returns the value of the '<em><b>Input Parameters</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.InputParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameters</em>' reference list.
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getInputParameterIterator_InputParameters()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<InputParameter> getInputParameters();

} // InputParameterIterator
