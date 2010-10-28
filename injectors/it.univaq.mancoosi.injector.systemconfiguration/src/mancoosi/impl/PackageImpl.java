/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.ConfigScript;
import mancoosi.Configuration;
import mancoosi.Conflict;
import mancoosi.Dependence;
import mancoosi.DocumentationFile;
import mancoosi.File;
import mancoosi.MancoosiPackage;
import mancoosi.PackageSetting;
import mancoosi.PostinstScript;
import mancoosi.PostrmScript;
import mancoosi.PreinstScript;
import mancoosi.PrermScript;
import mancoosi.PriorityType;
import mancoosi.SrcPackage;
import mancoosi.StatusType;
import mancoosi.VirtualPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PackageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link mancoosi.impl.PackageImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link mancoosi.impl.PackageImpl#getPackageSettings <em>Package Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PackageImpl extends NamedElementImpl implements mancoosi.Package {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * The cached value of the '{@link #getPackageSettings() <em>Package Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageSettings()
	 * @generated
	 * @ordered
	 */
	protected PackageSetting packageSettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.PACKAGE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject)configuration;
			configuration = (Configuration)eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.PACKAGE__CONFIGURATION, oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.PACKAGE__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageSetting getPackageSettings() {
		return packageSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageSettings(PackageSetting newPackageSettings, NotificationChain msgs) {
		PackageSetting oldPackageSettings = packageSettings;
		packageSettings = newPackageSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.PACKAGE__PACKAGE_SETTINGS, oldPackageSettings, newPackageSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageSettings(PackageSetting newPackageSettings) {
		if (newPackageSettings != packageSettings) {
			NotificationChain msgs = null;
			if (packageSettings != null)
				msgs = ((InternalEObject)packageSettings).eInverseRemove(this, MancoosiPackage.PACKAGE_SETTING__PKG, PackageSetting.class, msgs);
			if (newPackageSettings != null)
				msgs = ((InternalEObject)newPackageSettings).eInverseAdd(this, MancoosiPackage.PACKAGE_SETTING__PKG, PackageSetting.class, msgs);
			msgs = basicSetPackageSettings(newPackageSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.PACKAGE__PACKAGE_SETTINGS, newPackageSettings, newPackageSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.PACKAGE__PACKAGE_SETTINGS:
				if (packageSettings != null)
					msgs = ((InternalEObject)packageSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.PACKAGE__PACKAGE_SETTINGS, null, msgs);
				return basicSetPackageSettings((PackageSetting)otherEnd, msgs);
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
			case MancoosiPackage.PACKAGE__PACKAGE_SETTINGS:
				return basicSetPackageSettings(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.PACKAGE__VERSION:
				return getVersion();
			case MancoosiPackage.PACKAGE__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
			case MancoosiPackage.PACKAGE__PACKAGE_SETTINGS:
				return getPackageSettings();
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
			case MancoosiPackage.PACKAGE__VERSION:
				setVersion((String)newValue);
				return;
			case MancoosiPackage.PACKAGE__CONFIGURATION:
				setConfiguration((Configuration)newValue);
				return;
			case MancoosiPackage.PACKAGE__PACKAGE_SETTINGS:
				setPackageSettings((PackageSetting)newValue);
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
			case MancoosiPackage.PACKAGE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case MancoosiPackage.PACKAGE__CONFIGURATION:
				setConfiguration((Configuration)null);
				return;
			case MancoosiPackage.PACKAGE__PACKAGE_SETTINGS:
				setPackageSettings((PackageSetting)null);
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
			case MancoosiPackage.PACKAGE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case MancoosiPackage.PACKAGE__CONFIGURATION:
				return configuration != null;
			case MancoosiPackage.PACKAGE__PACKAGE_SETTINGS:
				return packageSettings != null;
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
