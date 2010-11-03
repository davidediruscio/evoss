/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getRunningServices <em>Running Services</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getUsers <em>Users</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getGroups <em>Groups</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getEmacspkg <em>Emacspkg</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getIconCache <em>Icon Cache</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getDesktopDb <em>Desktop Db</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getMimeTypeHandlerCache <em>Mime Type Handler Cache</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getLibraryCache <em>Library Cache</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getSkeeperCatalog <em>Skeeper Catalog</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getSgmlCatalog <em>Sgml Catalog</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getModuleCache <em>Module Cache</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getXfontCaches <em>Xfont Caches</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getGconf <em>Gconf</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Environment#getMenu <em>Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Running Services</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.Service}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Service#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Services</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_RunningServices()
	 * @see it.univaq.mancoosi.mancoosimm.Service#getEnv
	 * @model opposite="env" ordered="false"
	 * @generated
	 */
	EList<Service> getRunningServices();

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.Alternative}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Alternative#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternatives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_Alternatives()
	 * @see it.univaq.mancoosi.mancoosimm.Alternative#getEnv
	 * @model opposite="env" containment="true" ordered="false"
	 * @generated
	 */
	EList<Alternative> getAlternatives();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.User}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.User#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_Users()
	 * @see it.univaq.mancoosi.mancoosimm.User#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.Group}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Group#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_Groups()
	 * @see it.univaq.mancoosi.mancoosimm.Group#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Emacspkg</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.EmacsPackage#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emacspkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emacspkg</em>' containment reference.
	 * @see #setEmacspkg(EmacsPackage)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_Emacspkg()
	 * @see it.univaq.mancoosi.mancoosimm.EmacsPackage#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EmacsPackage getEmacspkg();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Environment#getEmacspkg <em>Emacspkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emacspkg</em>' containment reference.
	 * @see #getEmacspkg()
	 * @generated
	 */
	void setEmacspkg(EmacsPackage value);

	/**
	 * Returns the value of the '<em><b>Icon Cache</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.IconCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Cache</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Cache</em>' containment reference.
	 * @see #setIconCache(IconCache)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_IconCache()
	 * @see it.univaq.mancoosi.mancoosimm.IconCache#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	IconCache getIconCache();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Environment#getIconCache <em>Icon Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Cache</em>' containment reference.
	 * @see #getIconCache()
	 * @generated
	 */
	void setIconCache(IconCache value);

	/**
	 * Returns the value of the '<em><b>Desktop Db</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.DesktopDB#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desktop Db</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desktop Db</em>' containment reference.
	 * @see #setDesktopDb(DesktopDB)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_DesktopDb()
	 * @see it.univaq.mancoosi.mancoosimm.DesktopDB#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	DesktopDB getDesktopDb();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Environment#getDesktopDb <em>Desktop Db</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desktop Db</em>' containment reference.
	 * @see #getDesktopDb()
	 * @generated
	 */
	void setDesktopDb(DesktopDB value);

	/**
	 * Returns the value of the '<em><b>Mime Type Handler Cache</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type Handler Cache</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type Handler Cache</em>' containment reference.
	 * @see #setMimeTypeHandlerCache(MimeTypeHandlerCache)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_MimeTypeHandlerCache()
	 * @see it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	MimeTypeHandlerCache getMimeTypeHandlerCache();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Environment#getMimeTypeHandlerCache <em>Mime Type Handler Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type Handler Cache</em>' containment reference.
	 * @see #getMimeTypeHandlerCache()
	 * @generated
	 */
	void setMimeTypeHandlerCache(MimeTypeHandlerCache value);

	/**
	 * Returns the value of the '<em><b>Library Cache</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.LibraryCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Cache</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Cache</em>' containment reference.
	 * @see #setLibraryCache(LibraryCache)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_LibraryCache()
	 * @see it.univaq.mancoosi.mancoosimm.LibraryCache#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	LibraryCache getLibraryCache();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Environment#getLibraryCache <em>Library Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Cache</em>' containment reference.
	 * @see #getLibraryCache()
	 * @generated
	 */
	void setLibraryCache(LibraryCache value);

	/**
	 * Returns the value of the '<em><b>Skeeper Catalog</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.SkeeperCatalog#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skeeper Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skeeper Catalog</em>' containment reference.
	 * @see #setSkeeperCatalog(SkeeperCatalog)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_SkeeperCatalog()
	 * @see it.univaq.mancoosi.mancoosimm.SkeeperCatalog#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	SkeeperCatalog getSkeeperCatalog();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Environment#getSkeeperCatalog <em>Skeeper Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skeeper Catalog</em>' containment reference.
	 * @see #getSkeeperCatalog()
	 * @generated
	 */
	void setSkeeperCatalog(SkeeperCatalog value);

	/**
	 * Returns the value of the '<em><b>Sgml Catalog</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.SGMLCatalog#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sgml Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sgml Catalog</em>' containment reference.
	 * @see #setSgmlCatalog(SGMLCatalog)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_SgmlCatalog()
	 * @see it.univaq.mancoosi.mancoosimm.SGMLCatalog#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	SGMLCatalog getSgmlCatalog();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Environment#getSgmlCatalog <em>Sgml Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sgml Catalog</em>' containment reference.
	 * @see #getSgmlCatalog()
	 * @generated
	 */
	void setSgmlCatalog(SGMLCatalog value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Configuration#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' container reference.
	 * @see #setConfiguration(Configuration)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_Configuration()
	 * @see it.univaq.mancoosi.mancoosimm.Configuration#getEnvironment
	 * @model opposite="environment" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Environment#getConfiguration <em>Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' container reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Module Cache</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.ModuleCache}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.ModuleCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Cache</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Cache</em>' containment reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_ModuleCache()
	 * @see it.univaq.mancoosi.mancoosimm.ModuleCache#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ModuleCache> getModuleCache();

	/**
	 * Returns the value of the '<em><b>Xfont Caches</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.XFontCache}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.XFontCache#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xfont Caches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xfont Caches</em>' containment reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_XfontCaches()
	 * @see it.univaq.mancoosi.mancoosimm.XFontCache#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<XFontCache> getXfontCaches();

	/**
	 * Returns the value of the '<em><b>Gconf</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.GConf#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gconf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gconf</em>' containment reference.
	 * @see #setGconf(GConf)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_Gconf()
	 * @see it.univaq.mancoosi.mancoosimm.GConf#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	GConf getGconf();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Environment#getGconf <em>Gconf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gconf</em>' containment reference.
	 * @see #getGconf()
	 * @generated
	 */
	void setGconf(GConf value);

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Menu#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' containment reference.
	 * @see #setMenu(Menu)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getEnvironment_Menu()
	 * @see it.univaq.mancoosi.mancoosimm.Menu#getEnv
	 * @model opposite="env" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Menu getMenu();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Environment#getMenu <em>Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' containment reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(Menu value);

} // Environment
