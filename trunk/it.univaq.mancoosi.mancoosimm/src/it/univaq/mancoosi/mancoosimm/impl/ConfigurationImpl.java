/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.ConfigFilesPackage;
import it.univaq.mancoosi.mancoosimm.Configuration;
import it.univaq.mancoosi.mancoosimm.Environment;
import it.univaq.mancoosi.mancoosimm.FileSystem;
import it.univaq.mancoosi.mancoosimm.HalfConfiguredPackage;
import it.univaq.mancoosi.mancoosimm.HalfConfiguredReinstRequiredPackage;
import it.univaq.mancoosi.mancoosimm.HalfInstalledPackage;
import it.univaq.mancoosi.mancoosimm.HalfInstalledReinstRequiredPackage;
import it.univaq.mancoosi.mancoosimm.InstalledPackage;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.NotInstalledPackage;
import it.univaq.mancoosi.mancoosimm.UnpackedPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl#getSystemType <em>System Type</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl#getFileSystem <em>File System</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl#getInstalledPackages <em>Installed Packages</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl#getNotInstalledPackages <em>Not Installed Packages</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl#getConfigFilesPackages <em>Config Files Packages</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl#getUnpackedPackages <em>Unpacked Packages</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl#getHalfConfiguredPackages <em>Half Configured Packages</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl#getHalfInstalledPackages <em>Half Installed Packages</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl#getHalfConfiguredReinstRequiredPackages <em>Half Configured Reinst Required Packages</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ConfigurationImpl#getHalfInstalledReinstRequiredPackages <em>Half Installed Reinst Required Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends NamedElementImpl implements Configuration {
	/**
	 * The default value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected String creationTime = CREATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemType() <em>System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemType()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemType() <em>System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemType()
	 * @generated
	 * @ordered
	 */
	protected String systemType = SYSTEM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFileSystem() <em>File System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSystem()
	 * @generated
	 * @ordered
	 */
	protected FileSystem fileSystem;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getInstalledPackages() <em>Installed Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<InstalledPackage> installedPackages;

	/**
	 * The cached value of the '{@link #getNotInstalledPackages() <em>Not Installed Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotInstalledPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<NotInstalledPackage> notInstalledPackages;

	/**
	 * The cached value of the '{@link #getConfigFilesPackages() <em>Config Files Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigFilesPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigFilesPackage> configFilesPackages;

	/**
	 * The cached value of the '{@link #getUnpackedPackages() <em>Unpacked Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnpackedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<UnpackedPackage> unpackedPackages;

	/**
	 * The cached value of the '{@link #getHalfConfiguredPackages() <em>Half Configured Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHalfConfiguredPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<HalfConfiguredPackage> halfConfiguredPackages;

	/**
	 * The cached value of the '{@link #getHalfInstalledPackages() <em>Half Installed Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHalfInstalledPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<HalfInstalledPackage> halfInstalledPackages;

	/**
	 * The cached value of the '{@link #getHalfConfiguredReinstRequiredPackages() <em>Half Configured Reinst Required Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHalfConfiguredReinstRequiredPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<HalfConfiguredReinstRequiredPackage> halfConfiguredReinstRequiredPackages;

	/**
	 * The cached value of the '{@link #getHalfInstalledReinstRequiredPackages() <em>Half Installed Reinst Required Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHalfInstalledReinstRequiredPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<HalfInstalledReinstRequiredPackage> halfInstalledReinstRequiredPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationTime() {
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(String newCreationTime) {
		String oldCreationTime = creationTime;
		creationTime = newCreationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.CONFIGURATION__CREATION_TIME, oldCreationTime, creationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemType() {
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemType(String newSystemType) {
		String oldSystemType = systemType;
		systemType = newSystemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.CONFIGURATION__SYSTEM_TYPE, oldSystemType, systemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSystem getFileSystem() {
		return fileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileSystem(FileSystem newFileSystem, NotificationChain msgs) {
		FileSystem oldFileSystem = fileSystem;
		fileSystem = newFileSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.CONFIGURATION__FILE_SYSTEM, oldFileSystem, newFileSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSystem(FileSystem newFileSystem) {
		if (newFileSystem != fileSystem) {
			NotificationChain msgs = null;
			if (fileSystem != null)
				msgs = ((InternalEObject)fileSystem).eInverseRemove(this, MancoosiPackage.FILE_SYSTEM__CONFIGURATION, FileSystem.class, msgs);
			if (newFileSystem != null)
				msgs = ((InternalEObject)newFileSystem).eInverseAdd(this, MancoosiPackage.FILE_SYSTEM__CONFIGURATION, FileSystem.class, msgs);
			msgs = basicSetFileSystem(newFileSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.CONFIGURATION__FILE_SYSTEM, newFileSystem, newFileSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.CONFIGURATION__ENVIRONMENT, oldEnvironment, newEnvironment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject)environment).eInverseRemove(this, MancoosiPackage.ENVIRONMENT__CONFIGURATION, Environment.class, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, MancoosiPackage.ENVIRONMENT__CONFIGURATION, Environment.class, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.CONFIGURATION__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstalledPackage> getInstalledPackages() {
		if (installedPackages == null) {
			installedPackages = new EObjectContainmentEList<InstalledPackage>(InstalledPackage.class, this, MancoosiPackage.CONFIGURATION__INSTALLED_PACKAGES);
		}
		return installedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotInstalledPackage> getNotInstalledPackages() {
		if (notInstalledPackages == null) {
			notInstalledPackages = new EObjectContainmentEList<NotInstalledPackage>(NotInstalledPackage.class, this, MancoosiPackage.CONFIGURATION__NOT_INSTALLED_PACKAGES);
		}
		return notInstalledPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigFilesPackage> getConfigFilesPackages() {
		if (configFilesPackages == null) {
			configFilesPackages = new EObjectContainmentEList<ConfigFilesPackage>(ConfigFilesPackage.class, this, MancoosiPackage.CONFIGURATION__CONFIG_FILES_PACKAGES);
		}
		return configFilesPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnpackedPackage> getUnpackedPackages() {
		if (unpackedPackages == null) {
			unpackedPackages = new EObjectContainmentEList<UnpackedPackage>(UnpackedPackage.class, this, MancoosiPackage.CONFIGURATION__UNPACKED_PACKAGES);
		}
		return unpackedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HalfConfiguredPackage> getHalfConfiguredPackages() {
		if (halfConfiguredPackages == null) {
			halfConfiguredPackages = new EObjectContainmentEList<HalfConfiguredPackage>(HalfConfiguredPackage.class, this, MancoosiPackage.CONFIGURATION__HALF_CONFIGURED_PACKAGES);
		}
		return halfConfiguredPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HalfInstalledPackage> getHalfInstalledPackages() {
		if (halfInstalledPackages == null) {
			halfInstalledPackages = new EObjectContainmentEList<HalfInstalledPackage>(HalfInstalledPackage.class, this, MancoosiPackage.CONFIGURATION__HALF_INSTALLED_PACKAGES);
		}
		return halfInstalledPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HalfConfiguredReinstRequiredPackage> getHalfConfiguredReinstRequiredPackages() {
		if (halfConfiguredReinstRequiredPackages == null) {
			halfConfiguredReinstRequiredPackages = new EObjectContainmentEList<HalfConfiguredReinstRequiredPackage>(HalfConfiguredReinstRequiredPackage.class, this, MancoosiPackage.CONFIGURATION__HALF_CONFIGURED_REINST_REQUIRED_PACKAGES);
		}
		return halfConfiguredReinstRequiredPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HalfInstalledReinstRequiredPackage> getHalfInstalledReinstRequiredPackages() {
		if (halfInstalledReinstRequiredPackages == null) {
			halfInstalledReinstRequiredPackages = new EObjectContainmentEList<HalfInstalledReinstRequiredPackage>(HalfInstalledReinstRequiredPackage.class, this, MancoosiPackage.CONFIGURATION__HALF_INSTALLED_REINST_REQUIRED_PACKAGES);
		}
		return halfInstalledReinstRequiredPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.CONFIGURATION__FILE_SYSTEM:
				if (fileSystem != null)
					msgs = ((InternalEObject)fileSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.CONFIGURATION__FILE_SYSTEM, null, msgs);
				return basicSetFileSystem((FileSystem)otherEnd, msgs);
			case MancoosiPackage.CONFIGURATION__ENVIRONMENT:
				if (environment != null)
					msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.CONFIGURATION__ENVIRONMENT, null, msgs);
				return basicSetEnvironment((Environment)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.CONFIGURATION__FILE_SYSTEM:
				return basicSetFileSystem(null, msgs);
			case MancoosiPackage.CONFIGURATION__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
			case MancoosiPackage.CONFIGURATION__INSTALLED_PACKAGES:
				return ((InternalEList<?>)getInstalledPackages()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.CONFIGURATION__NOT_INSTALLED_PACKAGES:
				return ((InternalEList<?>)getNotInstalledPackages()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.CONFIGURATION__CONFIG_FILES_PACKAGES:
				return ((InternalEList<?>)getConfigFilesPackages()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.CONFIGURATION__UNPACKED_PACKAGES:
				return ((InternalEList<?>)getUnpackedPackages()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.CONFIGURATION__HALF_CONFIGURED_PACKAGES:
				return ((InternalEList<?>)getHalfConfiguredPackages()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.CONFIGURATION__HALF_INSTALLED_PACKAGES:
				return ((InternalEList<?>)getHalfInstalledPackages()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.CONFIGURATION__HALF_CONFIGURED_REINST_REQUIRED_PACKAGES:
				return ((InternalEList<?>)getHalfConfiguredReinstRequiredPackages()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.CONFIGURATION__HALF_INSTALLED_REINST_REQUIRED_PACKAGES:
				return ((InternalEList<?>)getHalfInstalledReinstRequiredPackages()).basicRemove(otherEnd, msgs);
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
			case MancoosiPackage.CONFIGURATION__CREATION_TIME:
				return getCreationTime();
			case MancoosiPackage.CONFIGURATION__SYSTEM_TYPE:
				return getSystemType();
			case MancoosiPackage.CONFIGURATION__FILE_SYSTEM:
				return getFileSystem();
			case MancoosiPackage.CONFIGURATION__ENVIRONMENT:
				return getEnvironment();
			case MancoosiPackage.CONFIGURATION__INSTALLED_PACKAGES:
				return getInstalledPackages();
			case MancoosiPackage.CONFIGURATION__NOT_INSTALLED_PACKAGES:
				return getNotInstalledPackages();
			case MancoosiPackage.CONFIGURATION__CONFIG_FILES_PACKAGES:
				return getConfigFilesPackages();
			case MancoosiPackage.CONFIGURATION__UNPACKED_PACKAGES:
				return getUnpackedPackages();
			case MancoosiPackage.CONFIGURATION__HALF_CONFIGURED_PACKAGES:
				return getHalfConfiguredPackages();
			case MancoosiPackage.CONFIGURATION__HALF_INSTALLED_PACKAGES:
				return getHalfInstalledPackages();
			case MancoosiPackage.CONFIGURATION__HALF_CONFIGURED_REINST_REQUIRED_PACKAGES:
				return getHalfConfiguredReinstRequiredPackages();
			case MancoosiPackage.CONFIGURATION__HALF_INSTALLED_REINST_REQUIRED_PACKAGES:
				return getHalfInstalledReinstRequiredPackages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.CONFIGURATION__CREATION_TIME:
				setCreationTime((String)newValue);
				return;
			case MancoosiPackage.CONFIGURATION__SYSTEM_TYPE:
				setSystemType((String)newValue);
				return;
			case MancoosiPackage.CONFIGURATION__FILE_SYSTEM:
				setFileSystem((FileSystem)newValue);
				return;
			case MancoosiPackage.CONFIGURATION__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case MancoosiPackage.CONFIGURATION__INSTALLED_PACKAGES:
				getInstalledPackages().clear();
				getInstalledPackages().addAll((Collection<? extends InstalledPackage>)newValue);
				return;
			case MancoosiPackage.CONFIGURATION__NOT_INSTALLED_PACKAGES:
				getNotInstalledPackages().clear();
				getNotInstalledPackages().addAll((Collection<? extends NotInstalledPackage>)newValue);
				return;
			case MancoosiPackage.CONFIGURATION__CONFIG_FILES_PACKAGES:
				getConfigFilesPackages().clear();
				getConfigFilesPackages().addAll((Collection<? extends ConfigFilesPackage>)newValue);
				return;
			case MancoosiPackage.CONFIGURATION__UNPACKED_PACKAGES:
				getUnpackedPackages().clear();
				getUnpackedPackages().addAll((Collection<? extends UnpackedPackage>)newValue);
				return;
			case MancoosiPackage.CONFIGURATION__HALF_CONFIGURED_PACKAGES:
				getHalfConfiguredPackages().clear();
				getHalfConfiguredPackages().addAll((Collection<? extends HalfConfiguredPackage>)newValue);
				return;
			case MancoosiPackage.CONFIGURATION__HALF_INSTALLED_PACKAGES:
				getHalfInstalledPackages().clear();
				getHalfInstalledPackages().addAll((Collection<? extends HalfInstalledPackage>)newValue);
				return;
			case MancoosiPackage.CONFIGURATION__HALF_CONFIGURED_REINST_REQUIRED_PACKAGES:
				getHalfConfiguredReinstRequiredPackages().clear();
				getHalfConfiguredReinstRequiredPackages().addAll((Collection<? extends HalfConfiguredReinstRequiredPackage>)newValue);
				return;
			case MancoosiPackage.CONFIGURATION__HALF_INSTALLED_REINST_REQUIRED_PACKAGES:
				getHalfInstalledReinstRequiredPackages().clear();
				getHalfInstalledReinstRequiredPackages().addAll((Collection<? extends HalfInstalledReinstRequiredPackage>)newValue);
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
			case MancoosiPackage.CONFIGURATION__CREATION_TIME:
				setCreationTime(CREATION_TIME_EDEFAULT);
				return;
			case MancoosiPackage.CONFIGURATION__SYSTEM_TYPE:
				setSystemType(SYSTEM_TYPE_EDEFAULT);
				return;
			case MancoosiPackage.CONFIGURATION__FILE_SYSTEM:
				setFileSystem((FileSystem)null);
				return;
			case MancoosiPackage.CONFIGURATION__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case MancoosiPackage.CONFIGURATION__INSTALLED_PACKAGES:
				getInstalledPackages().clear();
				return;
			case MancoosiPackage.CONFIGURATION__NOT_INSTALLED_PACKAGES:
				getNotInstalledPackages().clear();
				return;
			case MancoosiPackage.CONFIGURATION__CONFIG_FILES_PACKAGES:
				getConfigFilesPackages().clear();
				return;
			case MancoosiPackage.CONFIGURATION__UNPACKED_PACKAGES:
				getUnpackedPackages().clear();
				return;
			case MancoosiPackage.CONFIGURATION__HALF_CONFIGURED_PACKAGES:
				getHalfConfiguredPackages().clear();
				return;
			case MancoosiPackage.CONFIGURATION__HALF_INSTALLED_PACKAGES:
				getHalfInstalledPackages().clear();
				return;
			case MancoosiPackage.CONFIGURATION__HALF_CONFIGURED_REINST_REQUIRED_PACKAGES:
				getHalfConfiguredReinstRequiredPackages().clear();
				return;
			case MancoosiPackage.CONFIGURATION__HALF_INSTALLED_REINST_REQUIRED_PACKAGES:
				getHalfInstalledReinstRequiredPackages().clear();
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
			case MancoosiPackage.CONFIGURATION__CREATION_TIME:
				return CREATION_TIME_EDEFAULT == null ? creationTime != null : !CREATION_TIME_EDEFAULT.equals(creationTime);
			case MancoosiPackage.CONFIGURATION__SYSTEM_TYPE:
				return SYSTEM_TYPE_EDEFAULT == null ? systemType != null : !SYSTEM_TYPE_EDEFAULT.equals(systemType);
			case MancoosiPackage.CONFIGURATION__FILE_SYSTEM:
				return fileSystem != null;
			case MancoosiPackage.CONFIGURATION__ENVIRONMENT:
				return environment != null;
			case MancoosiPackage.CONFIGURATION__INSTALLED_PACKAGES:
				return installedPackages != null && !installedPackages.isEmpty();
			case MancoosiPackage.CONFIGURATION__NOT_INSTALLED_PACKAGES:
				return notInstalledPackages != null && !notInstalledPackages.isEmpty();
			case MancoosiPackage.CONFIGURATION__CONFIG_FILES_PACKAGES:
				return configFilesPackages != null && !configFilesPackages.isEmpty();
			case MancoosiPackage.CONFIGURATION__UNPACKED_PACKAGES:
				return unpackedPackages != null && !unpackedPackages.isEmpty();
			case MancoosiPackage.CONFIGURATION__HALF_CONFIGURED_PACKAGES:
				return halfConfiguredPackages != null && !halfConfiguredPackages.isEmpty();
			case MancoosiPackage.CONFIGURATION__HALF_INSTALLED_PACKAGES:
				return halfInstalledPackages != null && !halfInstalledPackages.isEmpty();
			case MancoosiPackage.CONFIGURATION__HALF_CONFIGURED_REINST_REQUIRED_PACKAGES:
				return halfConfiguredReinstRequiredPackages != null && !halfConfiguredReinstRequiredPackages.isEmpty();
			case MancoosiPackage.CONFIGURATION__HALF_INSTALLED_REINST_REQUIRED_PACKAGES:
				return halfInstalledReinstRequiredPackages != null && !halfInstalledReinstRequiredPackages.isEmpty();
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
		result.append(" (creationTime: ");
		result.append(creationTime);
		result.append(", systemType: ");
		result.append(systemType);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
