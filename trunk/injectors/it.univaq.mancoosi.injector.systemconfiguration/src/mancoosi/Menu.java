/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.Menu#getEntries <em>Entries</em>}</li>
 *   <li>{@link mancoosi.Menu#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link mancoosi.Menu#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.MenuEntry}.
	 * It is bidirectional and its opposite is '{@link mancoosi.MenuEntry#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getMenu_Entries()
	 * @see mancoosi.MenuEntry#getMenu
	 * @model type="mancoosi.MenuEntry" opposite="menu" containment="true" ordered="false"
	 * @generated
	 */
	EList getEntries();

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.ApplicationMenuCatalog#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference.
	 * @see #setCatalog(ApplicationMenuCatalog)
	 * @see mancoosi.MancoosiPackage#getMenu_Catalog()
	 * @see mancoosi.ApplicationMenuCatalog#getMenu
	 * @model opposite="menu" containment="true" required="true" ordered="false"
	 * @generated
	 */
	ApplicationMenuCatalog getCatalog();

	/**
	 * Sets the value of the '{@link mancoosi.Menu#getCatalog <em>Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' containment reference.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(ApplicationMenuCatalog value);

	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Environment#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see mancoosi.MancoosiPackage#getMenu_Env()
	 * @see mancoosi.Environment#getMenu
	 * @model opposite="menu" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link mancoosi.Menu#getEnv <em>Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' container reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

} // Menu
