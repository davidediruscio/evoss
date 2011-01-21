/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postrm Modules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostrmModules#getKvers <em>Kvers</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostrmModules()
 * @model
 * @generated
 */
public interface PostrmModules extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Kvers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kvers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kvers</em>' reference.
	 * @see #setKvers(IntParam)
	 * @see mancoosi.MancoosiPackage#getPostrmModules_Kvers()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IntParam getKvers();

	/**
	 * Sets the value of the '{@link mancoosi.PostrmModules#getKvers <em>Kvers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kvers</em>' reference.
	 * @see #getKvers()
	 * @generated
	 */
	void setKvers(IntParam value);

} // PostrmModules
