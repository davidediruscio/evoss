/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postrm Icons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostrmIcons#getDirs <em>Dirs</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostrmIcons()
 * @model
 * @generated
 */
public interface PostrmIcons extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Dirs</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dirs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dirs</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getPostrmIcons_Dirs()
	 * @model type="mancoosi.File" required="true" ordered="false"
	 * @generated
	 */
	EList getDirs();

} // PostrmIcons
