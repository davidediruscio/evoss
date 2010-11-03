/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Menu Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.ApplicationMenuCatalog#getMenu <em>Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getApplicationMenuCatalog()
 * @model
 * @generated
 */
public interface ApplicationMenuCatalog extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Menu</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Menu#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' container reference.
	 * @see #setMenu(Menu)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getApplicationMenuCatalog_Menu()
	 * @see it.univaq.mancoosi.mancoosimm.Menu#getCatalog
	 * @model opposite="catalog" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Menu getMenu();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.ApplicationMenuCatalog#getMenu <em>Menu</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' container reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(Menu value);

} // ApplicationMenuCatalog
