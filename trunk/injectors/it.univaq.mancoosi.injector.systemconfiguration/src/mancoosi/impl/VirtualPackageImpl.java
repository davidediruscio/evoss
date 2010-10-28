/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.InstalledPackage;
import mancoosi.MancoosiPackage;
import mancoosi.VirtualPackage;

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
 *   <li>{@link mancoosi.impl.VirtualPackageImpl#getImpPackage <em>Imp Package</em>}</li>
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
	protected EList impPackage;

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
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getVirtualPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImpPackage() {
		if (impPackage == null) {
			impPackage = new EObjectResolvingEList(InstalledPackage.class, this, MancoosiPackage.VIRTUAL_PACKAGE__IMP_PACKAGE);
		}
		return impPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.VIRTUAL_PACKAGE__IMP_PACKAGE:
				getImpPackage().clear();
				getImpPackage().addAll((Collection)newValue);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MancoosiPackage.VIRTUAL_PACKAGE__IMP_PACKAGE:
				return impPackage != null && !impPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VirtualPackageImpl
