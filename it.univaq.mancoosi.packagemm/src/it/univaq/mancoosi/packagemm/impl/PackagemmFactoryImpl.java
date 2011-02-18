/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.AddAlternative;
import it.univaq.mancoosi.packagemm.AdditionEnvironmentStatement;
import it.univaq.mancoosi.packagemm.AdditionFileSystemStatement;
import it.univaq.mancoosi.packagemm.AdditionPackageSettingStatement;
import it.univaq.mancoosi.packagemm.AndBooleanExpression;
import it.univaq.mancoosi.packagemm.AndConflict;
import it.univaq.mancoosi.packagemm.AndDep;
import it.univaq.mancoosi.packagemm.Assignment;
import it.univaq.mancoosi.packagemm.BasicCase;
import it.univaq.mancoosi.packagemm.BasicCaseCondition;
import it.univaq.mancoosi.packagemm.BooleanExpression;
import it.univaq.mancoosi.packagemm.CasePostinst;
import it.univaq.mancoosi.packagemm.CasePostinstCondition;
import it.univaq.mancoosi.packagemm.CasePostinstConditionValue;
import it.univaq.mancoosi.packagemm.CasePostrm;
import it.univaq.mancoosi.packagemm.CasePostrmCondition;
import it.univaq.mancoosi.packagemm.CasePostrmConditionValue;
import it.univaq.mancoosi.packagemm.CasePreinst;
import it.univaq.mancoosi.packagemm.CasePreinstCondition;
import it.univaq.mancoosi.packagemm.CasePreinstConditionValue;
import it.univaq.mancoosi.packagemm.CasePrerm;
import it.univaq.mancoosi.packagemm.CasePrermCondition;
import it.univaq.mancoosi.packagemm.CasePrermConditionValue;
import it.univaq.mancoosi.packagemm.Comment;
import it.univaq.mancoosi.packagemm.ConfigScript;
import it.univaq.mancoosi.packagemm.DefaultCaseCondition;
import it.univaq.mancoosi.packagemm.DeletionEnvironmentStatement;
import it.univaq.mancoosi.packagemm.DeletionFileSystemStatement;
import it.univaq.mancoosi.packagemm.DeletionPackageSettingStatement;
import it.univaq.mancoosi.packagemm.DirectoryIterator;
import it.univaq.mancoosi.packagemm.DocumentationFile;
import it.univaq.mancoosi.packagemm.Enumeration;
import it.univaq.mancoosi.packagemm.EnumerationElement;
import it.univaq.mancoosi.packagemm.EnumerationIterator;
import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.packagemm.FileBlockDeviceBoolean;
import it.univaq.mancoosi.packagemm.FileCharacterDeviceBoolean;
import it.univaq.mancoosi.packagemm.FileContentIterator;
import it.univaq.mancoosi.packagemm.FileExecutePermissionBoolean;
import it.univaq.mancoosi.packagemm.FileExistsBoolean;
import it.univaq.mancoosi.packagemm.FileNotZeroSizeBoolean;
import it.univaq.mancoosi.packagemm.FilePipeBoolean;
import it.univaq.mancoosi.packagemm.FileReadPermissionBoolean;
import it.univaq.mancoosi.packagemm.FileSocketBoolean;
import it.univaq.mancoosi.packagemm.FileSymbolicLinkBoolean;
import it.univaq.mancoosi.packagemm.FileTerminalDeviceBoolean;
import it.univaq.mancoosi.packagemm.FileWritePermissionBoolean;
import it.univaq.mancoosi.packagemm.If;
import it.univaq.mancoosi.packagemm.InformationFile;
import it.univaq.mancoosi.packagemm.InputParameter;
import it.univaq.mancoosi.packagemm.InputParameterIterator;
import it.univaq.mancoosi.packagemm.IntParam;
import it.univaq.mancoosi.packagemm.IntegerEqualBoolean;
import it.univaq.mancoosi.packagemm.IntegerGreaterBoolean;
import it.univaq.mancoosi.packagemm.IntegerGreaterEqualBoolean;
import it.univaq.mancoosi.packagemm.IntegerLessBoolean;
import it.univaq.mancoosi.packagemm.IntegerLessEqualBoolean;
import it.univaq.mancoosi.packagemm.IntegerNotEqualBoolean;
import it.univaq.mancoosi.packagemm.IsDirectoryBoolean;
import it.univaq.mancoosi.packagemm.Message;
import it.univaq.mancoosi.packagemm.OrBooleanExpression;
import it.univaq.mancoosi.packagemm.OrConflict;
import it.univaq.mancoosi.packagemm.OrDep;
import it.univaq.mancoosi.packagemm.PackagemmFactory;
import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.Param;
import it.univaq.mancoosi.packagemm.PostinstAddAlternative;
import it.univaq.mancoosi.packagemm.PostinstDesktop;
import it.univaq.mancoosi.packagemm.PostinstDocBase;
import it.univaq.mancoosi.packagemm.PostinstEmacsen;
import it.univaq.mancoosi.packagemm.PostinstGconf;
import it.univaq.mancoosi.packagemm.PostinstGconfDefaults;
import it.univaq.mancoosi.packagemm.PostinstIcons;
import it.univaq.mancoosi.packagemm.PostinstInfo;
import it.univaq.mancoosi.packagemm.PostinstInit;
import it.univaq.mancoosi.packagemm.PostinstInitNostart;
import it.univaq.mancoosi.packagemm.PostinstInitRestart;
import it.univaq.mancoosi.packagemm.PostinstMakeshlibs;
import it.univaq.mancoosi.packagemm.PostinstMenu;
import it.univaq.mancoosi.packagemm.PostinstMenuMethod;
import it.univaq.mancoosi.packagemm.PostinstMime;
import it.univaq.mancoosi.packagemm.PostinstModules;
import it.univaq.mancoosi.packagemm.PostinstPython;
import it.univaq.mancoosi.packagemm.PostinstScript;
import it.univaq.mancoosi.packagemm.PostinstScrollkeeper;
import it.univaq.mancoosi.packagemm.PostinstSgmlcatalog;
import it.univaq.mancoosi.packagemm.PostinstSharedmimeinfo;
import it.univaq.mancoosi.packagemm.PostinstSuid;
import it.univaq.mancoosi.packagemm.PostinstUdev;
import it.univaq.mancoosi.packagemm.PostinstUsrlocal;
import it.univaq.mancoosi.packagemm.PostinstWm;
import it.univaq.mancoosi.packagemm.PostinstWmNoman;
import it.univaq.mancoosi.packagemm.PostinstXfonts;
import it.univaq.mancoosi.packagemm.PostrmDebconf;
import it.univaq.mancoosi.packagemm.PostrmDesktop;
import it.univaq.mancoosi.packagemm.PostrmGconf;
import it.univaq.mancoosi.packagemm.PostrmGconfDefaults;
import it.univaq.mancoosi.packagemm.PostrmIcons;
import it.univaq.mancoosi.packagemm.PostrmInit;
import it.univaq.mancoosi.packagemm.PostrmMakeshlibs;
import it.univaq.mancoosi.packagemm.PostrmMenu;
import it.univaq.mancoosi.packagemm.PostrmMenuMethod;
import it.univaq.mancoosi.packagemm.PostrmMime;
import it.univaq.mancoosi.packagemm.PostrmModules;
import it.univaq.mancoosi.packagemm.PostrmScript;
import it.univaq.mancoosi.packagemm.PostrmScrollkeeper;
import it.univaq.mancoosi.packagemm.PostrmSgmlcatalog;
import it.univaq.mancoosi.packagemm.PostrmSharedmimeinfo;
import it.univaq.mancoosi.packagemm.PostrmSuid;
import it.univaq.mancoosi.packagemm.PostrmXfonts;
import it.univaq.mancoosi.packagemm.PreinstScript;
import it.univaq.mancoosi.packagemm.PreinstUdev;
import it.univaq.mancoosi.packagemm.PreinstUser;
import it.univaq.mancoosi.packagemm.PrermDocBase;
import it.univaq.mancoosi.packagemm.PrermEmacsen;
import it.univaq.mancoosi.packagemm.PrermGconf;
import it.univaq.mancoosi.packagemm.PrermInfo;
import it.univaq.mancoosi.packagemm.PrermInit;
import it.univaq.mancoosi.packagemm.PrermInitNorestart;
import it.univaq.mancoosi.packagemm.PrermPython;
import it.univaq.mancoosi.packagemm.PrermScript;
import it.univaq.mancoosi.packagemm.PrermSgmlcatalog;
import it.univaq.mancoosi.packagemm.PrermUsrlocal;
import it.univaq.mancoosi.packagemm.PrermWm;
import it.univaq.mancoosi.packagemm.PriorityType;
import it.univaq.mancoosi.packagemm.RegularFileBoolean;
import it.univaq.mancoosi.packagemm.Return;
import it.univaq.mancoosi.packagemm.ReturnStatementValue;
import it.univaq.mancoosi.packagemm.Script;
import it.univaq.mancoosi.packagemm.SingleConflict;
import it.univaq.mancoosi.packagemm.SingleDep;
import it.univaq.mancoosi.packagemm.StatementBoolean;
import it.univaq.mancoosi.packagemm.StatementExistsBoolean;
import it.univaq.mancoosi.packagemm.StrinNotNullBoolean;
import it.univaq.mancoosi.packagemm.StringEqualBoolean;
import it.univaq.mancoosi.packagemm.StringGreaterBoolean;
import it.univaq.mancoosi.packagemm.StringIterator;
import it.univaq.mancoosi.packagemm.StringLessBoolean;
import it.univaq.mancoosi.packagemm.StringNotEqualBoolean;
import it.univaq.mancoosi.packagemm.StringNullBoolean;
import it.univaq.mancoosi.packagemm.StringParam;
import it.univaq.mancoosi.packagemm.UpdateEnvironmentStatement;
import it.univaq.mancoosi.packagemm.UpdateFileSystemStatement;
import it.univaq.mancoosi.packagemm.UpdatePackageSettingStatement;
import it.univaq.mancoosi.packagemm.UpdatePythonModules;
import it.univaq.mancoosi.packagemm.VersionType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackagemmFactoryImpl extends EFactoryImpl implements PackagemmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackagemmFactory init() {
		try {
			PackagemmFactory thePackagemmFactory = (PackagemmFactory)EPackage.Registry.INSTANCE.getEFactory("packagemm"); 
			if (thePackagemmFactory != null) {
				return thePackagemmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PackagemmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagemmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PackagemmPackage.PACKAGE: return createPackage();
			case PackagemmPackage.SCRIPT: return createScript();
			case PackagemmPackage.INPUT_PARAMETER: return createInputParameter();
			case PackagemmPackage.AND_DEP: return createAndDep();
			case PackagemmPackage.OR_DEP: return createOrDep();
			case PackagemmPackage.SINGLE_DEP: return createSingleDep();
			case PackagemmPackage.PREINST_SCRIPT: return createPreinstScript();
			case PackagemmPackage.POSTINST_SCRIPT: return createPostinstScript();
			case PackagemmPackage.PRERM_SCRIPT: return createPrermScript();
			case PackagemmPackage.POSTRM_SCRIPT: return createPostrmScript();
			case PackagemmPackage.CONFIG_SCRIPT: return createConfigScript();
			case PackagemmPackage.DEFAULT_CASE_CONDITION: return createDefaultCaseCondition();
			case PackagemmPackage.CASE_PRERM: return createCasePrerm();
			case PackagemmPackage.CASE_PRERM_CONDITION: return createCasePrermCondition();
			case PackagemmPackage.CASE_POSTRM: return createCasePostrm();
			case PackagemmPackage.CASE_POSTRM_CONDITION: return createCasePostrmCondition();
			case PackagemmPackage.CASE_PREINST: return createCasePreinst();
			case PackagemmPackage.CASE_PREINST_CONDITION: return createCasePreinstCondition();
			case PackagemmPackage.CASE_POSTINST: return createCasePostinst();
			case PackagemmPackage.CASE_POSTINST_CONDITION: return createCasePostinstCondition();
			case PackagemmPackage.BASIC_CASE: return createBasicCase();
			case PackagemmPackage.BASIC_CASE_CONDITION: return createBasicCaseCondition();
			case PackagemmPackage.IF: return createIf();
			case PackagemmPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case PackagemmPackage.FILE_EXISTS_BOOLEAN: return createFileExistsBoolean();
			case PackagemmPackage.REGULAR_FILE_BOOLEAN: return createRegularFileBoolean();
			case PackagemmPackage.FILE_NOT_ZERO_SIZE_BOOLEAN: return createFileNotZeroSizeBoolean();
			case PackagemmPackage.IS_DIRECTORY_BOOLEAN: return createIsDirectoryBoolean();
			case PackagemmPackage.FILE_BLOCK_DEVICE_BOOLEAN: return createFileBlockDeviceBoolean();
			case PackagemmPackage.FILE_CHARACTER_DEVICE_BOOLEAN: return createFileCharacterDeviceBoolean();
			case PackagemmPackage.FILE_PIPE_BOOLEAN: return createFilePipeBoolean();
			case PackagemmPackage.FILE_SYMBOLIC_LINK_BOOLEAN: return createFileSymbolicLinkBoolean();
			case PackagemmPackage.FILE_SOCKET_BOOLEAN: return createFileSocketBoolean();
			case PackagemmPackage.FILE_TERMINAL_DEVICE_BOOLEAN: return createFileTerminalDeviceBoolean();
			case PackagemmPackage.FILE_READ_PERMISSION_BOOLEAN: return createFileReadPermissionBoolean();
			case PackagemmPackage.FILE_WRITE_PERMISSION_BOOLEAN: return createFileWritePermissionBoolean();
			case PackagemmPackage.FILE_EXECUTE_PERMISSION_BOOLEAN: return createFileExecutePermissionBoolean();
			case PackagemmPackage.INTEGER_EQUAL_BOOLEAN: return createIntegerEqualBoolean();
			case PackagemmPackage.INTEGER_NOT_EQUAL_BOOLEAN: return createIntegerNotEqualBoolean();
			case PackagemmPackage.INTEGER_GREATER_BOOLEAN: return createIntegerGreaterBoolean();
			case PackagemmPackage.INTEGER_GREATER_EQUAL_BOOLEAN: return createIntegerGreaterEqualBoolean();
			case PackagemmPackage.INTEGER_LESS_BOOLEAN: return createIntegerLessBoolean();
			case PackagemmPackage.INTEGER_LESS_EQUAL_BOOLEAN: return createIntegerLessEqualBoolean();
			case PackagemmPackage.STRING_EQUAL_BOOLEAN: return createStringEqualBoolean();
			case PackagemmPackage.STRING_NOT_EQUAL_BOOLEAN: return createStringNotEqualBoolean();
			case PackagemmPackage.STRING_GREATER_BOOLEAN: return createStringGreaterBoolean();
			case PackagemmPackage.STRING_LESS_BOOLEAN: return createStringLessBoolean();
			case PackagemmPackage.STRIN_NOT_NULL_BOOLEAN: return createStrinNotNullBoolean();
			case PackagemmPackage.STRING_NULL_BOOLEAN: return createStringNullBoolean();
			case PackagemmPackage.AND_BOOLEAN_EXPRESSION: return createAndBooleanExpression();
			case PackagemmPackage.OR_BOOLEAN_EXPRESSION: return createOrBooleanExpression();
			case PackagemmPackage.STATEMENT_BOOLEAN: return createStatementBoolean();
			case PackagemmPackage.STATEMENT_EXISTS_BOOLEAN: return createStatementExistsBoolean();
			case PackagemmPackage.RETURN: return createReturn();
			case PackagemmPackage.DIRECTORY_ITERATOR: return createDirectoryIterator();
			case PackagemmPackage.FILE_CONTENT_ITERATOR: return createFileContentIterator();
			case PackagemmPackage.INPUT_PARAMETER_ITERATOR: return createInputParameterIterator();
			case PackagemmPackage.ENUMERATION_ITERATOR: return createEnumerationIterator();
			case PackagemmPackage.STRING_ITERATOR: return createStringIterator();
			case PackagemmPackage.ENUMERATION: return createEnumeration();
			case PackagemmPackage.ENUMERATION_ELEMENT: return createEnumerationElement();
			case PackagemmPackage.ADDITION_FILE_SYSTEM_STATEMENT: return createAdditionFileSystemStatement();
			case PackagemmPackage.DELETION_FILE_SYSTEM_STATEMENT: return createDeletionFileSystemStatement();
			case PackagemmPackage.UPDATE_FILE_SYSTEM_STATEMENT: return createUpdateFileSystemStatement();
			case PackagemmPackage.ADDITION_ENVIRONMENT_STATEMENT: return createAdditionEnvironmentStatement();
			case PackagemmPackage.DELETION_ENVIRONMENT_STATEMENT: return createDeletionEnvironmentStatement();
			case PackagemmPackage.UPDATE_ENVIRONMENT_STATEMENT: return createUpdateEnvironmentStatement();
			case PackagemmPackage.ADDITION_PACKAGE_SETTING_STATEMENT: return createAdditionPackageSettingStatement();
			case PackagemmPackage.DELETION_PACKAGE_SETTING_STATEMENT: return createDeletionPackageSettingStatement();
			case PackagemmPackage.UPDATE_PACKAGE_SETTING_STATEMENT: return createUpdatePackageSettingStatement();
			case PackagemmPackage.MESSAGE: return createMessage();
			case PackagemmPackage.COMMENT: return createComment();
			case PackagemmPackage.FILE: return createFile();
			case PackagemmPackage.DOCUMENTATION_FILE: return createDocumentationFile();
			case PackagemmPackage.INFORMATION_FILE: return createInformationFile();
			case PackagemmPackage.POSTINST_DESKTOP: return createPostinstDesktop();
			case PackagemmPackage.POSTINST_DOC_BASE: return createPostinstDocBase();
			case PackagemmPackage.POSTINST_EMACSEN: return createPostinstEmacsen();
			case PackagemmPackage.POSTINST_GCONF: return createPostinstGconf();
			case PackagemmPackage.POSTINST_GCONF_DEFAULTS: return createPostinstGconfDefaults();
			case PackagemmPackage.POSTINST_ICONS: return createPostinstIcons();
			case PackagemmPackage.POSTINST_INFO: return createPostinstInfo();
			case PackagemmPackage.POSTINST_INIT: return createPostinstInit();
			case PackagemmPackage.POSTINST_INIT_NOSTART: return createPostinstInitNostart();
			case PackagemmPackage.POSTINST_INIT_RESTART: return createPostinstInitRestart();
			case PackagemmPackage.POSTINST_MAKESHLIBS: return createPostinstMakeshlibs();
			case PackagemmPackage.POSTINST_MENU: return createPostinstMenu();
			case PackagemmPackage.POSTINST_MENU_METHOD: return createPostinstMenuMethod();
			case PackagemmPackage.POSTINST_MIME: return createPostinstMime();
			case PackagemmPackage.POSTINST_MODULES: return createPostinstModules();
			case PackagemmPackage.POSTINST_PYTHON: return createPostinstPython();
			case PackagemmPackage.POSTINST_SCROLLKEEPER: return createPostinstScrollkeeper();
			case PackagemmPackage.POSTINST_SGMLCATALOG: return createPostinstSgmlcatalog();
			case PackagemmPackage.POSTINST_SHAREDMIMEINFO: return createPostinstSharedmimeinfo();
			case PackagemmPackage.POSTINST_SUID: return createPostinstSuid();
			case PackagemmPackage.POSTINST_UDEV: return createPostinstUdev();
			case PackagemmPackage.POSTINST_USRLOCAL: return createPostinstUsrlocal();
			case PackagemmPackage.POSTINST_WM: return createPostinstWm();
			case PackagemmPackage.POSTINST_WM_NOMAN: return createPostinstWmNoman();
			case PackagemmPackage.POSTINST_XFONTS: return createPostinstXfonts();
			case PackagemmPackage.POSTRM_DEBCONF: return createPostrmDebconf();
			case PackagemmPackage.POSTRM_DESKTOP: return createPostrmDesktop();
			case PackagemmPackage.POSTRM_GCONF: return createPostrmGconf();
			case PackagemmPackage.POSTRM_GCONF_DEFAULTS: return createPostrmGconfDefaults();
			case PackagemmPackage.POSTRM_ICONS: return createPostrmIcons();
			case PackagemmPackage.POSTRM_INIT: return createPostrmInit();
			case PackagemmPackage.POSTRM_MAKESHLIBS: return createPostrmMakeshlibs();
			case PackagemmPackage.POSTRM_MENU: return createPostrmMenu();
			case PackagemmPackage.POSTRM_MENU_METHOD: return createPostrmMenuMethod();
			case PackagemmPackage.POSTRM_MIME: return createPostrmMime();
			case PackagemmPackage.POSTRM_MODULES: return createPostrmModules();
			case PackagemmPackage.POSTRM_SCROLLKEEPER: return createPostrmScrollkeeper();
			case PackagemmPackage.POSTRM_SGMLCATALOG: return createPostrmSgmlcatalog();
			case PackagemmPackage.POSTRM_SHAREDMIMEINFO: return createPostrmSharedmimeinfo();
			case PackagemmPackage.POSTRM_SUID: return createPostrmSuid();
			case PackagemmPackage.POSTRM_XFONTS: return createPostrmXfonts();
			case PackagemmPackage.PREINST_UDEV: return createPreinstUdev();
			case PackagemmPackage.PREINST_USER: return createPreinstUser();
			case PackagemmPackage.PRERM_DOC_BASE: return createPrermDocBase();
			case PackagemmPackage.PRERM_EMACSEN: return createPrermEmacsen();
			case PackagemmPackage.PRERM_GCONF: return createPrermGconf();
			case PackagemmPackage.PRERM_INFO: return createPrermInfo();
			case PackagemmPackage.PRERM_INIT: return createPrermInit();
			case PackagemmPackage.PRERM_INIT_NORESTART: return createPrermInitNorestart();
			case PackagemmPackage.PRERM_PYTHON: return createPrermPython();
			case PackagemmPackage.PRERM_SGMLCATALOG: return createPrermSgmlcatalog();
			case PackagemmPackage.PRERM_USRLOCAL: return createPrermUsrlocal();
			case PackagemmPackage.PRERM_WM: return createPrermWm();
			case PackagemmPackage.UPDATE_PYTHON_MODULES: return createUpdatePythonModules();
			case PackagemmPackage.POSTINST_ADD_ALTERNATIVE: return createPostinstAddAlternative();
			case PackagemmPackage.ADD_ALTERNATIVE: return createAddAlternative();
			case PackagemmPackage.PARAM: return createParam();
			case PackagemmPackage.STRING_PARAM: return createStringParam();
			case PackagemmPackage.INT_PARAM: return createIntParam();
			case PackagemmPackage.SINGLE_CONFLICT: return createSingleConflict();
			case PackagemmPackage.AND_CONFLICT: return createAndConflict();
			case PackagemmPackage.OR_CONFLICT: return createOrConflict();
			case PackagemmPackage.ASSIGNMENT: return createAssignment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PackagemmPackage.PRIORITY_TYPE:
				return createPriorityTypeFromString(eDataType, initialValue);
			case PackagemmPackage.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
			case PackagemmPackage.RETURN_STATEMENT_VALUE:
				return createReturnStatementValueFromString(eDataType, initialValue);
			case PackagemmPackage.CASE_PRERM_CONDITION_VALUE:
				return createCasePrermConditionValueFromString(eDataType, initialValue);
			case PackagemmPackage.CASE_POSTRM_CONDITION_VALUE:
				return createCasePostrmConditionValueFromString(eDataType, initialValue);
			case PackagemmPackage.CASE_PREINST_CONDITION_VALUE:
				return createCasePreinstConditionValueFromString(eDataType, initialValue);
			case PackagemmPackage.CASE_POSTINST_CONDITION_VALUE:
				return createCasePostinstConditionValueFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PackagemmPackage.PRIORITY_TYPE:
				return convertPriorityTypeToString(eDataType, instanceValue);
			case PackagemmPackage.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			case PackagemmPackage.RETURN_STATEMENT_VALUE:
				return convertReturnStatementValueToString(eDataType, instanceValue);
			case PackagemmPackage.CASE_PRERM_CONDITION_VALUE:
				return convertCasePrermConditionValueToString(eDataType, instanceValue);
			case PackagemmPackage.CASE_POSTRM_CONDITION_VALUE:
				return convertCasePostrmConditionValueToString(eDataType, instanceValue);
			case PackagemmPackage.CASE_PREINST_CONDITION_VALUE:
				return convertCasePreinstConditionValueToString(eDataType, instanceValue);
			case PackagemmPackage.CASE_POSTINST_CONDITION_VALUE:
				return convertCasePostinstConditionValueToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.mancoosi.packagemm.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParameter createInputParameter() {
		InputParameterImpl inputParameter = new InputParameterImpl();
		return inputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndDep createAndDep() {
		AndDepImpl andDep = new AndDepImpl();
		return andDep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrDep createOrDep() {
		OrDepImpl orDep = new OrDepImpl();
		return orDep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleDep createSingleDep() {
		SingleDepImpl singleDep = new SingleDepImpl();
		return singleDep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreinstScript createPreinstScript() {
		PreinstScriptImpl preinstScript = new PreinstScriptImpl();
		return preinstScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstScript createPostinstScript() {
		PostinstScriptImpl postinstScript = new PostinstScriptImpl();
		return postinstScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrermScript createPrermScript() {
		PrermScriptImpl prermScript = new PrermScriptImpl();
		return prermScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmScript createPostrmScript() {
		PostrmScriptImpl postrmScript = new PostrmScriptImpl();
		return postrmScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigScript createConfigScript() {
		ConfigScriptImpl configScript = new ConfigScriptImpl();
		return configScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultCaseCondition createDefaultCaseCondition() {
		DefaultCaseConditionImpl defaultCaseCondition = new DefaultCaseConditionImpl();
		return defaultCaseCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePrerm createCasePrerm() {
		CasePrermImpl casePrerm = new CasePrermImpl();
		return casePrerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePrermCondition createCasePrermCondition() {
		CasePrermConditionImpl casePrermCondition = new CasePrermConditionImpl();
		return casePrermCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePostrm createCasePostrm() {
		CasePostrmImpl casePostrm = new CasePostrmImpl();
		return casePostrm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePostrmCondition createCasePostrmCondition() {
		CasePostrmConditionImpl casePostrmCondition = new CasePostrmConditionImpl();
		return casePostrmCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePreinst createCasePreinst() {
		CasePreinstImpl casePreinst = new CasePreinstImpl();
		return casePreinst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePreinstCondition createCasePreinstCondition() {
		CasePreinstConditionImpl casePreinstCondition = new CasePreinstConditionImpl();
		return casePreinstCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePostinst createCasePostinst() {
		CasePostinstImpl casePostinst = new CasePostinstImpl();
		return casePostinst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePostinstCondition createCasePostinstCondition() {
		CasePostinstConditionImpl casePostinstCondition = new CasePostinstConditionImpl();
		return casePostinstCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicCase createBasicCase() {
		BasicCaseImpl basicCase = new BasicCaseImpl();
		return basicCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicCaseCondition createBasicCaseCondition() {
		BasicCaseConditionImpl basicCaseCondition = new BasicCaseConditionImpl();
		return basicCaseCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression createBooleanExpression() {
		BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileExistsBoolean createFileExistsBoolean() {
		FileExistsBooleanImpl fileExistsBoolean = new FileExistsBooleanImpl();
		return fileExistsBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularFileBoolean createRegularFileBoolean() {
		RegularFileBooleanImpl regularFileBoolean = new RegularFileBooleanImpl();
		return regularFileBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNotZeroSizeBoolean createFileNotZeroSizeBoolean() {
		FileNotZeroSizeBooleanImpl fileNotZeroSizeBoolean = new FileNotZeroSizeBooleanImpl();
		return fileNotZeroSizeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsDirectoryBoolean createIsDirectoryBoolean() {
		IsDirectoryBooleanImpl isDirectoryBoolean = new IsDirectoryBooleanImpl();
		return isDirectoryBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileBlockDeviceBoolean createFileBlockDeviceBoolean() {
		FileBlockDeviceBooleanImpl fileBlockDeviceBoolean = new FileBlockDeviceBooleanImpl();
		return fileBlockDeviceBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileCharacterDeviceBoolean createFileCharacterDeviceBoolean() {
		FileCharacterDeviceBooleanImpl fileCharacterDeviceBoolean = new FileCharacterDeviceBooleanImpl();
		return fileCharacterDeviceBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilePipeBoolean createFilePipeBoolean() {
		FilePipeBooleanImpl filePipeBoolean = new FilePipeBooleanImpl();
		return filePipeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSymbolicLinkBoolean createFileSymbolicLinkBoolean() {
		FileSymbolicLinkBooleanImpl fileSymbolicLinkBoolean = new FileSymbolicLinkBooleanImpl();
		return fileSymbolicLinkBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSocketBoolean createFileSocketBoolean() {
		FileSocketBooleanImpl fileSocketBoolean = new FileSocketBooleanImpl();
		return fileSocketBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTerminalDeviceBoolean createFileTerminalDeviceBoolean() {
		FileTerminalDeviceBooleanImpl fileTerminalDeviceBoolean = new FileTerminalDeviceBooleanImpl();
		return fileTerminalDeviceBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileReadPermissionBoolean createFileReadPermissionBoolean() {
		FileReadPermissionBooleanImpl fileReadPermissionBoolean = new FileReadPermissionBooleanImpl();
		return fileReadPermissionBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileWritePermissionBoolean createFileWritePermissionBoolean() {
		FileWritePermissionBooleanImpl fileWritePermissionBoolean = new FileWritePermissionBooleanImpl();
		return fileWritePermissionBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileExecutePermissionBoolean createFileExecutePermissionBoolean() {
		FileExecutePermissionBooleanImpl fileExecutePermissionBoolean = new FileExecutePermissionBooleanImpl();
		return fileExecutePermissionBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerEqualBoolean createIntegerEqualBoolean() {
		IntegerEqualBooleanImpl integerEqualBoolean = new IntegerEqualBooleanImpl();
		return integerEqualBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerNotEqualBoolean createIntegerNotEqualBoolean() {
		IntegerNotEqualBooleanImpl integerNotEqualBoolean = new IntegerNotEqualBooleanImpl();
		return integerNotEqualBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerGreaterBoolean createIntegerGreaterBoolean() {
		IntegerGreaterBooleanImpl integerGreaterBoolean = new IntegerGreaterBooleanImpl();
		return integerGreaterBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerGreaterEqualBoolean createIntegerGreaterEqualBoolean() {
		IntegerGreaterEqualBooleanImpl integerGreaterEqualBoolean = new IntegerGreaterEqualBooleanImpl();
		return integerGreaterEqualBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLessBoolean createIntegerLessBoolean() {
		IntegerLessBooleanImpl integerLessBoolean = new IntegerLessBooleanImpl();
		return integerLessBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLessEqualBoolean createIntegerLessEqualBoolean() {
		IntegerLessEqualBooleanImpl integerLessEqualBoolean = new IntegerLessEqualBooleanImpl();
		return integerLessEqualBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringEqualBoolean createStringEqualBoolean() {
		StringEqualBooleanImpl stringEqualBoolean = new StringEqualBooleanImpl();
		return stringEqualBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringNotEqualBoolean createStringNotEqualBoolean() {
		StringNotEqualBooleanImpl stringNotEqualBoolean = new StringNotEqualBooleanImpl();
		return stringNotEqualBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringGreaterBoolean createStringGreaterBoolean() {
		StringGreaterBooleanImpl stringGreaterBoolean = new StringGreaterBooleanImpl();
		return stringGreaterBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLessBoolean createStringLessBoolean() {
		StringLessBooleanImpl stringLessBoolean = new StringLessBooleanImpl();
		return stringLessBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrinNotNullBoolean createStrinNotNullBoolean() {
		StrinNotNullBooleanImpl strinNotNullBoolean = new StrinNotNullBooleanImpl();
		return strinNotNullBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringNullBoolean createStringNullBoolean() {
		StringNullBooleanImpl stringNullBoolean = new StringNullBooleanImpl();
		return stringNullBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndBooleanExpression createAndBooleanExpression() {
		AndBooleanExpressionImpl andBooleanExpression = new AndBooleanExpressionImpl();
		return andBooleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrBooleanExpression createOrBooleanExpression() {
		OrBooleanExpressionImpl orBooleanExpression = new OrBooleanExpressionImpl();
		return orBooleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementBoolean createStatementBoolean() {
		StatementBooleanImpl statementBoolean = new StatementBooleanImpl();
		return statementBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementExistsBoolean createStatementExistsBoolean() {
		StatementExistsBooleanImpl statementExistsBoolean = new StatementExistsBooleanImpl();
		return statementExistsBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectoryIterator createDirectoryIterator() {
		DirectoryIteratorImpl directoryIterator = new DirectoryIteratorImpl();
		return directoryIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileContentIterator createFileContentIterator() {
		FileContentIteratorImpl fileContentIterator = new FileContentIteratorImpl();
		return fileContentIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParameterIterator createInputParameterIterator() {
		InputParameterIteratorImpl inputParameterIterator = new InputParameterIteratorImpl();
		return inputParameterIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationIterator createEnumerationIterator() {
		EnumerationIteratorImpl enumerationIterator = new EnumerationIteratorImpl();
		return enumerationIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringIterator createStringIterator() {
		StringIteratorImpl stringIterator = new StringIteratorImpl();
		return stringIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationElement createEnumerationElement() {
		EnumerationElementImpl enumerationElement = new EnumerationElementImpl();
		return enumerationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionFileSystemStatement createAdditionFileSystemStatement() {
		AdditionFileSystemStatementImpl additionFileSystemStatement = new AdditionFileSystemStatementImpl();
		return additionFileSystemStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletionFileSystemStatement createDeletionFileSystemStatement() {
		DeletionFileSystemStatementImpl deletionFileSystemStatement = new DeletionFileSystemStatementImpl();
		return deletionFileSystemStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateFileSystemStatement createUpdateFileSystemStatement() {
		UpdateFileSystemStatementImpl updateFileSystemStatement = new UpdateFileSystemStatementImpl();
		return updateFileSystemStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionEnvironmentStatement createAdditionEnvironmentStatement() {
		AdditionEnvironmentStatementImpl additionEnvironmentStatement = new AdditionEnvironmentStatementImpl();
		return additionEnvironmentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletionEnvironmentStatement createDeletionEnvironmentStatement() {
		DeletionEnvironmentStatementImpl deletionEnvironmentStatement = new DeletionEnvironmentStatementImpl();
		return deletionEnvironmentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateEnvironmentStatement createUpdateEnvironmentStatement() {
		UpdateEnvironmentStatementImpl updateEnvironmentStatement = new UpdateEnvironmentStatementImpl();
		return updateEnvironmentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionPackageSettingStatement createAdditionPackageSettingStatement() {
		AdditionPackageSettingStatementImpl additionPackageSettingStatement = new AdditionPackageSettingStatementImpl();
		return additionPackageSettingStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletionPackageSettingStatement createDeletionPackageSettingStatement() {
		DeletionPackageSettingStatementImpl deletionPackageSettingStatement = new DeletionPackageSettingStatementImpl();
		return deletionPackageSettingStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdatePackageSettingStatement createUpdatePackageSettingStatement() {
		UpdatePackageSettingStatementImpl updatePackageSettingStatement = new UpdatePackageSettingStatementImpl();
		return updatePackageSettingStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationFile createDocumentationFile() {
		DocumentationFileImpl documentationFile = new DocumentationFileImpl();
		return documentationFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFile createInformationFile() {
		InformationFileImpl informationFile = new InformationFileImpl();
		return informationFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstDesktop createPostinstDesktop() {
		PostinstDesktopImpl postinstDesktop = new PostinstDesktopImpl();
		return postinstDesktop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstDocBase createPostinstDocBase() {
		PostinstDocBaseImpl postinstDocBase = new PostinstDocBaseImpl();
		return postinstDocBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstEmacsen createPostinstEmacsen() {
		PostinstEmacsenImpl postinstEmacsen = new PostinstEmacsenImpl();
		return postinstEmacsen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstGconf createPostinstGconf() {
		PostinstGconfImpl postinstGconf = new PostinstGconfImpl();
		return postinstGconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstGconfDefaults createPostinstGconfDefaults() {
		PostinstGconfDefaultsImpl postinstGconfDefaults = new PostinstGconfDefaultsImpl();
		return postinstGconfDefaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstIcons createPostinstIcons() {
		PostinstIconsImpl postinstIcons = new PostinstIconsImpl();
		return postinstIcons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstInfo createPostinstInfo() {
		PostinstInfoImpl postinstInfo = new PostinstInfoImpl();
		return postinstInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstInit createPostinstInit() {
		PostinstInitImpl postinstInit = new PostinstInitImpl();
		return postinstInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstInitNostart createPostinstInitNostart() {
		PostinstInitNostartImpl postinstInitNostart = new PostinstInitNostartImpl();
		return postinstInitNostart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstInitRestart createPostinstInitRestart() {
		PostinstInitRestartImpl postinstInitRestart = new PostinstInitRestartImpl();
		return postinstInitRestart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstMakeshlibs createPostinstMakeshlibs() {
		PostinstMakeshlibsImpl postinstMakeshlibs = new PostinstMakeshlibsImpl();
		return postinstMakeshlibs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstMenu createPostinstMenu() {
		PostinstMenuImpl postinstMenu = new PostinstMenuImpl();
		return postinstMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstMenuMethod createPostinstMenuMethod() {
		PostinstMenuMethodImpl postinstMenuMethod = new PostinstMenuMethodImpl();
		return postinstMenuMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstMime createPostinstMime() {
		PostinstMimeImpl postinstMime = new PostinstMimeImpl();
		return postinstMime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstModules createPostinstModules() {
		PostinstModulesImpl postinstModules = new PostinstModulesImpl();
		return postinstModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstPython createPostinstPython() {
		PostinstPythonImpl postinstPython = new PostinstPythonImpl();
		return postinstPython;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstScrollkeeper createPostinstScrollkeeper() {
		PostinstScrollkeeperImpl postinstScrollkeeper = new PostinstScrollkeeperImpl();
		return postinstScrollkeeper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstSgmlcatalog createPostinstSgmlcatalog() {
		PostinstSgmlcatalogImpl postinstSgmlcatalog = new PostinstSgmlcatalogImpl();
		return postinstSgmlcatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstSharedmimeinfo createPostinstSharedmimeinfo() {
		PostinstSharedmimeinfoImpl postinstSharedmimeinfo = new PostinstSharedmimeinfoImpl();
		return postinstSharedmimeinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstSuid createPostinstSuid() {
		PostinstSuidImpl postinstSuid = new PostinstSuidImpl();
		return postinstSuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstUdev createPostinstUdev() {
		PostinstUdevImpl postinstUdev = new PostinstUdevImpl();
		return postinstUdev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstUsrlocal createPostinstUsrlocal() {
		PostinstUsrlocalImpl postinstUsrlocal = new PostinstUsrlocalImpl();
		return postinstUsrlocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstWm createPostinstWm() {
		PostinstWmImpl postinstWm = new PostinstWmImpl();
		return postinstWm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstWmNoman createPostinstWmNoman() {
		PostinstWmNomanImpl postinstWmNoman = new PostinstWmNomanImpl();
		return postinstWmNoman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstXfonts createPostinstXfonts() {
		PostinstXfontsImpl postinstXfonts = new PostinstXfontsImpl();
		return postinstXfonts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmDebconf createPostrmDebconf() {
		PostrmDebconfImpl postrmDebconf = new PostrmDebconfImpl();
		return postrmDebconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmDesktop createPostrmDesktop() {
		PostrmDesktopImpl postrmDesktop = new PostrmDesktopImpl();
		return postrmDesktop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmGconf createPostrmGconf() {
		PostrmGconfImpl postrmGconf = new PostrmGconfImpl();
		return postrmGconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmGconfDefaults createPostrmGconfDefaults() {
		PostrmGconfDefaultsImpl postrmGconfDefaults = new PostrmGconfDefaultsImpl();
		return postrmGconfDefaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmIcons createPostrmIcons() {
		PostrmIconsImpl postrmIcons = new PostrmIconsImpl();
		return postrmIcons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmInit createPostrmInit() {
		PostrmInitImpl postrmInit = new PostrmInitImpl();
		return postrmInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmMakeshlibs createPostrmMakeshlibs() {
		PostrmMakeshlibsImpl postrmMakeshlibs = new PostrmMakeshlibsImpl();
		return postrmMakeshlibs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmMenu createPostrmMenu() {
		PostrmMenuImpl postrmMenu = new PostrmMenuImpl();
		return postrmMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmMenuMethod createPostrmMenuMethod() {
		PostrmMenuMethodImpl postrmMenuMethod = new PostrmMenuMethodImpl();
		return postrmMenuMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmMime createPostrmMime() {
		PostrmMimeImpl postrmMime = new PostrmMimeImpl();
		return postrmMime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmModules createPostrmModules() {
		PostrmModulesImpl postrmModules = new PostrmModulesImpl();
		return postrmModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmScrollkeeper createPostrmScrollkeeper() {
		PostrmScrollkeeperImpl postrmScrollkeeper = new PostrmScrollkeeperImpl();
		return postrmScrollkeeper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmSgmlcatalog createPostrmSgmlcatalog() {
		PostrmSgmlcatalogImpl postrmSgmlcatalog = new PostrmSgmlcatalogImpl();
		return postrmSgmlcatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmSharedmimeinfo createPostrmSharedmimeinfo() {
		PostrmSharedmimeinfoImpl postrmSharedmimeinfo = new PostrmSharedmimeinfoImpl();
		return postrmSharedmimeinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmSuid createPostrmSuid() {
		PostrmSuidImpl postrmSuid = new PostrmSuidImpl();
		return postrmSuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmXfonts createPostrmXfonts() {
		PostrmXfontsImpl postrmXfonts = new PostrmXfontsImpl();
		return postrmXfonts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreinstUdev createPreinstUdev() {
		PreinstUdevImpl preinstUdev = new PreinstUdevImpl();
		return preinstUdev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreinstUser createPreinstUser() {
		PreinstUserImpl preinstUser = new PreinstUserImpl();
		return preinstUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrermDocBase createPrermDocBase() {
		PrermDocBaseImpl prermDocBase = new PrermDocBaseImpl();
		return prermDocBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrermEmacsen createPrermEmacsen() {
		PrermEmacsenImpl prermEmacsen = new PrermEmacsenImpl();
		return prermEmacsen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrermGconf createPrermGconf() {
		PrermGconfImpl prermGconf = new PrermGconfImpl();
		return prermGconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrermInfo createPrermInfo() {
		PrermInfoImpl prermInfo = new PrermInfoImpl();
		return prermInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrermInit createPrermInit() {
		PrermInitImpl prermInit = new PrermInitImpl();
		return prermInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrermInitNorestart createPrermInitNorestart() {
		PrermInitNorestartImpl prermInitNorestart = new PrermInitNorestartImpl();
		return prermInitNorestart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrermPython createPrermPython() {
		PrermPythonImpl prermPython = new PrermPythonImpl();
		return prermPython;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrermSgmlcatalog createPrermSgmlcatalog() {
		PrermSgmlcatalogImpl prermSgmlcatalog = new PrermSgmlcatalogImpl();
		return prermSgmlcatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrermUsrlocal createPrermUsrlocal() {
		PrermUsrlocalImpl prermUsrlocal = new PrermUsrlocalImpl();
		return prermUsrlocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrermWm createPrermWm() {
		PrermWmImpl prermWm = new PrermWmImpl();
		return prermWm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdatePythonModules createUpdatePythonModules() {
		UpdatePythonModulesImpl updatePythonModules = new UpdatePythonModulesImpl();
		return updatePythonModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstAddAlternative createPostinstAddAlternative() {
		PostinstAddAlternativeImpl postinstAddAlternative = new PostinstAddAlternativeImpl();
		return postinstAddAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAlternative createAddAlternative() {
		AddAlternativeImpl addAlternative = new AddAlternativeImpl();
		return addAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Param createParam() {
		ParamImpl param = new ParamImpl();
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam createStringParam() {
		StringParamImpl stringParam = new StringParamImpl();
		return stringParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntParam createIntParam() {
		IntParamImpl intParam = new IntParamImpl();
		return intParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleConflict createSingleConflict() {
		SingleConflictImpl singleConflict = new SingleConflictImpl();
		return singleConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndConflict createAndConflict() {
		AndConflictImpl andConflict = new AndConflictImpl();
		return andConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrConflict createOrConflict() {
		OrConflictImpl orConflict = new OrConflictImpl();
		return orConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityType createPriorityTypeFromString(EDataType eDataType, String initialValue) {
		PriorityType result = PriorityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionType createVersionTypeFromString(EDataType eDataType, String initialValue) {
		VersionType result = VersionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnStatementValue createReturnStatementValueFromString(EDataType eDataType, String initialValue) {
		ReturnStatementValue result = ReturnStatementValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReturnStatementValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePrermConditionValue createCasePrermConditionValueFromString(EDataType eDataType, String initialValue) {
		CasePrermConditionValue result = CasePrermConditionValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCasePrermConditionValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePostrmConditionValue createCasePostrmConditionValueFromString(EDataType eDataType, String initialValue) {
		CasePostrmConditionValue result = CasePostrmConditionValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCasePostrmConditionValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePreinstConditionValue createCasePreinstConditionValueFromString(EDataType eDataType, String initialValue) {
		CasePreinstConditionValue result = CasePreinstConditionValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCasePreinstConditionValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasePostinstConditionValue createCasePostinstConditionValueFromString(EDataType eDataType, String initialValue) {
		CasePostinstConditionValue result = CasePostinstConditionValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCasePostinstConditionValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagemmPackage getPackagemmPackage() {
		return (PackagemmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PackagemmPackage getPackage() {
		return PackagemmPackage.eINSTANCE;
	}

} //PackagemmFactoryImpl
