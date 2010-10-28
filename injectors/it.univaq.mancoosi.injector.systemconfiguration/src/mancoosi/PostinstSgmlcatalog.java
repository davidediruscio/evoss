/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Sgmlcatalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostinstSgmlcatalog#getCentralcat <em>Centralcat</em>}</li>
 *   <li>{@link mancoosi.PostinstSgmlcatalog#getOrdcats <em>Ordcats</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostinstSgmlcatalog()
 * @model
 * @generated
 */
public interface PostinstSgmlcatalog extends UpdateEnvironmentStatement {
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
	 * @see mancoosi.MancoosiPackage#getPostinstSgmlcatalog_Centralcat()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getCentralcat();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstSgmlcatalog#getCentralcat <em>Centralcat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centralcat</em>' reference.
	 * @see #getCentralcat()
	 * @generated
	 */
	void setCentralcat(File value);

	/**
	 * Returns the value of the '<em><b>Ordcats</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordcats</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordcats</em>' reference.
	 * @see #setOrdcats(File)
	 * @see mancoosi.MancoosiPackage#getPostinstSgmlcatalog_Ordcats()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getOrdcats();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstSgmlcatalog#getOrdcats <em>Ordcats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordcats</em>' reference.
	 * @see #getOrdcats()
	 * @generated
	 */
	void setOrdcats(File value);

} // PostinstSgmlcatalog
