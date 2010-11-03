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
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.Script#getStatements <em>Statements</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Script#getInputParameters <em>Input Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.Statement}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.Statement#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getScript_Statements()
	 * @see it.univaq.mancoosi.packagemm.Statement#getScript
	 * @model opposite="script" containment="true" ordered="false"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.InputParameter}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.InputParameter#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameters</em>' containment reference list.
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getScript_InputParameters()
	 * @see it.univaq.mancoosi.packagemm.InputParameter#getScript
	 * @model opposite="script" containment="true" ordered="false"
	 * @generated
	 */
	EList<InputParameter> getInputParameters();

} // Script
