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
 * A representation of the model object '<em><b>Postinst Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstInit#getScriptParam <em>Script Param</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstInit#getInitParams <em>Init Params</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstInit#getErrorHandler <em>Error Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstInit()
 * @model
 * @generated
 */
public interface PostinstInit extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Script Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Param</em>' containment reference.
	 * @see #setScriptParam(Script)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstInit_ScriptParam()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Script getScriptParam();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstInit#getScriptParam <em>Script Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Param</em>' containment reference.
	 * @see #getScriptParam()
	 * @generated
	 */
	void setScriptParam(Script value);

	/**
	 * Returns the value of the '<em><b>Init Params</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.Param}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Params</em>' containment reference list.
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstInit_InitParams()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Param> getInitParams();

	/**
	 * Returns the value of the '<em><b>Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Handler</em>' containment reference.
	 * @see #setErrorHandler(Statement)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstInit_ErrorHandler()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Statement getErrorHandler();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstInit#getErrorHandler <em>Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Handler</em>' containment reference.
	 * @see #getErrorHandler()
	 * @generated
	 */
	void setErrorHandler(Statement value);

} // PostinstInit
