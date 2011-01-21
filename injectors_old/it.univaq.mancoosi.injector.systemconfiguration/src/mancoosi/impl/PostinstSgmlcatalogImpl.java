/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import mancoosi.File;
import mancoosi.MancoosiPackage;
import mancoosi.PostinstSgmlcatalog;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link mancoosi.impl.PostinstSgmlcatalogImpl#getCentralcat <em>Centralcat</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstSgmlcatalogImpl#getOrdcats <em>Ordcats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostinstSgmlcatalogImpl extends UpdateEnvironmentStatementImpl implements PostinstSgmlcatalog {
	/**
	 * The cached value of the '{@link #getCentralcat() <em>Centralcat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentralcat()
	 * @generated
	 * @ordered
	 */
	protected File centralcat;

	/**
	 * The cached value of the '{@link #getOrdcats() <em>Ordcats</em>}' reference.
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
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPostinstSgmlcatalog();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getCentralcat() {
		if (centralcat != null && centralcat.eIsProxy()) {
			InternalEObject oldCentralcat = (InternalEObject)centralcat;
			centralcat = (File)eResolveProxy(oldCentralcat);
			if (centralcat != oldCentralcat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_SGMLCATALOG__CENTRALCAT, oldCentralcat, centralcat));
			}
		}
		return centralcat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetCentralcat() {
		return centralcat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentralcat(File newCentralcat) {
		File oldCentralcat = centralcat;
		centralcat = newCentralcat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_SGMLCATALOG__CENTRALCAT, oldCentralcat, centralcat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getOrdcats() {
		if (ordcats != null && ordcats.eIsProxy()) {
			InternalEObject oldOrdcats = (InternalEObject)ordcats;
			ordcats = (File)eResolveProxy(oldOrdcats);
			if (ordcats != oldOrdcats) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_SGMLCATALOG__ORDCATS, oldOrdcats, ordcats));
			}
		}
		return ordcats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetOrdcats() {
		return ordcats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdcats(File newOrdcats) {
		File oldOrdcats = ordcats;
		ordcats = newOrdcats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_SGMLCATALOG__ORDCATS, oldOrdcats, ordcats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.POSTINST_SGMLCATALOG__CENTRALCAT:
				if (resolve) return getCentralcat();
				return basicGetCentralcat();
			case MancoosiPackage.POSTINST_SGMLCATALOG__ORDCATS:
				if (resolve) return getOrdcats();
				return basicGetOrdcats();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.POSTINST_SGMLCATALOG__CENTRALCAT:
				setCentralcat((File)newValue);
				return;
			case MancoosiPackage.POSTINST_SGMLCATALOG__ORDCATS:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MancoosiPackage.POSTINST_SGMLCATALOG__CENTRALCAT:
				setCentralcat((File)null);
				return;
			case MancoosiPackage.POSTINST_SGMLCATALOG__ORDCATS:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MancoosiPackage.POSTINST_SGMLCATALOG__CENTRALCAT:
				return centralcat != null;
			case MancoosiPackage.POSTINST_SGMLCATALOG__ORDCATS:
				return ordcats != null;
		}
		return super.eIsSet(featureID);
	}

} //PostinstSgmlcatalogImpl
