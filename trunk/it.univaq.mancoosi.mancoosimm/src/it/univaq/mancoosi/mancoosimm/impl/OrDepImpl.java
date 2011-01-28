/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.Dependence;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.OrDep;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or Dep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.OrDepImpl#getOps <em>Ops</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.OrDepImpl#getDependence <em>Dependence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrDepImpl extends DependenceImpl implements OrDep {
	/**
	 * The cached value of the '{@link #getOps() <em>Ops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOps()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependence> ops;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrDepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.OR_DEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependence> getOps() {
		if (ops == null) {
			ops = new EObjectContainmentEList<Dependence>(Dependence.class, this, MancoosiPackage.OR_DEP__OPS);
		}
		return ops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependence getDependence() {
		if (eContainerFeatureID() != MancoosiPackage.OR_DEP__DEPENDENCE) return null;
		return (Dependence)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependence(Dependence newDependence, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDependence, MancoosiPackage.OR_DEP__DEPENDENCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependence(Dependence newDependence) {
		if (newDependence != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.OR_DEP__DEPENDENCE && newDependence != null)) {
			if (EcoreUtil.isAncestor(this, newDependence))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDependence != null)
				msgs = ((InternalEObject)newDependence).eInverseAdd(this, MancoosiPackage.DEPENDENCE__OR_DEP, Dependence.class, msgs);
			msgs = basicSetDependence(newDependence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.OR_DEP__DEPENDENCE, newDependence, newDependence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.OR_DEP__DEPENDENCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDependence((Dependence)otherEnd, msgs);
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
			case MancoosiPackage.OR_DEP__OPS:
				return ((InternalEList<?>)getOps()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.OR_DEP__DEPENDENCE:
				return basicSetDependence(null, msgs);
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
			case MancoosiPackage.OR_DEP__DEPENDENCE:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.DEPENDENCE__OR_DEP, Dependence.class, msgs);
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
			case MancoosiPackage.OR_DEP__OPS:
				return getOps();
			case MancoosiPackage.OR_DEP__DEPENDENCE:
				return getDependence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.OR_DEP__OPS:
				getOps().clear();
				getOps().addAll((Collection<? extends Dependence>)newValue);
				return;
			case MancoosiPackage.OR_DEP__DEPENDENCE:
				setDependence((Dependence)newValue);
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
			case MancoosiPackage.OR_DEP__OPS:
				getOps().clear();
				return;
			case MancoosiPackage.OR_DEP__DEPENDENCE:
				setDependence((Dependence)null);
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
			case MancoosiPackage.OR_DEP__OPS:
				return ops != null && !ops.isEmpty();
			case MancoosiPackage.OR_DEP__DEPENDENCE:
				return getDependence() != null;
		}
		return super.eIsSet(featureID);
	}

} //OrDepImpl
