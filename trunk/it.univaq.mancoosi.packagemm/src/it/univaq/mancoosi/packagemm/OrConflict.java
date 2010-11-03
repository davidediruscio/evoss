/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.OrConflict#getOps <em>Ops</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.OrConflict#getConflict <em>Conflict</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getOrConflict()
 * @model
 * @generated
 */
public interface OrConflict extends Conflict {
	/**
	 * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.Conflict}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ops</em>' containment reference list.
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getOrConflict_Ops()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Conflict> getOps();

	/**
	 * Returns the value of the '<em><b>Conflict</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.Conflict#getOrConflict <em>Or Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflict</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict</em>' container reference.
	 * @see #setConflict(Conflict)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getOrConflict_Conflict()
	 * @see it.univaq.mancoosi.packagemm.Conflict#getOrConflict
	 * @model opposite="orConflict" required="true" transient="false"
	 * @generated
	 */
	Conflict getConflict();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.OrConflict#getConflict <em>Conflict</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict</em>' container reference.
	 * @see #getConflict()
	 * @generated
	 */
	void setConflict(Conflict value);

} // OrConflict
