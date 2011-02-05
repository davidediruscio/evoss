/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.BinPackage#getSrcRef <em>Src Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getBinPackage()
 * @model
 * @generated
 */
public interface BinPackage extends InstalledPackage {
	/**
	 * Returns the value of the '<em><b>Src Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Ref</em>' reference.
	 * @see #setSrcRef(SrcPackage)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getBinPackage_SrcRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SrcPackage getSrcRef();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.BinPackage#getSrcRef <em>Src Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Ref</em>' reference.
	 * @see #getSrcRef()
	 * @generated
	 */
	void setSrcRef(SrcPackage value);

} // BinPackage