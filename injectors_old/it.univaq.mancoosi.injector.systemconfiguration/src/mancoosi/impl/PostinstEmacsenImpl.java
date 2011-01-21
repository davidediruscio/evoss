/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import mancoosi.File;
import mancoosi.MancoosiPackage;
import mancoosi.PackageSetting;
import mancoosi.PackageSettingStatement;
import mancoosi.PostinstEmacsen;
import mancoosi.UpdatePackageSettingStatement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postinst Emacsen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PostinstEmacsenImpl#getPkgsetting <em>Pkgsetting</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstEmacsenImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostinstEmacsenImpl extends UpdateEnvironmentStatementImpl implements PostinstEmacsen {
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
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected File package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostinstEmacsenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPostinstEmacsen();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_EMACSEN__PKGSETTING, oldPkgsetting, pkgsetting));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_EMACSEN__PKGSETTING, oldPkgsetting, pkgsetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (File)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_EMACSEN__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(File newPackage) {
		File oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_EMACSEN__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.POSTINST_EMACSEN__PKGSETTING:
				if (resolve) return getPkgsetting();
				return basicGetPkgsetting();
			case MancoosiPackage.POSTINST_EMACSEN__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
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
			case MancoosiPackage.POSTINST_EMACSEN__PKGSETTING:
				setPkgsetting((PackageSetting)newValue);
				return;
			case MancoosiPackage.POSTINST_EMACSEN__PACKAGE:
				setPackage((File)newValue);
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
			case MancoosiPackage.POSTINST_EMACSEN__PKGSETTING:
				setPkgsetting((PackageSetting)null);
				return;
			case MancoosiPackage.POSTINST_EMACSEN__PACKAGE:
				setPackage((File)null);
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
			case MancoosiPackage.POSTINST_EMACSEN__PKGSETTING:
				return pkgsetting != null;
			case MancoosiPackage.POSTINST_EMACSEN__PACKAGE:
				return package_ != null;
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
				case MancoosiPackage.POSTINST_EMACSEN__PKGSETTING: return MancoosiPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING;
				default: return -1;
			}
		}
		if (baseClass == UpdatePackageSettingStatement.class) {
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
				case MancoosiPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING: return MancoosiPackage.POSTINST_EMACSEN__PKGSETTING;
				default: return -1;
			}
		}
		if (baseClass == UpdatePackageSettingStatement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PostinstEmacsenImpl
