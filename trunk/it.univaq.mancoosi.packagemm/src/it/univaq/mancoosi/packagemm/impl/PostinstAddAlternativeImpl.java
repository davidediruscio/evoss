/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.AddAlternative;
import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.PostinstAddAlternative;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postinst Add Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PostinstAddAlternativeImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PostinstAddAlternativeImpl#getSlave <em>Slave</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostinstAddAlternativeImpl extends AdditionEnvironmentStatementImpl implements PostinstAddAlternative {
	/**
	 * The cached value of the '{@link #getMaster() <em>Master</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaster()
	 * @generated
	 * @ordered
	 */
	protected AddAlternative master;

	/**
	 * The cached value of the '{@link #getSlave() <em>Slave</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlave()
	 * @generated
	 * @ordered
	 */
	protected EList<AddAlternative> slave;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostinstAddAlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getPostinstAddAlternative();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAlternative getMaster() {
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaster(AddAlternative newMaster, NotificationChain msgs) {
		AddAlternative oldMaster = master;
		master = newMaster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_ADD_ALTERNATIVE__MASTER, oldMaster, newMaster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaster(AddAlternative newMaster) {
		if (newMaster != master) {
			NotificationChain msgs = null;
			if (master != null)
				msgs = ((InternalEObject)master).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_ADD_ALTERNATIVE__MASTER, null, msgs);
			if (newMaster != null)
				msgs = ((InternalEObject)newMaster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_ADD_ALTERNATIVE__MASTER, null, msgs);
			msgs = basicSetMaster(newMaster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_ADD_ALTERNATIVE__MASTER, newMaster, newMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddAlternative> getSlave() {
		if (slave == null) {
			slave = new EObjectContainmentEList<AddAlternative>(AddAlternative.class, this, PackagemmPackage.POSTINST_ADD_ALTERNATIVE__SLAVE);
		}
		return slave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.POSTINST_ADD_ALTERNATIVE__MASTER:
				return basicSetMaster(null, msgs);
			case PackagemmPackage.POSTINST_ADD_ALTERNATIVE__SLAVE:
				return ((InternalEList<?>)getSlave()).basicRemove(otherEnd, msgs);
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
			case PackagemmPackage.POSTINST_ADD_ALTERNATIVE__MASTER:
				return getMaster();
			case PackagemmPackage.POSTINST_ADD_ALTERNATIVE__SLAVE:
				return getSlave();
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
			case PackagemmPackage.POSTINST_ADD_ALTERNATIVE__MASTER:
				setMaster((AddAlternative)newValue);
				return;
			case PackagemmPackage.POSTINST_ADD_ALTERNATIVE__SLAVE:
				getSlave().clear();
				getSlave().addAll((Collection<? extends AddAlternative>)newValue);
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
			case PackagemmPackage.POSTINST_ADD_ALTERNATIVE__MASTER:
				setMaster((AddAlternative)null);
				return;
			case PackagemmPackage.POSTINST_ADD_ALTERNATIVE__SLAVE:
				getSlave().clear();
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
			case PackagemmPackage.POSTINST_ADD_ALTERNATIVE__MASTER:
				return master != null;
			case PackagemmPackage.POSTINST_ADD_ALTERNATIVE__SLAVE:
				return slave != null && !slave.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PostinstAddAlternativeImpl
