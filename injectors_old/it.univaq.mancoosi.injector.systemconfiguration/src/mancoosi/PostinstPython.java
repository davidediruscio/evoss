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
 * A representation of the model object '<em><b>Postinst Python</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostinstPython#getPyver <em>Pyver</em>}</li>
 *   <li>{@link mancoosi.PostinstPython#getDirlist <em>Dirlist</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostinstPython()
 * @model
 * @generated
 */
public interface PostinstPython extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Pyver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pyver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pyver</em>' reference.
	 * @see #setPyver(IntParam)
	 * @see mancoosi.MancoosiPackage#getPostinstPython_Pyver()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IntParam getPyver();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstPython#getPyver <em>Pyver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pyver</em>' reference.
	 * @see #getPyver()
	 * @generated
	 */
	void setPyver(IntParam value);

	/**
	 * Returns the value of the '<em><b>Dirlist</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dirlist</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dirlist</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getPostinstPython_Dirlist()
	 * @model type="mancoosi.File" required="true" ordered="false"
	 * @generated
	 */
	EList getDirlist();

} // PostinstPython
