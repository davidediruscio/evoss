/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.InstalledPackage;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.VirtualPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.VirtualPackageImpl#getImpPackage <em>Imp Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualPackageImpl extends InstalledPackageImpl implements VirtualPackage {
	/**
	 * The cached value of the '{@link #getImpPackage() <em>Imp Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<InstalledPackage> impPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.VIRTUAL_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstalledPackage> getImpPackage() {
		if (impPackage == null) {
			impPackage = new EObjectResolvingEList<InstalledPackage>(InstalledPackage.class, this, MancoosiPackage.VIRTUAL_PACKAGE__IMP_PACKAGE);
		}
		return impPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.VIRTUAL_PACKAGE__IMP_PACKAGE:
				return getImpPackage();
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
			case MancoosiPackage.VIRTUAL_PACKAGE__IMP_PACKAGE:
				getImpPackage().clear();
				getImpPackage().addAll((Collection<? extends InstalledPackage>)newValue);
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
			case MancoosiPackage.VIRTUAL_PACKAGE__IMP_PACKAGE:
				getImpPackage().clear();
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
			case MancoosiPackage.VIRTUAL_PACKAGE__IMP_PACKAGE:
				return impPackage != null && !impPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VirtualPackageImpl
