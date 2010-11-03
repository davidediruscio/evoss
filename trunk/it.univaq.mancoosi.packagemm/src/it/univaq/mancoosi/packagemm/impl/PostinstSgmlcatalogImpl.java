/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.PostinstSgmlcatalog;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postinst Sgmlcatalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PostinstSgmlcatalogImpl#getCentralcat <em>Centralcat</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PostinstSgmlcatalogImpl#getOrdcats <em>Ordcats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostinstSgmlcatalogImpl extends UpdateEnvironmentStatementImpl implements PostinstSgmlcatalog {
	/**
	 * The cached value of the '{@link #getCentralcat() <em>Centralcat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentralcat()
	 * @generated
	 * @ordered
	 */
	protected File centralcat;

	/**
	 * The cached value of the '{@link #getOrdcats() <em>Ordcats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdcats()
	 * @generated
	 * @ordered
	 */
	protected File ordcats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostinstSgmlcatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getPostinstSgmlcatalog();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getCentralcat() {
		return centralcat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCentralcat(File newCentralcat, NotificationChain msgs) {
		File oldCentralcat = centralcat;
		centralcat = newCentralcat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_SGMLCATALOG__CENTRALCAT, oldCentralcat, newCentralcat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentralcat(File newCentralcat) {
		if (newCentralcat != centralcat) {
			NotificationChain msgs = null;
			if (centralcat != null)
				msgs = ((InternalEObject)centralcat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_SGMLCATALOG__CENTRALCAT, null, msgs);
			if (newCentralcat != null)
				msgs = ((InternalEObject)newCentralcat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_SGMLCATALOG__CENTRALCAT, null, msgs);
			msgs = basicSetCentralcat(newCentralcat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_SGMLCATALOG__CENTRALCAT, newCentralcat, newCentralcat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getOrdcats() {
		return ordcats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrdcats(File newOrdcats, NotificationChain msgs) {
		File oldOrdcats = ordcats;
		ordcats = newOrdcats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_SGMLCATALOG__ORDCATS, oldOrdcats, newOrdcats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdcats(File newOrdcats) {
		if (newOrdcats != ordcats) {
			NotificationChain msgs = null;
			if (ordcats != null)
				msgs = ((InternalEObject)ordcats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_SGMLCATALOG__ORDCATS, null, msgs);
			if (newOrdcats != null)
				msgs = ((InternalEObject)newOrdcats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_SGMLCATALOG__ORDCATS, null, msgs);
			msgs = basicSetOrdcats(newOrdcats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_SGMLCATALOG__ORDCATS, newOrdcats, newOrdcats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.POSTINST_SGMLCATALOG__CENTRALCAT:
				return basicSetCentralcat(null, msgs);
			case PackagemmPackage.POSTINST_SGMLCATALOG__ORDCATS:
				return basicSetOrdcats(null, msgs);
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
			case PackagemmPackage.POSTINST_SGMLCATALOG__CENTRALCAT:
				return getCentralcat();
			case PackagemmPackage.POSTINST_SGMLCATALOG__ORDCATS:
				return getOrdcats();
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
			case PackagemmPackage.POSTINST_SGMLCATALOG__CENTRALCAT:
				setCentralcat((File)newValue);
				return;
			case PackagemmPackage.POSTINST_SGMLCATALOG__ORDCATS:
				setOrdcats((File)newValue);
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
			case PackagemmPackage.POSTINST_SGMLCATALOG__CENTRALCAT:
				setCentralcat((File)null);
				return;
			case PackagemmPackage.POSTINST_SGMLCATALOG__ORDCATS:
				setOrdcats((File)null);
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
			case PackagemmPackage.POSTINST_SGMLCATALOG__CENTRALCAT:
				return centralcat != null;
			case PackagemmPackage.POSTINST_SGMLCATALOG__ORDCATS:
				return ordcats != null;
		}
		return super.eIsSet(featureID);
	}

} //PostinstSgmlcatalogImpl
