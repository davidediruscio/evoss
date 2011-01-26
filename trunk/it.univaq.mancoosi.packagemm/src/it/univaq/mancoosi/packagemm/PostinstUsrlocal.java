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
 * A representation of the model object '<em><b>Postinst Usrlocal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstUsrlocal#getDirlist <em>Dirlist</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstUsrlocal()
 * @model
 * @generated
 */
public interface PostinstUsrlocal extends UpdateFileSystemStatement {
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
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstUsrlocal_Dirlist()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<File> getDirlist();

} // PostinstUsrlocal
