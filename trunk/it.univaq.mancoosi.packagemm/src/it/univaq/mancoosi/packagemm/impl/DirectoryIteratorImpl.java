/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.DirectoryIterator;
import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.packagemm.PackagemmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directory Iterator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.DirectoryIteratorImpl#getDirectory <em>Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectoryIteratorImpl extends IteratorImpl implements DirectoryIterator {
	/**
	 * The cached value of the '{@link #getDirectory() <em>Directory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected File directory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectoryIteratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getDirectoryIterator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getDirectory() {
		if (directory != null && directory.eIsProxy()) {
			InternalEObject oldDirectory = (InternalEObject)directory;
			directory = (File)eResolveProxy(oldDirectory);
			if (directory != oldDirectory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PackagemmPackage.DIRECTORY_ITERATOR__DIRECTORY, oldDirectory, directory));
			}
		}
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetDirectory() {
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectory(File newDirectory) {
		File oldDirectory = directory;
		directory = newDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.DIRECTORY_ITERATOR__DIRECTORY, oldDirectory, directory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackagemmPackage.DIRECTORY_ITERATOR__DIRECTORY:
				if (resolve) return getDirectory();
				return basicGetDirectory();
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
			case PackagemmPackage.DIRECTORY_ITERATOR__DIRECTORY:
				setDirectory((File)newValue);
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
			case PackagemmPackage.DIRECTORY_ITERATOR__DIRECTORY:
				setDirectory((File)null);
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
			case PackagemmPackage.DIRECTORY_ITERATOR__DIRECTORY:
				return directory != null;
		}
		return super.eIsSet(featureID);
	}

} //DirectoryIteratorImpl
