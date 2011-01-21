/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerm Doc Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PrermDocBase#getDoc <em>Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPrermDocBase()
 * @model
 * @generated
 */
public interface PrermDocBase extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' reference.
	 * @see #setDoc(File)
	 * @see mancoosi.MancoosiPackage#getPrermDocBase_Doc()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getDoc();

	/**
	 * Sets the value of the '{@link mancoosi.PrermDocBase#getDoc <em>Doc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' reference.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(File value);

} // PrermDocBase
