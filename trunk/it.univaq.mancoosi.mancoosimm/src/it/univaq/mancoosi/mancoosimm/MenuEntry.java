/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.MenuEntry#getMenu <em>Menu</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.MenuEntry#getExecutable <em>Executable</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.MenuEntry#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getMenuEntry()
 * @model
 * @generated
 */
public interface MenuEntry extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Menu</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Menu#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' container reference.
	 * @see #setMenu(Menu)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getMenuEntry_Menu()
	 * @see it.univaq.mancoosi.mancoosimm.Menu#getEntries
	 * @model opposite="entries" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Menu getMenu();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.MenuEntry#getMenu <em>Menu</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' container reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(Menu value);

	/**
	 * Returns the value of the '<em><b>Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable</em>' reference.
	 * @see #setExecutable(File)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getMenuEntry_Executable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getExecutable();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.MenuEntry#getExecutable <em>Executable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable</em>' reference.
	 * @see #getExecutable()
	 * @generated
	 */
	void setExecutable(File value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(MenuEntry)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getMenuEntry_Parent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MenuEntry getParent();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.MenuEntry#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(MenuEntry value);

} // MenuEntry
