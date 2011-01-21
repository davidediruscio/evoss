/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerm Wm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PrermWm#getWm <em>Wm</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPrermWm()
 * @model
 * @generated
 */
public interface PrermWm extends DeletionPackageSettingStatement {
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
	 * @see mancoosi.MancoosiPackage#getPrermWm_Wm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StringParam getWm();

	/**
	 * Sets the value of the '{@link mancoosi.PrermWm#getWm <em>Wm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wm</em>' reference.
	 * @see #getWm()
	 * @generated
	 */
	void setWm(StringParam value);

} // PrermWm
