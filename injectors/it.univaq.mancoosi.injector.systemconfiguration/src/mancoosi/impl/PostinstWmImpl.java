/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import mancoosi.MancoosiPackage;
import mancoosi.PostinstWm;
import mancoosi.StringParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postinst Wm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PostinstWmImpl#getWm <em>Wm</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstWmImpl#getWmman <em>Wmman</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstWmImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostinstWmImpl extends UpdateEnvironmentStatementImpl implements PostinstWm {
	/**
	 * The cached value of the '{@link #getWm() <em>Wm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWm()
	 * @generated
	 * @ordered
	 */
	protected StringParam wm;

	/**
	 * The cached value of the '{@link #getWmman() <em>Wmman</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWmman()
	 * @generated
	 * @ordered
	 */
	protected StringParam wmman;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected StringParam priority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostinstWmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPostinstWm();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getWm() {
		if (wm != null && wm.eIsProxy()) {
			InternalEObject oldWm = (InternalEObject)wm;
			wm = (StringParam)eResolveProxy(oldWm);
			if (wm != oldWm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_WM__WM, oldWm, wm));
			}
		}
		return wm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam basicGetWm() {
		return wm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWm(StringParam newWm) {
		StringParam oldWm = wm;
		wm = newWm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_WM__WM, oldWm, wm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getWmman() {
		if (wmman != null && wmman.eIsProxy()) {
			InternalEObject oldWmman = (InternalEObject)wmman;
			wmman = (StringParam)eResolveProxy(oldWmman);
			if (wmman != oldWmman) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_WM__WMMAN, oldWmman, wmman));
			}
		}
		return wmman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam basicGetWmman() {
		return wmman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWmman(StringParam newWmman) {
		StringParam oldWmman = wmman;
		wmman = newWmman;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_WM__WMMAN, oldWmman, wmman));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getPriority() {
		if (priority != null && priority.eIsProxy()) {
			InternalEObject oldPriority = (InternalEObject)priority;
			priority = (StringParam)eResolveProxy(oldPriority);
			if (priority != oldPriority) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_WM__PRIORITY, oldPriority, priority));
			}
		}
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam basicGetPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(StringParam newPriority) {
		StringParam oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_WM__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.POSTINST_WM__WM:
				if (resolve) return getWm();
				return basicGetWm();
			case MancoosiPackage.POSTINST_WM__WMMAN:
				if (resolve) return getWmman();
				return basicGetWmman();
			case MancoosiPackage.POSTINST_WM__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
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
			case MancoosiPackage.POSTINST_WM__WM:
				setWm((StringParam)newValue);
				return;
			case MancoosiPackage.POSTINST_WM__WMMAN:
				setWmman((StringParam)newValue);
				return;
			case MancoosiPackage.POSTINST_WM__PRIORITY:
				setPriority((StringParam)newValue);
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
			case MancoosiPackage.POSTINST_WM__WM:
				setWm((StringParam)null);
				return;
			case MancoosiPackage.POSTINST_WM__WMMAN:
				setWmman((StringParam)null);
				return;
			case MancoosiPackage.POSTINST_WM__PRIORITY:
				setPriority((StringParam)null);
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
			case MancoosiPackage.POSTINST_WM__WM:
				return wm != null;
			case MancoosiPackage.POSTINST_WM__WMMAN:
				return wmman != null;
			case MancoosiPackage.POSTINST_WM__PRIORITY:
				return priority != null;
		}
		return super.eIsSet(featureID);
	}

} //PostinstWmImpl
