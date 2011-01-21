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
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.Environment#getRunningServices <em>Running Services</em>}</li>
 *   <li>{@link mancoosi.Environment#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link mancoosi.Environment#getUsers <em>Users</em>}</li>
 *   <li>{@link mancoosi.Environment#getGroups <em>Groups</em>}</li>
 *   <li>{@link mancoosi.Environment#getEmacspkg <em>Emacspkg</em>}</li>
 *   <li>{@link mancoosi.Environment#getIconCache <em>Icon Cache</em>}</li>
 *   <li>{@link mancoosi.Environment#getDesktopDb <em>Desktop Db</em>}</li>
 *   <li>{@link mancoosi.Environment#getMimeTypeHandlerCache <em>Mime Type Handler Cache</em>}</li>
 *   <li>{@link mancoosi.Environment#getLibraryCache <em>Library Cache</em>}</li>
 *   <li>{@link mancoosi.Environment#getSkeeperCatalog <em>Skeeper Catalog</em>}</li>
 *   <li>{@link mancoosi.Environment#getSgmlCatalog <em>Sgml Catalog</em>}</li>
 *   <li>{@link mancoosi.Environment#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link mancoosi.Environment#getModuleCache <em>Module Cache</em>}</li>
 *   <li>{@link mancoosi.Environment#getXfontCaches <em>Xfont Caches</em>}</li>
 *   <li>{@link mancoosi.Environment#getGconf <em>Gconf</em>}</li>
 *   <li>{@link mancoosi.Environment#getMenu <em>Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Running Services</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.Service}.
	 * It is bidirectional and its opposite is '{@link mancoosi.Service#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Services</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getEnvironment_RunningServices()
	 * @see mancoosi.Service#getEnv
	 * @model type="mancoosi.Service" opposite="env" ordered="false"
	 * @generated
	 */
	EList getRunningServices();

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.Alternative}.
	 * It is bidirectional and its opposite is '{@link mancoosi.Alternative#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternatives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getEnvironment_Alternatives()
	 * @see mancoosi.Alternative#getEnv
	 * @model type="mancoosi.Alternative" opposite="env" containment="true" ordered="false"
	 * @generated
	 */
	EList getAlternatives();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.User}.
	 * It is bidirectional and its opposite is '{@link mancoosi.User#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getEnvironment_Users()
	 * @see mancoosi.User#getEnv
	 * @model type="mancoosi.User" opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList getUsers();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.Group}.
	 * It is bidirectional and its opposite is '{@link mancoosi.Group#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getEnvironment_Groups()
	 * @see mancoosi.Group#getEnv
	 * @model type="mancoosi.Group" opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList getGroups();

	/**
	 * Returns the value of the '<em><b>Emacspkg</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.EmacsPackage#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emacspkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emacspkg</em>' containment reference.
	 * @see #setEmacspkg(EmacsPackage)
	 * @see mancoosi.MancoosiPackage#getEnvironment_Emacspkg()
	 * @see mancoosi.EmacsPackage#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EmacsPackage getEmacspkg();

	/**
	 * Sets the value of the '{@link mancoosi.Environment#getEmacspkg <em>Emacspkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emacspkg</em>' containment reference.
	 * @see #getEmacspkg()
	 * @generated
	 */
	void setEmacspkg(EmacsPackage value);

	/**
	 * Returns the value of the '<em><b>Icon Cache</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.IconCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Cache</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Cache</em>' containment reference.
	 * @see #setIconCache(IconCache)
	 * @see mancoosi.MancoosiPackage#getEnvironment_IconCache()
	 * @see mancoosi.IconCache#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	IconCache getIconCache();

	/**
	 * Sets the value of the '{@link mancoosi.Environment#getIconCache <em>Icon Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Cache</em>' containment reference.
	 * @see #getIconCache()
	 * @generated
	 */
	void setIconCache(IconCache value);

	/**
	 * Returns the value of the '<em><b>Desktop Db</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.DesktopDB#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desktop Db</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desktop Db</em>' containment reference.
	 * @see #setDesktopDb(DesktopDB)
	 * @see mancoosi.MancoosiPackage#getEnvironment_DesktopDb()
	 * @see mancoosi.DesktopDB#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	DesktopDB getDesktopDb();

	/**
	 * Sets the value of the '{@link mancoosi.Environment#getDesktopDb <em>Desktop Db</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desktop Db</em>' containment reference.
	 * @see #getDesktopDb()
	 * @generated
	 */
	void setDesktopDb(DesktopDB value);

	/**
	 * Returns the value of the '<em><b>Mime Type Handler Cache</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.MimeTypeHandlerCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type Handler Cache</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type Handler Cache</em>' containment reference.
	 * @see #setMimeTypeHandlerCache(MimeTypeHandlerCache)
	 * @see mancoosi.MancoosiPackage#getEnvironment_MimeTypeHandlerCache()
	 * @see mancoosi.MimeTypeHandlerCache#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	MimeTypeHandlerCache getMimeTypeHandlerCache();

	/**
	 * Sets the value of the '{@link mancoosi.Environment#getMimeTypeHandlerCache <em>Mime Type Handler Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type Handler Cache</em>' containment reference.
	 * @see #getMimeTypeHandlerCache()
	 * @generated
	 */
	void setMimeTypeHandlerCache(MimeTypeHandlerCache value);

	/**
	 * Returns the value of the '<em><b>Library Cache</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.LibraryCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Cache</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Cache</em>' containment reference.
	 * @see #setLibraryCache(LibraryCache)
	 * @see mancoosi.MancoosiPackage#getEnvironment_LibraryCache()
	 * @see mancoosi.LibraryCache#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	LibraryCache getLibraryCache();

	/**
	 * Sets the value of the '{@link mancoosi.Environment#getLibraryCache <em>Library Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Cache</em>' containment reference.
	 * @see #getLibraryCache()
	 * @generated
	 */
	void setLibraryCache(LibraryCache value);

	/**
	 * Returns the value of the '<em><b>Skeeper Catalog</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.SkeeperCatalog#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skeeper Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skeeper Catalog</em>' containment reference.
	 * @see #setSkeeperCatalog(SkeeperCatalog)
	 * @see mancoosi.MancoosiPackage#getEnvironment_SkeeperCatalog()
	 * @see mancoosi.SkeeperCatalog#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	SkeeperCatalog getSkeeperCatalog();

	/**
	 * Sets the value of the '{@link mancoosi.Environment#getSkeeperCatalog <em>Skeeper Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skeeper Catalog</em>' containment reference.
	 * @see #getSkeeperCatalog()
	 * @generated
	 */
	void setSkeeperCatalog(SkeeperCatalog value);

	/**
	 * Returns the value of the '<em><b>Sgml Catalog</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.SGMLCatalog#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sgml Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgml Catalog</em>' containment reference.
	 * @see #setSgmlCatalog(SGMLCatalog)
	 * @see mancoosi.MancoosiPackage#getEnvironment_SgmlCatalog()
	 * @see mancoosi.SGMLCatalog#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	SGMLCatalog getSgmlCatalog();

	/**
	 * Sets the value of the '{@link mancoosi.Environment#getSgmlCatalog <em>Sgml Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgml Catalog</em>' containment reference.
	 * @see #getSgmlCatalog()
	 * @generated
	 */
	void setSgmlCatalog(SGMLCatalog value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Configuration#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' container reference.
	 * @see #setConfiguration(Configuration)
	 * @see mancoosi.MancoosiPackage#getEnvironment_Configuration()
	 * @see mancoosi.Configuration#getEnvironment
	 * @model opposite="environment" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link mancoosi.Environment#getConfiguration <em>Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' container reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Module Cache</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.ModuleCache}.
	 * It is bidirectional and its opposite is '{@link mancoosi.ModuleCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Cache</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Cache</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getEnvironment_ModuleCache()
	 * @see mancoosi.ModuleCache#getEnv
	 * @model type="mancoosi.ModuleCache" opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList getModuleCache();

	/**
	 * Returns the value of the '<em><b>Xfont Caches</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.XFontCache}.
	 * It is bidirectional and its opposite is '{@link mancoosi.XFontCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xfont Caches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xfont Caches</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getEnvironment_XfontCaches()
	 * @see mancoosi.XFontCache#getEnv
	 * @model type="mancoosi.XFontCache" opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList getXfontCaches();

	/**
	 * Returns the value of the '<em><b>Gconf</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.GConf#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gconf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gconf</em>' containment reference.
	 * @see #setGconf(GConf)
	 * @see mancoosi.MancoosiPackage#getEnvironment_Gconf()
	 * @see mancoosi.GConf#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	GConf getGconf();

	/**
	 * Sets the value of the '{@link mancoosi.Environment#getGconf <em>Gconf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gconf</em>' containment reference.
	 * @see #getGconf()
	 * @generated
	 */
	void setGconf(GConf value);

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Menu#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' containment reference.
	 * @see #setMenu(Menu)
	 * @see mancoosi.MancoosiPackage#getEnvironment_Menu()
	 * @see mancoosi.Menu#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Menu getMenu();

	/**
	 * Sets the value of the '{@link mancoosi.Environment#getMenu <em>Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' containment reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(Menu value);

} // Environment
