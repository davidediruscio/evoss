/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.AndDep;
import it.univaq.mancoosi.mancoosimm.Dependence;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.OrDep;
import it.univaq.mancoosi.mancoosimm.SingleDep;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.DependenceImpl#getAndDep <em>And Dep</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.DependenceImpl#getOrDep <em>Or Dep</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.DependenceImpl#getSingleDep <em>Single Dep</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.DependenceImpl#getPkg <em>Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DependenceImpl extends EObjectImpl implements Dependence {
	/**
	 * The cached value of the '{@link #getAndDep() <em>And Dep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndDep()
	 * @generated
	 * @ordered
	 */
	protected AndDep andDep;

	/**
	 * The cached value of the '{@link #getOrDep() <em>Or Dep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrDep()
	 * @generated
	 * @ordered
	 */
	protected OrDep orDep;

	/**
	 * The cached value of the '{@link #getSingleDep() <em>Single Dep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleDep()
	 * @generated
	 * @ordered
	 */
	protected SingleDep singleDep;

	/**
	 * The cached value of the '{@link #getPkg() <em>Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkg()
	 * @generated
	 * @ordered
	 */
	protected it.univaq.mancoosi.mancoosimm.Package pkg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.DEPENDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndDep getAndDep() {
		return andDep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAndDep(AndDep newAndDep, NotificationChain msgs) {
		AndDep oldAndDep = andDep;
		andDep = newAndDep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.DEPENDENCE__AND_DEP, oldAndDep, newAndDep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAndDep(AndDep newAndDep) {
		if (newAndDep != andDep) {
			NotificationChain msgs = null;
			if (andDep != null)
				msgs = ((InternalEObject)andDep).eInverseRemove(this, MancoosiPackage.AND_DEP__DEPENDENCE, AndDep.class, msgs);
			if (newAndDep != null)
				msgs = ((InternalEObject)newAndDep).eInverseAdd(this, MancoosiPackage.AND_DEP__DEPENDENCE, AndDep.class, msgs);
			msgs = basicSetAndDep(newAndDep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.DEPENDENCE__AND_DEP, newAndDep, newAndDep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrDep getOrDep() {
		return orDep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrDep(OrDep newOrDep, NotificationChain msgs) {
		OrDep oldOrDep = orDep;
		orDep = newOrDep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.DEPENDENCE__OR_DEP, oldOrDep, newOrDep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrDep(OrDep newOrDep) {
		if (newOrDep != orDep) {
			NotificationChain msgs = null;
			if (orDep != null)
				msgs = ((InternalEObject)orDep).eInverseRemove(this, MancoosiPackage.OR_DEP__DEPENDENCE, OrDep.class, msgs);
			if (newOrDep != null)
				msgs = ((InternalEObject)newOrDep).eInverseAdd(this, MancoosiPackage.OR_DEP__DEPENDENCE, OrDep.class, msgs);
			msgs = basicSetOrDep(newOrDep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.DEPENDENCE__OR_DEP, newOrDep, newOrDep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleDep getSingleDep() {
		return singleDep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleDep(SingleDep newSingleDep, NotificationChain msgs) {
		SingleDep oldSingleDep = singleDep;
		singleDep = newSingleDep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.DEPENDENCE__SINGLE_DEP, oldSingleDep, newSingleDep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleDep(SingleDep newSingleDep) {
		if (newSingleDep != singleDep) {
			NotificationChain msgs = null;
			if (singleDep != null)
				msgs = ((InternalEObject)singleDep).eInverseRemove(this, MancoosiPackage.SINGLE_DEP__DEPENDENCE, SingleDep.class, msgs);
			if (newSingleDep != null)
				msgs = ((InternalEObject)newSingleDep).eInverseAdd(this, MancoosiPackage.SINGLE_DEP__DEPENDENCE, SingleDep.class, msgs);
			msgs = basicSetSingleDep(newSingleDep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.DEPENDENCE__SINGLE_DEP, newSingleDep, newSingleDep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.mancoosi.mancoosimm.Package getPkg() {
		if (pkg != null && pkg.eIsProxy()) {
			InternalEObject oldPkg = (InternalEObject)pkg;
			pkg = (it.univaq.mancoosi.mancoosimm.Package)eResolveProxy(oldPkg);
			if (pkg != oldPkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.DEPENDENCE__PKG, oldPkg, pkg));
			}
		}
		return pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.mancoosi.mancoosimm.Package basicGetPkg() {
		return pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkg(it.univaq.mancoosi.mancoosimm.Package newPkg) {
		it.univaq.mancoosi.mancoosimm.Package oldPkg = pkg;
		pkg = newPkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.DEPENDENCE__PKG, oldPkg, pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.DEPENDENCE__AND_DEP:
				if (andDep != null)
					msgs = ((InternalEObject)andDep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.DEPENDENCE__AND_DEP, null, msgs);
				return basicSetAndDep((AndDep)otherEnd, msgs);
			case MancoosiPackage.DEPENDENCE__OR_DEP:
				if (orDep != null)
					msgs = ((InternalEObject)orDep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.DEPENDENCE__OR_DEP, null, msgs);
				return basicSetOrDep((OrDep)otherEnd, msgs);
			case MancoosiPackage.DEPENDENCE__SINGLE_DEP:
				if (singleDep != null)
					msgs = ((InternalEObject)singleDep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.DEPENDENCE__SINGLE_DEP, null, msgs);
				return basicSetSingleDep((SingleDep)otherEnd, msgs);
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
			case MancoosiPackage.DEPENDENCE__AND_DEP:
				return basicSetAndDep(null, msgs);
			case MancoosiPackage.DEPENDENCE__OR_DEP:
				return basicSetOrDep(null, msgs);
			case MancoosiPackage.DEPENDENCE__SINGLE_DEP:
				return basicSetSingleDep(null, msgs);
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
			case MancoosiPackage.DEPENDENCE__AND_DEP:
				return getAndDep();
			case MancoosiPackage.DEPENDENCE__OR_DEP:
				return getOrDep();
			case MancoosiPackage.DEPENDENCE__SINGLE_DEP:
				return getSingleDep();
			case MancoosiPackage.DEPENDENCE__PKG:
				if (resolve) return getPkg();
				return basicGetPkg();
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
			case MancoosiPackage.DEPENDENCE__AND_DEP:
				setAndDep((AndDep)newValue);
				return;
			case MancoosiPackage.DEPENDENCE__OR_DEP:
				setOrDep((OrDep)newValue);
				return;
			case MancoosiPackage.DEPENDENCE__SINGLE_DEP:
				setSingleDep((SingleDep)newValue);
				return;
			case MancoosiPackage.DEPENDENCE__PKG:
				setPkg((it.univaq.mancoosi.mancoosimm.Package)newValue);
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
			case MancoosiPackage.DEPENDENCE__AND_DEP:
				setAndDep((AndDep)null);
				return;
			case MancoosiPackage.DEPENDENCE__OR_DEP:
				setOrDep((OrDep)null);
				return;
			case MancoosiPackage.DEPENDENCE__SINGLE_DEP:
				setSingleDep((SingleDep)null);
				return;
			case MancoosiPackage.DEPENDENCE__PKG:
				setPkg((it.univaq.mancoosi.mancoosimm.Package)null);
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
			case MancoosiPackage.DEPENDENCE__AND_DEP:
				return andDep != null;
			case MancoosiPackage.DEPENDENCE__OR_DEP:
				return orDep != null;
			case MancoosiPackage.DEPENDENCE__SINGLE_DEP:
				return singleDep != null;
			case MancoosiPackage.DEPENDENCE__PKG:
				return pkg != null;
		}
		return super.eIsSet(featureID);
	}

} //DependenceImpl
