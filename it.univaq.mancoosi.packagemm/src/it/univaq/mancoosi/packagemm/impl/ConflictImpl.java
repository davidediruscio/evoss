/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.AndConflict;
import it.univaq.mancoosi.packagemm.Conflict;
import it.univaq.mancoosi.packagemm.OrConflict;
import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.SingleConflict;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conflict</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.ConflictImpl#getAndConflict <em>And Conflict</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.ConflictImpl#getOrConflict <em>Or Conflict</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.ConflictImpl#getSingleConflict <em>Single Conflict</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.ConflictImpl#getPkg <em>Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConflictImpl extends EObjectImpl implements Conflict {
	/**
	 * The cached value of the '{@link #getAndConflict() <em>And Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndConflict()
	 * @generated
	 * @ordered
	 */
	protected AndConflict andConflict;

	/**
	 * The cached value of the '{@link #getOrConflict() <em>Or Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrConflict()
	 * @generated
	 * @ordered
	 */
	protected OrConflict orConflict;

	/**
	 * The cached value of the '{@link #getSingleConflict() <em>Single Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleConflict()
	 * @generated
	 * @ordered
	 */
	protected SingleConflict singleConflict;

	/**
	 * The default value of the '{@link #getPkg() <em>Pkg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkg()
	 * @generated
	 * @ordered
	 */
	protected static final String PKG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPkg() <em>Pkg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkg()
	 * @generated
	 * @ordered
	 */
	protected String pkg = PKG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getConflict();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndConflict getAndConflict() {
		return andConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAndConflict(AndConflict newAndConflict, NotificationChain msgs) {
		AndConflict oldAndConflict = andConflict;
		andConflict = newAndConflict;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.CONFLICT__AND_CONFLICT, oldAndConflict, newAndConflict);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAndConflict(AndConflict newAndConflict) {
		if (newAndConflict != andConflict) {
			NotificationChain msgs = null;
			if (andConflict != null)
				msgs = ((InternalEObject)andConflict).eInverseRemove(this, PackagemmPackage.AND_CONFLICT__CONFLICT, AndConflict.class, msgs);
			if (newAndConflict != null)
				msgs = ((InternalEObject)newAndConflict).eInverseAdd(this, PackagemmPackage.AND_CONFLICT__CONFLICT, AndConflict.class, msgs);
			msgs = basicSetAndConflict(newAndConflict, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.CONFLICT__AND_CONFLICT, newAndConflict, newAndConflict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrConflict getOrConflict() {
		return orConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrConflict(OrConflict newOrConflict, NotificationChain msgs) {
		OrConflict oldOrConflict = orConflict;
		orConflict = newOrConflict;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.CONFLICT__OR_CONFLICT, oldOrConflict, newOrConflict);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrConflict(OrConflict newOrConflict) {
		if (newOrConflict != orConflict) {
			NotificationChain msgs = null;
			if (orConflict != null)
				msgs = ((InternalEObject)orConflict).eInverseRemove(this, PackagemmPackage.OR_CONFLICT__CONFLICT, OrConflict.class, msgs);
			if (newOrConflict != null)
				msgs = ((InternalEObject)newOrConflict).eInverseAdd(this, PackagemmPackage.OR_CONFLICT__CONFLICT, OrConflict.class, msgs);
			msgs = basicSetOrConflict(newOrConflict, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.CONFLICT__OR_CONFLICT, newOrConflict, newOrConflict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleConflict getSingleConflict() {
		return singleConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleConflict(SingleConflict newSingleConflict, NotificationChain msgs) {
		SingleConflict oldSingleConflict = singleConflict;
		singleConflict = newSingleConflict;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.CONFLICT__SINGLE_CONFLICT, oldSingleConflict, newSingleConflict);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleConflict(SingleConflict newSingleConflict) {
		if (newSingleConflict != singleConflict) {
			NotificationChain msgs = null;
			if (singleConflict != null)
				msgs = ((InternalEObject)singleConflict).eInverseRemove(this, PackagemmPackage.SINGLE_CONFLICT__CONFLICT, SingleConflict.class, msgs);
			if (newSingleConflict != null)
				msgs = ((InternalEObject)newSingleConflict).eInverseAdd(this, PackagemmPackage.SINGLE_CONFLICT__CONFLICT, SingleConflict.class, msgs);
			msgs = basicSetSingleConflict(newSingleConflict, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.CONFLICT__SINGLE_CONFLICT, newSingleConflict, newSingleConflict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPkg() {
		return pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkg(String newPkg) {
		String oldPkg = pkg;
		pkg = newPkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.CONFLICT__PKG, oldPkg, pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.CONFLICT__AND_CONFLICT:
				if (andConflict != null)
					msgs = ((InternalEObject)andConflict).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.CONFLICT__AND_CONFLICT, null, msgs);
				return basicSetAndConflict((AndConflict)otherEnd, msgs);
			case PackagemmPackage.CONFLICT__OR_CONFLICT:
				if (orConflict != null)
					msgs = ((InternalEObject)orConflict).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.CONFLICT__OR_CONFLICT, null, msgs);
				return basicSetOrConflict((OrConflict)otherEnd, msgs);
			case PackagemmPackage.CONFLICT__SINGLE_CONFLICT:
				if (singleConflict != null)
					msgs = ((InternalEObject)singleConflict).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.CONFLICT__SINGLE_CONFLICT, null, msgs);
				return basicSetSingleConflict((SingleConflict)otherEnd, msgs);
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
			case PackagemmPackage.CONFLICT__AND_CONFLICT:
				return basicSetAndConflict(null, msgs);
			case PackagemmPackage.CONFLICT__OR_CONFLICT:
				return basicSetOrConflict(null, msgs);
			case PackagemmPackage.CONFLICT__SINGLE_CONFLICT:
				return basicSetSingleConflict(null, msgs);
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
			case PackagemmPackage.CONFLICT__AND_CONFLICT:
				return getAndConflict();
			case PackagemmPackage.CONFLICT__OR_CONFLICT:
				return getOrConflict();
			case PackagemmPackage.CONFLICT__SINGLE_CONFLICT:
				return getSingleConflict();
			case PackagemmPackage.CONFLICT__PKG:
				return getPkg();
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
			case PackagemmPackage.CONFLICT__AND_CONFLICT:
				setAndConflict((AndConflict)newValue);
				return;
			case PackagemmPackage.CONFLICT__OR_CONFLICT:
				setOrConflict((OrConflict)newValue);
				return;
			case PackagemmPackage.CONFLICT__SINGLE_CONFLICT:
				setSingleConflict((SingleConflict)newValue);
				return;
			case PackagemmPackage.CONFLICT__PKG:
				setPkg((String)newValue);
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
			case PackagemmPackage.CONFLICT__AND_CONFLICT:
				setAndConflict((AndConflict)null);
				return;
			case PackagemmPackage.CONFLICT__OR_CONFLICT:
				setOrConflict((OrConflict)null);
				return;
			case PackagemmPackage.CONFLICT__SINGLE_CONFLICT:
				setSingleConflict((SingleConflict)null);
				return;
			case PackagemmPackage.CONFLICT__PKG:
				setPkg(PKG_EDEFAULT);
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
			case PackagemmPackage.CONFLICT__AND_CONFLICT:
				return andConflict != null;
			case PackagemmPackage.CONFLICT__OR_CONFLICT:
				return orConflict != null;
			case PackagemmPackage.CONFLICT__SINGLE_CONFLICT:
				return singleConflict != null;
			case PackagemmPackage.CONFLICT__PKG:
				return PKG_EDEFAULT == null ? pkg != null : !PKG_EDEFAULT.equals(pkg);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pkg: ");
		result.append(pkg);
		result.append(')');
		return result.toString();
	}

} //ConflictImpl
