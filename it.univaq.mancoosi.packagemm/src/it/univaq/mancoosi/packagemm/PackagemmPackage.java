/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.univaq.mancoosi.packagemm.PackagemmFactory
 * @model kind="package"
 * @generated
 */
public interface PackagemmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "packagemm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "packagemm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "packagemm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackagemmPackage eINSTANCE = it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.NamedElementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PackageImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Installed Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__INSTALLED_SIZE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MAINTAINER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ARCHITECTURE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FILE_SIZE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CHECK_SUM = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SECTION = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TAG = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PRIORITY = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Uploaders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__UPLOADERS = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Recommends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__RECOMMENDS = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Suggests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUGGESTS = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Enhances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ENHANCES = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Predepends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PREDEPENDS = NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Replaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REPLACES = NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FILES = NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Documentation Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOCUMENTATION_FILES = NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Preinst Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PREINST_SCRIPT = NAMED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Postinst Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__POSTINST_SCRIPT = NAMED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Prerm Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PRERM_SCRIPT = NAMED_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Postrm Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__POSTRM_SCRIPT = NAMED_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Config Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONFIG_SCRIPT = NAMED_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONFLICT = NAMED_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DEPENDS = NAMED_ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Conffiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONFFILES = NAMED_ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 27;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.ScriptImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__STATEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__INPUT_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.InputParameterImpl <em>Input Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.InputParameterImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getInputParameter()
	 * @generated
	 */
	int INPUT_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__SCRIPT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.DependenceImpl <em>Dependence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.DependenceImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getDependence()
	 * @generated
	 */
	int DEPENDENCE = 4;

	/**
	 * The feature id for the '<em><b>And Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__AND_DEP = 0;

	/**
	 * The feature id for the '<em><b>Or Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__OR_DEP = 1;

	/**
	 * The feature id for the '<em><b>Single Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__SINGLE_DEP = 2;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE__PKG = 3;

	/**
	 * The number of structural features of the '<em>Dependence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.AndDepImpl <em>And Dep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.AndDepImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getAndDep()
	 * @generated
	 */
	int AND_DEP = 5;

	/**
	 * The feature id for the '<em><b>And Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP__AND_DEP = DEPENDENCE__AND_DEP;

	/**
	 * The feature id for the '<em><b>Or Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP__OR_DEP = DEPENDENCE__OR_DEP;

	/**
	 * The feature id for the '<em><b>Single Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP__SINGLE_DEP = DEPENDENCE__SINGLE_DEP;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP__PKG = DEPENDENCE__PKG;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP__OPS = DEPENDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependence</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP__DEPENDENCE = DEPENDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Dep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DEP_FEATURE_COUNT = DEPENDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.OrDepImpl <em>Or Dep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.OrDepImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getOrDep()
	 * @generated
	 */
	int OR_DEP = 6;

	/**
	 * The feature id for the '<em><b>And Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP__AND_DEP = DEPENDENCE__AND_DEP;

	/**
	 * The feature id for the '<em><b>Or Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP__OR_DEP = DEPENDENCE__OR_DEP;

	/**
	 * The feature id for the '<em><b>Single Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP__SINGLE_DEP = DEPENDENCE__SINGLE_DEP;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP__PKG = DEPENDENCE__PKG;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP__OPS = DEPENDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependence</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP__DEPENDENCE = DEPENDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or Dep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DEP_FEATURE_COUNT = DEPENDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.SingleDepImpl <em>Single Dep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.SingleDepImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getSingleDep()
	 * @generated
	 */
	int SINGLE_DEP = 7;

	/**
	 * The feature id for the '<em><b>And Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__AND_DEP = DEPENDENCE__AND_DEP;

	/**
	 * The feature id for the '<em><b>Or Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__OR_DEP = DEPENDENCE__OR_DEP;

	/**
	 * The feature id for the '<em><b>Single Dep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__SINGLE_DEP = DEPENDENCE__SINGLE_DEP;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__PKG = DEPENDENCE__PKG;

	/**
	 * The feature id for the '<em><b>Dependence</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__DEPENDENCE = DEPENDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__VERSION = DEPENDENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP__VALUE = DEPENDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Single Dep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DEP_FEATURE_COUNT = DEPENDENCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PreinstScriptImpl <em>Preinst Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PreinstScriptImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPreinstScript()
	 * @generated
	 */
	int PREINST_SCRIPT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_SCRIPT__NAME = SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_SCRIPT__STATEMENTS = SCRIPT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_SCRIPT__INPUT_PARAMETERS = SCRIPT__INPUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_SCRIPT__PKG = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Preinst Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_SCRIPT_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstScriptImpl <em>Postinst Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstScriptImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstScript()
	 * @generated
	 */
	int POSTINST_SCRIPT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCRIPT__NAME = SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCRIPT__STATEMENTS = SCRIPT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCRIPT__INPUT_PARAMETERS = SCRIPT__INPUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCRIPT__PKG = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCRIPT_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PrermScriptImpl <em>Prerm Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PrermScriptImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPrermScript()
	 * @generated
	 */
	int PRERM_SCRIPT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SCRIPT__NAME = SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SCRIPT__STATEMENTS = SCRIPT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SCRIPT__INPUT_PARAMETERS = SCRIPT__INPUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SCRIPT__PKG = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerm Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SCRIPT_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmScriptImpl <em>Postrm Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmScriptImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmScript()
	 * @generated
	 */
	int POSTRM_SCRIPT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCRIPT__NAME = SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCRIPT__STATEMENTS = SCRIPT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCRIPT__INPUT_PARAMETERS = SCRIPT__INPUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCRIPT__PKG = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postrm Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCRIPT_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.ConfigScriptImpl <em>Config Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.ConfigScriptImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getConfigScript()
	 * @generated
	 */
	int CONFIG_SCRIPT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SCRIPT__NAME = SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SCRIPT__STATEMENTS = SCRIPT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SCRIPT__INPUT_PARAMETERS = SCRIPT__INPUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SCRIPT__PKG = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Config Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_SCRIPT_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.StatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__SCRIPT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__IS_START = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__PREVIOUS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__NEXT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.ControlStatementImpl <em>Control Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.ControlStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getControlStatement()
	 * @generated
	 */
	int CONTROL_STATEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__SCRIPT = STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__IS_START = STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>Control Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.CaseImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__NAME = CONTROL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__SCRIPT = CONTROL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__IS_START = CONTROL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__PREVIOUS = CONTROL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__NEXT = CONTROL_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__SELECTOR = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__DEFAULT = CONTROL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.ConditionImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ACTION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.DefaultCaseConditionImpl <em>Default Case Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.DefaultCaseConditionImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getDefaultCaseCondition()
	 * @generated
	 */
	int DEFAULT_CASE_CONDITION = 17;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CASE_CONDITION__ACTION = CONDITION__ACTION;

	/**
	 * The number of structural features of the '<em>Default Case Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CASE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.CasePrermImpl <em>Case Prerm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.CasePrermImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCasePrerm()
	 * @generated
	 */
	int CASE_PRERM = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__NAME = CASE__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__SCRIPT = CASE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__IS_START = CASE__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__PREVIOUS = CASE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__NEXT = CASE__NEXT;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__SELECTOR = CASE__SELECTOR;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__DEFAULT = CASE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM__CONDITIONS = CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Prerm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM_FEATURE_COUNT = CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.CasePrermConditionImpl <em>Case Prerm Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.CasePrermConditionImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCasePrermCondition()
	 * @generated
	 */
	int CASE_PRERM_CONDITION = 19;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM_CONDITION__ACTION = CONDITION__ACTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Prerm Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PRERM_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.CasePostrmImpl <em>Case Postrm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.CasePostrmImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCasePostrm()
	 * @generated
	 */
	int CASE_POSTRM = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__NAME = CASE__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__SCRIPT = CASE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__IS_START = CASE__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__PREVIOUS = CASE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__NEXT = CASE__NEXT;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__SELECTOR = CASE__SELECTOR;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__DEFAULT = CASE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM__CONDITIONS = CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Postrm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM_FEATURE_COUNT = CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.CasePostrmConditionImpl <em>Case Postrm Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.CasePostrmConditionImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCasePostrmCondition()
	 * @generated
	 */
	int CASE_POSTRM_CONDITION = 21;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM_CONDITION__ACTION = CONDITION__ACTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Postrm Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTRM_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.CasePreinstImpl <em>Case Preinst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.CasePreinstImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCasePreinst()
	 * @generated
	 */
	int CASE_PREINST = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__NAME = CASE__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__SCRIPT = CASE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__IS_START = CASE__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__PREVIOUS = CASE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__NEXT = CASE__NEXT;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__SELECTOR = CASE__SELECTOR;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__DEFAULT = CASE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST__CONDITIONS = CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Preinst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST_FEATURE_COUNT = CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.CasePreinstConditionImpl <em>Case Preinst Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.CasePreinstConditionImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCasePreinstCondition()
	 * @generated
	 */
	int CASE_PREINST_CONDITION = 23;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST_CONDITION__ACTION = CONDITION__ACTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Preinst Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PREINST_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.CasePostinstImpl <em>Case Postinst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.CasePostinstImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCasePostinst()
	 * @generated
	 */
	int CASE_POSTINST = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__NAME = CASE__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__SCRIPT = CASE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__IS_START = CASE__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__PREVIOUS = CASE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__NEXT = CASE__NEXT;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__SELECTOR = CASE__SELECTOR;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__DEFAULT = CASE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST__CONDITIONS = CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Postinst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST_FEATURE_COUNT = CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.CasePostinstConditionImpl <em>Case Postinst Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.CasePostinstConditionImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCasePostinstCondition()
	 * @generated
	 */
	int CASE_POSTINST_CONDITION = 25;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST_CONDITION__ACTION = CONDITION__ACTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Postinst Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_POSTINST_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.BasicCaseImpl <em>Basic Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.BasicCaseImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getBasicCase()
	 * @generated
	 */
	int BASIC_CASE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE__NAME = CONTROL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE__SCRIPT = CONTROL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE__IS_START = CONTROL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE__PREVIOUS = CONTROL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE__NEXT = CONTROL_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE__CONDITIONS = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.BasicCaseConditionImpl <em>Basic Case Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.BasicCaseConditionImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getBasicCaseCondition()
	 * @generated
	 */
	int BASIC_CASE_CONDITION = 27;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE_CONDITION__ACTION = CONDITION__ACTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Case Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CASE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.IfImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getIf()
	 * @generated
	 */
	int IF = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NAME = CONTROL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SCRIPT = CONTROL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IS_START = CONTROL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__PREVIOUS = CONTROL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NEXT = CONTROL_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN = CONTROL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = CONTROL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.BooleanExpressionImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__NOT = 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FileExistsBooleanImpl <em>File Exists Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FileExistsBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFileExistsBoolean()
	 * @generated
	 */
	int FILE_EXISTS_BOOLEAN = 30;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXISTS_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXISTS_BOOLEAN__FILE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Exists Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXISTS_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.RegularFileBooleanImpl <em>Regular File Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.RegularFileBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getRegularFileBoolean()
	 * @generated
	 */
	int REGULAR_FILE_BOOLEAN = 31;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_FILE_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_FILE_BOOLEAN__FILE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regular File Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_FILE_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FileNotZeroSizeBooleanImpl <em>File Not Zero Size Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FileNotZeroSizeBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFileNotZeroSizeBoolean()
	 * @generated
	 */
	int FILE_NOT_ZERO_SIZE_BOOLEAN = 32;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_ZERO_SIZE_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_ZERO_SIZE_BOOLEAN__FILE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Not Zero Size Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NOT_ZERO_SIZE_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.IsDirectoryBooleanImpl <em>Is Directory Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.IsDirectoryBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getIsDirectoryBoolean()
	 * @generated
	 */
	int IS_DIRECTORY_BOOLEAN = 33;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DIRECTORY_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DIRECTORY_BOOLEAN__FILE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Directory Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DIRECTORY_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FileBlockDeviceBooleanImpl <em>File Block Device Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FileBlockDeviceBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFileBlockDeviceBoolean()
	 * @generated
	 */
	int FILE_BLOCK_DEVICE_BOOLEAN = 34;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_BLOCK_DEVICE_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_BLOCK_DEVICE_BOOLEAN__FILE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Block Device Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_BLOCK_DEVICE_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FileCharacterDeviceBooleanImpl <em>File Character Device Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FileCharacterDeviceBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFileCharacterDeviceBoolean()
	 * @generated
	 */
	int FILE_CHARACTER_DEVICE_BOOLEAN = 35;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHARACTER_DEVICE_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHARACTER_DEVICE_BOOLEAN__FILE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Character Device Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CHARACTER_DEVICE_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FilePipeBooleanImpl <em>File Pipe Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FilePipeBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFilePipeBoolean()
	 * @generated
	 */
	int FILE_PIPE_BOOLEAN = 36;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PIPE_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PIPE_BOOLEAN__FILE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Pipe Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PIPE_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FileSymbolicLinkBooleanImpl <em>File Symbolic Link Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FileSymbolicLinkBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFileSymbolicLinkBoolean()
	 * @generated
	 */
	int FILE_SYMBOLIC_LINK_BOOLEAN = 37;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYMBOLIC_LINK_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYMBOLIC_LINK_BOOLEAN__FILE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Symbolic Link Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYMBOLIC_LINK_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FileSocketBooleanImpl <em>File Socket Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FileSocketBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFileSocketBoolean()
	 * @generated
	 */
	int FILE_SOCKET_BOOLEAN = 38;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SOCKET_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SOCKET_BOOLEAN__FILE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Socket Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SOCKET_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FileTerminalDeviceBooleanImpl <em>File Terminal Device Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FileTerminalDeviceBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFileTerminalDeviceBoolean()
	 * @generated
	 */
	int FILE_TERMINAL_DEVICE_BOOLEAN = 39;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TERMINAL_DEVICE_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TERMINAL_DEVICE_BOOLEAN__FILE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Terminal Device Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TERMINAL_DEVICE_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FileReadPermissionBooleanImpl <em>File Read Permission Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FileReadPermissionBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFileReadPermissionBoolean()
	 * @generated
	 */
	int FILE_READ_PERMISSION_BOOLEAN = 40;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READ_PERMISSION_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READ_PERMISSION_BOOLEAN__FILE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Read Permission Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READ_PERMISSION_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FileWritePermissionBooleanImpl <em>File Write Permission Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FileWritePermissionBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFileWritePermissionBoolean()
	 * @generated
	 */
	int FILE_WRITE_PERMISSION_BOOLEAN = 41;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_WRITE_PERMISSION_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_WRITE_PERMISSION_BOOLEAN__FILE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Write Permission Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_WRITE_PERMISSION_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FileExecutePermissionBooleanImpl <em>File Execute Permission Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FileExecutePermissionBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFileExecutePermissionBoolean()
	 * @generated
	 */
	int FILE_EXECUTE_PERMISSION_BOOLEAN = 42;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXECUTE_PERMISSION_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXECUTE_PERMISSION_BOOLEAN__FILE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Execute Permission Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXECUTE_PERMISSION_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.IntegerEqualBooleanImpl <em>Integer Equal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.IntegerEqualBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getIntegerEqualBoolean()
	 * @generated
	 */
	int INTEGER_EQUAL_BOOLEAN = 43;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EQUAL_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>First Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EQUAL_BOOLEAN__FIRST_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EQUAL_BOOLEAN__SECOND_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Equal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EQUAL_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.IntegerNotEqualBooleanImpl <em>Integer Not Equal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.IntegerNotEqualBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getIntegerNotEqualBoolean()
	 * @generated
	 */
	int INTEGER_NOT_EQUAL_BOOLEAN = 44;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NOT_EQUAL_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>First Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NOT_EQUAL_BOOLEAN__FIRST_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NOT_EQUAL_BOOLEAN__SECOND_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Not Equal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_NOT_EQUAL_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.IntegerGreaterBooleanImpl <em>Integer Greater Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.IntegerGreaterBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getIntegerGreaterBoolean()
	 * @generated
	 */
	int INTEGER_GREATER_BOOLEAN = 45;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GREATER_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>First Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GREATER_BOOLEAN__FIRST_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GREATER_BOOLEAN__SECOND_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Greater Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GREATER_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.IntegerGreaterEqualBooleanImpl <em>Integer Greater Equal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.IntegerGreaterEqualBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getIntegerGreaterEqualBoolean()
	 * @generated
	 */
	int INTEGER_GREATER_EQUAL_BOOLEAN = 46;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GREATER_EQUAL_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>First Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GREATER_EQUAL_BOOLEAN__FIRST_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GREATER_EQUAL_BOOLEAN__SECOND_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Greater Equal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GREATER_EQUAL_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.IntegerLessBooleanImpl <em>Integer Less Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.IntegerLessBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getIntegerLessBoolean()
	 * @generated
	 */
	int INTEGER_LESS_BOOLEAN = 47;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LESS_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>First Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LESS_BOOLEAN__FIRST_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LESS_BOOLEAN__SECOND_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Less Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LESS_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.IntegerLessEqualBooleanImpl <em>Integer Less Equal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.IntegerLessEqualBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getIntegerLessEqualBoolean()
	 * @generated
	 */
	int INTEGER_LESS_EQUAL_BOOLEAN = 48;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LESS_EQUAL_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>First Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LESS_EQUAL_BOOLEAN__FIRST_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LESS_EQUAL_BOOLEAN__SECOND_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Less Equal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LESS_EQUAL_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.StringEqualBooleanImpl <em>String Equal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.StringEqualBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getStringEqualBoolean()
	 * @generated
	 */
	int STRING_EQUAL_BOOLEAN = 49;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EQUAL_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>First Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EQUAL_BOOLEAN__FIRST_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EQUAL_BOOLEAN__SECOND_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Equal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EQUAL_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.StringNotEqualBooleanImpl <em>String Not Equal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.StringNotEqualBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getStringNotEqualBoolean()
	 * @generated
	 */
	int STRING_NOT_EQUAL_BOOLEAN = 50;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NOT_EQUAL_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>First Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NOT_EQUAL_BOOLEAN__FIRST_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NOT_EQUAL_BOOLEAN__SECOND_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Not Equal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NOT_EQUAL_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.StringGreaterBooleanImpl <em>String Greater Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.StringGreaterBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getStringGreaterBoolean()
	 * @generated
	 */
	int STRING_GREATER_BOOLEAN = 51;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GREATER_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>First Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GREATER_BOOLEAN__FIRST_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GREATER_BOOLEAN__SECOND_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Greater Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GREATER_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.StringLessBooleanImpl <em>String Less Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.StringLessBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getStringLessBoolean()
	 * @generated
	 */
	int STRING_LESS_BOOLEAN = 52;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LESS_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>First Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LESS_BOOLEAN__FIRST_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LESS_BOOLEAN__SECOND_OP = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Less Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LESS_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.StrinNotNullBooleanImpl <em>Strin Not Null Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.StrinNotNullBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getStrinNotNullBoolean()
	 * @generated
	 */
	int STRIN_NOT_NULL_BOOLEAN = 53;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIN_NOT_NULL_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIN_NOT_NULL_BOOLEAN__STRING = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strin Not Null Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIN_NOT_NULL_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.StringNullBooleanImpl <em>String Null Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.StringNullBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getStringNullBoolean()
	 * @generated
	 */
	int STRING_NULL_BOOLEAN = 54;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NULL_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NULL_BOOLEAN__STRING = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Null Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_NULL_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.AndBooleanExpressionImpl <em>And Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.AndBooleanExpressionImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getAndBooleanExpression()
	 * @generated
	 */
	int AND_BOOLEAN_EXPRESSION = 55;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_BOOLEAN_EXPRESSION__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_BOOLEAN_EXPRESSION__EXPS = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_BOOLEAN_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.OrBooleanExpressionImpl <em>Or Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.OrBooleanExpressionImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getOrBooleanExpression()
	 * @generated
	 */
	int OR_BOOLEAN_EXPRESSION = 56;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_BOOLEAN_EXPRESSION__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_BOOLEAN_EXPRESSION__EXPS = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_BOOLEAN_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.StatementBooleanImpl <em>Statement Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.StatementBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getStatementBoolean()
	 * @generated
	 */
	int STATEMENT_BOOLEAN = 57;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BOOLEAN__NOT = BOOLEAN_EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BOOLEAN__NAME = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BOOLEAN__SCRIPT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BOOLEAN__IS_START = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BOOLEAN__PREVIOUS = BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BOOLEAN__NEXT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Statement Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BOOLEAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.StatementExistsBooleanImpl <em>Statement Exists Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.StatementExistsBooleanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getStatementExistsBoolean()
	 * @generated
	 */
	int STATEMENT_EXISTS_BOOLEAN = 58;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_EXISTS_BOOLEAN__NOT = STATEMENT_BOOLEAN__NOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_EXISTS_BOOLEAN__NAME = STATEMENT_BOOLEAN__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_EXISTS_BOOLEAN__SCRIPT = STATEMENT_BOOLEAN__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_EXISTS_BOOLEAN__IS_START = STATEMENT_BOOLEAN__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_EXISTS_BOOLEAN__PREVIOUS = STATEMENT_BOOLEAN__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_EXISTS_BOOLEAN__NEXT = STATEMENT_BOOLEAN__NEXT;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_EXISTS_BOOLEAN__STATEMENT = STATEMENT_BOOLEAN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statement Exists Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_EXISTS_BOOLEAN_FEATURE_COUNT = STATEMENT_BOOLEAN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.ReturnImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__NAME = CONTROL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__SCRIPT = CONTROL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__IS_START = CONTROL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__PREVIOUS = CONTROL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__NEXT = CONTROL_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__VALUE = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.IteratorImpl <em>Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.IteratorImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getIterator()
	 * @generated
	 */
	int ITERATOR = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__NAME = CONTROL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__SCRIPT = CONTROL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__IS_START = CONTROL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__PREVIOUS = CONTROL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__NEXT = CONTROL_STATEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_FEATURE_COUNT = CONTROL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.DirectoryIteratorImpl <em>Directory Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.DirectoryIteratorImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getDirectoryIterator()
	 * @generated
	 */
	int DIRECTORY_ITERATOR = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR__NAME = ITERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR__SCRIPT = ITERATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR__IS_START = ITERATOR__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR__PREVIOUS = ITERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR__NEXT = ITERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR__DIRECTORY = ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directory Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_ITERATOR_FEATURE_COUNT = ITERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FileContentIteratorImpl <em>File Content Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FileContentIteratorImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFileContentIterator()
	 * @generated
	 */
	int FILE_CONTENT_ITERATOR = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR__NAME = ITERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR__SCRIPT = ITERATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR__IS_START = ITERATOR__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR__PREVIOUS = ITERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR__NEXT = ITERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR__FILE = ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Content Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_ITERATOR_FEATURE_COUNT = ITERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.InputParameterIteratorImpl <em>Input Parameter Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.InputParameterIteratorImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getInputParameterIterator()
	 * @generated
	 */
	int INPUT_PARAMETER_ITERATOR = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR__NAME = ITERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR__SCRIPT = ITERATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR__IS_START = ITERATOR__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR__PREVIOUS = ITERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR__NEXT = ITERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR__INPUT_PARAMETERS = ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Parameter Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_ITERATOR_FEATURE_COUNT = ITERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.EnumerationIteratorImpl <em>Enumeration Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.EnumerationIteratorImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getEnumerationIterator()
	 * @generated
	 */
	int ENUMERATION_ITERATOR = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR__NAME = ITERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR__SCRIPT = ITERATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR__IS_START = ITERATOR__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR__PREVIOUS = ITERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR__NEXT = ITERATOR__NEXT;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR__ENUMERATION = ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR__STATEMENTS = ITERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITERATOR_FEATURE_COUNT = ITERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.StringIteratorImpl <em>String Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.StringIteratorImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getStringIterator()
	 * @generated
	 */
	int STRING_ITERATOR = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ITERATOR__NAME = ITERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ITERATOR__SCRIPT = ITERATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ITERATOR__IS_START = ITERATOR__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ITERATOR__PREVIOUS = ITERATOR__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ITERATOR__NEXT = ITERATOR__NEXT;

	/**
	 * The number of structural features of the '<em>String Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ITERATOR_FEATURE_COUNT = ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.EnumerationImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 66;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.EnumerationElementImpl <em>Enumeration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.EnumerationElementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getEnumerationElement()
	 * @generated
	 */
	int ENUMERATION_ELEMENT = 67;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enumeration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FileSystemStatementImpl <em>File System Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FileSystemStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFileSystemStatement()
	 * @generated
	 */
	int FILE_SYSTEM_STATEMENT = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT__SCRIPT = STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT__IS_START = STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT__FILES = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File System Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.AdditionFileSystemStatementImpl <em>Addition File System Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.AdditionFileSystemStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getAdditionFileSystemStatement()
	 * @generated
	 */
	int ADDITION_FILE_SYSTEM_STATEMENT = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYSTEM_STATEMENT__NAME = FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYSTEM_STATEMENT__SCRIPT = FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYSTEM_STATEMENT__IS_START = FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYSTEM_STATEMENT__PREVIOUS = FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYSTEM_STATEMENT__NEXT = FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYSTEM_STATEMENT__FILES = FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The number of structural features of the '<em>Addition File System Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT = FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.DeletionFileSystemStatementImpl <em>Deletion File System Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.DeletionFileSystemStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getDeletionFileSystemStatement()
	 * @generated
	 */
	int DELETION_FILE_SYSTEM_STATEMENT = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT__NAME = FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT__SCRIPT = FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT__IS_START = FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT__PREVIOUS = FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT__NEXT = FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT__FILES = FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The number of structural features of the '<em>Deletion File System Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT = FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.UpdateFileSystemStatementImpl <em>Update File System Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.UpdateFileSystemStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getUpdateFileSystemStatement()
	 * @generated
	 */
	int UPDATE_FILE_SYSTEM_STATEMENT = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYSTEM_STATEMENT__NAME = FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYSTEM_STATEMENT__SCRIPT = FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYSTEM_STATEMENT__IS_START = FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYSTEM_STATEMENT__PREVIOUS = FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYSTEM_STATEMENT__NEXT = FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYSTEM_STATEMENT__FILES = FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The number of structural features of the '<em>Update File System Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_SYSTEM_STATEMENT_FEATURE_COUNT = FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.EnvironmentStatementImpl <em>Environment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.EnvironmentStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getEnvironmentStatement()
	 * @generated
	 */
	int ENVIRONMENT_STATEMENT = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT__SCRIPT = STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT__IS_START = STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT__ENVIRONMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Environment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.AdditionEnvironmentStatementImpl <em>Addition Environment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.AdditionEnvironmentStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getAdditionEnvironmentStatement()
	 * @generated
	 */
	int ADDITION_ENVIRONMENT_STATEMENT = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT__NAME = ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT__SCRIPT = ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT__IS_START = ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT__PREVIOUS = ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT__NEXT = ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT__ENVIRONMENT = ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Addition Environment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_ENVIRONMENT_STATEMENT_FEATURE_COUNT = ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.DeletionEnvironmentStatementImpl <em>Deletion Environment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.DeletionEnvironmentStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getDeletionEnvironmentStatement()
	 * @generated
	 */
	int DELETION_ENVIRONMENT_STATEMENT = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT__NAME = ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT__SCRIPT = ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT__IS_START = ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT__PREVIOUS = ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT__NEXT = ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT__ENVIRONMENT = ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Deletion Environment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_ENVIRONMENT_STATEMENT_FEATURE_COUNT = ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.UpdateEnvironmentStatementImpl <em>Update Environment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.UpdateEnvironmentStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getUpdateEnvironmentStatement()
	 * @generated
	 */
	int UPDATE_ENVIRONMENT_STATEMENT = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT__NAME = ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT__SCRIPT = ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT__IS_START = ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS = ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT__NEXT = ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT = ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Update Environment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT = ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PackageSettingStatementImpl <em>Package Setting Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PackageSettingStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPackageSettingStatement()
	 * @generated
	 */
	int PACKAGE_SETTING_STATEMENT = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT__SCRIPT = STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT__IS_START = STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT__PKGSETTING = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Setting Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SETTING_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.AdditionPackageSettingStatementImpl <em>Addition Package Setting Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.AdditionPackageSettingStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getAdditionPackageSettingStatement()
	 * @generated
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT__NAME = PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT__SCRIPT = PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT__IS_START = PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT__PREVIOUS = PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT__NEXT = PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT__PKGSETTING = PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The number of structural features of the '<em>Addition Package Setting Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT = PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.DeletionPackageSettingStatementImpl <em>Deletion Package Setting Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.DeletionPackageSettingStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getDeletionPackageSettingStatement()
	 * @generated
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT = 78;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT__NAME = PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT__SCRIPT = PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT__IS_START = PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT__PREVIOUS = PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT__NEXT = PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT__PKGSETTING = PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The number of structural features of the '<em>Deletion Package Setting Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETION_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT = PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.UpdatePackageSettingStatementImpl <em>Update Package Setting Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.UpdatePackageSettingStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getUpdatePackageSettingStatement()
	 * @generated
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT = 79;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT__NAME = PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT__SCRIPT = PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT__IS_START = PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT__PREVIOUS = PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT__NEXT = PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT__PKGSETTING = PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The number of structural features of the '<em>Update Package Setting Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT = PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.NeutralStatementImpl <em>Neutral Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.NeutralStatementImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getNeutralStatement()
	 * @generated
	 */
	int NEUTRAL_STATEMENT = 80;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_STATEMENT__SCRIPT = STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_STATEMENT__IS_START = STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>Neutral Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.MessageImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 81;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = NEUTRAL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SCRIPT = NEUTRAL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__IS_START = NEUTRAL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PREVIOUS = NEUTRAL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NEXT = NEUTRAL_STATEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = NEUTRAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.CommentImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 82;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME = NEUTRAL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SCRIPT = NEUTRAL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__IS_START = NEUTRAL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PREVIOUS = NEUTRAL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NEXT = NEUTRAL_STATEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = NEUTRAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.FileImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__EXTENSION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SIZE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CHECK_SUM = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__IS_DIRECTORY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Suid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SUID = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__GUID = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PERMISSION = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CHILDS = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__GROUP = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__IS_MISSING = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.DocumentationFileImpl <em>Documentation File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.DocumentationFileImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getDocumentationFile()
	 * @generated
	 */
	int DOCUMENTATION_FILE = 84;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__EXTENSION = FILE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__DESCRIPTION = FILE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__SIZE = FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__CHECK_SUM = FILE__CHECK_SUM;

	/**
	 * The feature id for the '<em><b>Is Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__IS_DIRECTORY = FILE__IS_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Suid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__SUID = FILE__SUID;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__GUID = FILE__GUID;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__PERMISSION = FILE__PERMISSION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__LOCATION = FILE__LOCATION;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__CHILDS = FILE__CHILDS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__PARENT = FILE__PARENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__OWNER = FILE__OWNER;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__GROUP = FILE__GROUP;

	/**
	 * The feature id for the '<em><b>Is Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__IS_MISSING = FILE__IS_MISSING;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE__PKG = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Documentation File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.InformationFileImpl <em>Information File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.InformationFileImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getInformationFile()
	 * @generated
	 */
	int INFORMATION_FILE = 85;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__EXTENSION = FILE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__DESCRIPTION = FILE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__SIZE = FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__CHECK_SUM = FILE__CHECK_SUM;

	/**
	 * The feature id for the '<em><b>Is Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__IS_DIRECTORY = FILE__IS_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Suid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__SUID = FILE__SUID;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__GUID = FILE__GUID;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__PERMISSION = FILE__PERMISSION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__LOCATION = FILE__LOCATION;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__CHILDS = FILE__CHILDS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__PARENT = FILE__PARENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__OWNER = FILE__OWNER;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__GROUP = FILE__GROUP;

	/**
	 * The feature id for the '<em><b>Is Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE__IS_MISSING = FILE__IS_MISSING;

	/**
	 * The number of structural features of the '<em>Information File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstDesktopImpl <em>Postinst Desktop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstDesktopImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstDesktop()
	 * @generated
	 */
	int POSTINST_DESKTOP = 86;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postinst Desktop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DESKTOP_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstDocBaseImpl <em>Postinst Doc Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstDocBaseImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstDocBase()
	 * @generated
	 */
	int POSTINST_DOC_BASE = 87;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__NAME = ADDITION_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__SCRIPT = ADDITION_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__IS_START = ADDITION_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__PREVIOUS = ADDITION_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__NEXT = ADDITION_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__ENVIRONMENT = ADDITION_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE__DOCUMENT = ADDITION_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Doc Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_DOC_BASE_FEATURE_COUNT = ADDITION_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstEmacsenImpl <em>Postinst Emacsen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstEmacsenImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstEmacsen()
	 * @generated
	 */
	int POSTINST_EMACSEN = 88;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__PKGSETTING = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN__PACKAGE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postinst Emacsen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_EMACSEN_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstGconfImpl <em>Postinst Gconf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstGconfImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstGconf()
	 * @generated
	 */
	int POSTINST_GCONF = 89;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__NAME = UPDATE_PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__SCRIPT = UPDATE_PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__IS_START = UPDATE_PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__PREVIOUS = UPDATE_PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__NEXT = UPDATE_PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__PKGSETTING = UPDATE_PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF__SCHEMAS = UPDATE_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Gconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_FEATURE_COUNT = UPDATE_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstGconfDefaultsImpl <em>Postinst Gconf Defaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstGconfDefaultsImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstGconfDefaults()
	 * @generated
	 */
	int POSTINST_GCONF_DEFAULTS = 90;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS__NAME = UPDATE_PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS__SCRIPT = UPDATE_PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS__IS_START = UPDATE_PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS__PREVIOUS = UPDATE_PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS__NEXT = UPDATE_PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS__PKGSETTING = UPDATE_PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The number of structural features of the '<em>Postinst Gconf Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_GCONF_DEFAULTS_FEATURE_COUNT = UPDATE_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstIconsImpl <em>Postinst Icons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstIconsImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstIcons()
	 * @generated
	 */
	int POSTINST_ICONS = 91;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Directories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS__DIRECTORIES = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Icons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ICONS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstInfoImpl <em>Postinst Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstInfoImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstInfo()
	 * @generated
	 */
	int POSTINST_INFO = 92;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO__FILE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INFO_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstInitImpl <em>Postinst Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstInitImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstInit()
	 * @generated
	 */
	int POSTINST_INIT = 93;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Script Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__SCRIPT_PARAM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__INIT_PARAMS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT__ERROR_HANDLER = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Postinst Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstInitNostartImpl <em>Postinst Init Nostart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstInitNostartImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstInitNostart()
	 * @generated
	 */
	int POSTINST_INIT_NOSTART = 94;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Script Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__SCRIPT_PARAM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__INIT_PARAMS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART__ERROR_HANDLER = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Postinst Init Nostart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_NOSTART_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstInitRestartImpl <em>Postinst Init Restart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstInitRestartImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstInitRestart()
	 * @generated
	 */
	int POSTINST_INIT_RESTART = 95;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Script Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__SCRIPT_PARAM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__INIT_PARAMS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART__ERROR_HANDLER = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Postinst Init Restart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_INIT_RESTART_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstMakeshlibsImpl <em>Postinst Makeshlibs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstMakeshlibsImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstMakeshlibs()
	 * @generated
	 */
	int POSTINST_MAKESHLIBS = 96;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postinst Makeshlibs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MAKESHLIBS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstMenuImpl <em>Postinst Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstMenuImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstMenu()
	 * @generated
	 */
	int POSTINST_MENU = 97;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postinst Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstMenuMethodImpl <em>Postinst Menu Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstMenuMethodImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstMenuMethod()
	 * @generated
	 */
	int POSTINST_MENU_METHOD = 98;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD__PACKAGE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Menu Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MENU_METHOD_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstMimeImpl <em>Postinst Mime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstMimeImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstMime()
	 * @generated
	 */
	int POSTINST_MIME = 99;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postinst Mime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MIME_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstModulesImpl <em>Postinst Modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstModulesImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstModules()
	 * @generated
	 */
	int POSTINST_MODULES = 100;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Kvers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES__KVERS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_MODULES_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstPythonImpl <em>Postinst Python</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstPythonImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstPython()
	 * @generated
	 */
	int POSTINST_PYTHON = 101;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Pyver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__PYVER = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dirlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON__DIRLIST = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postinst Python</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_PYTHON_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstScrollkeeperImpl <em>Postinst Scrollkeeper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstScrollkeeperImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstScrollkeeper()
	 * @generated
	 */
	int POSTINST_SCROLLKEEPER = 102;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postinst Scrollkeeper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SCROLLKEEPER_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstSgmlcatalogImpl <em>Postinst Sgmlcatalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstSgmlcatalogImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstSgmlcatalog()
	 * @generated
	 */
	int POSTINST_SGMLCATALOG = 103;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Centralcat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__CENTRALCAT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordcats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG__ORDCATS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postinst Sgmlcatalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SGMLCATALOG_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstSharedmimeinfoImpl <em>Postinst Sharedmimeinfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstSharedmimeinfoImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstSharedmimeinfo()
	 * @generated
	 */
	int POSTINST_SHAREDMIMEINFO = 104;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postinst Sharedmimeinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SHAREDMIMEINFO_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstSuidImpl <em>Postinst Suid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstSuidImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstSuid()
	 * @generated
	 */
	int POSTINST_SUID = 105;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__FILES = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__PACKAGE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__FILE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__OWNER = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__GROUP = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Perms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID__PERMS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Postinst Suid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_SUID_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstUdevImpl <em>Postinst Udev</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstUdevImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstUdev()
	 * @generated
	 */
	int POSTINST_UDEV = 106;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__NAME = UPDATE_FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__SCRIPT = UPDATE_FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__IS_START = UPDATE_FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__PREVIOUS = UPDATE_FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__NEXT = UPDATE_FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__FILES = UPDATE_FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__OLD = UPDATE_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV__RULE = UPDATE_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postinst Udev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_UDEV_FEATURE_COUNT = UPDATE_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstUsrlocalImpl <em>Postinst Usrlocal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstUsrlocalImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstUsrlocal()
	 * @generated
	 */
	int POSTINST_USRLOCAL = 107;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__NAME = UPDATE_FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__SCRIPT = UPDATE_FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__IS_START = UPDATE_FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__PREVIOUS = UPDATE_FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__NEXT = UPDATE_FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__FILES = UPDATE_FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Dirlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL__DIRLIST = UPDATE_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Usrlocal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_USRLOCAL_FEATURE_COUNT = UPDATE_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstWmImpl <em>Postinst Wm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstWmImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstWm()
	 * @generated
	 */
	int POSTINST_WM = 108;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Wm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__WM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wmman</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__WMMAN = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM__PRIORITY = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Postinst Wm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstWmNomanImpl <em>Postinst Wm Noman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstWmNomanImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstWmNoman()
	 * @generated
	 */
	int POSTINST_WM_NOMAN = 109;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Wm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__WM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN__PRIORITY = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postinst Wm Noman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_WM_NOMAN_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstXfontsImpl <em>Postinst Xfonts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstXfontsImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstXfonts()
	 * @generated
	 */
	int POSTINST_XFONTS = 110;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Cmds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS__CMDS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postinst Xfonts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_XFONTS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmDebconfImpl <em>Postrm Debconf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmDebconfImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmDebconf()
	 * @generated
	 */
	int POSTRM_DEBCONF = 111;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Debconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DEBCONF_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmDesktopImpl <em>Postrm Desktop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmDesktopImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmDesktop()
	 * @generated
	 */
	int POSTRM_DESKTOP = 112;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Desktop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_DESKTOP_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmGconfImpl <em>Postrm Gconf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmGconfImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmGconf()
	 * @generated
	 */
	int POSTRM_GCONF = 113;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__NAME = DELETION_FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__SCRIPT = DELETION_FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__IS_START = DELETION_FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__PREVIOUS = DELETION_FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__NEXT = DELETION_FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__FILES = DELETION_FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF__SCHEMAS = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postrm Gconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_FEATURE_COUNT = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmGconfDefaultsImpl <em>Postrm Gconf Defaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmGconfDefaultsImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmGconfDefaults()
	 * @generated
	 */
	int POSTRM_GCONF_DEFAULTS = 114;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Gconf Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_GCONF_DEFAULTS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmIconsImpl <em>Postrm Icons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmIconsImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmIcons()
	 * @generated
	 */
	int POSTRM_ICONS = 115;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Dirs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS__DIRS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postrm Icons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_ICONS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmInitImpl <em>Postrm Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmInitImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmInit()
	 * @generated
	 */
	int POSTRM_INIT = 116;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__FILES = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__SCRIPT_PARAM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT__ERROR_HANDLER = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Postrm Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_INIT_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmMakeshlibsImpl <em>Postrm Makeshlibs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmMakeshlibsImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmMakeshlibs()
	 * @generated
	 */
	int POSTRM_MAKESHLIBS = 117;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Makeshlibs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MAKESHLIBS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmMenuImpl <em>Postrm Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmMenuImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmMenu()
	 * @generated
	 */
	int POSTRM_MENU = 118;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmMenuMethodImpl <em>Postrm Menu Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmMenuMethodImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmMenuMethod()
	 * @generated
	 */
	int POSTRM_MENU_METHOD = 119;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__FILES = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD__PACKAGE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postrm Menu Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MENU_METHOD_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmMimeImpl <em>Postrm Mime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmMimeImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmMime()
	 * @generated
	 */
	int POSTRM_MIME = 120;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Mime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MIME_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmModulesImpl <em>Postrm Modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmModulesImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmModules()
	 * @generated
	 */
	int POSTRM_MODULES = 121;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Kvers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES__KVERS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postrm Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_MODULES_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmScrollkeeperImpl <em>Postrm Scrollkeeper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmScrollkeeperImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmScrollkeeper()
	 * @generated
	 */
	int POSTRM_SCROLLKEEPER = 122;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Scrollkeeper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SCROLLKEEPER_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmSgmlcatalogImpl <em>Postrm Sgmlcatalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmSgmlcatalogImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmSgmlcatalog()
	 * @generated
	 */
	int POSTRM_SGMLCATALOG = 123;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__NAME = UPDATE_FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__SCRIPT = UPDATE_FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__IS_START = UPDATE_FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__PREVIOUS = UPDATE_FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__NEXT = UPDATE_FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__FILES = UPDATE_FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Centralcat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG__CENTRALCAT = UPDATE_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postrm Sgmlcatalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SGMLCATALOG_FEATURE_COUNT = UPDATE_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmSharedmimeinfoImpl <em>Postrm Sharedmimeinfo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmSharedmimeinfoImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmSharedmimeinfo()
	 * @generated
	 */
	int POSTRM_SHAREDMIMEINFO = 124;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Postrm Sharedmimeinfo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SHAREDMIMEINFO_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmSuidImpl <em>Postrm Suid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmSuidImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmSuid()
	 * @generated
	 */
	int POSTRM_SUID = 125;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__PACKAGE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID__FILE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postrm Suid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_SUID_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostrmXfontsImpl <em>Postrm Xfonts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostrmXfontsImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostrmXfonts()
	 * @generated
	 */
	int POSTRM_XFONTS = 126;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Cmds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS__CMDS = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postrm Xfonts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTRM_XFONTS_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PreinstUdevImpl <em>Preinst Udev</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PreinstUdevImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPreinstUdev()
	 * @generated
	 */
	int PREINST_UDEV = 127;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__NAME = DELETION_FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__SCRIPT = DELETION_FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__IS_START = DELETION_FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__PREVIOUS = DELETION_FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__NEXT = DELETION_FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__FILES = DELETION_FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__OLD = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__RULE = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV__PACKAGE = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Preinst Udev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_UDEV_FEATURE_COUNT = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PreinstUserImpl <em>Preinst User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PreinstUserImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPreinstUser()
	 * @generated
	 */
	int PREINST_USER = 128;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__NAME = UPDATE_FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__SCRIPT = UPDATE_FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__IS_START = UPDATE_FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__PREVIOUS = UPDATE_FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__NEXT = UPDATE_FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__FILES = UPDATE_FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__DIR = UPDATE_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__MODE = UPDATE_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__USER = UPDATE_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER__GROUP = UPDATE_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Preinst User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREINST_USER_FEATURE_COUNT = UPDATE_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PrermDocBaseImpl <em>Prerm Doc Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PrermDocBaseImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPrermDocBase()
	 * @generated
	 */
	int PRERM_DOC_BASE = 129;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE__DOCUMENT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerm Doc Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_DOC_BASE_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PrermEmacsenImpl <em>Prerm Emacsen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PrermEmacsenImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPrermEmacsen()
	 * @generated
	 */
	int PRERM_EMACSEN = 130;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__PKGSETTING = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN__PACKAGE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prerm Emacsen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_EMACSEN_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PrermGconfImpl <em>Prerm Gconf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PrermGconfImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPrermGconf()
	 * @generated
	 */
	int PRERM_GCONF = 131;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__NAME = UPDATE_PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__SCRIPT = UPDATE_PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__IS_START = UPDATE_PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__PREVIOUS = UPDATE_PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__NEXT = UPDATE_PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__PKGSETTING = UPDATE_PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF__SCHEMAS = UPDATE_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerm Gconf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_GCONF_FEATURE_COUNT = UPDATE_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PrermInfoImpl <em>Prerm Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PrermInfoImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPrermInfo()
	 * @generated
	 */
	int PRERM_INFO = 132;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__PKGSETTING = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO__FILE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prerm Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INFO_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PrermInitImpl <em>Prerm Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PrermInitImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPrermInit()
	 * @generated
	 */
	int PRERM_INIT = 133;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Script Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__SCRIPT_PARAM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT__ERROR_HANDLER = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prerm Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PrermInitNorestartImpl <em>Prerm Init Norestart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PrermInitNorestartImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPrermInitNorestart()
	 * @generated
	 */
	int PRERM_INIT_NORESTART = 134;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Script Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__SCRIPT_PARAM = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART__ERROR_HANDLER = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prerm Init Norestart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_INIT_NORESTART_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PrermPythonImpl <em>Prerm Python</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PrermPythonImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPrermPython()
	 * @generated
	 */
	int PRERM_PYTHON = 135;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__NAME = DELETION_FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__SCRIPT = DELETION_FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__IS_START = DELETION_FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__PREVIOUS = DELETION_FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__NEXT = DELETION_FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__FILES = DELETION_FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON__PACKAGE = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerm Python</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_PYTHON_FEATURE_COUNT = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PrermSgmlcatalogImpl <em>Prerm Sgmlcatalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PrermSgmlcatalogImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPrermSgmlcatalog()
	 * @generated
	 */
	int PRERM_SGMLCATALOG = 136;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__PKGSETTING = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Centralcat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG__CENTRALCAT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prerm Sgmlcatalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_SGMLCATALOG_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PrermUsrlocalImpl <em>Prerm Usrlocal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PrermUsrlocalImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPrermUsrlocal()
	 * @generated
	 */
	int PRERM_USRLOCAL = 137;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL__NAME = DELETION_FILE_SYSTEM_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL__SCRIPT = DELETION_FILE_SYSTEM_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL__IS_START = DELETION_FILE_SYSTEM_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL__PREVIOUS = DELETION_FILE_SYSTEM_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL__NEXT = DELETION_FILE_SYSTEM_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL__FILES = DELETION_FILE_SYSTEM_STATEMENT__FILES;

	/**
	 * The feature id for the '<em><b>Dirlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL__DIRLIST = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerm Usrlocal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_USRLOCAL_FEATURE_COUNT = DELETION_FILE_SYSTEM_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PrermWmImpl <em>Prerm Wm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PrermWmImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPrermWm()
	 * @generated
	 */
	int PRERM_WM = 138;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__NAME = DELETION_PACKAGE_SETTING_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__SCRIPT = DELETION_PACKAGE_SETTING_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__IS_START = DELETION_PACKAGE_SETTING_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__PREVIOUS = DELETION_PACKAGE_SETTING_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__NEXT = DELETION_PACKAGE_SETTING_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Pkgsetting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__PKGSETTING = DELETION_PACKAGE_SETTING_STATEMENT__PKGSETTING;

	/**
	 * The feature id for the '<em><b>Wm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM__WM = DELETION_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerm Wm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRERM_WM_FEATURE_COUNT = DELETION_PACKAGE_SETTING_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.UpdatePythonModulesImpl <em>Update Python Modules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.UpdatePythonModulesImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getUpdatePythonModules()
	 * @generated
	 */
	int UPDATE_PYTHON_MODULES = 139;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PYTHON_MODULES__NAME = UPDATE_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PYTHON_MODULES__SCRIPT = UPDATE_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PYTHON_MODULES__IS_START = UPDATE_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PYTHON_MODULES__PREVIOUS = UPDATE_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PYTHON_MODULES__NEXT = UPDATE_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PYTHON_MODULES__ENVIRONMENT = UPDATE_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PYTHON_MODULES__FILE = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Python Modules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PYTHON_MODULES_FEATURE_COUNT = UPDATE_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.PostinstAddAlternativeImpl <em>Postinst Add Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.PostinstAddAlternativeImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPostinstAddAlternative()
	 * @generated
	 */
	int POSTINST_ADD_ALTERNATIVE = 140;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ADD_ALTERNATIVE__NAME = ADDITION_ENVIRONMENT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ADD_ALTERNATIVE__SCRIPT = ADDITION_ENVIRONMENT_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ADD_ALTERNATIVE__IS_START = ADDITION_ENVIRONMENT_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ADD_ALTERNATIVE__PREVIOUS = ADDITION_ENVIRONMENT_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ADD_ALTERNATIVE__NEXT = ADDITION_ENVIRONMENT_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ADD_ALTERNATIVE__ENVIRONMENT = ADDITION_ENVIRONMENT_STATEMENT__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Master</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ADD_ALTERNATIVE__MASTER = ADDITION_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ADD_ALTERNATIVE__SLAVE = ADDITION_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postinst Add Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTINST_ADD_ALTERNATIVE_FEATURE_COUNT = ADDITION_ENVIRONMENT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.AddAlternativeImpl <em>Add Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.AddAlternativeImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getAddAlternative()
	 * @generated
	 */
	int ADD_ALTERNATIVE = 141;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE__LINK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE__PRIORITY = 3;

	/**
	 * The number of structural features of the '<em>Add Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.ParamImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 142;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.StringParamImpl <em>String Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.StringParamImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getStringParam()
	 * @generated
	 */
	int STRING_PARAM = 143;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAM__VALUE = PARAM__VALUE;

	/**
	 * The number of structural features of the '<em>String Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAM_FEATURE_COUNT = PARAM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.IntParamImpl <em>Int Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.IntParamImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getIntParam()
	 * @generated
	 */
	int INT_PARAM = 144;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_PARAM__VALUE = PARAM__VALUE;

	/**
	 * The number of structural features of the '<em>Int Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_PARAM_FEATURE_COUNT = PARAM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.ConflictImpl <em>Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.ConflictImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getConflict()
	 * @generated
	 */
	int CONFLICT = 146;

	/**
	 * The feature id for the '<em><b>And Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__AND_CONFLICT = 0;

	/**
	 * The feature id for the '<em><b>Or Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__OR_CONFLICT = 1;

	/**
	 * The feature id for the '<em><b>Single Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__SINGLE_CONFLICT = 2;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__PKG = 3;

	/**
	 * The number of structural features of the '<em>Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.SingleConflictImpl <em>Single Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.SingleConflictImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getSingleConflict()
	 * @generated
	 */
	int SINGLE_CONFLICT = 145;

	/**
	 * The feature id for the '<em><b>And Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__AND_CONFLICT = CONFLICT__AND_CONFLICT;

	/**
	 * The feature id for the '<em><b>Or Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__OR_CONFLICT = CONFLICT__OR_CONFLICT;

	/**
	 * The feature id for the '<em><b>Single Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__SINGLE_CONFLICT = CONFLICT__SINGLE_CONFLICT;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__PKG = CONFLICT__PKG;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__CONFLICT = CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__VERSION = CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT__VALUE = CONFLICT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Single Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CONFLICT_FEATURE_COUNT = CONFLICT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.AndConflictImpl <em>And Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.AndConflictImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getAndConflict()
	 * @generated
	 */
	int AND_CONFLICT = 147;

	/**
	 * The feature id for the '<em><b>And Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT__AND_CONFLICT = CONFLICT__AND_CONFLICT;

	/**
	 * The feature id for the '<em><b>Or Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT__OR_CONFLICT = CONFLICT__OR_CONFLICT;

	/**
	 * The feature id for the '<em><b>Single Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT__SINGLE_CONFLICT = CONFLICT__SINGLE_CONFLICT;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT__PKG = CONFLICT__PKG;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT__OPS = CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT__CONFLICT = CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONFLICT_FEATURE_COUNT = CONFLICT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.OrConflictImpl <em>Or Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.OrConflictImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getOrConflict()
	 * @generated
	 */
	int OR_CONFLICT = 148;

	/**
	 * The feature id for the '<em><b>And Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT__AND_CONFLICT = CONFLICT__AND_CONFLICT;

	/**
	 * The feature id for the '<em><b>Or Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT__OR_CONFLICT = CONFLICT__OR_CONFLICT;

	/**
	 * The feature id for the '<em><b>Single Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT__SINGLE_CONFLICT = CONFLICT__SINGLE_CONFLICT;

	/**
	 * The feature id for the '<em><b>Pkg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT__PKG = CONFLICT__PKG;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT__OPS = CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT__CONFLICT = CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONFLICT_FEATURE_COUNT = CONFLICT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.impl.AssignmentImpl
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 149;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__NAME = NEUTRAL_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__SCRIPT = NEUTRAL_STATEMENT__SCRIPT;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__IS_START = NEUTRAL_STATEMENT__IS_START;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__PREVIOUS = NEUTRAL_STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__NEXT = NEUTRAL_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Assigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ASSIGNED = NEUTRAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXPRESSION = NEUTRAL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = NEUTRAL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.PriorityType <em>Priority Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.PriorityType
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getPriorityType()
	 * @generated
	 */
	int PRIORITY_TYPE = 150;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.StatusType <em>Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.StatusType
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 151;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.VersionType <em>Version Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.VersionType
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 152;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.ReturnStatementValue <em>Return Statement Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.ReturnStatementValue
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getReturnStatementValue()
	 * @generated
	 */
	int RETURN_STATEMENT_VALUE = 153;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.CasePrermConditionValue <em>Case Prerm Condition Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.CasePrermConditionValue
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCasePrermConditionValue()
	 * @generated
	 */
	int CASE_PRERM_CONDITION_VALUE = 154;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.CasePostrmConditionValue <em>Case Postrm Condition Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.CasePostrmConditionValue
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCasePostrmConditionValue()
	 * @generated
	 */
	int CASE_POSTRM_CONDITION_VALUE = 155;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.CasePreinstConditionValue <em>Case Preinst Condition Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.CasePreinstConditionValue
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCasePreinstConditionValue()
	 * @generated
	 */
	int CASE_PREINST_CONDITION_VALUE = 156;

	/**
	 * The meta object id for the '{@link it.univaq.mancoosi.packagemm.CasePostinstConditionValue <em>Case Postinst Condition Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.mancoosi.packagemm.CasePostinstConditionValue
	 * @see it.univaq.mancoosi.packagemm.impl.PackagemmPackageImpl#getCasePostinstConditionValue()
	 * @generated
	 */
	int CASE_POSTINST_CONDITION_VALUE = 157;


	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see it.univaq.mancoosi.packagemm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.mancoosi.packagemm.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Version();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getInstalledSize <em>Installed Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Installed Size</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getInstalledSize()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_InstalledSize();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getMaintainer <em>Maintainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintainer</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getMaintainer()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Maintainer();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getArchitecture()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getFileSize <em>File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Size</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getFileSize()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_FileSize();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getCheckSum <em>Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Sum</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getCheckSum()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_CheckSum();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getDescription()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Description();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getSection()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Section();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getTag()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Tag();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getPriority()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Priority();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getStatus()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Status();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getUploaders <em>Uploaders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uploaders</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getUploaders()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Uploaders();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getRecommends <em>Recommends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommends</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getRecommends()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Recommends();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getSuggests <em>Suggests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suggests</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getSuggests()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Suggests();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getEnhances <em>Enhances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enhances</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getEnhances()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Enhances();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getPredepends <em>Predepends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predepends</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getPredepends()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Predepends();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Package#getReplaces <em>Replaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replaces</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getReplaces()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Replaces();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.Package#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getFiles()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Files();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.packagemm.Package#getDocumentationFiles <em>Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documentation Files</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getDocumentationFiles()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_DocumentationFiles();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Package#getPreinstScript <em>Preinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preinst Script</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getPreinstScript()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PreinstScript();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Package#getPostinstScript <em>Postinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postinst Script</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getPostinstScript()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PostinstScript();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Package#getPrermScript <em>Prerm Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prerm Script</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getPrermScript()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PrermScript();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Package#getPostrmScript <em>Postrm Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postrm Script</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getPostrmScript()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PostrmScript();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Package#getConfigScript <em>Config Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Script</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getConfigScript()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ConfigScript();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Package#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conflict</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getConflict()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Conflict();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Package#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Depends</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getDepends()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Depends();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.Package#getConffiles <em>Conffiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conffiles</em>'.
	 * @see it.univaq.mancoosi.packagemm.Package#getConffiles()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Conffiles();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see it.univaq.mancoosi.packagemm.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.Script#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see it.univaq.mancoosi.packagemm.Script#getStatements()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.Script#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameters</em>'.
	 * @see it.univaq.mancoosi.packagemm.Script#getInputParameters()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_InputParameters();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.InputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameter</em>'.
	 * @see it.univaq.mancoosi.packagemm.InputParameter
	 * @generated
	 */
	EClass getInputParameter();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.InputParameter#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Script</em>'.
	 * @see it.univaq.mancoosi.packagemm.InputParameter#getScript()
	 * @see #getInputParameter()
	 * @generated
	 */
	EReference getInputParameter_Script();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Dependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependence</em>'.
	 * @see it.univaq.mancoosi.packagemm.Dependence
	 * @generated
	 */
	EClass getDependence();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Dependence#getAndDep <em>And Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And Dep</em>'.
	 * @see it.univaq.mancoosi.packagemm.Dependence#getAndDep()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_AndDep();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Dependence#getOrDep <em>Or Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or Dep</em>'.
	 * @see it.univaq.mancoosi.packagemm.Dependence#getOrDep()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_OrDep();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Dependence#getSingleDep <em>Single Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Dep</em>'.
	 * @see it.univaq.mancoosi.packagemm.Dependence#getSingleDep()
	 * @see #getDependence()
	 * @generated
	 */
	EReference getDependence_SingleDep();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Dependence#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pkg</em>'.
	 * @see it.univaq.mancoosi.packagemm.Dependence#getPkg()
	 * @see #getDependence()
	 * @generated
	 */
	EAttribute getDependence_Pkg();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.AndDep <em>And Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Dep</em>'.
	 * @see it.univaq.mancoosi.packagemm.AndDep
	 * @generated
	 */
	EClass getAndDep();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.AndDep#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see it.univaq.mancoosi.packagemm.AndDep#getOps()
	 * @see #getAndDep()
	 * @generated
	 */
	EReference getAndDep_Ops();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.AndDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dependence</em>'.
	 * @see it.univaq.mancoosi.packagemm.AndDep#getDependence()
	 * @see #getAndDep()
	 * @generated
	 */
	EReference getAndDep_Dependence();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.OrDep <em>Or Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Dep</em>'.
	 * @see it.univaq.mancoosi.packagemm.OrDep
	 * @generated
	 */
	EClass getOrDep();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.OrDep#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see it.univaq.mancoosi.packagemm.OrDep#getOps()
	 * @see #getOrDep()
	 * @generated
	 */
	EReference getOrDep_Ops();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.OrDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dependence</em>'.
	 * @see it.univaq.mancoosi.packagemm.OrDep#getDependence()
	 * @see #getOrDep()
	 * @generated
	 */
	EReference getOrDep_Dependence();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.SingleDep <em>Single Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Dep</em>'.
	 * @see it.univaq.mancoosi.packagemm.SingleDep
	 * @generated
	 */
	EClass getSingleDep();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.SingleDep#getDependence <em>Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dependence</em>'.
	 * @see it.univaq.mancoosi.packagemm.SingleDep#getDependence()
	 * @see #getSingleDep()
	 * @generated
	 */
	EReference getSingleDep_Dependence();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.SingleDep#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see it.univaq.mancoosi.packagemm.SingleDep#getVersion()
	 * @see #getSingleDep()
	 * @generated
	 */
	EAttribute getSingleDep_Version();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.SingleDep#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.SingleDep#getValue()
	 * @see #getSingleDep()
	 * @generated
	 */
	EAttribute getSingleDep_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PreinstScript <em>Preinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preinst Script</em>'.
	 * @see it.univaq.mancoosi.packagemm.PreinstScript
	 * @generated
	 */
	EClass getPreinstScript();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.PreinstScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see it.univaq.mancoosi.packagemm.PreinstScript#getPkg()
	 * @see #getPreinstScript()
	 * @generated
	 */
	EReference getPreinstScript_Pkg();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstScript <em>Postinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Script</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstScript
	 * @generated
	 */
	EClass getPostinstScript();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.PostinstScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstScript#getPkg()
	 * @see #getPostinstScript()
	 * @generated
	 */
	EReference getPostinstScript_Pkg();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PrermScript <em>Prerm Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Script</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermScript
	 * @generated
	 */
	EClass getPrermScript();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.PrermScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermScript#getPkg()
	 * @see #getPrermScript()
	 * @generated
	 */
	EReference getPrermScript_Pkg();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmScript <em>Postrm Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Script</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmScript
	 * @generated
	 */
	EClass getPostrmScript();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.PostrmScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmScript#getPkg()
	 * @see #getPostrmScript()
	 * @generated
	 */
	EReference getPostrmScript_Pkg();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.ConfigScript <em>Config Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Script</em>'.
	 * @see it.univaq.mancoosi.packagemm.ConfigScript
	 * @generated
	 */
	EClass getConfigScript();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.ConfigScript#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pkg</em>'.
	 * @see it.univaq.mancoosi.packagemm.ConfigScript#getPkg()
	 * @see #getConfigScript()
	 * @generated
	 */
	EReference getConfigScript_Pkg();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.Statement#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Script</em>'.
	 * @see it.univaq.mancoosi.packagemm.Statement#getScript()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Script();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Statement#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see it.univaq.mancoosi.packagemm.Statement#isIsStart()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_IsStart();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.packagemm.Statement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see it.univaq.mancoosi.packagemm.Statement#getPrevious()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Previous();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.packagemm.Statement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see it.univaq.mancoosi.packagemm.Statement#getNext()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Next();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.ControlStatement <em>Control Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.ControlStatement
	 * @generated
	 */
	EClass getControlStatement();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see it.univaq.mancoosi.packagemm.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Case#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see it.univaq.mancoosi.packagemm.Case#getSelector()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Selector();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Case#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see it.univaq.mancoosi.packagemm.Case#getDefault()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Default();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see it.univaq.mancoosi.packagemm.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.Condition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see it.univaq.mancoosi.packagemm.Condition#getAction()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Action();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.DefaultCaseCondition <em>Default Case Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Case Condition</em>'.
	 * @see it.univaq.mancoosi.packagemm.DefaultCaseCondition
	 * @generated
	 */
	EClass getDefaultCaseCondition();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.CasePrerm <em>Case Prerm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Prerm</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePrerm
	 * @generated
	 */
	EClass getCasePrerm();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.CasePrerm#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePrerm#getConditions()
	 * @see #getCasePrerm()
	 * @generated
	 */
	EReference getCasePrerm_Conditions();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.CasePrermCondition <em>Case Prerm Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Prerm Condition</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePrermCondition
	 * @generated
	 */
	EClass getCasePrermCondition();

	/**
	 * Returns the meta object for the attribute list '{@link it.univaq.mancoosi.packagemm.CasePrermCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePrermCondition#getValue()
	 * @see #getCasePrermCondition()
	 * @generated
	 */
	EAttribute getCasePrermCondition_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.CasePostrm <em>Case Postrm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Postrm</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePostrm
	 * @generated
	 */
	EClass getCasePostrm();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.CasePostrm#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePostrm#getConditions()
	 * @see #getCasePostrm()
	 * @generated
	 */
	EReference getCasePostrm_Conditions();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.CasePostrmCondition <em>Case Postrm Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Postrm Condition</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePostrmCondition
	 * @generated
	 */
	EClass getCasePostrmCondition();

	/**
	 * Returns the meta object for the attribute list '{@link it.univaq.mancoosi.packagemm.CasePostrmCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePostrmCondition#getValue()
	 * @see #getCasePostrmCondition()
	 * @generated
	 */
	EAttribute getCasePostrmCondition_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.CasePreinst <em>Case Preinst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Preinst</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePreinst
	 * @generated
	 */
	EClass getCasePreinst();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.CasePreinst#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePreinst#getConditions()
	 * @see #getCasePreinst()
	 * @generated
	 */
	EReference getCasePreinst_Conditions();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.CasePreinstCondition <em>Case Preinst Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Preinst Condition</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePreinstCondition
	 * @generated
	 */
	EClass getCasePreinstCondition();

	/**
	 * Returns the meta object for the attribute list '{@link it.univaq.mancoosi.packagemm.CasePreinstCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePreinstCondition#getValue()
	 * @see #getCasePreinstCondition()
	 * @generated
	 */
	EAttribute getCasePreinstCondition_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.CasePostinst <em>Case Postinst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Postinst</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePostinst
	 * @generated
	 */
	EClass getCasePostinst();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.CasePostinst#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePostinst#getConditions()
	 * @see #getCasePostinst()
	 * @generated
	 */
	EReference getCasePostinst_Conditions();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.CasePostinstCondition <em>Case Postinst Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Postinst Condition</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePostinstCondition
	 * @generated
	 */
	EClass getCasePostinstCondition();

	/**
	 * Returns the meta object for the attribute list '{@link it.univaq.mancoosi.packagemm.CasePostinstCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePostinstCondition#getValue()
	 * @see #getCasePostinstCondition()
	 * @generated
	 */
	EAttribute getCasePostinstCondition_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.BasicCase <em>Basic Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Case</em>'.
	 * @see it.univaq.mancoosi.packagemm.BasicCase
	 * @generated
	 */
	EClass getBasicCase();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.BasicCase#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see it.univaq.mancoosi.packagemm.BasicCase#getConditions()
	 * @see #getBasicCase()
	 * @generated
	 */
	EReference getBasicCase_Conditions();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.BasicCaseCondition <em>Basic Case Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Case Condition</em>'.
	 * @see it.univaq.mancoosi.packagemm.BasicCaseCondition
	 * @generated
	 */
	EClass getBasicCaseCondition();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.BasicCaseCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.BasicCaseCondition#getValue()
	 * @see #getBasicCaseCondition()
	 * @generated
	 */
	EAttribute getBasicCaseCondition_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see it.univaq.mancoosi.packagemm.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see it.univaq.mancoosi.packagemm.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.If#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then</em>'.
	 * @see it.univaq.mancoosi.packagemm.If#getThen()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Then();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else</em>'.
	 * @see it.univaq.mancoosi.packagemm.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see it.univaq.mancoosi.packagemm.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.BooleanExpression#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see it.univaq.mancoosi.packagemm.BooleanExpression#isNot()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_Not();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.FileExistsBoolean <em>File Exists Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Exists Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileExistsBoolean
	 * @generated
	 */
	EClass getFileExistsBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.FileExistsBoolean#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileExistsBoolean#getFile()
	 * @see #getFileExistsBoolean()
	 * @generated
	 */
	EReference getFileExistsBoolean_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.RegularFileBoolean <em>Regular File Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular File Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.RegularFileBoolean
	 * @generated
	 */
	EClass getRegularFileBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.RegularFileBoolean#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.RegularFileBoolean#getFile()
	 * @see #getRegularFileBoolean()
	 * @generated
	 */
	EReference getRegularFileBoolean_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.FileNotZeroSizeBoolean <em>File Not Zero Size Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Not Zero Size Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileNotZeroSizeBoolean
	 * @generated
	 */
	EClass getFileNotZeroSizeBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.FileNotZeroSizeBoolean#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileNotZeroSizeBoolean#getFile()
	 * @see #getFileNotZeroSizeBoolean()
	 * @generated
	 */
	EReference getFileNotZeroSizeBoolean_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.IsDirectoryBoolean <em>Is Directory Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Directory Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.IsDirectoryBoolean
	 * @generated
	 */
	EClass getIsDirectoryBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.IsDirectoryBoolean#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.IsDirectoryBoolean#getFile()
	 * @see #getIsDirectoryBoolean()
	 * @generated
	 */
	EReference getIsDirectoryBoolean_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.FileBlockDeviceBoolean <em>File Block Device Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Block Device Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileBlockDeviceBoolean
	 * @generated
	 */
	EClass getFileBlockDeviceBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.FileBlockDeviceBoolean#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileBlockDeviceBoolean#getFile()
	 * @see #getFileBlockDeviceBoolean()
	 * @generated
	 */
	EReference getFileBlockDeviceBoolean_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.FileCharacterDeviceBoolean <em>File Character Device Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Character Device Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileCharacterDeviceBoolean
	 * @generated
	 */
	EClass getFileCharacterDeviceBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.FileCharacterDeviceBoolean#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileCharacterDeviceBoolean#getFile()
	 * @see #getFileCharacterDeviceBoolean()
	 * @generated
	 */
	EReference getFileCharacterDeviceBoolean_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.FilePipeBoolean <em>File Pipe Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Pipe Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.FilePipeBoolean
	 * @generated
	 */
	EClass getFilePipeBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.FilePipeBoolean#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.FilePipeBoolean#getFile()
	 * @see #getFilePipeBoolean()
	 * @generated
	 */
	EReference getFilePipeBoolean_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.FileSymbolicLinkBoolean <em>File Symbolic Link Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Symbolic Link Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileSymbolicLinkBoolean
	 * @generated
	 */
	EClass getFileSymbolicLinkBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.FileSymbolicLinkBoolean#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileSymbolicLinkBoolean#getFile()
	 * @see #getFileSymbolicLinkBoolean()
	 * @generated
	 */
	EReference getFileSymbolicLinkBoolean_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.FileSocketBoolean <em>File Socket Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Socket Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileSocketBoolean
	 * @generated
	 */
	EClass getFileSocketBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.FileSocketBoolean#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileSocketBoolean#getFile()
	 * @see #getFileSocketBoolean()
	 * @generated
	 */
	EReference getFileSocketBoolean_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.FileTerminalDeviceBoolean <em>File Terminal Device Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Terminal Device Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileTerminalDeviceBoolean
	 * @generated
	 */
	EClass getFileTerminalDeviceBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.FileTerminalDeviceBoolean#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileTerminalDeviceBoolean#getFile()
	 * @see #getFileTerminalDeviceBoolean()
	 * @generated
	 */
	EReference getFileTerminalDeviceBoolean_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.FileReadPermissionBoolean <em>File Read Permission Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Read Permission Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileReadPermissionBoolean
	 * @generated
	 */
	EClass getFileReadPermissionBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.FileReadPermissionBoolean#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileReadPermissionBoolean#getFile()
	 * @see #getFileReadPermissionBoolean()
	 * @generated
	 */
	EReference getFileReadPermissionBoolean_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.FileWritePermissionBoolean <em>File Write Permission Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Write Permission Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileWritePermissionBoolean
	 * @generated
	 */
	EClass getFileWritePermissionBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.FileWritePermissionBoolean#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileWritePermissionBoolean#getFile()
	 * @see #getFileWritePermissionBoolean()
	 * @generated
	 */
	EReference getFileWritePermissionBoolean_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.FileExecutePermissionBoolean <em>File Execute Permission Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Execute Permission Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileExecutePermissionBoolean
	 * @generated
	 */
	EClass getFileExecutePermissionBoolean();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.FileExecutePermissionBoolean#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileExecutePermissionBoolean#getFile()
	 * @see #getFileExecutePermissionBoolean()
	 * @generated
	 */
	EReference getFileExecutePermissionBoolean_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.IntegerEqualBoolean <em>Integer Equal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Equal Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerEqualBoolean
	 * @generated
	 */
	EClass getIntegerEqualBoolean();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.IntegerEqualBoolean#getFirstOp <em>First Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerEqualBoolean#getFirstOp()
	 * @see #getIntegerEqualBoolean()
	 * @generated
	 */
	EAttribute getIntegerEqualBoolean_FirstOp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.IntegerEqualBoolean#getSecondOp <em>Second Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerEqualBoolean#getSecondOp()
	 * @see #getIntegerEqualBoolean()
	 * @generated
	 */
	EAttribute getIntegerEqualBoolean_SecondOp();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.IntegerNotEqualBoolean <em>Integer Not Equal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Not Equal Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerNotEqualBoolean
	 * @generated
	 */
	EClass getIntegerNotEqualBoolean();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.IntegerNotEqualBoolean#getFirstOp <em>First Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerNotEqualBoolean#getFirstOp()
	 * @see #getIntegerNotEqualBoolean()
	 * @generated
	 */
	EAttribute getIntegerNotEqualBoolean_FirstOp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.IntegerNotEqualBoolean#getSecondOp <em>Second Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerNotEqualBoolean#getSecondOp()
	 * @see #getIntegerNotEqualBoolean()
	 * @generated
	 */
	EAttribute getIntegerNotEqualBoolean_SecondOp();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.IntegerGreaterBoolean <em>Integer Greater Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Greater Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerGreaterBoolean
	 * @generated
	 */
	EClass getIntegerGreaterBoolean();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.IntegerGreaterBoolean#getFirstOp <em>First Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerGreaterBoolean#getFirstOp()
	 * @see #getIntegerGreaterBoolean()
	 * @generated
	 */
	EAttribute getIntegerGreaterBoolean_FirstOp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.IntegerGreaterBoolean#getSecondOp <em>Second Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerGreaterBoolean#getSecondOp()
	 * @see #getIntegerGreaterBoolean()
	 * @generated
	 */
	EAttribute getIntegerGreaterBoolean_SecondOp();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.IntegerGreaterEqualBoolean <em>Integer Greater Equal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Greater Equal Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerGreaterEqualBoolean
	 * @generated
	 */
	EClass getIntegerGreaterEqualBoolean();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.IntegerGreaterEqualBoolean#getFirstOp <em>First Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerGreaterEqualBoolean#getFirstOp()
	 * @see #getIntegerGreaterEqualBoolean()
	 * @generated
	 */
	EAttribute getIntegerGreaterEqualBoolean_FirstOp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.IntegerGreaterEqualBoolean#getSecondOp <em>Second Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerGreaterEqualBoolean#getSecondOp()
	 * @see #getIntegerGreaterEqualBoolean()
	 * @generated
	 */
	EAttribute getIntegerGreaterEqualBoolean_SecondOp();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.IntegerLessBoolean <em>Integer Less Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Less Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerLessBoolean
	 * @generated
	 */
	EClass getIntegerLessBoolean();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.IntegerLessBoolean#getFirstOp <em>First Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerLessBoolean#getFirstOp()
	 * @see #getIntegerLessBoolean()
	 * @generated
	 */
	EAttribute getIntegerLessBoolean_FirstOp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.IntegerLessBoolean#getSecondOp <em>Second Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerLessBoolean#getSecondOp()
	 * @see #getIntegerLessBoolean()
	 * @generated
	 */
	EAttribute getIntegerLessBoolean_SecondOp();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.IntegerLessEqualBoolean <em>Integer Less Equal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Less Equal Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerLessEqualBoolean
	 * @generated
	 */
	EClass getIntegerLessEqualBoolean();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.IntegerLessEqualBoolean#getFirstOp <em>First Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerLessEqualBoolean#getFirstOp()
	 * @see #getIntegerLessEqualBoolean()
	 * @generated
	 */
	EAttribute getIntegerLessEqualBoolean_FirstOp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.IntegerLessEqualBoolean#getSecondOp <em>Second Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntegerLessEqualBoolean#getSecondOp()
	 * @see #getIntegerLessEqualBoolean()
	 * @generated
	 */
	EAttribute getIntegerLessEqualBoolean_SecondOp();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.StringEqualBoolean <em>String Equal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Equal Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringEqualBoolean
	 * @generated
	 */
	EClass getStringEqualBoolean();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.StringEqualBoolean#getFirstOp <em>First Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringEqualBoolean#getFirstOp()
	 * @see #getStringEqualBoolean()
	 * @generated
	 */
	EAttribute getStringEqualBoolean_FirstOp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.StringEqualBoolean#getSecondOp <em>Second Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringEqualBoolean#getSecondOp()
	 * @see #getStringEqualBoolean()
	 * @generated
	 */
	EAttribute getStringEqualBoolean_SecondOp();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.StringNotEqualBoolean <em>String Not Equal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Not Equal Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringNotEqualBoolean
	 * @generated
	 */
	EClass getStringNotEqualBoolean();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.StringNotEqualBoolean#getFirstOp <em>First Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringNotEqualBoolean#getFirstOp()
	 * @see #getStringNotEqualBoolean()
	 * @generated
	 */
	EAttribute getStringNotEqualBoolean_FirstOp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.StringNotEqualBoolean#getSecondOp <em>Second Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringNotEqualBoolean#getSecondOp()
	 * @see #getStringNotEqualBoolean()
	 * @generated
	 */
	EAttribute getStringNotEqualBoolean_SecondOp();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.StringGreaterBoolean <em>String Greater Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Greater Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringGreaterBoolean
	 * @generated
	 */
	EClass getStringGreaterBoolean();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.StringGreaterBoolean#getFirstOp <em>First Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringGreaterBoolean#getFirstOp()
	 * @see #getStringGreaterBoolean()
	 * @generated
	 */
	EAttribute getStringGreaterBoolean_FirstOp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.StringGreaterBoolean#getSecondOp <em>Second Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringGreaterBoolean#getSecondOp()
	 * @see #getStringGreaterBoolean()
	 * @generated
	 */
	EAttribute getStringGreaterBoolean_SecondOp();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.StringLessBoolean <em>String Less Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Less Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringLessBoolean
	 * @generated
	 */
	EClass getStringLessBoolean();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.StringLessBoolean#getFirstOp <em>First Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringLessBoolean#getFirstOp()
	 * @see #getStringLessBoolean()
	 * @generated
	 */
	EAttribute getStringLessBoolean_FirstOp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.StringLessBoolean#getSecondOp <em>Second Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Op</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringLessBoolean#getSecondOp()
	 * @see #getStringLessBoolean()
	 * @generated
	 */
	EAttribute getStringLessBoolean_SecondOp();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.StrinNotNullBoolean <em>Strin Not Null Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strin Not Null Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.StrinNotNullBoolean
	 * @generated
	 */
	EClass getStrinNotNullBoolean();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.StrinNotNullBoolean#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see it.univaq.mancoosi.packagemm.StrinNotNullBoolean#getString()
	 * @see #getStrinNotNullBoolean()
	 * @generated
	 */
	EAttribute getStrinNotNullBoolean_String();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.StringNullBoolean <em>String Null Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Null Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringNullBoolean
	 * @generated
	 */
	EClass getStringNullBoolean();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.StringNullBoolean#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringNullBoolean#getString()
	 * @see #getStringNullBoolean()
	 * @generated
	 */
	EAttribute getStringNullBoolean_String();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.AndBooleanExpression <em>And Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Boolean Expression</em>'.
	 * @see it.univaq.mancoosi.packagemm.AndBooleanExpression
	 * @generated
	 */
	EClass getAndBooleanExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.AndBooleanExpression#getExps <em>Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exps</em>'.
	 * @see it.univaq.mancoosi.packagemm.AndBooleanExpression#getExps()
	 * @see #getAndBooleanExpression()
	 * @generated
	 */
	EReference getAndBooleanExpression_Exps();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.OrBooleanExpression <em>Or Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Boolean Expression</em>'.
	 * @see it.univaq.mancoosi.packagemm.OrBooleanExpression
	 * @generated
	 */
	EClass getOrBooleanExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.OrBooleanExpression#getExps <em>Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exps</em>'.
	 * @see it.univaq.mancoosi.packagemm.OrBooleanExpression#getExps()
	 * @see #getOrBooleanExpression()
	 * @generated
	 */
	EReference getOrBooleanExpression_Exps();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.StatementBoolean <em>Statement Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.StatementBoolean
	 * @generated
	 */
	EClass getStatementBoolean();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.StatementExistsBoolean <em>Statement Exists Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Exists Boolean</em>'.
	 * @see it.univaq.mancoosi.packagemm.StatementExistsBoolean
	 * @generated
	 */
	EClass getStatementExistsBoolean();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.StatementExistsBoolean#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.StatementExistsBoolean#getStatement()
	 * @see #getStatementExistsBoolean()
	 * @generated
	 */
	EAttribute getStatementExistsBoolean_Statement();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see it.univaq.mancoosi.packagemm.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Return#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.Return#getValue()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator</em>'.
	 * @see it.univaq.mancoosi.packagemm.Iterator
	 * @generated
	 */
	EClass getIterator();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.DirectoryIterator <em>Directory Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directory Iterator</em>'.
	 * @see it.univaq.mancoosi.packagemm.DirectoryIterator
	 * @generated
	 */
	EClass getDirectoryIterator();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.packagemm.DirectoryIterator#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Directory</em>'.
	 * @see it.univaq.mancoosi.packagemm.DirectoryIterator#getDirectory()
	 * @see #getDirectoryIterator()
	 * @generated
	 */
	EReference getDirectoryIterator_Directory();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.FileContentIterator <em>File Content Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Content Iterator</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileContentIterator
	 * @generated
	 */
	EClass getFileContentIterator();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.packagemm.FileContentIterator#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileContentIterator#getFile()
	 * @see #getFileContentIterator()
	 * @generated
	 */
	EReference getFileContentIterator_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.InputParameterIterator <em>Input Parameter Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameter Iterator</em>'.
	 * @see it.univaq.mancoosi.packagemm.InputParameterIterator
	 * @generated
	 */
	EClass getInputParameterIterator();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.packagemm.InputParameterIterator#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Parameters</em>'.
	 * @see it.univaq.mancoosi.packagemm.InputParameterIterator#getInputParameters()
	 * @see #getInputParameterIterator()
	 * @generated
	 */
	EReference getInputParameterIterator_InputParameters();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.EnumerationIterator <em>Enumeration Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Iterator</em>'.
	 * @see it.univaq.mancoosi.packagemm.EnumerationIterator
	 * @generated
	 */
	EClass getEnumerationIterator();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.packagemm.EnumerationIterator#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration</em>'.
	 * @see it.univaq.mancoosi.packagemm.EnumerationIterator#getEnumeration()
	 * @see #getEnumerationIterator()
	 * @generated
	 */
	EReference getEnumerationIterator_Enumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.EnumerationIterator#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see it.univaq.mancoosi.packagemm.EnumerationIterator#getStatements()
	 * @see #getEnumerationIterator()
	 * @generated
	 */
	EReference getEnumerationIterator_Statements();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.StringIterator <em>String Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Iterator</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringIterator
	 * @generated
	 */
	EClass getStringIterator();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see it.univaq.mancoosi.packagemm.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.packagemm.Enumeration#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see it.univaq.mancoosi.packagemm.Enumeration#getElements()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Elements();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.EnumerationElement <em>Enumeration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Element</em>'.
	 * @see it.univaq.mancoosi.packagemm.EnumerationElement
	 * @generated
	 */
	EClass getEnumerationElement();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.EnumerationElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see it.univaq.mancoosi.packagemm.EnumerationElement#getIndex()
	 * @see #getEnumerationElement()
	 * @generated
	 */
	EAttribute getEnumerationElement_Index();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.EnumerationElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.EnumerationElement#getValue()
	 * @see #getEnumerationElement()
	 * @generated
	 */
	EAttribute getEnumerationElement_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.FileSystemStatement <em>File System Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileSystemStatement
	 * @generated
	 */
	EClass getFileSystemStatement();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.mancoosi.packagemm.FileSystemStatement#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Files</em>'.
	 * @see it.univaq.mancoosi.packagemm.FileSystemStatement#getFiles()
	 * @see #getFileSystemStatement()
	 * @generated
	 */
	EReference getFileSystemStatement_Files();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.AdditionFileSystemStatement <em>Addition File System Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition File System Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.AdditionFileSystemStatement
	 * @generated
	 */
	EClass getAdditionFileSystemStatement();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.DeletionFileSystemStatement <em>Deletion File System Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deletion File System Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.DeletionFileSystemStatement
	 * @generated
	 */
	EClass getDeletionFileSystemStatement();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.UpdateFileSystemStatement <em>Update File System Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update File System Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.UpdateFileSystemStatement
	 * @generated
	 */
	EClass getUpdateFileSystemStatement();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.EnvironmentStatement <em>Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.EnvironmentStatement
	 * @generated
	 */
	EClass getEnvironmentStatement();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.EnvironmentStatement#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see it.univaq.mancoosi.packagemm.EnvironmentStatement#getEnvironment()
	 * @see #getEnvironmentStatement()
	 * @generated
	 */
	EAttribute getEnvironmentStatement_Environment();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.AdditionEnvironmentStatement <em>Addition Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Environment Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.AdditionEnvironmentStatement
	 * @generated
	 */
	EClass getAdditionEnvironmentStatement();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.DeletionEnvironmentStatement <em>Deletion Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deletion Environment Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.DeletionEnvironmentStatement
	 * @generated
	 */
	EClass getDeletionEnvironmentStatement();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.UpdateEnvironmentStatement <em>Update Environment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Environment Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.UpdateEnvironmentStatement
	 * @generated
	 */
	EClass getUpdateEnvironmentStatement();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PackageSettingStatement <em>Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Setting Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.PackageSettingStatement
	 * @generated
	 */
	EClass getPackageSettingStatement();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.PackageSettingStatement#getPkgsetting <em>Pkgsetting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pkgsetting</em>'.
	 * @see it.univaq.mancoosi.packagemm.PackageSettingStatement#getPkgsetting()
	 * @see #getPackageSettingStatement()
	 * @generated
	 */
	EAttribute getPackageSettingStatement_Pkgsetting();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.AdditionPackageSettingStatement <em>Addition Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Package Setting Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.AdditionPackageSettingStatement
	 * @generated
	 */
	EClass getAdditionPackageSettingStatement();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.DeletionPackageSettingStatement <em>Deletion Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deletion Package Setting Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.DeletionPackageSettingStatement
	 * @generated
	 */
	EClass getDeletionPackageSettingStatement();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.UpdatePackageSettingStatement <em>Update Package Setting Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Package Setting Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.UpdatePackageSettingStatement
	 * @generated
	 */
	EClass getUpdatePackageSettingStatement();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.NeutralStatement <em>Neutral Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neutral Statement</em>'.
	 * @see it.univaq.mancoosi.packagemm.NeutralStatement
	 * @generated
	 */
	EClass getNeutralStatement();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see it.univaq.mancoosi.packagemm.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see it.univaq.mancoosi.packagemm.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.File#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#getExtension()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Extension();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.File#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#getDescription()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Description();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.File#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#getSize()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Size();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.File#getCheckSum <em>Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Sum</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#getCheckSum()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_CheckSum();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.File#isIsDirectory <em>Is Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Directory</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#isIsDirectory()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_IsDirectory();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.File#isSuid <em>Suid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suid</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#isSuid()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Suid();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.File#isGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#isGuid()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Guid();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.File#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#getPermission()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Permission();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.File#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#getLocation()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.File#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childs</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#getChilds()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Childs();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.File#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#getParent()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Parent();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.File#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#getOwner()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Owner();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.File#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#getGroup()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Group();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.File#isIsMissing <em>Is Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Missing</em>'.
	 * @see it.univaq.mancoosi.packagemm.File#isIsMissing()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_IsMissing();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.DocumentationFile <em>Documentation File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation File</em>'.
	 * @see it.univaq.mancoosi.packagemm.DocumentationFile
	 * @generated
	 */
	EClass getDocumentationFile();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.mancoosi.packagemm.DocumentationFile#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pkg</em>'.
	 * @see it.univaq.mancoosi.packagemm.DocumentationFile#getPkg()
	 * @see #getDocumentationFile()
	 * @generated
	 */
	EReference getDocumentationFile_Pkg();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.InformationFile <em>Information File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information File</em>'.
	 * @see it.univaq.mancoosi.packagemm.InformationFile
	 * @generated
	 */
	EClass getInformationFile();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstDesktop <em>Postinst Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Desktop</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstDesktop
	 * @generated
	 */
	EClass getPostinstDesktop();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstDocBase <em>Postinst Doc Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Doc Base</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstDocBase
	 * @generated
	 */
	EClass getPostinstDocBase();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstDocBase#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstDocBase#getDocument()
	 * @see #getPostinstDocBase()
	 * @generated
	 */
	EReference getPostinstDocBase_Document();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstEmacsen <em>Postinst Emacsen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Emacsen</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstEmacsen
	 * @generated
	 */
	EClass getPostinstEmacsen();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstEmacsen#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstEmacsen#getPackage()
	 * @see #getPostinstEmacsen()
	 * @generated
	 */
	EReference getPostinstEmacsen_Package();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstGconf <em>Postinst Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Gconf</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstGconf
	 * @generated
	 */
	EClass getPostinstGconf();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PostinstGconf#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstGconf#getSchemas()
	 * @see #getPostinstGconf()
	 * @generated
	 */
	EReference getPostinstGconf_Schemas();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstGconfDefaults <em>Postinst Gconf Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Gconf Defaults</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstGconfDefaults
	 * @generated
	 */
	EClass getPostinstGconfDefaults();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstIcons <em>Postinst Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Icons</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstIcons
	 * @generated
	 */
	EClass getPostinstIcons();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PostinstIcons#getDirectories <em>Directories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directories</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstIcons#getDirectories()
	 * @see #getPostinstIcons()
	 * @generated
	 */
	EReference getPostinstIcons_Directories();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstInfo <em>Postinst Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Info</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInfo
	 * @generated
	 */
	EClass getPostinstInfo();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstInfo#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInfo#getFile()
	 * @see #getPostinstInfo()
	 * @generated
	 */
	EReference getPostinstInfo_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstInit <em>Postinst Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Init</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInit
	 * @generated
	 */
	EClass getPostinstInit();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstInit#getScriptParam <em>Script Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script Param</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInit#getScriptParam()
	 * @see #getPostinstInit()
	 * @generated
	 */
	EReference getPostinstInit_ScriptParam();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PostinstInit#getInitParams <em>Init Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Params</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInit#getInitParams()
	 * @see #getPostinstInit()
	 * @generated
	 */
	EReference getPostinstInit_InitParams();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstInit#getErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Handler</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInit#getErrorHandler()
	 * @see #getPostinstInit()
	 * @generated
	 */
	EReference getPostinstInit_ErrorHandler();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstInitNostart <em>Postinst Init Nostart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Init Nostart</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInitNostart
	 * @generated
	 */
	EClass getPostinstInitNostart();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstInitNostart#getScriptParam <em>Script Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script Param</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInitNostart#getScriptParam()
	 * @see #getPostinstInitNostart()
	 * @generated
	 */
	EReference getPostinstInitNostart_ScriptParam();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PostinstInitNostart#getInitParams <em>Init Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Params</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInitNostart#getInitParams()
	 * @see #getPostinstInitNostart()
	 * @generated
	 */
	EReference getPostinstInitNostart_InitParams();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstInitNostart#getErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Handler</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInitNostart#getErrorHandler()
	 * @see #getPostinstInitNostart()
	 * @generated
	 */
	EReference getPostinstInitNostart_ErrorHandler();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstInitRestart <em>Postinst Init Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Init Restart</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInitRestart
	 * @generated
	 */
	EClass getPostinstInitRestart();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstInitRestart#getScriptParam <em>Script Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script Param</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInitRestart#getScriptParam()
	 * @see #getPostinstInitRestart()
	 * @generated
	 */
	EReference getPostinstInitRestart_ScriptParam();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PostinstInitRestart#getInitParams <em>Init Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Params</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInitRestart#getInitParams()
	 * @see #getPostinstInitRestart()
	 * @generated
	 */
	EReference getPostinstInitRestart_InitParams();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstInitRestart#getErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Handler</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstInitRestart#getErrorHandler()
	 * @see #getPostinstInitRestart()
	 * @generated
	 */
	EReference getPostinstInitRestart_ErrorHandler();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstMakeshlibs <em>Postinst Makeshlibs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Makeshlibs</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstMakeshlibs
	 * @generated
	 */
	EClass getPostinstMakeshlibs();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstMenu <em>Postinst Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Menu</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstMenu
	 * @generated
	 */
	EClass getPostinstMenu();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstMenuMethod <em>Postinst Menu Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Menu Method</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstMenuMethod
	 * @generated
	 */
	EClass getPostinstMenuMethod();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstMenuMethod#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstMenuMethod#getPackage()
	 * @see #getPostinstMenuMethod()
	 * @generated
	 */
	EReference getPostinstMenuMethod_Package();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstMime <em>Postinst Mime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Mime</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstMime
	 * @generated
	 */
	EClass getPostinstMime();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstModules <em>Postinst Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Modules</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstModules
	 * @generated
	 */
	EClass getPostinstModules();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstModules#getKvers <em>Kvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kvers</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstModules#getKvers()
	 * @see #getPostinstModules()
	 * @generated
	 */
	EReference getPostinstModules_Kvers();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstPython <em>Postinst Python</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Python</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstPython
	 * @generated
	 */
	EClass getPostinstPython();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstPython#getPyver <em>Pyver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pyver</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstPython#getPyver()
	 * @see #getPostinstPython()
	 * @generated
	 */
	EReference getPostinstPython_Pyver();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PostinstPython#getDirlist <em>Dirlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dirlist</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstPython#getDirlist()
	 * @see #getPostinstPython()
	 * @generated
	 */
	EReference getPostinstPython_Dirlist();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstScrollkeeper <em>Postinst Scrollkeeper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Scrollkeeper</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstScrollkeeper
	 * @generated
	 */
	EClass getPostinstScrollkeeper();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstSgmlcatalog <em>Postinst Sgmlcatalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Sgmlcatalog</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstSgmlcatalog
	 * @generated
	 */
	EClass getPostinstSgmlcatalog();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstSgmlcatalog#getCentralcat <em>Centralcat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Centralcat</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstSgmlcatalog#getCentralcat()
	 * @see #getPostinstSgmlcatalog()
	 * @generated
	 */
	EReference getPostinstSgmlcatalog_Centralcat();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstSgmlcatalog#getOrdcats <em>Ordcats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ordcats</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstSgmlcatalog#getOrdcats()
	 * @see #getPostinstSgmlcatalog()
	 * @generated
	 */
	EReference getPostinstSgmlcatalog_Ordcats();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstSharedmimeinfo <em>Postinst Sharedmimeinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Sharedmimeinfo</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstSharedmimeinfo
	 * @generated
	 */
	EClass getPostinstSharedmimeinfo();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstSuid <em>Postinst Suid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Suid</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstSuid
	 * @generated
	 */
	EClass getPostinstSuid();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstSuid#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstSuid#getPackage()
	 * @see #getPostinstSuid()
	 * @generated
	 */
	EReference getPostinstSuid_Package();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstSuid#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstSuid#getFile()
	 * @see #getPostinstSuid()
	 * @generated
	 */
	EReference getPostinstSuid_File();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstSuid#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owner</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstSuid#getOwner()
	 * @see #getPostinstSuid()
	 * @generated
	 */
	EReference getPostinstSuid_Owner();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstSuid#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstSuid#getGroup()
	 * @see #getPostinstSuid()
	 * @generated
	 */
	EReference getPostinstSuid_Group();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstSuid#getPerms <em>Perms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Perms</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstSuid#getPerms()
	 * @see #getPostinstSuid()
	 * @generated
	 */
	EReference getPostinstSuid_Perms();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstUdev <em>Postinst Udev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Udev</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstUdev
	 * @generated
	 */
	EClass getPostinstUdev();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstUdev#getOld <em>Old</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Old</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstUdev#getOld()
	 * @see #getPostinstUdev()
	 * @generated
	 */
	EReference getPostinstUdev_Old();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstUdev#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstUdev#getRule()
	 * @see #getPostinstUdev()
	 * @generated
	 */
	EReference getPostinstUdev_Rule();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstUsrlocal <em>Postinst Usrlocal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Usrlocal</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstUsrlocal
	 * @generated
	 */
	EClass getPostinstUsrlocal();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PostinstUsrlocal#getDirlist <em>Dirlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dirlist</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstUsrlocal#getDirlist()
	 * @see #getPostinstUsrlocal()
	 * @generated
	 */
	EReference getPostinstUsrlocal_Dirlist();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstWm <em>Postinst Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Wm</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstWm
	 * @generated
	 */
	EClass getPostinstWm();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstWm#getWm <em>Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wm</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstWm#getWm()
	 * @see #getPostinstWm()
	 * @generated
	 */
	EReference getPostinstWm_Wm();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstWm#getWmman <em>Wmman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wmman</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstWm#getWmman()
	 * @see #getPostinstWm()
	 * @generated
	 */
	EReference getPostinstWm_Wmman();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstWm#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstWm#getPriority()
	 * @see #getPostinstWm()
	 * @generated
	 */
	EReference getPostinstWm_Priority();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstWmNoman <em>Postinst Wm Noman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Wm Noman</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstWmNoman
	 * @generated
	 */
	EClass getPostinstWmNoman();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstWmNoman#getWm <em>Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wm</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstWmNoman#getWm()
	 * @see #getPostinstWmNoman()
	 * @generated
	 */
	EReference getPostinstWmNoman_Wm();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstWmNoman#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstWmNoman#getPriority()
	 * @see #getPostinstWmNoman()
	 * @generated
	 */
	EReference getPostinstWmNoman_Priority();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstXfonts <em>Postinst Xfonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Xfonts</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstXfonts
	 * @generated
	 */
	EClass getPostinstXfonts();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PostinstXfonts#getCmds <em>Cmds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmds</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstXfonts#getCmds()
	 * @see #getPostinstXfonts()
	 * @generated
	 */
	EReference getPostinstXfonts_Cmds();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmDebconf <em>Postrm Debconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Debconf</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmDebconf
	 * @generated
	 */
	EClass getPostrmDebconf();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmDesktop <em>Postrm Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Desktop</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmDesktop
	 * @generated
	 */
	EClass getPostrmDesktop();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmGconf <em>Postrm Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Gconf</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmGconf
	 * @generated
	 */
	EClass getPostrmGconf();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PostrmGconf#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmGconf#getSchemas()
	 * @see #getPostrmGconf()
	 * @generated
	 */
	EReference getPostrmGconf_Schemas();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmGconfDefaults <em>Postrm Gconf Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Gconf Defaults</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmGconfDefaults
	 * @generated
	 */
	EClass getPostrmGconfDefaults();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmIcons <em>Postrm Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Icons</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmIcons
	 * @generated
	 */
	EClass getPostrmIcons();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PostrmIcons#getDirs <em>Dirs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dirs</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmIcons#getDirs()
	 * @see #getPostrmIcons()
	 * @generated
	 */
	EReference getPostrmIcons_Dirs();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmInit <em>Postrm Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Init</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmInit
	 * @generated
	 */
	EClass getPostrmInit();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostrmInit#getScriptParam <em>Script Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script Param</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmInit#getScriptParam()
	 * @see #getPostrmInit()
	 * @generated
	 */
	EReference getPostrmInit_ScriptParam();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostrmInit#getErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Handler</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmInit#getErrorHandler()
	 * @see #getPostrmInit()
	 * @generated
	 */
	EReference getPostrmInit_ErrorHandler();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmMakeshlibs <em>Postrm Makeshlibs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Makeshlibs</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmMakeshlibs
	 * @generated
	 */
	EClass getPostrmMakeshlibs();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmMenu <em>Postrm Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Menu</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmMenu
	 * @generated
	 */
	EClass getPostrmMenu();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmMenuMethod <em>Postrm Menu Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Menu Method</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmMenuMethod
	 * @generated
	 */
	EClass getPostrmMenuMethod();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostrmMenuMethod#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmMenuMethod#getPackage()
	 * @see #getPostrmMenuMethod()
	 * @generated
	 */
	EReference getPostrmMenuMethod_Package();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmMime <em>Postrm Mime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Mime</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmMime
	 * @generated
	 */
	EClass getPostrmMime();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmModules <em>Postrm Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Modules</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmModules
	 * @generated
	 */
	EClass getPostrmModules();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostrmModules#getKvers <em>Kvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kvers</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmModules#getKvers()
	 * @see #getPostrmModules()
	 * @generated
	 */
	EReference getPostrmModules_Kvers();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmScrollkeeper <em>Postrm Scrollkeeper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Scrollkeeper</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmScrollkeeper
	 * @generated
	 */
	EClass getPostrmScrollkeeper();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmSgmlcatalog <em>Postrm Sgmlcatalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Sgmlcatalog</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmSgmlcatalog
	 * @generated
	 */
	EClass getPostrmSgmlcatalog();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostrmSgmlcatalog#getCentralcat <em>Centralcat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Centralcat</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmSgmlcatalog#getCentralcat()
	 * @see #getPostrmSgmlcatalog()
	 * @generated
	 */
	EReference getPostrmSgmlcatalog_Centralcat();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmSharedmimeinfo <em>Postrm Sharedmimeinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Sharedmimeinfo</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmSharedmimeinfo
	 * @generated
	 */
	EClass getPostrmSharedmimeinfo();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmSuid <em>Postrm Suid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Suid</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmSuid
	 * @generated
	 */
	EClass getPostrmSuid();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostrmSuid#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmSuid#getPackage()
	 * @see #getPostrmSuid()
	 * @generated
	 */
	EReference getPostrmSuid_Package();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostrmSuid#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmSuid#getFile()
	 * @see #getPostrmSuid()
	 * @generated
	 */
	EReference getPostrmSuid_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostrmXfonts <em>Postrm Xfonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postrm Xfonts</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmXfonts
	 * @generated
	 */
	EClass getPostrmXfonts();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PostrmXfonts#getCmds <em>Cmds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmds</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostrmXfonts#getCmds()
	 * @see #getPostrmXfonts()
	 * @generated
	 */
	EReference getPostrmXfonts_Cmds();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PreinstUdev <em>Preinst Udev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preinst Udev</em>'.
	 * @see it.univaq.mancoosi.packagemm.PreinstUdev
	 * @generated
	 */
	EClass getPreinstUdev();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PreinstUdev#getOld <em>Old</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Old</em>'.
	 * @see it.univaq.mancoosi.packagemm.PreinstUdev#getOld()
	 * @see #getPreinstUdev()
	 * @generated
	 */
	EReference getPreinstUdev_Old();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PreinstUdev#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see it.univaq.mancoosi.packagemm.PreinstUdev#getRule()
	 * @see #getPreinstUdev()
	 * @generated
	 */
	EReference getPreinstUdev_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PreinstUdev#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see it.univaq.mancoosi.packagemm.PreinstUdev#getPackage()
	 * @see #getPreinstUdev()
	 * @generated
	 */
	EReference getPreinstUdev_Package();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PreinstUser <em>Preinst User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preinst User</em>'.
	 * @see it.univaq.mancoosi.packagemm.PreinstUser
	 * @generated
	 */
	EClass getPreinstUser();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PreinstUser#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dir</em>'.
	 * @see it.univaq.mancoosi.packagemm.PreinstUser#getDir()
	 * @see #getPreinstUser()
	 * @generated
	 */
	EReference getPreinstUser_Dir();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PreinstUser#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mode</em>'.
	 * @see it.univaq.mancoosi.packagemm.PreinstUser#getMode()
	 * @see #getPreinstUser()
	 * @generated
	 */
	EReference getPreinstUser_Mode();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PreinstUser#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see it.univaq.mancoosi.packagemm.PreinstUser#getUser()
	 * @see #getPreinstUser()
	 * @generated
	 */
	EReference getPreinstUser_User();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PreinstUser#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see it.univaq.mancoosi.packagemm.PreinstUser#getGroup()
	 * @see #getPreinstUser()
	 * @generated
	 */
	EReference getPreinstUser_Group();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PrermDocBase <em>Prerm Doc Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Doc Base</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermDocBase
	 * @generated
	 */
	EClass getPrermDocBase();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PrermDocBase#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermDocBase#getDocument()
	 * @see #getPrermDocBase()
	 * @generated
	 */
	EReference getPrermDocBase_Document();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PrermEmacsen <em>Prerm Emacsen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Emacsen</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermEmacsen
	 * @generated
	 */
	EClass getPrermEmacsen();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PrermEmacsen#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermEmacsen#getPackage()
	 * @see #getPrermEmacsen()
	 * @generated
	 */
	EReference getPrermEmacsen_Package();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PrermGconf <em>Prerm Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Gconf</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermGconf
	 * @generated
	 */
	EClass getPrermGconf();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PrermGconf#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermGconf#getSchemas()
	 * @see #getPrermGconf()
	 * @generated
	 */
	EReference getPrermGconf_Schemas();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PrermInfo <em>Prerm Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Info</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermInfo
	 * @generated
	 */
	EClass getPrermInfo();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PrermInfo#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermInfo#getFile()
	 * @see #getPrermInfo()
	 * @generated
	 */
	EReference getPrermInfo_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PrermInit <em>Prerm Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Init</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermInit
	 * @generated
	 */
	EClass getPrermInit();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PrermInit#getScriptParam <em>Script Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script Param</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermInit#getScriptParam()
	 * @see #getPrermInit()
	 * @generated
	 */
	EReference getPrermInit_ScriptParam();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PrermInit#getErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Handler</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermInit#getErrorHandler()
	 * @see #getPrermInit()
	 * @generated
	 */
	EReference getPrermInit_ErrorHandler();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PrermInitNorestart <em>Prerm Init Norestart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Init Norestart</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermInitNorestart
	 * @generated
	 */
	EClass getPrermInitNorestart();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PrermInitNorestart#getScriptParam <em>Script Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script Param</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermInitNorestart#getScriptParam()
	 * @see #getPrermInitNorestart()
	 * @generated
	 */
	EReference getPrermInitNorestart_ScriptParam();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PrermInitNorestart#getErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Handler</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermInitNorestart#getErrorHandler()
	 * @see #getPrermInitNorestart()
	 * @generated
	 */
	EReference getPrermInitNorestart_ErrorHandler();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PrermPython <em>Prerm Python</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Python</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermPython
	 * @generated
	 */
	EClass getPrermPython();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PrermPython#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermPython#getPackage()
	 * @see #getPrermPython()
	 * @generated
	 */
	EReference getPrermPython_Package();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PrermSgmlcatalog <em>Prerm Sgmlcatalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Sgmlcatalog</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermSgmlcatalog
	 * @generated
	 */
	EClass getPrermSgmlcatalog();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PrermSgmlcatalog#getCentralcat <em>Centralcat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Centralcat</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermSgmlcatalog#getCentralcat()
	 * @see #getPrermSgmlcatalog()
	 * @generated
	 */
	EReference getPrermSgmlcatalog_Centralcat();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PrermUsrlocal <em>Prerm Usrlocal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Usrlocal</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermUsrlocal
	 * @generated
	 */
	EClass getPrermUsrlocal();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PrermUsrlocal#getDirlist <em>Dirlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dirlist</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermUsrlocal#getDirlist()
	 * @see #getPrermUsrlocal()
	 * @generated
	 */
	EReference getPrermUsrlocal_Dirlist();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PrermWm <em>Prerm Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerm Wm</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermWm
	 * @generated
	 */
	EClass getPrermWm();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PrermWm#getWm <em>Wm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wm</em>'.
	 * @see it.univaq.mancoosi.packagemm.PrermWm#getWm()
	 * @see #getPrermWm()
	 * @generated
	 */
	EReference getPrermWm_Wm();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.UpdatePythonModules <em>Update Python Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Python Modules</em>'.
	 * @see it.univaq.mancoosi.packagemm.UpdatePythonModules
	 * @generated
	 */
	EClass getUpdatePythonModules();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.UpdatePythonModules#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see it.univaq.mancoosi.packagemm.UpdatePythonModules#getFile()
	 * @see #getUpdatePythonModules()
	 * @generated
	 */
	EReference getUpdatePythonModules_File();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.PostinstAddAlternative <em>Postinst Add Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postinst Add Alternative</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstAddAlternative
	 * @generated
	 */
	EClass getPostinstAddAlternative();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.PostinstAddAlternative#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstAddAlternative#getMaster()
	 * @see #getPostinstAddAlternative()
	 * @generated
	 */
	EReference getPostinstAddAlternative_Master();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.PostinstAddAlternative#getSlave <em>Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slave</em>'.
	 * @see it.univaq.mancoosi.packagemm.PostinstAddAlternative#getSlave()
	 * @see #getPostinstAddAlternative()
	 * @generated
	 */
	EReference getPostinstAddAlternative_Slave();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.AddAlternative <em>Add Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Alternative</em>'.
	 * @see it.univaq.mancoosi.packagemm.AddAlternative
	 * @generated
	 */
	EClass getAddAlternative();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.AddAlternative#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see it.univaq.mancoosi.packagemm.AddAlternative#getLink()
	 * @see #getAddAlternative()
	 * @generated
	 */
	EAttribute getAddAlternative_Link();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.AddAlternative#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.mancoosi.packagemm.AddAlternative#getName()
	 * @see #getAddAlternative()
	 * @generated
	 */
	EAttribute getAddAlternative_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.AddAlternative#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see it.univaq.mancoosi.packagemm.AddAlternative#getPath()
	 * @see #getAddAlternative()
	 * @generated
	 */
	EAttribute getAddAlternative_Path();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.AddAlternative#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see it.univaq.mancoosi.packagemm.AddAlternative#getPriority()
	 * @see #getAddAlternative()
	 * @generated
	 */
	EAttribute getAddAlternative_Priority();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see it.univaq.mancoosi.packagemm.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Param#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.Param#getValue()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.StringParam <em>String Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Param</em>'.
	 * @see it.univaq.mancoosi.packagemm.StringParam
	 * @generated
	 */
	EClass getStringParam();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.IntParam <em>Int Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Param</em>'.
	 * @see it.univaq.mancoosi.packagemm.IntParam
	 * @generated
	 */
	EClass getIntParam();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.SingleConflict <em>Single Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Conflict</em>'.
	 * @see it.univaq.mancoosi.packagemm.SingleConflict
	 * @generated
	 */
	EClass getSingleConflict();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.SingleConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conflict</em>'.
	 * @see it.univaq.mancoosi.packagemm.SingleConflict#getConflict()
	 * @see #getSingleConflict()
	 * @generated
	 */
	EReference getSingleConflict_Conflict();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.SingleConflict#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see it.univaq.mancoosi.packagemm.SingleConflict#getVersion()
	 * @see #getSingleConflict()
	 * @generated
	 */
	EAttribute getSingleConflict_Version();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.SingleConflict#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.SingleConflict#getValue()
	 * @see #getSingleConflict()
	 * @generated
	 */
	EAttribute getSingleConflict_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict</em>'.
	 * @see it.univaq.mancoosi.packagemm.Conflict
	 * @generated
	 */
	EClass getConflict();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Conflict#getAndConflict <em>And Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And Conflict</em>'.
	 * @see it.univaq.mancoosi.packagemm.Conflict#getAndConflict()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_AndConflict();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Conflict#getOrConflict <em>Or Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or Conflict</em>'.
	 * @see it.univaq.mancoosi.packagemm.Conflict#getOrConflict()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_OrConflict();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.mancoosi.packagemm.Conflict#getSingleConflict <em>Single Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Conflict</em>'.
	 * @see it.univaq.mancoosi.packagemm.Conflict#getSingleConflict()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_SingleConflict();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Conflict#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pkg</em>'.
	 * @see it.univaq.mancoosi.packagemm.Conflict#getPkg()
	 * @see #getConflict()
	 * @generated
	 */
	EAttribute getConflict_Pkg();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.AndConflict <em>And Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Conflict</em>'.
	 * @see it.univaq.mancoosi.packagemm.AndConflict
	 * @generated
	 */
	EClass getAndConflict();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.AndConflict#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see it.univaq.mancoosi.packagemm.AndConflict#getOps()
	 * @see #getAndConflict()
	 * @generated
	 */
	EReference getAndConflict_Ops();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.AndConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conflict</em>'.
	 * @see it.univaq.mancoosi.packagemm.AndConflict#getConflict()
	 * @see #getAndConflict()
	 * @generated
	 */
	EReference getAndConflict_Conflict();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.OrConflict <em>Or Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Conflict</em>'.
	 * @see it.univaq.mancoosi.packagemm.OrConflict
	 * @generated
	 */
	EClass getOrConflict();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.mancoosi.packagemm.OrConflict#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see it.univaq.mancoosi.packagemm.OrConflict#getOps()
	 * @see #getOrConflict()
	 * @generated
	 */
	EReference getOrConflict_Ops();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.mancoosi.packagemm.OrConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conflict</em>'.
	 * @see it.univaq.mancoosi.packagemm.OrConflict#getConflict()
	 * @see #getOrConflict()
	 * @generated
	 */
	EReference getOrConflict_Conflict();

	/**
	 * Returns the meta object for class '{@link it.univaq.mancoosi.packagemm.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see it.univaq.mancoosi.packagemm.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Assignment#getAssigned <em>Assigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned</em>'.
	 * @see it.univaq.mancoosi.packagemm.Assignment#getAssigned()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Assigned();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.mancoosi.packagemm.Assignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see it.univaq.mancoosi.packagemm.Assignment#getExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Expression();

	/**
	 * Returns the meta object for enum '{@link it.univaq.mancoosi.packagemm.PriorityType <em>Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority Type</em>'.
	 * @see it.univaq.mancoosi.packagemm.PriorityType
	 * @generated
	 */
	EEnum getPriorityType();

	/**
	 * Returns the meta object for enum '{@link it.univaq.mancoosi.packagemm.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Type</em>'.
	 * @see it.univaq.mancoosi.packagemm.StatusType
	 * @generated
	 */
	EEnum getStatusType();

	/**
	 * Returns the meta object for enum '{@link it.univaq.mancoosi.packagemm.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Version Type</em>'.
	 * @see it.univaq.mancoosi.packagemm.VersionType
	 * @generated
	 */
	EEnum getVersionType();

	/**
	 * Returns the meta object for enum '{@link it.univaq.mancoosi.packagemm.ReturnStatementValue <em>Return Statement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Return Statement Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.ReturnStatementValue
	 * @generated
	 */
	EEnum getReturnStatementValue();

	/**
	 * Returns the meta object for enum '{@link it.univaq.mancoosi.packagemm.CasePrermConditionValue <em>Case Prerm Condition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Case Prerm Condition Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePrermConditionValue
	 * @generated
	 */
	EEnum getCasePrermConditionValue();

	/**
	 * Returns the meta object for enum '{@link it.univaq.mancoosi.packagemm.CasePostrmConditionValue <em>Case Postrm Condition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Case Postrm Condition Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePostrmConditionValue
	 * @generated
	 */
	EEnum getCasePostrmConditionValue();

	/**
	 * Returns the meta object for enum '{@link it.univaq.mancoosi.packagemm.CasePreinstConditionValue <em>Case Preinst Condition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Case Preinst Condition Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePreinstConditionValue
	 * @generated
	 */
	EEnum getCasePreinstConditionValue();

	/**
	 * Returns the meta object for enum '{@link it.univaq.mancoosi.packagemm.CasePostinstConditionValue <em>Case Postinst Condition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Case Postinst Condition Value</em>'.
	 * @see it.univaq.mancoosi.packagemm.CasePostinstConditionValue
	 * @generated
	 */
	EEnum getCasePostinstConditionValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PackagemmFactory getPackagemmFactory();

} //PackagemmPackage
