/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.errormm.impl;

import it.univaq.mancoosi.errormm.ErrormmPackage;
import it.univaq.mancoosi.errormm.Report;
import it.univaq.mancoosi.errormm.Warning;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.errormm.impl.ReportImpl#getWarnings <em>Warnings</em>}</li>
 *   <li>{@link it.univaq.mancoosi.errormm.impl.ReportImpl#getErrors <em>Errors</em>}</li>
 *   <li>{@link it.univaq.mancoosi.errormm.impl.ReportImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportImpl extends EObjectImpl implements Report {
	/**
	 * The cached value of the '{@link #getWarnings() <em>Warnings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarnings()
	 * @generated
	 * @ordered
	 */
	protected EList<Warning> warnings;

	/**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<it.univaq.mancoosi.errormm.Error> errors;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrormmPackage.Literals.REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Warning> getWarnings() {
		if (warnings == null) {
			warnings = new EObjectContainmentEList<Warning>(Warning.class, this, ErrormmPackage.REPORT__WARNINGS);
		}
		return warnings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<it.univaq.mancoosi.errormm.Error> getErrors() {
		if (errors == null) {
			errors = new EObjectContainmentEList<it.univaq.mancoosi.errormm.Error>(it.univaq.mancoosi.errormm.Error.class, this, ErrormmPackage.REPORT__ERRORS);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormmPackage.REPORT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrormmPackage.REPORT__WARNINGS:
				return ((InternalEList<?>)getWarnings()).basicRemove(otherEnd, msgs);
			case ErrormmPackage.REPORT__ERRORS:
				return ((InternalEList<?>)getErrors()).basicRemove(otherEnd, msgs);
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
			case ErrormmPackage.REPORT__WARNINGS:
				return getWarnings();
			case ErrormmPackage.REPORT__ERRORS:
				return getErrors();
			case ErrormmPackage.REPORT__DESCRIPTION:
				return getDescription();
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
			case ErrormmPackage.REPORT__WARNINGS:
				getWarnings().clear();
				getWarnings().addAll((Collection<? extends Warning>)newValue);
				return;
			case ErrormmPackage.REPORT__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends it.univaq.mancoosi.errormm.Error>)newValue);
				return;
			case ErrormmPackage.REPORT__DESCRIPTION:
				setDescription((String)newValue);
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
			case ErrormmPackage.REPORT__WARNINGS:
				getWarnings().clear();
				return;
			case ErrormmPackage.REPORT__ERRORS:
				getErrors().clear();
				return;
			case ErrormmPackage.REPORT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ErrormmPackage.REPORT__WARNINGS:
				return warnings != null && !warnings.isEmpty();
			case ErrormmPackage.REPORT__ERRORS:
				return errors != null && !errors.isEmpty();
			case ErrormmPackage.REPORT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ReportImpl
