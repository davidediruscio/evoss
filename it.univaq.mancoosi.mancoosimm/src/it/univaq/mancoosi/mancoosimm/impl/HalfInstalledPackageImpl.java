/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.HalfInstalledPackage;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.PriorityType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Half Installed Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.HalfInstalledPackageImpl#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.HalfInstalledPackageImpl#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.HalfInstalledPackageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.HalfInstalledPackageImpl#getSection <em>Section</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.HalfInstalledPackageImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.HalfInstalledPackageImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.HalfInstalledPackageImpl#getUploaders <em>Uploaders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HalfInstalledPackageImpl extends PackageImpl implements HalfInstalledPackage {
	/**
	 * The default value of the '{@link #getMaintainer() <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainer()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintainer() <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainer()
	 * @generated
	 * @ordered
	 */
	protected String maintainer = MAINTAINER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_SUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected String checkSum = CHECK_SUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected String section = SECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final PriorityType PRIORITY_EDEFAULT = PriorityType.STANDARD;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected PriorityType priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUploaders() <em>Uploaders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploaders()
	 * @generated
	 * @ordered
	 */
	protected static final String UPLOADERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUploaders() <em>Uploaders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploaders()
	 * @generated
	 * @ordered
	 */
	protected String uploaders = UPLOADERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HalfInstalledPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.HALF_INSTALLED_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaintainer() {
		return maintainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintainer(String newMaintainer) {
		String oldMaintainer = maintainer;
		maintainer = newMaintainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.HALF_INSTALLED_PACKAGE__MAINTAINER, oldMaintainer, maintainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckSum() {
		return checkSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckSum(String newCheckSum) {
		String oldCheckSum = checkSum;
		checkSum = newCheckSum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.HALF_INSTALLED_PACKAGE__CHECK_SUM, oldCheckSum, checkSum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.HALF_INSTALLED_PACKAGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSection() {
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(String newSection) {
		String oldSection = section;
		section = newSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.HALF_INSTALLED_PACKAGE__SECTION, oldSection, section));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.HALF_INSTALLED_PACKAGE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityType getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(PriorityType newPriority) {
		PriorityType oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.HALF_INSTALLED_PACKAGE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUploaders() {
		return uploaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUploaders(String newUploaders) {
		String oldUploaders = uploaders;
		uploaders = newUploaders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.HALF_INSTALLED_PACKAGE__UPLOADERS, oldUploaders, uploaders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__MAINTAINER:
				return getMaintainer();
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__CHECK_SUM:
				return getCheckSum();
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__DESCRIPTION:
				return getDescription();
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__SECTION:
				return getSection();
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__TAG:
				return getTag();
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__PRIORITY:
				return getPriority();
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__UPLOADERS:
				return getUploaders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__MAINTAINER:
				setMaintainer((String)newValue);
				return;
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__CHECK_SUM:
				setCheckSum((String)newValue);
				return;
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__SECTION:
				setSection((String)newValue);
				return;
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__TAG:
				setTag((String)newValue);
				return;
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__PRIORITY:
				setPriority((PriorityType)newValue);
				return;
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__UPLOADERS:
				setUploaders((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__MAINTAINER:
				setMaintainer(MAINTAINER_EDEFAULT);
				return;
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__CHECK_SUM:
				setCheckSum(CHECK_SUM_EDEFAULT);
				return;
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__SECTION:
				setSection(SECTION_EDEFAULT);
				return;
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__UPLOADERS:
				setUploaders(UPLOADERS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__MAINTAINER:
				return MAINTAINER_EDEFAULT == null ? maintainer != null : !MAINTAINER_EDEFAULT.equals(maintainer);
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__CHECK_SUM:
				return CHECK_SUM_EDEFAULT == null ? checkSum != null : !CHECK_SUM_EDEFAULT.equals(checkSum);
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__SECTION:
				return SECTION_EDEFAULT == null ? section != null : !SECTION_EDEFAULT.equals(section);
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case MancoosiPackage.HALF_INSTALLED_PACKAGE__UPLOADERS:
				return UPLOADERS_EDEFAULT == null ? uploaders != null : !UPLOADERS_EDEFAULT.equals(uploaders);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maintainer: ");
		result.append(maintainer);
		result.append(", checkSum: ");
		result.append(checkSum);
		result.append(", description: ");
		result.append(description);
		result.append(", section: ");
		result.append(section);
		result.append(", tag: ");
		result.append(tag);
		result.append(", priority: ");
		result.append(priority);
		result.append(", uploaders: ");
		result.append(uploaders);
		result.append(')');
		return result.toString();
	}

} //HalfInstalledPackageImpl
