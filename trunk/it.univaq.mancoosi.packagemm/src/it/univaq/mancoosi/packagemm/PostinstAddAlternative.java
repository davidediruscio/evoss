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
 * A representation of the model object '<em><b>Postinst Add Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstAddAlternative#getMaster <em>Master</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstAddAlternative#getSlave <em>Slave</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstAddAlternative()
 * @model
 * @generated
 */
public interface PostinstAddAlternative extends AdditionEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Master</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master</em>' containment reference.
	 * @see #setMaster(AddAlternative)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstAddAlternative_Master()
	 * @model containment="true"
	 * @generated
	 */
	AddAlternative getMaster();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstAddAlternative#getMaster <em>Master</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master</em>' containment reference.
	 * @see #getMaster()
	 * @generated
	 */
	void setMaster(AddAlternative value);

	/**
	 * Returns the value of the '<em><b>Slave</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.AddAlternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slave</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slave</em>' containment reference list.
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstAddAlternative_Slave()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<AddAlternative> getSlave();

} // PostinstAddAlternative
