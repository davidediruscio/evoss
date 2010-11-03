/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.PostinstWm;
import it.univaq.mancoosi.packagemm.StringParam;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PostinstWmImpl#getWm <em>Wm</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PostinstWmImpl#getWmman <em>Wmman</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PostinstWmImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostinstWmImpl extends UpdateEnvironmentStatementImpl implements PostinstWm {
	/**
	 * The cached value of the '{@link #getWm() <em>Wm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWm()
	 * @generated
	 * @ordered
	 */
	protected StringParam wm;

	/**
	 * The cached value of the '{@link #getWmman() <em>Wmman</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWmman()
	 * @generated
	 * @ordered
	 */
	protected StringParam wmman;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
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
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getPostinstWm();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getWm() {
		return wm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWm(StringParam newWm, NotificationChain msgs) {
		StringParam oldWm = wm;
		wm = newWm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_WM__WM, oldWm, newWm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWm(StringParam newWm) {
		if (newWm != wm) {
			NotificationChain msgs = null;
			if (wm != null)
				msgs = ((InternalEObject)wm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_WM__WM, null, msgs);
			if (newWm != null)
				msgs = ((InternalEObject)newWm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_WM__WM, null, msgs);
			msgs = basicSetWm(newWm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_WM__WM, newWm, newWm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getWmman() {
		return wmman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWmman(StringParam newWmman, NotificationChain msgs) {
		StringParam oldWmman = wmman;
		wmman = newWmman;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_WM__WMMAN, oldWmman, newWmman);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWmman(StringParam newWmman) {
		if (newWmman != wmman) {
			NotificationChain msgs = null;
			if (wmman != null)
				msgs = ((InternalEObject)wmman).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_WM__WMMAN, null, msgs);
			if (newWmman != null)
				msgs = ((InternalEObject)newWmman).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_WM__WMMAN, null, msgs);
			msgs = basicSetWmman(newWmman, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_WM__WMMAN, newWmman, newWmman));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(StringParam newPriority, NotificationChain msgs) {
		StringParam oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_WM__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(StringParam newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_WM__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_WM__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_WM__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.POSTINST_WM__WM:
				return basicSetWm(null, msgs);
			case PackagemmPackage.POSTINST_WM__WMMAN:
				return basicSetWmman(null, msgs);
			case PackagemmPackage.POSTINST_WM__PRIORITY:
				return basicSetPriority(null, msgs);
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
			case PackagemmPackage.POSTINST_WM__WM:
				return getWm();
			case PackagemmPackage.POSTINST_WM__WMMAN:
				return getWmman();
			case PackagemmPackage.POSTINST_WM__PRIORITY:
				return getPriority();
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
			case PackagemmPackage.POSTINST_WM__WM:
				setWm((StringParam)newValue);
				return;
			case PackagemmPackage.POSTINST_WM__WMMAN:
				setWmman((StringParam)newValue);
				return;
			case PackagemmPackage.POSTINST_WM__PRIORITY:
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PackagemmPackage.POSTINST_WM__WM:
				setWm((StringParam)null);
				return;
			case PackagemmPackage.POSTINST_WM__WMMAN:
				setWmman((StringParam)null);
				return;
			case PackagemmPackage.POSTINST_WM__PRIORITY:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PackagemmPackage.POSTINST_WM__WM:
				return wm != null;
			case PackagemmPackage.POSTINST_WM__WMMAN:
				return wmman != null;
			case PackagemmPackage.POSTINST_WM__PRIORITY:
				return priority != null;
		}
		return super.eIsSet(featureID);
	}

} //PostinstWmImpl
