/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import mancoosi.IntParam;
import mancoosi.MancoosiPackage;
import mancoosi.PostrmModules;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postrm Modules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PostrmModulesImpl#getKvers <em>Kvers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostrmModulesImpl extends UpdateEnvironmentStatementImpl implements PostrmModules {
	/**
	 * The cached value of the '{@link #getKvers() <em>Kvers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKvers()
	 * @generated
	 * @ordered
	 */
	protected IntParam kvers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostrmModulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPostrmModules();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntParam getKvers() {
		if (kvers != null && kvers.eIsProxy()) {
			InternalEObject oldKvers = (InternalEObject)kvers;
			kvers = (IntParam)eResolveProxy(oldKvers);
			if (kvers != oldKvers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTRM_MODULES__KVERS, oldKvers, kvers));
			}
		}
		return kvers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntParam basicGetKvers() {
		return kvers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKvers(IntParam newKvers) {
		IntParam oldKvers = kvers;
		kvers = newKvers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTRM_MODULES__KVERS, oldKvers, kvers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.POSTRM_MODULES__KVERS:
				if (resolve) return getKvers();
				return basicGetKvers();
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
			case MancoosiPackage.POSTRM_MODULES__KVERS:
				setKvers((IntParam)newValue);
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
			case MancoosiPackage.POSTRM_MODULES__KVERS:
				setKvers((IntParam)null);
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
			case MancoosiPackage.POSTRM_MODULES__KVERS:
				return kvers != null;
		}
		return super.eIsSet(featureID);
	}

} //PostrmModulesImpl
