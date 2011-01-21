/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preinst Udev</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PreinstUdev#getOld <em>Old</em>}</li>
 *   <li>{@link mancoosi.PreinstUdev#getRule <em>Rule</em>}</li>
 *   <li>{@link mancoosi.PreinstUdev#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPreinstUdev()
 * @model
 * @generated
 */
public interface PreinstUdev extends DeletionFileSystemStatement {
	/**
	 * Returns the value of the '<em><b>Old</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old</em>' reference.
	 * @see #setOld(File)
	 * @see mancoosi.MancoosiPackage#getPreinstUdev_Old()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getOld();

	/**
	 * Sets the value of the '{@link mancoosi.PreinstUdev#getOld <em>Old</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old</em>' reference.
	 * @see #getOld()
	 * @generated
	 */
	void setOld(File value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(File)
	 * @see mancoosi.MancoosiPackage#getPreinstUdev_Rule()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getRule();

	/**
	 * Sets the value of the '{@link mancoosi.PreinstUdev#getRule <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(File value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(InstalledPackage)
	 * @see mancoosi.MancoosiPackage#getPreinstUdev_Package()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InstalledPackage getPackage();

	/**
	 * Sets the value of the '{@link mancoosi.PreinstUdev#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(InstalledPackage value);

} // PreinstUdev
