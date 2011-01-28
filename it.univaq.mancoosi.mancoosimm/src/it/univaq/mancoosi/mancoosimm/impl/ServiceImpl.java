/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.Environment;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ServiceImpl#getExecutable <em>Executable</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.ServiceImpl#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends NamedElementImpl implements Service {
	/**
	 * The cached value of the '{@link #getExecutable() <em>Executable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutable()
	 * @generated
	 * @ordered
	 */
	protected File executable;

	/**
	 * The cached value of the '{@link #getEnv() <em>Env</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv()
	 * @generated
	 * @ordered
	 */
	protected Environment env;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getExecutable() {
		if (executable != null && executable.eIsProxy()) {
			InternalEObject oldExecutable = (InternalEObject)executable;
			executable = (File)eResolveProxy(oldExecutable);
			if (executable != oldExecutable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.SERVICE__EXECUTABLE, oldExecutable, executable));
			}
		}
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetExecutable() {
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutable(File newExecutable) {
		File oldExecutable = executable;
		executable = newExecutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.SERVICE__EXECUTABLE, oldExecutable, executable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnv() {
		if (env != null && env.eIsProxy()) {
			InternalEObject oldEnv = (InternalEObject)env;
			env = (Environment)eResolveProxy(oldEnv);
			if (env != oldEnv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.SERVICE__ENV, oldEnv, env));
			}
		}
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment basicGetEnv() {
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnv(Environment newEnv, NotificationChain msgs) {
		Environment oldEnv = env;
		env = newEnv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.SERVICE__ENV, oldEnv, newEnv);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnv(Environment newEnv) {
		if (newEnv != env) {
			NotificationChain msgs = null;
			if (env != null)
				msgs = ((InternalEObject)env).eInverseRemove(this, MancoosiPackage.ENVIRONMENT__RUNNING_SERVICES, Environment.class, msgs);
			if (newEnv != null)
				msgs = ((InternalEObject)newEnv).eInverseAdd(this, MancoosiPackage.ENVIRONMENT__RUNNING_SERVICES, Environment.class, msgs);
			msgs = basicSetEnv(newEnv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.SERVICE__ENV, newEnv, newEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.SERVICE__ENV:
				if (env != null)
					msgs = ((InternalEObject)env).eInverseRemove(this, MancoosiPackage.ENVIRONMENT__RUNNING_SERVICES, Environment.class, msgs);
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
			case MancoosiPackage.SERVICE__ENV:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.SERVICE__EXECUTABLE:
				if (resolve) return getExecutable();
				return basicGetExecutable();
			case MancoosiPackage.SERVICE__ENV:
				if (resolve) return getEnv();
				return basicGetEnv();
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
			case MancoosiPackage.SERVICE__EXECUTABLE:
				setExecutable((File)newValue);
				return;
			case MancoosiPackage.SERVICE__ENV:
				setEnv((Environment)newValue);
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
			case MancoosiPackage.SERVICE__EXECUTABLE:
				setExecutable((File)null);
				return;
			case MancoosiPackage.SERVICE__ENV:
				setEnv((Environment)null);
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
			case MancoosiPackage.SERVICE__EXECUTABLE:
				return executable != null;
			case MancoosiPackage.SERVICE__ENV:
				return env != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
