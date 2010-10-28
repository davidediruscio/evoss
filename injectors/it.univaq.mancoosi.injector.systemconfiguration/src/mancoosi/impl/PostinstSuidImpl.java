/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.File;
import mancoosi.FileSystemStatement;
import mancoosi.InstalledPackage;
import mancoosi.MancoosiPackage;
import mancoosi.PostinstSuid;
import mancoosi.StringParam;
import mancoosi.UpdateFileSytemStatement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postinst Suid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PostinstSuidImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstSuidImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstSuidImpl#getFile <em>File</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstSuidImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstSuidImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstSuidImpl#getPerms <em>Perms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostinstSuidImpl extends UpdateEnvironmentStatementImpl implements PostinstSuid {
	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList files;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected InstalledPackage package_;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected File file;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected StringParam owner;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected StringParam group;

	/**
	 * The cached value of the '{@link #getPerms() <em>Perms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerms()
	 * @generated
	 * @ordered
	 */
	protected StringParam perms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostinstSuidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPostinstSuid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFiles() {
		if (files == null) {
			files = new EObjectResolvingEList(File.class, this, MancoosiPackage.POSTINST_SUID__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstalledPackage getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (InstalledPackage)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_SUID__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstalledPackage basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(InstalledPackage newPackage) {
		InstalledPackage oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_SUID__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getFile() {
		if (file != null && file.eIsProxy()) {
			InternalEObject oldFile = (InternalEObject)file;
			file = (File)eResolveProxy(oldFile);
			if (file != oldFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_SUID__FILE, oldFile, file));
			}
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(File newFile) {
		File oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_SUID__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (StringParam)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_SUID__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(StringParam newOwner) {
		StringParam oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_SUID__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (StringParam)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_SUID__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(StringParam newGroup) {
		StringParam oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_SUID__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getPerms() {
		if (perms != null && perms.eIsProxy()) {
			InternalEObject oldPerms = (InternalEObject)perms;
			perms = (StringParam)eResolveProxy(oldPerms);
			if (perms != oldPerms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_SUID__PERMS, oldPerms, perms));
			}
		}
		return perms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam basicGetPerms() {
		return perms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerms(StringParam newPerms) {
		StringParam oldPerms = perms;
		perms = newPerms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_SUID__PERMS, oldPerms, perms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.POSTINST_SUID__FILES:
				return getFiles();
			case MancoosiPackage.POSTINST_SUID__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case MancoosiPackage.POSTINST_SUID__FILE:
				if (resolve) return getFile();
				return basicGetFile();
			case MancoosiPackage.POSTINST_SUID__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case MancoosiPackage.POSTINST_SUID__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case MancoosiPackage.POSTINST_SUID__PERMS:
				if (resolve) return getPerms();
				return basicGetPerms();
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
			case MancoosiPackage.POSTINST_SUID__FILES:
				getFiles().clear();
				getFiles().addAll((Collection)newValue);
				return;
			case MancoosiPackage.POSTINST_SUID__PACKAGE:
				setPackage((InstalledPackage)newValue);
				return;
			case MancoosiPackage.POSTINST_SUID__FILE:
				setFile((File)newValue);
				return;
			case MancoosiPackage.POSTINST_SUID__OWNER:
				setOwner((StringParam)newValue);
				return;
			case MancoosiPackage.POSTINST_SUID__GROUP:
				setGroup((StringParam)newValue);
				return;
			case MancoosiPackage.POSTINST_SUID__PERMS:
				setPerms((StringParam)newValue);
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
			case MancoosiPackage.POSTINST_SUID__FILES:
				getFiles().clear();
				return;
			case MancoosiPackage.POSTINST_SUID__PACKAGE:
				setPackage((InstalledPackage)null);
				return;
			case MancoosiPackage.POSTINST_SUID__FILE:
				setFile((File)null);
				return;
			case MancoosiPackage.POSTINST_SUID__OWNER:
				setOwner((StringParam)null);
				return;
			case MancoosiPackage.POSTINST_SUID__GROUP:
				setGroup((StringParam)null);
				return;
			case MancoosiPackage.POSTINST_SUID__PERMS:
				setPerms((StringParam)null);
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
			case MancoosiPackage.POSTINST_SUID__FILES:
				return files != null && !files.isEmpty();
			case MancoosiPackage.POSTINST_SUID__PACKAGE:
				return package_ != null;
			case MancoosiPackage.POSTINST_SUID__FILE:
				return file != null;
			case MancoosiPackage.POSTINST_SUID__OWNER:
				return owner != null;
			case MancoosiPackage.POSTINST_SUID__GROUP:
				return group != null;
			case MancoosiPackage.POSTINST_SUID__PERMS:
				return perms != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == FileSystemStatement.class) {
			switch (derivedFeatureID) {
				case MancoosiPackage.POSTINST_SUID__FILES: return MancoosiPackage.FILE_SYSTEM_STATEMENT__FILES;
				default: return -1;
			}
		}
		if (baseClass == UpdateFileSytemStatement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == FileSystemStatement.class) {
			switch (baseFeatureID) {
				case MancoosiPackage.FILE_SYSTEM_STATEMENT__FILES: return MancoosiPackage.POSTINST_SUID__FILES;
				default: return -1;
			}
		}
		if (baseClass == UpdateFileSytemStatement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PostinstSuidImpl
