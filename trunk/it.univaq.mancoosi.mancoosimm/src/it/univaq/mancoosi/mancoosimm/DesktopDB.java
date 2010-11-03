/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Desktop DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.DesktopDB#getEnv <em>Env</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.DesktopDB#getApplications <em>Applications</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getDesktopDB()
 * @model
 * @generated
 */
public interface DesktopDB extends EObject {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Environment#getDesktopDb <em>Desktop Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getDesktopDB_Env()
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getDesktopDb
	 * @model opposite="desktopDb" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.DesktopDB#getEnv <em>Env</em>}' container reference.
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
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getDesktopDB_Applications()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getApplications();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.DesktopDB#getApplications <em>Applications</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applications</em>' reference.
	 * @see #getApplications()
	 * @generated
	 */
	void setApplications(File value);

} // DesktopDB
