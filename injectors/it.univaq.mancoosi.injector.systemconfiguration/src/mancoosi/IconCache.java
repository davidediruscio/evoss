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
 * A representation of the model object '<em><b>Icon Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.IconCache#getMtime <em>Mtime</em>}</li>
 *   <li>{@link mancoosi.IconCache#getEnv <em>Env</em>}</li>
 *   <li>{@link mancoosi.IconCache#getIcons <em>Icons</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getIconCache()
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
	 * @see mancoosi.MancoosiPackage#getIconCache_Mtime()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getMtime();

	/**
	 * Sets the value of the '{@link mancoosi.IconCache#getMtime <em>Mtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtime</em>' attribute.
	 * @see #getMtime()
	 * @generated
	 */
	void setMtime(String value);

	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Environment#getIconCache <em>Icon Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see mancoosi.MancoosiPackage#getIconCache_Env()
	 * @see mancoosi.Environment#getIconCache
	 * @model opposite="iconCache" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link mancoosi.IconCache#getEnv <em>Env</em>}' container reference.
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
	 * @see mancoosi.MancoosiPackage#getIconCache_Icons()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getIcons();

	/**
	 * Sets the value of the '{@link mancoosi.IconCache#getIcons <em>Icons</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icons</em>' reference.
	 * @see #getIcons()
	 * @generated
	 */
	void setIcons(File value);

} // IconCache
