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
 * A representation of the model object '<em><b>Icon Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.IconCache#getMtime <em>Mtime</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.IconCache#getEnv <em>Env</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.IconCache#getIcons <em>Icons</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getIconCache()
 * @model
 * @generated
 */
public interface IconCache extends EObject {
	/**
	 * Returns the value of the '<em><b>Mtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mtime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mtime</em>' attribute.
	 * @see #setMtime(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getIconCache_Mtime()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getMtime();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.IconCache#getMtime <em>Mtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtime</em>' attribute.
	 * @see #getMtime()
	 * @generated
	 */
	void setMtime(String value);

	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Environment#getIconCache <em>Icon Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getIconCache_Env()
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getIconCache
	 * @model opposite="iconCache" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.IconCache#getEnv <em>Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' container reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

	/**
	 * Returns the value of the '<em><b>Icons</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icons</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icons</em>' reference.
	 * @see #setIcons(File)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getIconCache_Icons()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getIcons();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.IconCache#getIcons <em>Icons</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icons</em>' reference.
	 * @see #getIcons()
	 * @generated
	 */
	void setIcons(File value);

} // IconCache
