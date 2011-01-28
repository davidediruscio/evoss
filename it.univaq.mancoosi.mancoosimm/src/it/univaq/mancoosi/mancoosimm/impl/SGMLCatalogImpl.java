/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.Environment;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.SGMLCatalog;
import it.univaq.mancoosi.mancoosimm.SGMLDocument;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGML Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.SGMLCatalogImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.SGMLCatalogImpl#getDocuments <em>Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SGMLCatalogImpl extends NamedElementImpl implements SGMLCatalog {
	/**
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<SGMLDocument> documents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGMLCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.SGML_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnv() {
		if (eContainerFeatureID() != MancoosiPackage.SGML_CATALOG__ENV) return null;
		return (Environment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnv(Environment newEnv, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnv, MancoosiPackage.SGML_CATALOG__ENV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnv(Environment newEnv) {
		if (newEnv != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.SGML_CATALOG__ENV && newEnv != null)) {
			if (EcoreUtil.isAncestor(this, newEnv))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnv != null)
				msgs = ((InternalEObject)newEnv).eInverseAdd(this, MancoosiPackage.ENVIRONMENT__SGML_CATALOG, Environment.class, msgs);
			msgs = basicSetEnv(newEnv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.SGML_CATALOG__ENV, newEnv, newEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SGMLDocument> getDocuments() {
		if (documents == null) {
			documents = new EObjectResolvingEList<SGMLDocument>(SGMLDocument.class, this, MancoosiPackage.SGML_CATALOG__DOCUMENTS);
		}
		return documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.SGML_CATALOG__ENV:
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
			case MancoosiPackage.SGML_CATALOG__ENV:
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
			case MancoosiPackage.SGML_CATALOG__ENV:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.ENVIRONMENT__SGML_CATALOG, Environment.class, msgs);
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
			case MancoosiPackage.SGML_CATALOG__ENV:
				return getEnv();
			case MancoosiPackage.SGML_CATALOG__DOCUMENTS:
				return getDocuments();
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
			case MancoosiPackage.SGML_CATALOG__ENV:
				setEnv((Environment)newValue);
				return;
			case MancoosiPackage.SGML_CATALOG__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends SGMLDocument>)newValue);
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
			case MancoosiPackage.SGML_CATALOG__ENV:
				setEnv((Environment)null);
				return;
			case MancoosiPackage.SGML_CATALOG__DOCUMENTS:
				getDocuments().clear();
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
			case MancoosiPackage.SGML_CATALOG__ENV:
				return getEnv() != null;
			case MancoosiPackage.SGML_CATALOG__DOCUMENTS:
				return documents != null && !documents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SGMLCatalogImpl
