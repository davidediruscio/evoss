/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Schema#getGconf <em>Gconf</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends File {
	/**
	 * Returns the value of the '<em><b>Gconf</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.GConf#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gconf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gconf</em>' container reference.
	 * @see #setGconf(GConf)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getSchema_Gconf()
	 * @see it.univaq.mancoosi.mancoosimm.GConf#getSchemas
	 * @model opposite="schemas" required="true" transient="false"
	 * @generated
	 */
	GConf getGconf();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Schema#getGconf <em>Gconf</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gconf</em>' container reference.
	 * @see #getGconf()
	 * @generated
	 */
	void setGconf(GConf value);

} // Schema
