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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bin Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.BinPackageImpl#getSrcRef <em>Src Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinPackageImpl extends InstalledPackageImpl implements BinPackage {
	/**
	 * The cached value of the '{@link #getSrcRef() <em>Src Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcRef()
	 * @generated
	 * @ordered
	 */
	protected SrcPackage srcRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.BIN_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcPackage getSrcRef() {
		if (srcRef != null && srcRef.eIsProxy()) {
			InternalEObject oldSrcRef = (InternalEObject)srcRef;
			srcRef = (SrcPackage)eResolveProxy(oldSrcRef);
			if (srcRef != oldSrcRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.BIN_PACKAGE__SRC_REF, oldSrcRef, srcRef));
			}
		}
		return srcRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcPackage basicGetSrcRef() {
		return srcRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcRef(SrcPackage newSrcRef) {
		SrcPackage oldSrcRef = srcRef;
		srcRef = newSrcRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.BIN_PACKAGE__SRC_REF, oldSrcRef, srcRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.BIN_PACKAGE__SRC_REF:
				if (resolve) return getSrcRef();
				return basicGetSrcRef();
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
			case MancoosiPackage.BIN_PACKAGE__SRC_REF:
				setSrcRef((SrcPackage)newValue);
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
			case MancoosiPackage.BIN_PACKAGE__SRC_REF:
				setSrcRef((SrcPackage)null);
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
			case MancoosiPackage.BIN_PACKAGE__SRC_REF:
				return srcRef != null;
		}
		return super.eIsSet(featureID);
	}

} //BinPackageImpl
