/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import mancoosi.DeletionPackageSettingStatement;
import mancoosi.File;
import mancoosi.MancoosiPackage;
import mancoosi.PackageSetting;
import mancoosi.PackageSettingStatement;
import mancoosi.PrermInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prerm Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PrermInfoImpl#getPkgsetting <em>Pkgsetting</em>}</li>
 *   <li>{@link mancoosi.impl.PrermInfoImpl#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrermInfoImpl extends UpdateEnvironmentStatementImpl implements PrermInfo {
	/**
	 * The cached value of the '{@link #getPkgsetting() <em>Pkgsetting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkgsetting()
	 * @generated
	 * @ordered
	 */
	protected PackageSetting pkgsetting;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrermInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPrermInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageSetting getPkgsetting() {
		if (pkgsetting != null && pkgsetting.eIsProxy()) {
			InternalEObject oldPkgsetting = (InternalEObject)pkgsetting;
			pkgsetting = (PackageSetting)eResolveProxy(oldPkgsetting);
			if (pkgsetting != oldPkgsetting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.PRERM_INFO__PKGSETTING, oldPkgsetting, pkgsetting));
			}
		}
		return pkgsetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageSetting basicGetPkgsetting() {
		return pkgsetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkgsetting(PackageSetting newPkgsetting) {
		PackageSetting oldPkgsetting = pkgsetting;
		pkgsetting = newPkgsetting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.PRERM_INFO__PKGSETTING, oldPkgsetting, pkgsetting));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.PRERM_INFO__FILE, oldFile, file));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.PRERM_INFO__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.PRERM_INFO__PKGSETTING:
				if (resolve) return getPkgsetting();
				return basicGetPkgsetting();
			case MancoosiPackage.PRERM_INFO__FILE:
				if (resolve) return getFile();
				return basicGetFile();
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
			case MancoosiPackage.PRERM_INFO__PKGSETTING:
				setPkgsetting((PackageSetting)newValue);
				return;
			case MancoosiPackage.PRERM_INFO__FILE:
				setFile((File)newValue);
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
			case MancoosiPackage.PRERM_INFO__PKGSETTING:
				setPkgsetting((PackageSetting)null);
				return;
			case MancoosiPackage.PRERM_INFO__FILE:
				setFile((File)null);
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
			case MancoosiPackage.PRERM_INFO__PKGSETTING:
				return pkgsetting != null;
			case MancoosiPackage.PRERM_INFO__FILE:
				return file != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == PackageSettingStatement.class) {
			switch (derivedFeatureID) {
				case MancoosiPackage.PRERM_INFO__PKGSETTING: return MancoosiPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING;
				default: return -1;
			}
		}
		if (baseClass == DeletionPackageSettingStatement.class) {
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
		if (baseClass == PackageSettingStatement.class) {
			switch (baseFeatureID) {
				case MancoosiPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING: return MancoosiPackage.PRERM_INFO__PKGSETTING;
				default: return -1;
			}
		}
		if (baseClass == DeletionPackageSettingStatement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PrermInfoImpl
