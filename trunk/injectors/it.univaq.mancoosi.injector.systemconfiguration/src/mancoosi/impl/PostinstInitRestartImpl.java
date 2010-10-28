/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.File;
import mancoosi.MancoosiPackage;
import mancoosi.Param;
import mancoosi.PostinstInitRestart;
import mancoosi.Script;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postinst Init Restart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PostinstInitRestartImpl#getScriptParam <em>Script Param</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstInitRestartImpl#getInitParams <em>Init Params</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstInitRestartImpl#getErrorHandler <em>Error Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostinstInitRestartImpl extends UpdateEnvironmentStatementImpl implements PostinstInitRestart {
	/**
	 * The cached value of the '{@link #getScriptParam() <em>Script Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptParam()
	 * @generated
	 * @ordered
	 */
	protected Script scriptParam;

	/**
	 * The cached value of the '{@link #getInitParams() <em>Init Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitParams()
	 * @generated
	 * @ordered
	 */
	protected EList initParams;

	/**
	 * The cached value of the '{@link #getErrorHandler() <em>Error Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorHandler()
	 * @generated
	 * @ordered
	 */
	protected File errorHandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostinstInitRestartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPostinstInitRestart();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script getScriptParam() {
		if (scriptParam != null && scriptParam.eIsProxy()) {
			InternalEObject oldScriptParam = (InternalEObject)scriptParam;
			scriptParam = (Script)eResolveProxy(oldScriptParam);
			if (scriptParam != oldScriptParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_INIT_RESTART__SCRIPT_PARAM, oldScriptParam, scriptParam));
			}
		}
		return scriptParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script basicGetScriptParam() {
		return scriptParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptParam(Script newScriptParam) {
		Script oldScriptParam = scriptParam;
		scriptParam = newScriptParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_INIT_RESTART__SCRIPT_PARAM, oldScriptParam, scriptParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInitParams() {
		if (initParams == null) {
			initParams = new EObjectResolvingEList(Param.class, this, MancoosiPackage.POSTINST_INIT_RESTART__INIT_PARAMS);
		}
		return initParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getErrorHandler() {
		if (errorHandler != null && errorHandler.eIsProxy()) {
			InternalEObject oldErrorHandler = (InternalEObject)errorHandler;
			errorHandler = (File)eResolveProxy(oldErrorHandler);
			if (errorHandler != oldErrorHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_INIT_RESTART__ERROR_HANDLER, oldErrorHandler, errorHandler));
			}
		}
		return errorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetErrorHandler() {
		return errorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorHandler(File newErrorHandler) {
		File oldErrorHandler = errorHandler;
		errorHandler = newErrorHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_INIT_RESTART__ERROR_HANDLER, oldErrorHandler, errorHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.POSTINST_INIT_RESTART__SCRIPT_PARAM:
				if (resolve) return getScriptParam();
				return basicGetScriptParam();
			case MancoosiPackage.POSTINST_INIT_RESTART__INIT_PARAMS:
				return getInitParams();
			case MancoosiPackage.POSTINST_INIT_RESTART__ERROR_HANDLER:
				if (resolve) return getErrorHandler();
				return basicGetErrorHandler();
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
			case MancoosiPackage.POSTINST_INIT_RESTART__SCRIPT_PARAM:
				setScriptParam((Script)newValue);
				return;
			case MancoosiPackage.POSTINST_INIT_RESTART__INIT_PARAMS:
				getInitParams().clear();
				getInitParams().addAll((Collection)newValue);
				return;
			case MancoosiPackage.POSTINST_INIT_RESTART__ERROR_HANDLER:
				setErrorHandler((File)newValue);
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
			case MancoosiPackage.POSTINST_INIT_RESTART__SCRIPT_PARAM:
				setScriptParam((Script)null);
				return;
			case MancoosiPackage.POSTINST_INIT_RESTART__INIT_PARAMS:
				getInitParams().clear();
				return;
			case MancoosiPackage.POSTINST_INIT_RESTART__ERROR_HANDLER:
				setErrorHandler((File)null);
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
			case MancoosiPackage.POSTINST_INIT_RESTART__SCRIPT_PARAM:
				return scriptParam != null;
			case MancoosiPackage.POSTINST_INIT_RESTART__INIT_PARAMS:
				return initParams != null && !initParams.isEmpty();
			case MancoosiPackage.POSTINST_INIT_RESTART__ERROR_HANDLER:
				return errorHandler != null;
		}
		return super.eIsSet(featureID);
	}

} //PostinstInitRestartImpl
