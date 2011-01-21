/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.File;
import mancoosi.FileSystem;
import mancoosi.Group;
import mancoosi.MancoosiPackage;

import mancoosi.PackageSetting;
import mancoosi.User;
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
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.FileImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#getSize <em>Size</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#isIsDirectory <em>Is Directory</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#isSuid <em>Suid</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#isGuid <em>Guid</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#getFs <em>Fs</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#getChilds <em>Childs</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#isIsMissing <em>Is Missing</em>}</li>
 *   <li>{@link mancoosi.impl.FileImpl#getPkgSettings <em>Pkg Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileImpl extends NamedElementImpl implements File {
	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_SUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected String checkSum = CHECK_SUM_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDirectory() <em>Is Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIRECTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDirectory() <em>Is Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDirectory()
	 * @generated
	 * @ordered
	 */
	protected boolean isDirectory = IS_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSuid() <em>Suid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSuid() <em>Suid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuid()
	 * @generated
	 * @ordered
	 */
	protected boolean suid = SUID_EDEFAULT;

	/**
	 * The default value of the '{@link #isGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGuid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GUID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGuid()
	 * @generated
	 * @ordered
	 */
	protected boolean guid = GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermission() <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected String permission = PERMISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChilds() <em>Childs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChilds()
	 * @generated
	 * @ordered
	 */
	protected EList childs;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected User owner;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected Group group;

	/**
	 * The default value of the '{@link #isIsMissing() <em>Is Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMissing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MISSING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMissing() <em>Is Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMissing()
	 * @generated
	 * @ordered
	 */
	protected boolean isMissing = IS_MISSING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPkgSettings() <em>Pkg Settings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkgSettings()
	 * @generated
	 * @ordered
	 */
	protected EList pkgSettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getFile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckSum() {
		return checkSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckSum(String newCheckSum) {
		String oldCheckSum = checkSum;
		checkSum = newCheckSum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__CHECK_SUM, oldCheckSum, checkSum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDirectory() {
		return isDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDirectory(boolean newIsDirectory) {
		boolean oldIsDirectory = isDirectory;
		isDirectory = newIsDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__IS_DIRECTORY, oldIsDirectory, isDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuid() {
		return suid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuid(boolean newSuid) {
		boolean oldSuid = suid;
		suid = newSuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__SUID, oldSuid, suid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGuid() {
		return guid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuid(boolean newGuid) {
		boolean oldGuid = guid;
		guid = newGuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__GUID, oldGuid, guid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPermission() {
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermission(String newPermission) {
		String oldPermission = permission;
		permission = newPermission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__PERMISSION, oldPermission, permission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSystem getFs() {
		if (eContainerFeatureID() != MancoosiPackage.FILE__FS) return null;
		return (FileSystem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFs(FileSystem newFs, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFs, MancoosiPackage.FILE__FS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFs(FileSystem newFs) {
		if (newFs != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.FILE__FS && newFs != null)) {
			if (EcoreUtil.isAncestor(this, newFs))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFs != null)
				msgs = ((InternalEObject)newFs).eInverseAdd(this, MancoosiPackage.FILE_SYSTEM__ROOT, FileSystem.class, msgs);
			msgs = basicSetFs(newFs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__FS, newFs, newFs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChilds() {
		if (childs == null) {
			childs = new EObjectContainmentWithInverseEList(File.class, this, MancoosiPackage.FILE__CHILDS, MancoosiPackage.FILE__PARENT);
		}
		return childs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getParent() {
		if (eContainerFeatureID() != MancoosiPackage.FILE__PARENT) return null;
		return (File)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(File newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, MancoosiPackage.FILE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(File newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.FILE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MancoosiPackage.FILE__CHILDS, File.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (User)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.FILE__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(User newOwner) {
		User oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (Group)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.FILE__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		Group oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMissing() {
		return isMissing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMissing(boolean newIsMissing) {
		boolean oldIsMissing = isMissing;
		isMissing = newIsMissing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.FILE__IS_MISSING, oldIsMissing, isMissing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPkgSettings() {
		if (pkgSettings == null) {
			pkgSettings = new EObjectWithInverseResolvingEList.ManyInverse(PackageSetting.class, this, MancoosiPackage.FILE__PKG_SETTINGS, MancoosiPackage.PACKAGE_SETTING__FILES);
		}
		return pkgSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.FILE__FS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFs((FileSystem)otherEnd, msgs);
			case MancoosiPackage.FILE__CHILDS:
				return ((InternalEList)getChilds()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.FILE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((File)otherEnd, msgs);
			case MancoosiPackage.FILE__PKG_SETTINGS:
				return ((InternalEList)getPkgSettings()).basicAdd(otherEnd, msgs);
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
			case MancoosiPackage.FILE__FS:
				return basicSetFs(null, msgs);
			case MancoosiPackage.FILE__CHILDS:
				return ((InternalEList)getChilds()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.FILE__PARENT:
				return basicSetParent(null, msgs);
			case MancoosiPackage.FILE__PKG_SETTINGS:
				return ((InternalEList)getPkgSettings()).basicRemove(otherEnd, msgs);
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
			case MancoosiPackage.FILE__FS:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.FILE_SYSTEM__ROOT, FileSystem.class, msgs);
			case MancoosiPackage.FILE__PARENT:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.FILE__CHILDS, File.class, msgs);
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
			case MancoosiPackage.FILE__EXTENSION:
				return getExtension();
			case MancoosiPackage.FILE__DESCRIPTION:
				return getDescription();
			case MancoosiPackage.FILE__SIZE:
				return new Integer(getSize());
			case MancoosiPackage.FILE__CHECK_SUM:
				return getCheckSum();
			case MancoosiPackage.FILE__IS_DIRECTORY:
				return isIsDirectory() ? Boolean.TRUE : Boolean.FALSE;
			case MancoosiPackage.FILE__SUID:
				return isSuid() ? Boolean.TRUE : Boolean.FALSE;
			case MancoosiPackage.FILE__GUID:
				return isGuid() ? Boolean.TRUE : Boolean.FALSE;
			case MancoosiPackage.FILE__PERMISSION:
				return getPermission();
			case MancoosiPackage.FILE__LOCATION:
				return getLocation();
			case MancoosiPackage.FILE__FS:
				return getFs();
			case MancoosiPackage.FILE__CHILDS:
				return getChilds();
			case MancoosiPackage.FILE__PARENT:
				return getParent();
			case MancoosiPackage.FILE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case MancoosiPackage.FILE__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case MancoosiPackage.FILE__IS_MISSING:
				return isIsMissing() ? Boolean.TRUE : Boolean.FALSE;
			case MancoosiPackage.FILE__PKG_SETTINGS:
				return getPkgSettings();
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
			case MancoosiPackage.FILE__EXTENSION:
				setExtension((String)newValue);
				return;
			case MancoosiPackage.FILE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MancoosiPackage.FILE__SIZE:
				setSize(((Integer)newValue).intValue());
				return;
			case MancoosiPackage.FILE__CHECK_SUM:
				setCheckSum((String)newValue);
				return;
			case MancoosiPackage.FILE__IS_DIRECTORY:
				setIsDirectory(((Boolean)newValue).booleanValue());
				return;
			case MancoosiPackage.FILE__SUID:
				setSuid(((Boolean)newValue).booleanValue());
				return;
			case MancoosiPackage.FILE__GUID:
				setGuid(((Boolean)newValue).booleanValue());
				return;
			case MancoosiPackage.FILE__PERMISSION:
				setPermission((String)newValue);
				return;
			case MancoosiPackage.FILE__LOCATION:
				setLocation((String)newValue);
				return;
			case MancoosiPackage.FILE__FS:
				setFs((FileSystem)newValue);
				return;
			case MancoosiPackage.FILE__CHILDS:
				getChilds().clear();
				getChilds().addAll((Collection)newValue);
				return;
			case MancoosiPackage.FILE__PARENT:
				setParent((File)newValue);
				return;
			case MancoosiPackage.FILE__OWNER:
				setOwner((User)newValue);
				return;
			case MancoosiPackage.FILE__GROUP:
				setGroup((Group)newValue);
				return;
			case MancoosiPackage.FILE__IS_MISSING:
				setIsMissing(((Boolean)newValue).booleanValue());
				return;
			case MancoosiPackage.FILE__PKG_SETTINGS:
				getPkgSettings().clear();
				getPkgSettings().addAll((Collection)newValue);
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
			case MancoosiPackage.FILE__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case MancoosiPackage.FILE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MancoosiPackage.FILE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case MancoosiPackage.FILE__CHECK_SUM:
				setCheckSum(CHECK_SUM_EDEFAULT);
				return;
			case MancoosiPackage.FILE__IS_DIRECTORY:
				setIsDirectory(IS_DIRECTORY_EDEFAULT);
				return;
			case MancoosiPackage.FILE__SUID:
				setSuid(SUID_EDEFAULT);
				return;
			case MancoosiPackage.FILE__GUID:
				setGuid(GUID_EDEFAULT);
				return;
			case MancoosiPackage.FILE__PERMISSION:
				setPermission(PERMISSION_EDEFAULT);
				return;
			case MancoosiPackage.FILE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case MancoosiPackage.FILE__FS:
				setFs((FileSystem)null);
				return;
			case MancoosiPackage.FILE__CHILDS:
				getChilds().clear();
				return;
			case MancoosiPackage.FILE__PARENT:
				setParent((File)null);
				return;
			case MancoosiPackage.FILE__OWNER:
				setOwner((User)null);
				return;
			case MancoosiPackage.FILE__GROUP:
				setGroup((Group)null);
				return;
			case MancoosiPackage.FILE__IS_MISSING:
				setIsMissing(IS_MISSING_EDEFAULT);
				return;
			case MancoosiPackage.FILE__PKG_SETTINGS:
				getPkgSettings().clear();
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
			case MancoosiPackage.FILE__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case MancoosiPackage.FILE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MancoosiPackage.FILE__SIZE:
				return size != SIZE_EDEFAULT;
			case MancoosiPackage.FILE__CHECK_SUM:
				return CHECK_SUM_EDEFAULT == null ? checkSum != null : !CHECK_SUM_EDEFAULT.equals(checkSum);
			case MancoosiPackage.FILE__IS_DIRECTORY:
				return isDirectory != IS_DIRECTORY_EDEFAULT;
			case MancoosiPackage.FILE__SUID:
				return suid != SUID_EDEFAULT;
			case MancoosiPackage.FILE__GUID:
				return guid != GUID_EDEFAULT;
			case MancoosiPackage.FILE__PERMISSION:
				return PERMISSION_EDEFAULT == null ? permission != null : !PERMISSION_EDEFAULT.equals(permission);
			case MancoosiPackage.FILE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case MancoosiPackage.FILE__FS:
				return getFs() != null;
			case MancoosiPackage.FILE__CHILDS:
				return childs != null && !childs.isEmpty();
			case MancoosiPackage.FILE__PARENT:
				return getParent() != null;
			case MancoosiPackage.FILE__OWNER:
				return owner != null;
			case MancoosiPackage.FILE__GROUP:
				return group != null;
			case MancoosiPackage.FILE__IS_MISSING:
				return isMissing != IS_MISSING_EDEFAULT;
			case MancoosiPackage.FILE__PKG_SETTINGS:
				return pkgSettings != null && !pkgSettings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extension: ");
		result.append(extension);
		result.append(", description: ");
		result.append(description);
		result.append(", size: ");
		result.append(size);
		result.append(", checkSum: ");
		result.append(checkSum);
		result.append(", isDirectory: ");
		result.append(isDirectory);
		result.append(", suid: ");
		result.append(suid);
		result.append(", guid: ");
		result.append(guid);
		result.append(", permission: ");
		result.append(permission);
		result.append(", location: ");
		result.append(location);
		result.append(", isMissing: ");
		result.append(isMissing);
		result.append(')');
		return result.toString();
	}

} //FileImpl
