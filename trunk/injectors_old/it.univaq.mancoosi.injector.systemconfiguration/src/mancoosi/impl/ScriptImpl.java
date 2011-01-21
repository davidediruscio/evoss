/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.InputParameter;
import mancoosi.Invariant;
import mancoosi.MancoosiPackage;
import mancoosi.Script;
import mancoosi.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.ScriptImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link mancoosi.impl.ScriptImpl#getPost <em>Post</em>}</li>
 *   <li>{@link mancoosi.impl.ScriptImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link mancoosi.impl.ScriptImpl#getInputParameters <em>Input Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptImpl extends NamedElementImpl implements Script {
	/**
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected Invariant pre;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected Invariant post;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList statements;

	/**
	 * The cached value of the '{@link #getInputParameters() <em>Input Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameters()
	 * @generated
	 * @ordered
	 */
	protected EList inputParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getScript();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariant getPre() {
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPre(Invariant newPre, NotificationChain msgs) {
		Invariant oldPre = pre;
		pre = newPre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.SCRIPT__PRE, oldPre, newPre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPre(Invariant newPre) {
		if (newPre != pre) {
			NotificationChain msgs = null;
			if (pre != null)
				msgs = ((InternalEObject)pre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.SCRIPT__PRE, null, msgs);
			if (newPre != null)
				msgs = ((InternalEObject)newPre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.SCRIPT__PRE, null, msgs);
			msgs = basicSetPre(newPre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.SCRIPT__PRE, newPre, newPre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariant getPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPost(Invariant newPost, NotificationChain msgs) {
		Invariant oldPost = post;
		post = newPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.SCRIPT__POST, oldPost, newPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(Invariant newPost) {
		if (newPost != post) {
			NotificationChain msgs = null;
			if (post != null)
				msgs = ((InternalEObject)post).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.SCRIPT__POST, null, msgs);
			if (newPost != null)
				msgs = ((InternalEObject)newPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.SCRIPT__POST, null, msgs);
			msgs = basicSetPost(newPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.SCRIPT__POST, newPost, newPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentWithInverseEList(Statement.class, this, MancoosiPackage.SCRIPT__STATEMENTS, MancoosiPackage.STATEMENT__SCRIPT);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputParameters() {
		if (inputParameters == null) {
			inputParameters = new EObjectContainmentWithInverseEList(InputParameter.class, this, MancoosiPackage.SCRIPT__INPUT_PARAMETERS, MancoosiPackage.INPUT_PARAMETER__SCRIPT);
		}
		return inputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.SCRIPT__STATEMENTS:
				return ((InternalEList)getStatements()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.SCRIPT__INPUT_PARAMETERS:
				return ((InternalEList)getInputParameters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.SCRIPT__PRE:
				return basicSetPre(null, msgs);
			case MancoosiPackage.SCRIPT__POST:
				return basicSetPost(null, msgs);
			case MancoosiPackage.SCRIPT__STATEMENTS:
				return ((InternalEList)getStatements()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.SCRIPT__INPUT_PARAMETERS:
				return ((InternalEList)getInputParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.SCRIPT__PRE:
				return getPre();
			case MancoosiPackage.SCRIPT__POST:
				return getPost();
			case MancoosiPackage.SCRIPT__STATEMENTS:
				return getStatements();
			case MancoosiPackage.SCRIPT__INPUT_PARAMETERS:
				return getInputParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.SCRIPT__PRE:
				setPre((Invariant)newValue);
				return;
			case MancoosiPackage.SCRIPT__POST:
				setPost((Invariant)newValue);
				return;
			case MancoosiPackage.SCRIPT__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection)newValue);
				return;
			case MancoosiPackage.SCRIPT__INPUT_PARAMETERS:
				getInputParameters().clear();
				getInputParameters().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case MancoosiPackage.SCRIPT__PRE:
				setPre((Invariant)null);
				return;
			case MancoosiPackage.SCRIPT__POST:
				setPost((Invariant)null);
				return;
			case MancoosiPackage.SCRIPT__STATEMENTS:
				getStatements().clear();
				return;
			case MancoosiPackage.SCRIPT__INPUT_PARAMETERS:
				getInputParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MancoosiPackage.SCRIPT__PRE:
				return pre != null;
			case MancoosiPackage.SCRIPT__POST:
				return post != null;
			case MancoosiPackage.SCRIPT__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case MancoosiPackage.SCRIPT__INPUT_PARAMETERS:
				return inputParameters != null && !inputParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScriptImpl
