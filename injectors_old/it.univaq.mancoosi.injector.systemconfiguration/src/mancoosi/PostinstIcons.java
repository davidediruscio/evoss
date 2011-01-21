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
 * A representation of the model object '<em><b>Postinst Icons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostinstIcons#getDirectories <em>Directories</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostinstIcons()
 * @model
 * @generated
 */
public interface PostinstIcons extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Directories</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directories</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getPostinstIcons_Directories()
	 * @model type="mancoosi.File" required="true" ordered="false"
	 * @generated
	 */
	EList getDirectories();

} // PostinstIcons
