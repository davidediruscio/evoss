/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.DeletionPackageSettingStatement;
import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.packagemm.PackageSettingStatement;
import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.PrermSgmlcatalog;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prerm Sgmlcatalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PrermSgmlcatalogImpl#getPkgsetting <em>Pkgsetting</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PrermSgmlcatalogImpl#getCentralcat <em>Centralcat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrermSgmlcatalogImpl extends UpdateEnvironmentStatementImpl implements PrermSgmlcatalog {
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
	 * The cached value of the '{@link #getCentralcat() <em>Centralcat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentralcat()
	 * @generated
	 * @ordered
	 */
	protected File centralcat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrermSgmlcatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getPrermSgmlcatalog();
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PRERM_SGMLCATALOG__PKGSETTING, oldPkgsetting, pkgsetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getCentralcat() {
		return centralcat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCentralcat(File newCentralcat, NotificationChain msgs) {
		File oldCentralcat = centralcat;
		centralcat = newCentralcat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.PRERM_SGMLCATALOG__CENTRALCAT, oldCentralcat, newCentralcat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentralcat(File newCentralcat) {
		if (newCentralcat != centralcat) {
			NotificationChain msgs = null;
			if (centralcat != null)
				msgs = ((InternalEObject)centralcat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PRERM_SGMLCATALOG__CENTRALCAT, null, msgs);
			if (newCentralcat != null)
				msgs = ((InternalEObject)newCentralcat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PRERM_SGMLCATALOG__CENTRALCAT, null, msgs);
			msgs = basicSetCentralcat(newCentralcat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PRERM_SGMLCATALOG__CENTRALCAT, newCentralcat, newCentralcat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.PRERM_SGMLCATALOG__CENTRALCAT:
				return basicSetCentralcat(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackagemmPackage.PRERM_SGMLCATALOG__PKGSETTING:
				return getPkgsetting();
			case PackagemmPackage.PRERM_SGMLCATALOG__CENTRALCAT:
				return getCentralcat();
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
			case PackagemmPackage.PRERM_SGMLCATALOG__PKGSETTING:
				setPkgsetting((String)newValue);
				return;
			case PackagemmPackage.PRERM_SGMLCATALOG__CENTRALCAT:
				setCentralcat((File)newValue);
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
			case PackagemmPackage.PRERM_SGMLCATALOG__PKGSETTING:
				setPkgsetting(PKGSETTING_EDEFAULT);
				return;
			case PackagemmPackage.PRERM_SGMLCATALOG__CENTRALCAT:
				setCentralcat((File)null);
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
			case PackagemmPackage.PRERM_SGMLCATALOG__PKGSETTING:
				return PKGSETTING_EDEFAULT == null ? pkgsetting != null : !PKGSETTING_EDEFAULT.equals(pkgsetting);
			case PackagemmPackage.PRERM_SGMLCATALOG__CENTRALCAT:
				return centralcat != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PackageSettingStatement.class) {
			switch (derivedFeatureID) {
				case PackagemmPackage.PRERM_SGMLCATALOG__PKGSETTING: return PackagemmPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING;
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PackageSettingStatement.class) {
			switch (baseFeatureID) {
				case PackagemmPackage.PACKAGE_SETTING_STATEMENT__PKGSETTING: return PackagemmPackage.PRERM_SGMLCATALOG__PKGSETTING;
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

} //PrermSgmlcatalogImpl
