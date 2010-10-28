/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.Alternative;
import mancoosi.Configuration;
import mancoosi.DesktopDB;
import mancoosi.EmacsPackage;
import mancoosi.Environment;
import mancoosi.GConf;
import mancoosi.Group;
import mancoosi.IconCache;
import mancoosi.LibraryCache;
import mancoosi.MancoosiPackage;
import mancoosi.Menu;
import mancoosi.MimeTypeHandlerCache;
import mancoosi.ModuleCache;
import mancoosi.SGMLCatalog;
import mancoosi.Service;
import mancoosi.SkeeperCatalog;
import mancoosi.User;
import mancoosi.XFontCache;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getRunningServices <em>Running Services</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getEmacspkg <em>Emacspkg</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getIconCache <em>Icon Cache</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getDesktopDb <em>Desktop Db</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getMimeTypeHandlerCache <em>Mime Type Handler Cache</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getLibraryCache <em>Library Cache</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getSkeeperCatalog <em>Skeeper Catalog</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getSgmlCatalog <em>Sgml Catalog</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getModuleCache <em>Module Cache</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getXfontCaches <em>Xfont Caches</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getGconf <em>Gconf</em>}</li>
 *   <li>{@link mancoosi.impl.EnvironmentImpl#getMenu <em>Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentImpl extends NamedElementImpl implements Environment {
	/**
	 * The cached value of the '{@link #getRunningServices() <em>Running Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningServices()
	 * @generated
	 * @ordered
	 */
	protected EList runningServices;

	/**
	 * The cached value of the '{@link #getAlternatives() <em>Alternatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList alternatives;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList users;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList groups;

	/**
	 * The cached value of the '{@link #getEmacspkg() <em>Emacspkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmacspkg()
	 * @generated
	 * @ordered
	 */
	protected EmacsPackage emacspkg;

	/**
	 * The cached value of the '{@link #getIconCache() <em>Icon Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconCache()
	 * @generated
	 * @ordered
	 */
	protected IconCache iconCache;

	/**
	 * The cached value of the '{@link #getDesktopDb() <em>Desktop Db</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesktopDb()
	 * @generated
	 * @ordered
	 */
	protected DesktopDB desktopDb;

	/**
	 * The cached value of the '{@link #getMimeTypeHandlerCache() <em>Mime Type Handler Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypeHandlerCache()
	 * @generated
	 * @ordered
	 */
	protected MimeTypeHandlerCache mimeTypeHandlerCache;

	/**
	 * The cached value of the '{@link #getLibraryCache() <em>Library Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryCache()
	 * @generated
	 * @ordered
	 */
	protected LibraryCache libraryCache;

	/**
	 * The cached value of the '{@link #getSkeeperCatalog() <em>Skeeper Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkeeperCatalog()
	 * @generated
	 * @ordered
	 */
	protected SkeeperCatalog skeeperCatalog;

	/**
	 * The cached value of the '{@link #getSgmlCatalog() <em>Sgml Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSgmlCatalog()
	 * @generated
	 * @ordered
	 */
	protected SGMLCatalog sgmlCatalog;

	/**
	 * The cached value of the '{@link #getModuleCache() <em>Module Cache</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleCache()
	 * @generated
	 * @ordered
	 */
	protected EList moduleCache;

	/**
	 * The cached value of the '{@link #getXfontCaches() <em>Xfont Caches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXfontCaches()
	 * @generated
	 * @ordered
	 */
	protected EList xfontCaches;

	/**
	 * The cached value of the '{@link #getGconf() <em>Gconf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGconf()
	 * @generated
	 * @ordered
	 */
	protected GConf gconf;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected Menu menu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getEnvironment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRunningServices() {
		if (runningServices == null) {
			runningServices = new EObjectWithInverseResolvingEList(Service.class, this, MancoosiPackage.ENVIRONMENT__RUNNING_SERVICES, MancoosiPackage.SERVICE__ENV);
		}
		return runningServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAlternatives() {
		if (alternatives == null) {
			alternatives = new EObjectContainmentWithInverseEList(Alternative.class, this, MancoosiPackage.ENVIRONMENT__ALTERNATIVES, MancoosiPackage.ALTERNATIVE__ENV);
		}
		return alternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsers() {
		if (users == null) {
			users = new EObjectContainmentWithInverseEList(User.class, this, MancoosiPackage.ENVIRONMENT__USERS, MancoosiPackage.USER__ENV);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentWithInverseEList(Group.class, this, MancoosiPackage.ENVIRONMENT__GROUPS, MancoosiPackage.GROUP__ENV);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmacsPackage getEmacspkg() {
		return emacspkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmacspkg(EmacsPackage newEmacspkg, NotificationChain msgs) {
		EmacsPackage oldEmacspkg = emacspkg;
		emacspkg = newEmacspkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__EMACSPKG, oldEmacspkg, newEmacspkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmacspkg(EmacsPackage newEmacspkg) {
		if (newEmacspkg != emacspkg) {
			NotificationChain msgs = null;
			if (emacspkg != null)
				msgs = ((InternalEObject)emacspkg).eInverseRemove(this, MancoosiPackage.EMACS_PACKAGE__ENV, EmacsPackage.class, msgs);
			if (newEmacspkg != null)
				msgs = ((InternalEObject)newEmacspkg).eInverseAdd(this, MancoosiPackage.EMACS_PACKAGE__ENV, EmacsPackage.class, msgs);
			msgs = basicSetEmacspkg(newEmacspkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__EMACSPKG, newEmacspkg, newEmacspkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconCache getIconCache() {
		return iconCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIconCache(IconCache newIconCache, NotificationChain msgs) {
		IconCache oldIconCache = iconCache;
		iconCache = newIconCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__ICON_CACHE, oldIconCache, newIconCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconCache(IconCache newIconCache) {
		if (newIconCache != iconCache) {
			NotificationChain msgs = null;
			if (iconCache != null)
				msgs = ((InternalEObject)iconCache).eInverseRemove(this, MancoosiPackage.ICON_CACHE__ENV, IconCache.class, msgs);
			if (newIconCache != null)
				msgs = ((InternalEObject)newIconCache).eInverseAdd(this, MancoosiPackage.ICON_CACHE__ENV, IconCache.class, msgs);
			msgs = basicSetIconCache(newIconCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__ICON_CACHE, newIconCache, newIconCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesktopDB getDesktopDb() {
		return desktopDb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesktopDb(DesktopDB newDesktopDb, NotificationChain msgs) {
		DesktopDB oldDesktopDb = desktopDb;
		desktopDb = newDesktopDb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__DESKTOP_DB, oldDesktopDb, newDesktopDb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesktopDb(DesktopDB newDesktopDb) {
		if (newDesktopDb != desktopDb) {
			NotificationChain msgs = null;
			if (desktopDb != null)
				msgs = ((InternalEObject)desktopDb).eInverseRemove(this, MancoosiPackage.DESKTOP_DB__ENV, DesktopDB.class, msgs);
			if (newDesktopDb != null)
				msgs = ((InternalEObject)newDesktopDb).eInverseAdd(this, MancoosiPackage.DESKTOP_DB__ENV, DesktopDB.class, msgs);
			msgs = basicSetDesktopDb(newDesktopDb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__DESKTOP_DB, newDesktopDb, newDesktopDb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeTypeHandlerCache getMimeTypeHandlerCache() {
		return mimeTypeHandlerCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMimeTypeHandlerCache(MimeTypeHandlerCache newMimeTypeHandlerCache, NotificationChain msgs) {
		MimeTypeHandlerCache oldMimeTypeHandlerCache = mimeTypeHandlerCache;
		mimeTypeHandlerCache = newMimeTypeHandlerCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__MIME_TYPE_HANDLER_CACHE, oldMimeTypeHandlerCache, newMimeTypeHandlerCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeTypeHandlerCache(MimeTypeHandlerCache newMimeTypeHandlerCache) {
		if (newMimeTypeHandlerCache != mimeTypeHandlerCache) {
			NotificationChain msgs = null;
			if (mimeTypeHandlerCache != null)
				msgs = ((InternalEObject)mimeTypeHandlerCache).eInverseRemove(this, MancoosiPackage.MIME_TYPE_HANDLER_CACHE__ENV, MimeTypeHandlerCache.class, msgs);
			if (newMimeTypeHandlerCache != null)
				msgs = ((InternalEObject)newMimeTypeHandlerCache).eInverseAdd(this, MancoosiPackage.MIME_TYPE_HANDLER_CACHE__ENV, MimeTypeHandlerCache.class, msgs);
			msgs = basicSetMimeTypeHandlerCache(newMimeTypeHandlerCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__MIME_TYPE_HANDLER_CACHE, newMimeTypeHandlerCache, newMimeTypeHandlerCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryCache getLibraryCache() {
		return libraryCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibraryCache(LibraryCache newLibraryCache, NotificationChain msgs) {
		LibraryCache oldLibraryCache = libraryCache;
		libraryCache = newLibraryCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__LIBRARY_CACHE, oldLibraryCache, newLibraryCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryCache(LibraryCache newLibraryCache) {
		if (newLibraryCache != libraryCache) {
			NotificationChain msgs = null;
			if (libraryCache != null)
				msgs = ((InternalEObject)libraryCache).eInverseRemove(this, MancoosiPackage.LIBRARY_CACHE__ENV, LibraryCache.class, msgs);
			if (newLibraryCache != null)
				msgs = ((InternalEObject)newLibraryCache).eInverseAdd(this, MancoosiPackage.LIBRARY_CACHE__ENV, LibraryCache.class, msgs);
			msgs = basicSetLibraryCache(newLibraryCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__LIBRARY_CACHE, newLibraryCache, newLibraryCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkeeperCatalog getSkeeperCatalog() {
		return skeeperCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSkeeperCatalog(SkeeperCatalog newSkeeperCatalog, NotificationChain msgs) {
		SkeeperCatalog oldSkeeperCatalog = skeeperCatalog;
		skeeperCatalog = newSkeeperCatalog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__SKEEPER_CATALOG, oldSkeeperCatalog, newSkeeperCatalog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkeeperCatalog(SkeeperCatalog newSkeeperCatalog) {
		if (newSkeeperCatalog != skeeperCatalog) {
			NotificationChain msgs = null;
			if (skeeperCatalog != null)
				msgs = ((InternalEObject)skeeperCatalog).eInverseRemove(this, MancoosiPackage.SKEEPER_CATALOG__ENV, SkeeperCatalog.class, msgs);
			if (newSkeeperCatalog != null)
				msgs = ((InternalEObject)newSkeeperCatalog).eInverseAdd(this, MancoosiPackage.SKEEPER_CATALOG__ENV, SkeeperCatalog.class, msgs);
			msgs = basicSetSkeeperCatalog(newSkeeperCatalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__SKEEPER_CATALOG, newSkeeperCatalog, newSkeeperCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGMLCatalog getSgmlCatalog() {
		return sgmlCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSgmlCatalog(SGMLCatalog newSgmlCatalog, NotificationChain msgs) {
		SGMLCatalog oldSgmlCatalog = sgmlCatalog;
		sgmlCatalog = newSgmlCatalog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__SGML_CATALOG, oldSgmlCatalog, newSgmlCatalog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSgmlCatalog(SGMLCatalog newSgmlCatalog) {
		if (newSgmlCatalog != sgmlCatalog) {
			NotificationChain msgs = null;
			if (sgmlCatalog != null)
				msgs = ((InternalEObject)sgmlCatalog).eInverseRemove(this, MancoosiPackage.SGML_CATALOG__ENV, SGMLCatalog.class, msgs);
			if (newSgmlCatalog != null)
				msgs = ((InternalEObject)newSgmlCatalog).eInverseAdd(this, MancoosiPackage.SGML_CATALOG__ENV, SGMLCatalog.class, msgs);
			msgs = basicSetSgmlCatalog(newSgmlCatalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__SGML_CATALOG, newSgmlCatalog, newSgmlCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration() {
		if (eContainerFeatureID() != MancoosiPackage.ENVIRONMENT__CONFIGURATION) return null;
		return (Configuration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConfiguration, MancoosiPackage.ENVIRONMENT__CONFIGURATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.ENVIRONMENT__CONFIGURATION && newConfiguration != null)) {
			if (EcoreUtil.isAncestor(this, newConfiguration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, MancoosiPackage.CONFIGURATION__ENVIRONMENT, Configuration.class, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getModuleCache() {
		if (moduleCache == null) {
			moduleCache = new EObjectContainmentWithInverseEList(ModuleCache.class, this, MancoosiPackage.ENVIRONMENT__MODULE_CACHE, MancoosiPackage.MODULE_CACHE__ENV);
		}
		return moduleCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getXfontCaches() {
		if (xfontCaches == null) {
			xfontCaches = new EObjectContainmentWithInverseEList(XFontCache.class, this, MancoosiPackage.ENVIRONMENT__XFONT_CACHES, MancoosiPackage.XFONT_CACHE__ENV);
		}
		return xfontCaches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GConf getGconf() {
		return gconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGconf(GConf newGconf, NotificationChain msgs) {
		GConf oldGconf = gconf;
		gconf = newGconf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__GCONF, oldGconf, newGconf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGconf(GConf newGconf) {
		if (newGconf != gconf) {
			NotificationChain msgs = null;
			if (gconf != null)
				msgs = ((InternalEObject)gconf).eInverseRemove(this, MancoosiPackage.GCONF__ENV, GConf.class, msgs);
			if (newGconf != null)
				msgs = ((InternalEObject)newGconf).eInverseAdd(this, MancoosiPackage.GCONF__ENV, GConf.class, msgs);
			msgs = basicSetGconf(newGconf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__GCONF, newGconf, newGconf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu getMenu() {
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMenu(Menu newMenu, NotificationChain msgs) {
		Menu oldMenu = menu;
		menu = newMenu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__MENU, oldMenu, newMenu);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenu(Menu newMenu) {
		if (newMenu != menu) {
			NotificationChain msgs = null;
			if (menu != null)
				msgs = ((InternalEObject)menu).eInverseRemove(this, MancoosiPackage.MENU__ENV, Menu.class, msgs);
			if (newMenu != null)
				msgs = ((InternalEObject)newMenu).eInverseAdd(this, MancoosiPackage.MENU__ENV, Menu.class, msgs);
			msgs = basicSetMenu(newMenu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.ENVIRONMENT__MENU, newMenu, newMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.ENVIRONMENT__RUNNING_SERVICES:
				return ((InternalEList)getRunningServices()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__ALTERNATIVES:
				return ((InternalEList)getAlternatives()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__USERS:
				return ((InternalEList)getUsers()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__GROUPS:
				return ((InternalEList)getGroups()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__EMACSPKG:
				if (emacspkg != null)
					msgs = ((InternalEObject)emacspkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.ENVIRONMENT__EMACSPKG, null, msgs);
				return basicSetEmacspkg((EmacsPackage)otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__ICON_CACHE:
				if (iconCache != null)
					msgs = ((InternalEObject)iconCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.ENVIRONMENT__ICON_CACHE, null, msgs);
				return basicSetIconCache((IconCache)otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__DESKTOP_DB:
				if (desktopDb != null)
					msgs = ((InternalEObject)desktopDb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.ENVIRONMENT__DESKTOP_DB, null, msgs);
				return basicSetDesktopDb((DesktopDB)otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__MIME_TYPE_HANDLER_CACHE:
				if (mimeTypeHandlerCache != null)
					msgs = ((InternalEObject)mimeTypeHandlerCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.ENVIRONMENT__MIME_TYPE_HANDLER_CACHE, null, msgs);
				return basicSetMimeTypeHandlerCache((MimeTypeHandlerCache)otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__LIBRARY_CACHE:
				if (libraryCache != null)
					msgs = ((InternalEObject)libraryCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.ENVIRONMENT__LIBRARY_CACHE, null, msgs);
				return basicSetLibraryCache((LibraryCache)otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__SKEEPER_CATALOG:
				if (skeeperCatalog != null)
					msgs = ((InternalEObject)skeeperCatalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.ENVIRONMENT__SKEEPER_CATALOG, null, msgs);
				return basicSetSkeeperCatalog((SkeeperCatalog)otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__SGML_CATALOG:
				if (sgmlCatalog != null)
					msgs = ((InternalEObject)sgmlCatalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.ENVIRONMENT__SGML_CATALOG, null, msgs);
				return basicSetSgmlCatalog((SGMLCatalog)otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__CONFIGURATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConfiguration((Configuration)otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__MODULE_CACHE:
				return ((InternalEList)getModuleCache()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__XFONT_CACHES:
				return ((InternalEList)getXfontCaches()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__GCONF:
				if (gconf != null)
					msgs = ((InternalEObject)gconf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.ENVIRONMENT__GCONF, null, msgs);
				return basicSetGconf((GConf)otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__MENU:
				if (menu != null)
					msgs = ((InternalEObject)menu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.ENVIRONMENT__MENU, null, msgs);
				return basicSetMenu((Menu)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.ENVIRONMENT__RUNNING_SERVICES:
				return ((InternalEList)getRunningServices()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__ALTERNATIVES:
				return ((InternalEList)getAlternatives()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__USERS:
				return ((InternalEList)getUsers()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__GROUPS:
				return ((InternalEList)getGroups()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__EMACSPKG:
				return basicSetEmacspkg(null, msgs);
			case MancoosiPackage.ENVIRONMENT__ICON_CACHE:
				return basicSetIconCache(null, msgs);
			case MancoosiPackage.ENVIRONMENT__DESKTOP_DB:
				return basicSetDesktopDb(null, msgs);
			case MancoosiPackage.ENVIRONMENT__MIME_TYPE_HANDLER_CACHE:
				return basicSetMimeTypeHandlerCache(null, msgs);
			case MancoosiPackage.ENVIRONMENT__LIBRARY_CACHE:
				return basicSetLibraryCache(null, msgs);
			case MancoosiPackage.ENVIRONMENT__SKEEPER_CATALOG:
				return basicSetSkeeperCatalog(null, msgs);
			case MancoosiPackage.ENVIRONMENT__SGML_CATALOG:
				return basicSetSgmlCatalog(null, msgs);
			case MancoosiPackage.ENVIRONMENT__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case MancoosiPackage.ENVIRONMENT__MODULE_CACHE:
				return ((InternalEList)getModuleCache()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__XFONT_CACHES:
				return ((InternalEList)getXfontCaches()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.ENVIRONMENT__GCONF:
				return basicSetGconf(null, msgs);
			case MancoosiPackage.ENVIRONMENT__MENU:
				return basicSetMenu(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MancoosiPackage.ENVIRONMENT__CONFIGURATION:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.CONFIGURATION__ENVIRONMENT, Configuration.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.ENVIRONMENT__RUNNING_SERVICES:
				return getRunningServices();
			case MancoosiPackage.ENVIRONMENT__ALTERNATIVES:
				return getAlternatives();
			case MancoosiPackage.ENVIRONMENT__USERS:
				return getUsers();
			case MancoosiPackage.ENVIRONMENT__GROUPS:
				return getGroups();
			case MancoosiPackage.ENVIRONMENT__EMACSPKG:
				return getEmacspkg();
			case MancoosiPackage.ENVIRONMENT__ICON_CACHE:
				return getIconCache();
			case MancoosiPackage.ENVIRONMENT__DESKTOP_DB:
				return getDesktopDb();
			case MancoosiPackage.ENVIRONMENT__MIME_TYPE_HANDLER_CACHE:
				return getMimeTypeHandlerCache();
			case MancoosiPackage.ENVIRONMENT__LIBRARY_CACHE:
				return getLibraryCache();
			case MancoosiPackage.ENVIRONMENT__SKEEPER_CATALOG:
				return getSkeeperCatalog();
			case MancoosiPackage.ENVIRONMENT__SGML_CATALOG:
				return getSgmlCatalog();
			case MancoosiPackage.ENVIRONMENT__CONFIGURATION:
				return getConfiguration();
			case MancoosiPackage.ENVIRONMENT__MODULE_CACHE:
				return getModuleCache();
			case MancoosiPackage.ENVIRONMENT__XFONT_CACHES:
				return getXfontCaches();
			case MancoosiPackage.ENVIRONMENT__GCONF:
				return getGconf();
			case MancoosiPackage.ENVIRONMENT__MENU:
				return getMenu();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.ENVIRONMENT__RUNNING_SERVICES:
				getRunningServices().clear();
				getRunningServices().addAll((Collection)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__USERS:
				getUsers().clear();
				getUsers().addAll((Collection)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__EMACSPKG:
				setEmacspkg((EmacsPackage)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__ICON_CACHE:
				setIconCache((IconCache)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__DESKTOP_DB:
				setDesktopDb((DesktopDB)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__MIME_TYPE_HANDLER_CACHE:
				setMimeTypeHandlerCache((MimeTypeHandlerCache)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__LIBRARY_CACHE:
				setLibraryCache((LibraryCache)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__SKEEPER_CATALOG:
				setSkeeperCatalog((SkeeperCatalog)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__SGML_CATALOG:
				setSgmlCatalog((SGMLCatalog)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__CONFIGURATION:
				setConfiguration((Configuration)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__MODULE_CACHE:
				getModuleCache().clear();
				getModuleCache().addAll((Collection)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__XFONT_CACHES:
				getXfontCaches().clear();
				getXfontCaches().addAll((Collection)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__GCONF:
				setGconf((GConf)newValue);
				return;
			case MancoosiPackage.ENVIRONMENT__MENU:
				setMenu((Menu)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case MancoosiPackage.ENVIRONMENT__RUNNING_SERVICES:
				getRunningServices().clear();
				return;
			case MancoosiPackage.ENVIRONMENT__ALTERNATIVES:
				getAlternatives().clear();
				return;
			case MancoosiPackage.ENVIRONMENT__USERS:
				getUsers().clear();
				return;
			case MancoosiPackage.ENVIRONMENT__GROUPS:
				getGroups().clear();
				return;
			case MancoosiPackage.ENVIRONMENT__EMACSPKG:
				setEmacspkg((EmacsPackage)null);
				return;
			case MancoosiPackage.ENVIRONMENT__ICON_CACHE:
				setIconCache((IconCache)null);
				return;
			case MancoosiPackage.ENVIRONMENT__DESKTOP_DB:
				setDesktopDb((DesktopDB)null);
				return;
			case MancoosiPackage.ENVIRONMENT__MIME_TYPE_HANDLER_CACHE:
				setMimeTypeHandlerCache((MimeTypeHandlerCache)null);
				return;
			case MancoosiPackage.ENVIRONMENT__LIBRARY_CACHE:
				setLibraryCache((LibraryCache)null);
				return;
			case MancoosiPackage.ENVIRONMENT__SKEEPER_CATALOG:
				setSkeeperCatalog((SkeeperCatalog)null);
				return;
			case MancoosiPackage.ENVIRONMENT__SGML_CATALOG:
				setSgmlCatalog((SGMLCatalog)null);
				return;
			case MancoosiPackage.ENVIRONMENT__CONFIGURATION:
				setConfiguration((Configuration)null);
				return;
			case MancoosiPackage.ENVIRONMENT__MODULE_CACHE:
				getModuleCache().clear();
				return;
			case MancoosiPackage.ENVIRONMENT__XFONT_CACHES:
				getXfontCaches().clear();
				return;
			case MancoosiPackage.ENVIRONMENT__GCONF:
				setGconf((GConf)null);
				return;
			case MancoosiPackage.ENVIRONMENT__MENU:
				setMenu((Menu)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MancoosiPackage.ENVIRONMENT__RUNNING_SERVICES:
				return runningServices != null && !runningServices.isEmpty();
			case MancoosiPackage.ENVIRONMENT__ALTERNATIVES:
				return alternatives != null && !alternatives.isEmpty();
			case MancoosiPackage.ENVIRONMENT__USERS:
				return users != null && !users.isEmpty();
			case MancoosiPackage.ENVIRONMENT__GROUPS:
				return groups != null && !groups.isEmpty();
			case MancoosiPackage.ENVIRONMENT__EMACSPKG:
				return emacspkg != null;
			case MancoosiPackage.ENVIRONMENT__ICON_CACHE:
				return iconCache != null;
			case MancoosiPackage.ENVIRONMENT__DESKTOP_DB:
				return desktopDb != null;
			case MancoosiPackage.ENVIRONMENT__MIME_TYPE_HANDLER_CACHE:
				return mimeTypeHandlerCache != null;
			case MancoosiPackage.ENVIRONMENT__LIBRARY_CACHE:
				return libraryCache != null;
			case MancoosiPackage.ENVIRONMENT__SKEEPER_CATALOG:
				return skeeperCatalog != null;
			case MancoosiPackage.ENVIRONMENT__SGML_CATALOG:
				return sgmlCatalog != null;
			case MancoosiPackage.ENVIRONMENT__CONFIGURATION:
				return getConfiguration() != null;
			case MancoosiPackage.ENVIRONMENT__MODULE_CACHE:
				return moduleCache != null && !moduleCache.isEmpty();
			case MancoosiPackage.ENVIRONMENT__XFONT_CACHES:
				return xfontCaches != null && !xfontCaches.isEmpty();
			case MancoosiPackage.ENVIRONMENT__GCONF:
				return gconf != null;
			case MancoosiPackage.ENVIRONMENT__MENU:
				return menu != null;
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentImpl
