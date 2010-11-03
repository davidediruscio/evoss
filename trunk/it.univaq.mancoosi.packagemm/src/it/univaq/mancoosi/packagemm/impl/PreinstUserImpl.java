/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.PreinstUser;
import it.univaq.mancoosi.packagemm.StringParam;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preinst User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PreinstUserImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PreinstUserImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PreinstUserImpl#getUser <em>User</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PreinstUserImpl#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreinstUserImpl extends UpdateFileSystemStatementImpl implements PreinstUser {
	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected StringParam dir;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected StringParam mode;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected StringParam user;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected StringParam group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreinstUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getPreinstUser();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDir(StringParam newDir, NotificationChain msgs) {
		StringParam oldDir = dir;
		dir = newDir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.PREINST_USER__DIR, oldDir, newDir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDir(StringParam newDir) {
		if (newDir != dir) {
			NotificationChain msgs = null;
			if (dir != null)
				msgs = ((InternalEObject)dir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PREINST_USER__DIR, null, msgs);
			if (newDir != null)
				msgs = ((InternalEObject)newDir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PREINST_USER__DIR, null, msgs);
			msgs = basicSetDir(newDir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PREINST_USER__DIR, newDir, newDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(StringParam newMode, NotificationChain msgs) {
		StringParam oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.PREINST_USER__MODE, oldMode, newMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(StringParam newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PREINST_USER__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PREINST_USER__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PREINST_USER__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(StringParam newUser, NotificationChain msgs) {
		StringParam oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.PREINST_USER__USER, oldUser, newUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(StringParam newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject)user).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PREINST_USER__USER, null, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PREINST_USER__USER, null, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PREINST_USER__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(StringParam newGroup, NotificationChain msgs) {
		StringParam oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.PREINST_USER__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(StringParam newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PREINST_USER__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.PREINST_USER__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.PREINST_USER__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.PREINST_USER__DIR:
				return basicSetDir(null, msgs);
			case PackagemmPackage.PREINST_USER__MODE:
				return basicSetMode(null, msgs);
			case PackagemmPackage.PREINST_USER__USER:
				return basicSetUser(null, msgs);
			case PackagemmPackage.PREINST_USER__GROUP:
				return basicSetGroup(null, msgs);
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
			case PackagemmPackage.PREINST_USER__DIR:
				return getDir();
			case PackagemmPackage.PREINST_USER__MODE:
				return getMode();
			case PackagemmPackage.PREINST_USER__USER:
				return getUser();
			case PackagemmPackage.PREINST_USER__GROUP:
				return getGroup();
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
			case PackagemmPackage.PREINST_USER__DIR:
				setDir((StringParam)newValue);
				return;
			case PackagemmPackage.PREINST_USER__MODE:
				setMode((StringParam)newValue);
				return;
			case PackagemmPackage.PREINST_USER__USER:
				setUser((StringParam)newValue);
				return;
			case PackagemmPackage.PREINST_USER__GROUP:
				setGroup((StringParam)newValue);
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
			case PackagemmPackage.PREINST_USER__DIR:
				setDir((StringParam)null);
				return;
			case PackagemmPackage.PREINST_USER__MODE:
				setMode((StringParam)null);
				return;
			case PackagemmPackage.PREINST_USER__USER:
				setUser((StringParam)null);
				return;
			case PackagemmPackage.PREINST_USER__GROUP:
				setGroup((StringParam)null);
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
			case PackagemmPackage.PREINST_USER__DIR:
				return dir != null;
			case PackagemmPackage.PREINST_USER__MODE:
				return mode != null;
			case PackagemmPackage.PREINST_USER__USER:
				return user != null;
			case PackagemmPackage.PREINST_USER__GROUP:
				return group != null;
		}
		return super.eIsSet(featureID);
	}

} //PreinstUserImpl
