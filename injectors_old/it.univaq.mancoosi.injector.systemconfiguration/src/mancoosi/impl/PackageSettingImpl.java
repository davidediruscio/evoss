/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.Configuration;
import mancoosi.File;
import mancoosi.InstalledPackage;
import mancoosi.MancoosiPackage;
import mancoosi.PackageSetting;
import mancoosi.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PackageSettingImpl#getServices <em>Services</em>}</li>
 *   <li>{@link mancoosi.impl.PackageSettingImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link mancoosi.impl.PackageSettingImpl#getPkg <em>Pkg</em>}</li>
 *   <li>{@link mancoosi.impl.PackageSettingImpl#getDependences <em>Dependences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageSettingImpl extends NamedElementImpl implements PackageSetting {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList services;

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
	 * The cached value of the '{@link #getDependences() <em>Dependences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependences()
	 * @generated
	 * @ordered
	 */
	protected EList dependences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPackageSetting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServices() {
		if (services == null) {
			services = new EObjectResolvingEList(Service.class, this, MancoosiPackage.PACKAGE_SETTING__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFiles() {
		if (files == null) {
			files = new EObjectWithInverseResolvingEList.ManyInverse(File.class, this, MancoosiPackage.PACKAGE_SETTING__FILES, MancoosiPackage.FILE__PKG_SETTINGS);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mancoosi.Package getPkg() {
		if (eContainerFeatureID() != MancoosiPackage.PACKAGE_SETTING__PKG) return null;
		return (mancoosi.Package)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPkg(mancoosi.Package newPkg, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPkg, MancoosiPackage.PACKAGE_SETTING__PKG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkg(mancoosi.Package newPkg) {
		if (newPkg != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.PACKAGE_SETTING__PKG && newPkg != null)) {
			if (EcoreUtil.isAncestor(this, newPkg))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPkg != null)
				msgs = ((InternalEObject)newPkg).eInverseAdd(this, MancoosiPackage.PACKAGE__PACKAGE_SETTINGS, mancoosi.Package.class, msgs);
			msgs = basicSetPkg(newPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.PACKAGE_SETTING__PKG, newPkg, newPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDependences() {
		if (dependences == null) {
			dependences = new EObjectResolvingEList(PackageSetting.class, this, MancoosiPackage.PACKAGE_SETTING__DEPENDENCES);
		}
		return dependences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.PACKAGE_SETTING__FILES:
				return ((InternalEList)getFiles()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.PACKAGE_SETTING__PKG:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPkg((mancoosi.Package)otherEnd, msgs);
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
			case MancoosiPackage.PACKAGE_SETTING__FILES:
				return ((InternalEList)getFiles()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.PACKAGE_SETTING__PKG:
				return basicSetPkg(null, msgs);
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
			case MancoosiPackage.PACKAGE_SETTING__PKG:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.PACKAGE__PACKAGE_SETTINGS, mancoosi.Package.class, msgs);
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
			case MancoosiPackage.PACKAGE_SETTING__SERVICES:
				return getServices();
			case MancoosiPackage.PACKAGE_SETTING__FILES:
				return getFiles();
			case MancoosiPackage.PACKAGE_SETTING__PKG:
				return getPkg();
			case MancoosiPackage.PACKAGE_SETTING__DEPENDENCES:
				return getDependences();
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
			case MancoosiPackage.PACKAGE_SETTING__SERVICES:
				getServices().clear();
				getServices().addAll((Collection)newValue);
				return;
			case MancoosiPackage.PACKAGE_SETTING__FILES:
				getFiles().clear();
				getFiles().addAll((Collection)newValue);
				return;
			case MancoosiPackage.PACKAGE_SETTING__PKG:
				setPkg((mancoosi.Package)newValue);
				return;
			case MancoosiPackage.PACKAGE_SETTING__DEPENDENCES:
				getDependences().clear();
				getDependences().addAll((Collection)newValue);
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
			case MancoosiPackage.PACKAGE_SETTING__SERVICES:
				getServices().clear();
				return;
			case MancoosiPackage.PACKAGE_SETTING__FILES:
				getFiles().clear();
				return;
			case MancoosiPackage.PACKAGE_SETTING__PKG:
				setPkg((mancoosi.Package)null);
				return;
			case MancoosiPackage.PACKAGE_SETTING__DEPENDENCES:
				getDependences().clear();
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
			case MancoosiPackage.PACKAGE_SETTING__SERVICES:
				return services != null && !services.isEmpty();
			case MancoosiPackage.PACKAGE_SETTING__FILES:
				return files != null && !files.isEmpty();
			case MancoosiPackage.PACKAGE_SETTING__PKG:
				return getPkg() != null;
			case MancoosiPackage.PACKAGE_SETTING__DEPENDENCES:
				return dependences != null && !dependences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageSettingImpl
