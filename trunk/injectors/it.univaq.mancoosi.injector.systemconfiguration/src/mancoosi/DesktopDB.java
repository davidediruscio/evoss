/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Desktop DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.DesktopDB#getEnv <em>Env</em>}</li>
 *   <li>{@link mancoosi.DesktopDB#getApplications <em>Applications</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getDesktopDB()
 * @model
 * @generated
 */
public interface DesktopDB extends EObject {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Environment#getDesktopDb <em>Desktop Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see mancoosi.MancoosiPackage#getDesktopDB_Env()
	 * @see mancoosi.Environment#getDesktopDb
	 * @model opposite="desktopDb" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link mancoosi.DesktopDB#getEnv <em>Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' container reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' reference.
	 * @see #setApplications(File)
	 * @see mancoosi.MancoosiPackage#getDesktopDB_Applications()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getApplications();

	/**
	 * Sets the value of the '{@link mancoosi.DesktopDB#getApplications <em>Applications</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applications</em>' reference.
	 * @see #getApplications()
	 * @generated
	 */
	void setApplications(File value);

} // DesktopDB
