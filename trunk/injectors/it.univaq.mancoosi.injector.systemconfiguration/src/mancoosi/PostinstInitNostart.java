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
 * A representation of the model object '<em><b>Postinst Init Nostart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostinstInitNostart#getScriptParam <em>Script Param</em>}</li>
 *   <li>{@link mancoosi.PostinstInitNostart#getInitParams <em>Init Params</em>}</li>
 *   <li>{@link mancoosi.PostinstInitNostart#getErrorHandler <em>Error Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostinstInitNostart()
 * @model
 * @generated
 */
public interface PostinstInitNostart extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Script Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Param</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Param</em>' reference.
	 * @see #setScriptParam(Script)
	 * @see mancoosi.MancoosiPackage#getPostinstInitNostart_ScriptParam()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Script getScriptParam();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstInitNostart#getScriptParam <em>Script Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Param</em>' reference.
	 * @see #getScriptParam()
	 * @generated
	 */
	void setScriptParam(Script value);

	/**
	 * Returns the value of the '<em><b>Init Params</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.Param}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Params</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getPostinstInitNostart_InitParams()
	 * @model type="mancoosi.Param" ordered="false"
	 * @generated
	 */
	EList getInitParams();

	/**
	 * Returns the value of the '<em><b>Error Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Handler</em>' reference.
	 * @see #setErrorHandler(File)
	 * @see mancoosi.MancoosiPackage#getPostinstInitNostart_ErrorHandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getErrorHandler();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstInitNostart#getErrorHandler <em>Error Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Handler</em>' reference.
	 * @see #getErrorHandler()
	 * @generated
	 */
	void setErrorHandler(File value);

} // PostinstInitNostart
