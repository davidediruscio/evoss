/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Wm Noman</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostinstWmNoman#getWm <em>Wm</em>}</li>
 *   <li>{@link mancoosi.PostinstWmNoman#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostinstWmNoman()
 * @model
 * @generated
 */
public interface PostinstWmNoman extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Wm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wm</em>' reference.
	 * @see #setWm(StringParam)
	 * @see mancoosi.MancoosiPackage#getPostinstWmNoman_Wm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StringParam getWm();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstWmNoman#getWm <em>Wm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wm</em>' reference.
	 * @see #getWm()
	 * @generated
	 */
	void setWm(StringParam value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' reference.
	 * @see #setPriority(StringParam)
	 * @see mancoosi.MancoosiPackage#getPostinstWmNoman_Priority()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StringParam getPriority();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstWmNoman#getPriority <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(StringParam value);

} // PostinstWmNoman
