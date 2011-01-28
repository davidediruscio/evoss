/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.DesktopDB;
import it.univaq.mancoosi.mancoosimm.Environment;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Desktop DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.DesktopDBImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.DesktopDBImpl#getApplications <em>Applications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesktopDBImpl extends EObjectImpl implements DesktopDB {
	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected File applications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesktopDBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.DESKTOP_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnv() {
		if (eContainerFeatureID() != MancoosiPackage.DESKTOP_DB__ENV) return null;
		return (Environment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnv(Environment newEnv, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnv, MancoosiPackage.DESKTOP_DB__ENV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnv(Environment newEnv) {
		if (newEnv != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.DESKTOP_DB__ENV && newEnv != null)) {
			if (EcoreUtil.isAncestor(this, newEnv))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnv != null)
				msgs = ((InternalEObject)newEnv).eInverseAdd(this, MancoosiPackage.ENVIRONMENT__DESKTOP_DB, Environment.class, msgs);
			msgs = basicSetEnv(newEnv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.DESKTOP_DB__ENV, newEnv, newEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getApplications() {
		if (applications != null && applications.eIsProxy()) {
			InternalEObject oldApplications = (InternalEObject)applications;
			applications = (File)eResolveProxy(oldApplications);
			if (applications != oldApplications) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.DESKTOP_DB__APPLICATIONS, oldApplications, applications));
			}
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetApplications() {
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplications(File newApplications) {
		File oldApplications = applications;
		applications = newApplications;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.DESKTOP_DB__APPLICATIONS, oldApplications, applications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.DESKTOP_DB__ENV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnv((Environment)otherEnd, msgs);
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
			case MancoosiPackage.DESKTOP_DB__ENV:
				return basicSetEnv(null, msgs);
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
			case MancoosiPackage.DESKTOP_DB__ENV:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.ENVIRONMENT__DESKTOP_DB, Environment.class, msgs);
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
			case MancoosiPackage.DESKTOP_DB__ENV:
				return getEnv();
			case MancoosiPackage.DESKTOP_DB__APPLICATIONS:
				if (resolve) return getApplications();
				return basicGetApplications();
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
			case MancoosiPackage.DESKTOP_DB__ENV:
				setEnv((Environment)newValue);
				return;
			case MancoosiPackage.DESKTOP_DB__APPLICATIONS:
				setApplications((File)newValue);
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
			case MancoosiPackage.DESKTOP_DB__ENV:
				setEnv((Environment)null);
				return;
			case MancoosiPackage.DESKTOP_DB__APPLICATIONS:
				setApplications((File)null);
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
			case MancoosiPackage.DESKTOP_DB__ENV:
				return getEnv() != null;
			case MancoosiPackage.DESKTOP_DB__APPLICATIONS:
				return applications != null;
		}
		return super.eIsSet(featureID);
	}

} //DesktopDBImpl
