/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postrm Sgmlcatalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostrmSgmlcatalog#getCentralcat <em>Centralcat</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostrmSgmlcatalog()
 * @model
 * @generated
 */
public interface PostrmSgmlcatalog extends UpdateFileSytemStatement {
	/**
	 * Returns the value of the '<em><b>Centralcat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centralcat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centralcat</em>' reference.
	 * @see #setCentralcat(File)
	 * @see mancoosi.MancoosiPackage#getPostrmSgmlcatalog_Centralcat()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getCentralcat();

	/**
	 * Sets the value of the '{@link mancoosi.PostrmSgmlcatalog#getCentralcat <em>Centralcat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centralcat</em>' reference.
	 * @see #getCentralcat()
	 * @generated
	 */
	void setCentralcat(File value);

} // PostrmSgmlcatalog
