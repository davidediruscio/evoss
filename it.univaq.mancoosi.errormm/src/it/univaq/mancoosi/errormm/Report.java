/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.errormm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.errormm.Report#getWarnings <em>Warnings</em>}</li>
 *   <li>{@link it.univaq.mancoosi.errormm.Report#getErrors <em>Errors</em>}</li>
 *   <li>{@link it.univaq.mancoosi.errormm.Report#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.errormm.ErrormmPackage#getReport()
 * @model
 * @generated
 */
public interface Report extends EObject {
	/**
	 * Returns the value of the '<em><b>Warnings</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.errormm.Warning}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warnings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warnings</em>' containment reference list.
	 * @see it.univaq.mancoosi.errormm.ErrormmPackage#getReport_Warnings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Warning> getWarnings();

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.errormm.Error}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' containment reference list.
	 * @see it.univaq.mancoosi.errormm.ErrormmPackage#getReport_Errors()
	 * @model containment="true"
	 * @generated
	 */
	EList<it.univaq.mancoosi.errormm.Error> getErrors();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see it.univaq.mancoosi.errormm.ErrormmPackage#getReport_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.errormm.Report#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Report
