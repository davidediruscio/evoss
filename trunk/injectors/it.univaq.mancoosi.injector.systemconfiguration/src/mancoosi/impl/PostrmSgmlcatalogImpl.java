/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import mancoosi.File;
import mancoosi.MancoosiPackage;
import mancoosi.PostrmSgmlcatalog;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postrm Sgmlcatalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PostrmSgmlcatalogImpl#getCentralcat <em>Centralcat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostrmSgmlcatalogImpl extends UpdateFileSytemStatementImpl implements PostrmSgmlcatalog {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostrmSgmlcatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPostrmSgmlcatalog();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTRM_SGMLCATALOG__CENTRALCAT, oldCentralcat, centralcat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTRM_SGMLCATALOG__CENTRALCAT, oldCentralcat, centralcat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.POSTRM_SGMLCATALOG__CENTRALCAT:
				if (resolve) return getCentralcat();
				return basicGetCentralcat();
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
			case MancoosiPackage.POSTRM_SGMLCATALOG__CENTRALCAT:
				setCentralcat((File)newValue);
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
			case MancoosiPackage.POSTRM_SGMLCATALOG__CENTRALCAT:
				setCentralcat((File)null);
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
			case MancoosiPackage.POSTRM_SGMLCATALOG__CENTRALCAT:
				return centralcat != null;
		}
		return super.eIsSet(featureID);
	}

} //PostrmSgmlcatalogImpl
