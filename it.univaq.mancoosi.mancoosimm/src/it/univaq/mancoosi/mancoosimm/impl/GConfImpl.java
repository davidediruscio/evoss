/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.Environment;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.GConf;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GConf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.GConfImpl#getConfFiles <em>Conf Files</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.GConfImpl#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.GConfImpl#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GConfImpl extends EObjectImpl implements GConf {
	/**
	 * The cached value of the '{@link #getConfFiles() <em>Conf Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> confFiles;

	/**
	 * The cached value of the '{@link #getSchemas() <em>Schemas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemas()
	 * @generated
	 * @ordered
	 */
	protected EList<File> schemas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GConfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.GCONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getConfFiles() {
		if (confFiles == null) {
			confFiles = new EObjectResolvingEList<File>(File.class, this, MancoosiPackage.GCONF__CONF_FILES);
		}
		return confFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getSchemas() {
		if (schemas == null) {
			schemas = new EObjectResolvingEList<File>(File.class, this, MancoosiPackage.GCONF__SCHEMAS);
		}
		return schemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnv() {
		if (eContainerFeatureID() != MancoosiPackage.GCONF__ENV) return null;
		return (Environment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnv(Environment newEnv, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnv, MancoosiPackage.GCONF__ENV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnv(Environment newEnv) {
		if (newEnv != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.GCONF__ENV && newEnv != null)) {
			if (EcoreUtil.isAncestor(this, newEnv))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnv != null)
				msgs = ((InternalEObject)newEnv).eInverseAdd(this, MancoosiPackage.ENVIRONMENT__GCONF, Environment.class, msgs);
			msgs = basicSetEnv(newEnv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.GCONF__ENV, newEnv, newEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.GCONF__ENV:
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
			case MancoosiPackage.GCONF__ENV:
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
			case MancoosiPackage.GCONF__ENV:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.ENVIRONMENT__GCONF, Environment.class, msgs);
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
			case MancoosiPackage.GCONF__CONF_FILES:
				return getConfFiles();
			case MancoosiPackage.GCONF__SCHEMAS:
				return getSchemas();
			case MancoosiPackage.GCONF__ENV:
				return getEnv();
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
			case MancoosiPackage.GCONF__CONF_FILES:
				getConfFiles().clear();
				getConfFiles().addAll((Collection<? extends File>)newValue);
				return;
			case MancoosiPackage.GCONF__SCHEMAS:
				getSchemas().clear();
				getSchemas().addAll((Collection<? extends File>)newValue);
				return;
			case MancoosiPackage.GCONF__ENV:
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
			case MancoosiPackage.GCONF__CONF_FILES:
				getConfFiles().clear();
				return;
			case MancoosiPackage.GCONF__SCHEMAS:
				getSchemas().clear();
				return;
			case MancoosiPackage.GCONF__ENV:
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
			case MancoosiPackage.GCONF__CONF_FILES:
				return confFiles != null && !confFiles.isEmpty();
			case MancoosiPackage.GCONF__SCHEMAS:
				return schemas != null && !schemas.isEmpty();
			case MancoosiPackage.GCONF__ENV:
				return getEnv() != null;
		}
		return super.eIsSet(featureID);
	}

} //GConfImpl
