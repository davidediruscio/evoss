/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import mancoosi.MancoosiPackage;
import mancoosi.PackageSetting;
import mancoosi.PackageSettingStatement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Setting Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PackageSettingStatementImpl#getPkgsetting <em>Pkgsetting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PackageSettingStatementImpl extends StatementImpl implements PackageSettingStatement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageSettingStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPackageSettingStatement();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING, oldPkgsetting, pkgsetting));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING, oldPkgsetting, pkgsetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING:
				if (resolve) return getPkgsetting();
				return basicGetPkgsetting();
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
			case MancoosiPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING:
				setPkgsetting((PackageSetting)newValue);
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
			case MancoosiPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING:
				setPkgsetting((PackageSetting)null);
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
			case MancoosiPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING:
				return pkgsetting != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageSettingStatementImpl
