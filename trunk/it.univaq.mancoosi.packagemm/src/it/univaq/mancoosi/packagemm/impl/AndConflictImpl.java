/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.AndConflict;
import it.univaq.mancoosi.packagemm.Conflict;
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
 * An implementation of the model object '<em><b>And Conflict</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.AndConflictImpl#getOps <em>Ops</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.AndConflictImpl#getConflict <em>Conflict</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndConflictImpl extends ConflictImpl implements AndConflict {
	/**
	 * The cached value of the '{@link #getOps() <em>Ops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOps()
	 * @generated
	 * @ordered
	 */
	protected EList<Conflict> ops;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getAndConflict();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conflict> getOps() {
		if (ops == null) {
			ops = new EObjectContainmentEList<Conflict>(Conflict.class, this, PackagemmPackage.AND_CONFLICT__OPS);
		}
		return ops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conflict getConflict() {
		if (eContainerFeatureID() != PackagemmPackage.AND_CONFLICT__CONFLICT) return null;
		return (Conflict)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConflict(Conflict newConflict, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConflict, PackagemmPackage.AND_CONFLICT__CONFLICT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConflict(Conflict newConflict) {
		if (newConflict != eInternalContainer() || (eContainerFeatureID() != PackagemmPackage.AND_CONFLICT__CONFLICT && newConflict != null)) {
			if (EcoreUtil.isAncestor(this, newConflict))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConflict != null)
				msgs = ((InternalEObject)newConflict).eInverseAdd(this, PackagemmPackage.CONFLICT__AND_CONFLICT, Conflict.class, msgs);
			msgs = basicSetConflict(newConflict, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.AND_CONFLICT__CONFLICT, newConflict, newConflict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.AND_CONFLICT__CONFLICT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConflict((Conflict)otherEnd, msgs);
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
			case PackagemmPackage.AND_CONFLICT__OPS:
				return ((InternalEList<?>)getOps()).basicRemove(otherEnd, msgs);
			case PackagemmPackage.AND_CONFLICT__CONFLICT:
				return basicSetConflict(null, msgs);
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
			case PackagemmPackage.AND_CONFLICT__CONFLICT:
				return eInternalContainer().eInverseRemove(this, PackagemmPackage.CONFLICT__AND_CONFLICT, Conflict.class, msgs);
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
			case PackagemmPackage.AND_CONFLICT__OPS:
				return getOps();
			case PackagemmPackage.AND_CONFLICT__CONFLICT:
				return getConflict();
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
			case PackagemmPackage.AND_CONFLICT__OPS:
				getOps().clear();
				getOps().addAll((Collection<? extends Conflict>)newValue);
				return;
			case PackagemmPackage.AND_CONFLICT__CONFLICT:
				setConflict((Conflict)newValue);
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
			case PackagemmPackage.AND_CONFLICT__OPS:
				getOps().clear();
				return;
			case PackagemmPackage.AND_CONFLICT__CONFLICT:
				setConflict((Conflict)null);
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
			case PackagemmPackage.AND_CONFLICT__OPS:
				return ops != null && !ops.isEmpty();
			case PackagemmPackage.AND_CONFLICT__CONFLICT:
				return getConflict() != null;
		}
		return super.eIsSet(featureID);
	}

} //AndConflictImpl
