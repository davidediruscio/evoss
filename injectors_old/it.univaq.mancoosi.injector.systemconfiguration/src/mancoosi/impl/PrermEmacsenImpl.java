/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import mancoosi.InstalledPackage;
import mancoosi.MancoosiPackage;
import mancoosi.PackageSetting;
import mancoosi.PackageSettingStatement;
import mancoosi.PrermEmacsen;
import mancoosi.UpdatePackageSettingStatement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prerm Emacsen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PrermEmacsenImpl#getPkgsetting <em>Pkgsetting</em>}</li>
 *   <li>{@link mancoosi.impl.PrermEmacsenImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrermEmacsenImpl extends UpdateEnvironmentStatementImpl implements PrermEmacsen {
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
	protected InstalledPackage package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrermEmacsenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPrermEmacsen();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.PRERM_EMACSEN__PKGSETTING, oldPkgsetting, pkgsetting));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.PRERM_EMACSEN__PKGSETTING, oldPkgsetting, pkgsetting));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.PRERM_EMACSEN__PACKAGE, oldPackage, package_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.PRERM_EMACSEN__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.PRERM_EMACSEN__PKGSETTING:
				if (resolve) return getPkgsetting();
				return basicGetPkgsetting();
			case MancoosiPackage.PRERM_EMACSEN__PACKAGE:
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
			case MancoosiPackage.PRERM_EMACSEN__PKGSETTING:
				setPkgsetting((PackageSetting)newValue);
				return;
			case MancoosiPackage.PRERM_EMACSEN__PACKAGE:
				setPackage((InstalledPackage)newValue);
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
			case MancoosiPackage.PRERM_EMACSEN__PKGSETTING:
				setPkgsetting((PackageSetting)null);
				return;
			case MancoosiPackage.PRERM_EMACSEN__PACKAGE:
				setPackage((InstalledPackage)null);
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
			case MancoosiPackage.PRERM_EMACSEN__PKGSETTING:
				return pkgsetting != null;
			case MancoosiPackage.PRERM_EMACSEN__PACKAGE:
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
				case MancoosiPackage.PRERM_EMACSEN__PKGSETTING: return MancoosiPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING;
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
				case MancoosiPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING: return MancoosiPackage.PRERM_EMACSEN__PKGSETTING;
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

} //PrermEmacsenImpl
