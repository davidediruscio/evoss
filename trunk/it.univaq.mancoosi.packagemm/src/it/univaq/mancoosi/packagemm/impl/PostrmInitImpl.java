/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.DeletionFileSystemStatement;
import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.packagemm.FileSystemStatement;
import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.PostrmInit;
import it.univaq.mancoosi.packagemm.Script;
import it.univaq.mancoosi.packagemm.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postrm Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PostrmInitImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PostrmInitImpl#getScriptParam <em>Script Param</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PostrmInitImpl#getErrorHandler <em>Error Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostrmInitImpl extends UpdateEnvironmentStatementImpl implements PostrmInit {
	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The cached value of the '{@link #getScriptParam() <em>Script Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptParam()
	 * @generated
	 * @ordered
	 */
	protected Script scriptParam;

	/**
	 * The cached value of the '{@link #getErrorHandler() <em>Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected Statement errorHandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostrmInitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getPostrmInit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectResolvingEList<File>(File.class, this, PackagemmPackage.POSTRM_INIT__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script getScriptParam() {
		return scriptParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScriptParam(Script newScriptParam, NotificationChain msgs) {
		Script oldScriptParam = scriptParam;
		scriptParam = newScriptParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTRM_INIT__SCRIPT_PARAM, oldScriptParam, newScriptParam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptParam(Script newScriptParam) {
		if (newScriptParam != scriptParam) {
			NotificationChain msgs = null;
			if (scriptParam != null)
				msgs = ((InternalEObject)scriptParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTRM_INIT__SCRIPT_PARAM, null, msgs);
			if (newScriptParam != null)
				msgs = ((InternalEObject)newScriptParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTRM_INIT__SCRIPT_PARAM, null, msgs);
			msgs = basicSetScriptParam(newScriptParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTRM_INIT__SCRIPT_PARAM, newScriptParam, newScriptParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getErrorHandler() {
		return errorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorHandler(Statement newErrorHandler, NotificationChain msgs) {
		Statement oldErrorHandler = errorHandler;
		errorHandler = newErrorHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTRM_INIT__ERROR_HANDLER, oldErrorHandler, newErrorHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorHandler(Statement newErrorHandler) {
		if (newErrorHandler != errorHandler) {
			NotificationChain msgs = null;
			if (errorHandler != null)
				msgs = ((InternalEObject)errorHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTRM_INIT__ERROR_HANDLER, null, msgs);
			if (newErrorHandler != null)
				msgs = ((InternalEObject)newErrorHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTRM_INIT__ERROR_HANDLER, null, msgs);
			msgs = basicSetErrorHandler(newErrorHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTRM_INIT__ERROR_HANDLER, newErrorHandler, newErrorHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.POSTRM_INIT__SCRIPT_PARAM:
				return basicSetScriptParam(null, msgs);
			case PackagemmPackage.POSTRM_INIT__ERROR_HANDLER:
				return basicSetErrorHandler(null, msgs);
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
			case PackagemmPackage.POSTRM_INIT__FILES:
				return getFiles();
			case PackagemmPackage.POSTRM_INIT__SCRIPT_PARAM:
				return getScriptParam();
			case PackagemmPackage.POSTRM_INIT__ERROR_HANDLER:
				return getErrorHandler();
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
			case PackagemmPackage.POSTRM_INIT__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
			case PackagemmPackage.POSTRM_INIT__SCRIPT_PARAM:
				setScriptParam((Script)newValue);
				return;
			case PackagemmPackage.POSTRM_INIT__ERROR_HANDLER:
				setErrorHandler((Statement)newValue);
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
			case PackagemmPackage.POSTRM_INIT__FILES:
				getFiles().clear();
				return;
			case PackagemmPackage.POSTRM_INIT__SCRIPT_PARAM:
				setScriptParam((Script)null);
				return;
			case PackagemmPackage.POSTRM_INIT__ERROR_HANDLER:
				setErrorHandler((Statement)null);
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
			case PackagemmPackage.POSTRM_INIT__FILES:
				return files != null && !files.isEmpty();
			case PackagemmPackage.POSTRM_INIT__SCRIPT_PARAM:
				return scriptParam != null;
			case PackagemmPackage.POSTRM_INIT__ERROR_HANDLER:
				return errorHandler != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FileSystemStatement.class) {
			switch (derivedFeatureID) {
				case PackagemmPackage.POSTRM_INIT__FILES: return PackagemmPackage.FILE_SYSTEM_STATEMENT__FILES;
				default: return -1;
			}
		}
		if (baseClass == DeletionFileSystemStatement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FileSystemStatement.class) {
			switch (baseFeatureID) {
				case PackagemmPackage.FILE_SYSTEM_STATEMENT__FILES: return PackagemmPackage.POSTRM_INIT__FILES;
				default: return -1;
			}
		}
		if (baseClass == DeletionFileSystemStatement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PostrmInitImpl
