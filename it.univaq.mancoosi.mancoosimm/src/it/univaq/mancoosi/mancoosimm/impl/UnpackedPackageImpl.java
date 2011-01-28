/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.PriorityType;
import it.univaq.mancoosi.mancoosimm.UnpackedPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unpacked Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.UnpackedPackageImpl#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.UnpackedPackageImpl#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.UnpackedPackageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.UnpackedPackageImpl#getSection <em>Section</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.UnpackedPackageImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.UnpackedPackageImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.UnpackedPackageImpl#getUploaders <em>Uploaders</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.UnpackedPackageImpl#getFiles <em>Files</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnpackedPackageImpl extends PackageImpl implements UnpackedPackage {
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
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnpackedPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.UNPACKED_PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.UNPACKED_PACKAGE__MAINTAINER, oldMaintainer, maintainer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.UNPACKED_PACKAGE__CHECK_SUM, oldCheckSum, checkSum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.UNPACKED_PACKAGE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.UNPACKED_PACKAGE__SECTION, oldSection, section));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.UNPACKED_PACKAGE__TAG, oldTag, tag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.UNPACKED_PACKAGE__PRIORITY, oldPriority, priority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.UNPACKED_PACKAGE__UPLOADERS, oldUploaders, uploaders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectResolvingEList<File>(File.class, this, MancoosiPackage.UNPACKED_PACKAGE__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.UNPACKED_PACKAGE__MAINTAINER:
				return getMaintainer();
			case MancoosiPackage.UNPACKED_PACKAGE__CHECK_SUM:
				return getCheckSum();
			case MancoosiPackage.UNPACKED_PACKAGE__DESCRIPTION:
				return getDescription();
			case MancoosiPackage.UNPACKED_PACKAGE__SECTION:
				return getSection();
			case MancoosiPackage.UNPACKED_PACKAGE__TAG:
				return getTag();
			case MancoosiPackage.UNPACKED_PACKAGE__PRIORITY:
				return getPriority();
			case MancoosiPackage.UNPACKED_PACKAGE__UPLOADERS:
				return getUploaders();
			case MancoosiPackage.UNPACKED_PACKAGE__FILES:
				return getFiles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.UNPACKED_PACKAGE__MAINTAINER:
				setMaintainer((String)newValue);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__CHECK_SUM:
				setCheckSum((String)newValue);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__SECTION:
				setSection((String)newValue);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__TAG:
				setTag((String)newValue);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__PRIORITY:
				setPriority((PriorityType)newValue);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__UPLOADERS:
				setUploaders((String)newValue);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
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
			case MancoosiPackage.UNPACKED_PACKAGE__MAINTAINER:
				setMaintainer(MAINTAINER_EDEFAULT);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__CHECK_SUM:
				setCheckSum(CHECK_SUM_EDEFAULT);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__SECTION:
				setSection(SECTION_EDEFAULT);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__UPLOADERS:
				setUploaders(UPLOADERS_EDEFAULT);
				return;
			case MancoosiPackage.UNPACKED_PACKAGE__FILES:
				getFiles().clear();
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
			case MancoosiPackage.UNPACKED_PACKAGE__MAINTAINER:
				return MAINTAINER_EDEFAULT == null ? maintainer != null : !MAINTAINER_EDEFAULT.equals(maintainer);
			case MancoosiPackage.UNPACKED_PACKAGE__CHECK_SUM:
				return CHECK_SUM_EDEFAULT == null ? checkSum != null : !CHECK_SUM_EDEFAULT.equals(checkSum);
			case MancoosiPackage.UNPACKED_PACKAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MancoosiPackage.UNPACKED_PACKAGE__SECTION:
				return SECTION_EDEFAULT == null ? section != null : !SECTION_EDEFAULT.equals(section);
			case MancoosiPackage.UNPACKED_PACKAGE__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case MancoosiPackage.UNPACKED_PACKAGE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case MancoosiPackage.UNPACKED_PACKAGE__UPLOADERS:
				return UPLOADERS_EDEFAULT == null ? uploaders != null : !UPLOADERS_EDEFAULT.equals(uploaders);
			case MancoosiPackage.UNPACKED_PACKAGE__FILES:
				return files != null && !files.isEmpty();
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

} //UnpackedPackageImpl
