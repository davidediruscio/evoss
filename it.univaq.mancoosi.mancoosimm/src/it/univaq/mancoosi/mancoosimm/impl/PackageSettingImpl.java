/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.PackageSetting;
import it.univaq.mancoosi.mancoosimm.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.PackageSettingImpl#getServices <em>Services</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.PackageSettingImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.PackageSettingImpl#getPkg <em>Pkg</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.PackageSettingImpl#getDependences <em>Dependences</em>}</li>
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
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The cached value of the '{@link #getDependences() <em>Dependences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependences()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageSetting> dependences;

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
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.PACKAGE_SETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<Service>(Service.class, this, MancoosiPackage.PACKAGE_SETTING__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectWithInverseResolvingEList.ManyInverse<File>(File.class, this, MancoosiPackage.PACKAGE_SETTING__FILES, MancoosiPackage.FILE__PKG_SETTINGS);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.mancoosi.mancoosimm.Package getPkg() {
		if (eContainerFeatureID() != MancoosiPackage.PACKAGE_SETTING__PKG) return null;
		return (it.univaq.mancoosi.mancoosimm.Package)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPkg(it.univaq.mancoosi.mancoosimm.Package newPkg, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPkg, MancoosiPackage.PACKAGE_SETTING__PKG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkg(it.univaq.mancoosi.mancoosimm.Package newPkg) {
		if (newPkg != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.PACKAGE_SETTING__PKG && newPkg != null)) {
			if (EcoreUtil.isAncestor(this, newPkg))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPkg != null)
				msgs = ((InternalEObject)newPkg).eInverseAdd(this, MancoosiPackage.PACKAGE__PACKAGE_SETTINGS, it.univaq.mancoosi.mancoosimm.Package.class, msgs);
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
	public EList<PackageSetting> getDependences() {
		if (dependences == null) {
			dependences = new EObjectResolvingEList<PackageSetting>(PackageSetting.class, this, MancoosiPackage.PACKAGE_SETTING__DEPENDENCES);
		}
		return dependences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.PACKAGE_SETTING__FILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFiles()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.PACKAGE_SETTING__PKG:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPkg((it.univaq.mancoosi.mancoosimm.Package)otherEnd, msgs);
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
			case MancoosiPackage.PACKAGE_SETTING__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
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
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MancoosiPackage.PACKAGE_SETTING__PKG:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.PACKAGE__PACKAGE_SETTINGS, it.univaq.mancoosi.mancoosimm.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.PACKAGE_SETTING__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case MancoosiPackage.PACKAGE_SETTING__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
			case MancoosiPackage.PACKAGE_SETTING__PKG:
				setPkg((it.univaq.mancoosi.mancoosimm.Package)newValue);
				return;
			case MancoosiPackage.PACKAGE_SETTING__DEPENDENCES:
				getDependences().clear();
				getDependences().addAll((Collection<? extends PackageSetting>)newValue);
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
			case MancoosiPackage.PACKAGE_SETTING__SERVICES:
				getServices().clear();
				return;
			case MancoosiPackage.PACKAGE_SETTING__FILES:
				getFiles().clear();
				return;
			case MancoosiPackage.PACKAGE_SETTING__PKG:
				setPkg((it.univaq.mancoosi.mancoosimm.Package)null);
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
	@Override
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
