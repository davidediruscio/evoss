/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.BinPackage;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.SrcPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.SrcPackageImpl#getBuildDepends <em>Build Depends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.SrcPackageImpl#getBuildConflicts <em>Build Conflicts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SrcPackageImpl extends InstalledPackageImpl implements SrcPackage {
	/**
	 * The cached value of the '{@link #getBuildDepends() <em>Build Depends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildDepends()
	 * @generated
	 * @ordered
	 */
	protected EList<BinPackage> buildDepends;

	/**
	 * The cached value of the '{@link #getBuildConflicts() <em>Build Conflicts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildConflicts()
	 * @generated
	 * @ordered
	 */
	protected EList<BinPackage> buildConflicts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.SRC_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinPackage> getBuildDepends() {
		if (buildDepends == null) {
			buildDepends = new EObjectResolvingEList<BinPackage>(BinPackage.class, this, MancoosiPackage.SRC_PACKAGE__BUILD_DEPENDS);
		}
		return buildDepends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinPackage> getBuildConflicts() {
		if (buildConflicts == null) {
			buildConflicts = new EObjectResolvingEList<BinPackage>(BinPackage.class, this, MancoosiPackage.SRC_PACKAGE__BUILD_CONFLICTS);
		}
		return buildConflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.SRC_PACKAGE__BUILD_DEPENDS:
				return getBuildDepends();
			case MancoosiPackage.SRC_PACKAGE__BUILD_CONFLICTS:
				return getBuildConflicts();
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
			case MancoosiPackage.SRC_PACKAGE__BUILD_DEPENDS:
				getBuildDepends().clear();
				getBuildDepends().addAll((Collection<? extends BinPackage>)newValue);
				return;
			case MancoosiPackage.SRC_PACKAGE__BUILD_CONFLICTS:
				getBuildConflicts().clear();
				getBuildConflicts().addAll((Collection<? extends BinPackage>)newValue);
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
			case MancoosiPackage.SRC_PACKAGE__BUILD_DEPENDS:
				getBuildDepends().clear();
				return;
			case MancoosiPackage.SRC_PACKAGE__BUILD_CONFLICTS:
				getBuildConflicts().clear();
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
			case MancoosiPackage.SRC_PACKAGE__BUILD_DEPENDS:
				return buildDepends != null && !buildDepends.isEmpty();
			case MancoosiPackage.SRC_PACKAGE__BUILD_CONFLICTS:
				return buildConflicts != null && !buildConflicts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SrcPackageImpl