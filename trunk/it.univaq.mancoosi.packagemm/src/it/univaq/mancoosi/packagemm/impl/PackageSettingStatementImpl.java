/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.PackageSettingStatement;
import it.univaq.mancoosi.packagemm.PackagemmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Setting Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PackageSettingStatementImpl#getPkgsetting <em>Pkgsetting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PackageSettingStatementImpl extends StatementImpl implements PackageSettingStatement {
	/**
	 * The default value of the '{@link #getPkgsetting() <em>Pkgsetting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkgsetting()
	 * @generated
	 * @ordered
	 */
	protected static final String PKGSETTING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPkgsetting() <em>Pkgsetting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkgsetting()
	 * @generated
	 * @ordered
	 */
	protected String pkgsetting = PKGSETTING_EDEFAULT;

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
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getPackageSettingStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPkgsetting() {
		return pkgsetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkgsetting(String newPkgsetting) {
		String oldPkgsetting = pkgsetting;
		pkgsetting = newPkgsetting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING, oldPkgsetting, pkgsetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackagemmPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING:
				return getPkgsetting();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PackagemmPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING:
				setPkgsetting((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PackagemmPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING:
				setPkgsetting(PKGSETTING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PackagemmPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING:
				return PKGSETTING_EDEFAULT == null ? pkgsetting != null : !PKGSETTING_EDEFAULT.equals(pkgsetting);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pkgsetting: ");
		result.append(pkgsetting);
		result.append(')');
		return result.toString();
	}

} //PackageSettingStatementImpl
