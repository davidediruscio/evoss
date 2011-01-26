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
 * A representation of the model object '<em><b>Postinst Python</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstPython#getPyver <em>Pyver</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstPython#getDirlist <em>Dirlist</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstPython()
 * @model
 * @generated
 */
public interface PostinstPython extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Pyver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pyver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pyver</em>' containment reference.
	 * @see #setPyver(IntParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstPython_Pyver()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	IntParam getPyver();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstPython#getPyver <em>Pyver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pyver</em>' containment reference.
	 * @see #getPyver()
	 * @generated
	 */
	void setPyver(IntParam value);

	/**
	 * Returns the value of the '<em><b>Dirlist</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dirlist</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dirlist</em>' containment reference list.
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstPython_Dirlist()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<File> getDirlist();

} // PostinstPython
