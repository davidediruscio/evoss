/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import mancoosi.MancoosiPackage;
import mancoosi.PostinstModules;
import mancoosi.StringParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postinst Modules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PostinstModulesImpl#getKvers <em>Kvers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostinstModulesImpl extends UpdateEnvironmentStatementImpl implements PostinstModules {
	/**
	 * The cached value of the '{@link #getKvers() <em>Kvers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKvers()
	 * @generated
	 * @ordered
	 */
	protected StringParam kvers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostinstModulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPostinstModules();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getKvers() {
		if (kvers != null && kvers.eIsProxy()) {
			InternalEObject oldKvers = (InternalEObject)kvers;
			kvers = (StringParam)eResolveProxy(oldKvers);
			if (kvers != oldKvers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_MODULES__KVERS, oldKvers, kvers));
			}
		}
		return kvers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam basicGetKvers() {
		return kvers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKvers(StringParam newKvers) {
		StringParam oldKvers = kvers;
		kvers = newKvers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_MODULES__KVERS, oldKvers, kvers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.POSTINST_MODULES__KVERS:
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
			case MancoosiPackage.POSTINST_MODULES__KVERS:
				setKvers((StringParam)newValue);
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
			case MancoosiPackage.POSTINST_MODULES__KVERS:
				setKvers((StringParam)null);
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
			case MancoosiPackage.POSTINST_MODULES__KVERS:
				return kvers != null;
		}
		return super.eIsSet(featureID);
	}

} //PostinstModulesImpl
