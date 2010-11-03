/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.AndDep;
import it.univaq.mancoosi.packagemm.Dependence;
import it.univaq.mancoosi.packagemm.PackagemmPackage;

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
 * An implementation of the model object '<em><b>And Dep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.AndDepImpl#getOps <em>Ops</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.AndDepImpl#getDependence <em>Dependence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndDepImpl extends DependenceImpl implements AndDep {
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
	protected AndDepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getAndDep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependence> getOps() {
		if (ops == null) {
			ops = new EObjectContainmentEList<Dependence>(Dependence.class, this, PackagemmPackage.AND_DEP__OPS);
		}
		return ops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependence getDependence() {
		if (eContainerFeatureID() != PackagemmPackage.AND_DEP__DEPENDENCE) return null;
		return (Dependence)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependence(Dependence newDependence, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDependence, PackagemmPackage.AND_DEP__DEPENDENCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependence(Dependence newDependence) {
		if (newDependence != eInternalContainer() || (eContainerFeatureID() != PackagemmPackage.AND_DEP__DEPENDENCE && newDependence != null)) {
			if (EcoreUtil.isAncestor(this, newDependence))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDependence != null)
				msgs = ((InternalEObject)newDependence).eInverseAdd(this, PackagemmPackage.DEPENDENCE__AND_DEP, Dependence.class, msgs);
			msgs = basicSetDependence(newDependence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.AND_DEP__DEPENDENCE, newDependence, newDependence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.AND_DEP__DEPENDENCE:
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
			case PackagemmPackage.AND_DEP__OPS:
				return ((InternalEList<?>)getOps()).basicRemove(otherEnd, msgs);
			case PackagemmPackage.AND_DEP__DEPENDENCE:
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
			case PackagemmPackage.AND_DEP__DEPENDENCE:
				return eInternalContainer().eInverseRemove(this, PackagemmPackage.DEPENDENCE__AND_DEP, Dependence.class, msgs);
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
			case PackagemmPackage.AND_DEP__OPS:
				return getOps();
			case PackagemmPackage.AND_DEP__DEPENDENCE:
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
			case PackagemmPackage.AND_DEP__OPS:
				getOps().clear();
				getOps().addAll((Collection<? extends Dependence>)newValue);
				return;
			case PackagemmPackage.AND_DEP__DEPENDENCE:
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
			case PackagemmPackage.AND_DEP__OPS:
				getOps().clear();
				return;
			case PackagemmPackage.AND_DEP__DEPENDENCE:
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
			case PackagemmPackage.AND_DEP__OPS:
				return ops != null && !ops.isEmpty();
			case PackagemmPackage.AND_DEP__DEPENDENCE:
				return getDependence() != null;
		}
		return super.eIsSet(featureID);
	}

} //AndDepImpl
