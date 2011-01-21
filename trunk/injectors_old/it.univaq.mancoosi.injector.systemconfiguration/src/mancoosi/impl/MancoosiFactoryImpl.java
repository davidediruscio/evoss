/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import mancoosi.AdditionEnvironmentStatement;
import mancoosi.AdditionFileSytemStatement;
import mancoosi.AdditionPackageSettingStatement;
import mancoosi.Alternative;
import mancoosi.AndConflict;
import mancoosi.AndDep;
import mancoosi.AndInv;
import mancoosi.ApplicationMenuCatalog;
import mancoosi.Atom;
import mancoosi.BasicCase;
import mancoosi.BasicCaseCondition;
import mancoosi.BinPackage;
import mancoosi.BooleanExpression;
import mancoosi.Boot;
import mancoosi.CasePostinst;
import mancoosi.CasePostinstCondition;
import mancoosi.CasePostinstConditionValue;
import mancoosi.CasePostrm;
import mancoosi.CasePostrmCondition;
import mancoosi.CasePostrmConditionValue;
import mancoosi.CasePreinst;
import mancoosi.CasePreinstCondition;
import mancoosi.CasePreinstConditionValue;
import mancoosi.CasePrerm;
import mancoosi.CasePrermCondition;
import mancoosi.CasePrermConditionValue;
import mancoosi.Comment;
import mancoosi.ConfigScript;
import mancoosi.Configuration;
import mancoosi.DefaultCaseCondition;
import mancoosi.DeletionEnvironmentStatement;
import mancoosi.DeletionFileSystemStatement;
import mancoosi.DeletionPackageSettingStatement;
import mancoosi.DesktopDB;
import mancoosi.DirectoryIterator;
import mancoosi.DocumentationFile;
import mancoosi.EmacsPackage;
import mancoosi.Enumeration;
import mancoosi.EnumerationElement;
import mancoosi.EnumerationIterator;
import mancoosi.Environment;
import mancoosi.File;
import mancoosi.FileContentIterator;
import mancoosi.FileSystem;
import mancoosi.GConf;
import mancoosi.Group;
import mancoosi.IconCache;
import mancoosi.If;
import mancoosi.InformationFile;
import mancoosi.InputParameter;
import mancoosi.InputParameterIterator;
import mancoosi.InstalledPackage;
import mancoosi.IntParam;
import mancoosi.Invariant;
import mancoosi.LibraryCache;
import mancoosi.MancoosiFactory;
import mancoosi.MancoosiPackage;
import mancoosi.Menu;
import mancoosi.MenuEntry;
import mancoosi.Message;
import mancoosi.MimeType;
import mancoosi.MimeTypeHandler;
import mancoosi.MimeTypeHandlerCache;
import mancoosi.Module;
import mancoosi.ModuleCache;
import mancoosi.NotInstalledPackage;
import mancoosi.NotInv;
import mancoosi.OrConflict;
import mancoosi.OrDep;
import mancoosi.OrInv;
import mancoosi.PackageSetting;
import mancoosi.Param;
import mancoosi.PostinstDesktop;
import mancoosi.PostinstDocBase;
import mancoosi.PostinstEmacsen;
import mancoosi.PostinstGconf;
import mancoosi.PostinstGconfDefaults;
import mancoosi.PostinstIcons;
import mancoosi.PostinstInfo;
import mancoosi.PostinstInit;
import mancoosi.PostinstInitNostart;
import mancoosi.PostinstInitRestart;
import mancoosi.PostinstMakeshlibs;
import mancoosi.PostinstMenu;
import mancoosi.PostinstMenuMethod;
import mancoosi.PostinstMime;
import mancoosi.PostinstModules;
import mancoosi.PostinstPython;
import mancoosi.PostinstScript;
import mancoosi.PostinstScrollkeeper;
import mancoosi.PostinstSgmlcatalog;
import mancoosi.PostinstSharedmimeinfo;
import mancoosi.PostinstSuid;
import mancoosi.PostinstUdev;
import mancoosi.PostinstUsrlocal;
import mancoosi.PostinstWm;
import mancoosi.PostinstWmNoman;
import mancoosi.PostinstXfonts;
import mancoosi.PostrmDebconf;
import mancoosi.PostrmDesktop;
import mancoosi.PostrmGconf;
import mancoosi.PostrmGconfDefaults;
import mancoosi.PostrmIcons;
import mancoosi.PostrmInit;
import mancoosi.PostrmMakeshlibs;
import mancoosi.PostrmMenu;
import mancoosi.PostrmMenuMethod;
import mancoosi.PostrmMime;
import mancoosi.PostrmModules;
import mancoosi.PostrmScript;
import mancoosi.PostrmScrollkeeper;
import mancoosi.PostrmSgmlcatalog;
import mancoosi.PostrmSharedmimeinfo;
import mancoosi.PostrmSuid;
import mancoosi.PostrmXfonts;
import mancoosi.PreinstScript;
import mancoosi.PreinstUdev;
import mancoosi.PreinstUser;
import mancoosi.PrermDocBase;
import mancoosi.PrermEmacsen;
import mancoosi.PrermGconf;
import mancoosi.PrermInfo;
import mancoosi.PrermInit;
import mancoosi.PrermInitNorestart;
import mancoosi.PrermPython;
import mancoosi.PrermScript;
import mancoosi.PrermSgmlcatalog;
import mancoosi.PrermUsrlocal;
import mancoosi.PrermWm;
import mancoosi.PriorityType;
import mancoosi.Return;
import mancoosi.ReturnStatementValue;
import mancoosi.SGMLCatalog;
import mancoosi.SGMLDocument;
import mancoosi.Script;
import mancoosi.Service;
import mancoosi.SharedLibrary;
import mancoosi.SingleConflict;
import mancoosi.SingleDep;
import mancoosi.SkeeperCatalog;
import mancoosi.SkeeperDocument;
import mancoosi.SrcPackage;
import mancoosi.StatusType;
import mancoosi.StringIterator;
import mancoosi.StringParam;
import mancoosi.UpdateEnvironmentStatement;
import mancoosi.UpdateFileSytemStatement;
import mancoosi.UpdatePackageSettingStatement;
import mancoosi.User;
import mancoosi.VersionType;
import mancoosi.VirtualPackage;
import mancoosi.XFont;
import mancoosi.XFontCache;

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
public class MancoosiFactoryImpl extends EFactoryImpl implements MancoosiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MancoosiFactory init() {
		try {
			MancoosiFactory theMancoosiFactory = (MancoosiFactory)EPackage.Registry.INSTANCE.getEFactory("mancoosi"); 
			if (theMancoosiFactory != null) {
				return theMancoosiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MancoosiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MancoosiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MancoosiPackage.CONFIGURATION: return createConfiguration();
			case MancoosiPackage.INSTALLED_PACKAGE: return createInstalledPackage();
			case MancoosiPackage.NOT_INSTALLED_PACKAGE: return createNotInstalledPackage();
			case MancoosiPackage.SRC_PACKAGE: return createSrcPackage();
			case MancoosiPackage.BIN_PACKAGE: return createBinPackage();
			case MancoosiPackage.VIRTUAL_PACKAGE: return createVirtualPackage();
			case MancoosiPackage.AND_DEP: return createAndDep();
			case MancoosiPackage.OR_DEP: return createOrDep();
			case MancoosiPackage.SINGLE_DEP: return createSingleDep();
			case MancoosiPackage.SCRIPT: return createScript();
			case MancoosiPackage.INPUT_PARAMETER: return createInputParameter();
			case MancoosiPackage.PREINST_SCRIPT: return createPreinstScript();
			case MancoosiPackage.POSTINST_SCRIPT: return createPostinstScript();
			case MancoosiPackage.PRERM_SCRIPT: return createPrermScript();
			case MancoosiPackage.POSTRM_SCRIPT: return createPostrmScript();
			case MancoosiPackage.CONFIG_SCRIPT: return createConfigScript();
			case MancoosiPackage.INVARIANT: return createInvariant();
			case MancoosiPackage.ATOM: return createAtom();
			case MancoosiPackage.AND_INV: return createAndInv();
			case MancoosiPackage.OR_INV: return createOrInv();
			case MancoosiPackage.NOT_INV: return createNotInv();
			case MancoosiPackage.DEFAULT_CASE_CONDITION: return createDefaultCaseCondition();
			case MancoosiPackage.CASE_PRERM: return createCasePrerm();
			case MancoosiPackage.CASE_PRERM_CONDITION: return createCasePrermCondition();
			case MancoosiPackage.CASE_POSTRM: return createCasePostrm();
			case MancoosiPackage.CASE_POSTRM_CONDITION: return createCasePostrmCondition();
			case MancoosiPackage.CASE_PREINST: return createCasePreinst();
			case MancoosiPackage.CASE_PREINST_CONDITION: return createCasePreinstCondition();
			case MancoosiPackage.CASE_POSTINST: return createCasePostinst();
			case MancoosiPackage.CASE_POSTINST_CONDITION: return createCasePostinstCondition();
			case MancoosiPackage.BASIC_CASE: return createBasicCase();
			case MancoosiPackage.BASIC_CASE_CONDITION: return createBasicCaseCondition();
			case MancoosiPackage.IF: return createIf();
			case MancoosiPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case MancoosiPackage.RETURN: return createReturn();
			case MancoosiPackage.DIRECTORY_ITERATOR: return createDirectoryIterator();
			case MancoosiPackage.FILE_CONTENT_ITERATOR: return createFileContentIterator();
			case MancoosiPackage.INPUT_PARAMETER_ITERATOR: return createInputParameterIterator();
			case MancoosiPackage.ENUMERATION_ITERATOR: return createEnumerationIterator();
			case MancoosiPackage.STRING_ITERATOR: return createStringIterator();
			case MancoosiPackage.ENUMERATION: return createEnumeration();
			case MancoosiPackage.ENUMERATION_ELEMENT: return createEnumerationElement();
			case MancoosiPackage.ADDITION_FILE_SYTEM_STATEMENT: return createAdditionFileSytemStatement();
			case MancoosiPackage.DELETION_FILE_SYSTEM_STATEMENT: return createDeletionFileSystemStatement();
			case MancoosiPackage.UPDATE_FILE_SYTEM_STATEMENT: return createUpdateFileSytemStatement();
			case MancoosiPackage.ADDITION_ENVIRONMENT_STATEMENT: return createAdditionEnvironmentStatement();
			case MancoosiPackage.DELETION_ENVIRONMENT_STATEMENT: return createDeletionEnvironmentStatement();
			case MancoosiPackage.UPDATE_ENVIRONMENT_STATEMENT: return createUpdateEnvironmentStatement();
			case MancoosiPackage.ADDITION_PACKAGE_SETTING_STATEMENT: return createAdditionPackageSettingStatement();
			case MancoosiPackage.DELETION_PACKAGE_SETTING_STATEMENT: return createDeletionPackageSettingStatement();
			case MancoosiPackage.UPDATE_PACKAGE_SETTING_STATEMENT: return createUpdatePackageSettingStatement();
			case MancoosiPackage.MESSAGE: return createMessage();
			case MancoosiPackage.COMMENT: return createComment();
			case MancoosiPackage.ENVIRONMENT: return createEnvironment();
			case MancoosiPackage.FILE_SYSTEM: return createFileSystem();
			case MancoosiPackage.GCONF: return createGConf();
			case MancoosiPackage.APPLICATION_MENU_CATALOG: return createApplicationMenuCatalog();
			case MancoosiPackage.MENU: return createMenu();
			case MancoosiPackage.MENU_ENTRY: return createMenuEntry();
			case MancoosiPackage.BOOT: return createBoot();
			case MancoosiPackage.SERVICE: return createService();
			case MancoosiPackage.FILE: return createFile();
			case MancoosiPackage.DOCUMENTATION_FILE: return createDocumentationFile();
			case MancoosiPackage.INFORMATION_FILE: return createInformationFile();
			case MancoosiPackage.ALTERNATIVE: return createAlternative();
			case MancoosiPackage.PACKAGE_SETTING: return createPackageSetting();
			case MancoosiPackage.ICON_CACHE: return createIconCache();
			case MancoosiPackage.DESKTOP_DB: return createDesktopDB();
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE: return createMimeTypeHandlerCache();
			case MancoosiPackage.MIME_TYPE_HANDLER: return createMimeTypeHandler();
			case MancoosiPackage.MIME_TYPE: return createMimeType();
			case MancoosiPackage.XFONT_CACHE: return createXFontCache();
			case MancoosiPackage.XFONT: return createXFont();
			case MancoosiPackage.LIBRARY_CACHE: return createLibraryCache();
			case MancoosiPackage.SHARED_LIBRARY: return createSharedLibrary();
			case MancoosiPackage.MODULE_CACHE: return createModuleCache();
			case MancoosiPackage.MODULE: return createModule();
			case MancoosiPackage.SGML_CATALOG: return createSGMLCatalog();
			case MancoosiPackage.SGML_DOCUMENT: return createSGMLDocument();
			case MancoosiPackage.SKEEPER_CATALOG: return createSkeeperCatalog();
			case MancoosiPackage.SKEEPER_DOCUMENT: return createSkeeperDocument();
			case MancoosiPackage.EMACS_PACKAGE: return createEmacsPackage();
			case MancoosiPackage.USER: return createUser();
			case MancoosiPackage.GROUP: return createGroup();
			case MancoosiPackage.POSTINST_DESKTOP: return createPostinstDesktop();
			case MancoosiPackage.POSTINST_DOC_BASE: return createPostinstDocBase();
			case MancoosiPackage.POSTINST_EMACSEN: return createPostinstEmacsen();
			case MancoosiPackage.POSTINST_GCONF: return createPostinstGconf();
			case MancoosiPackage.POSTINST_GCONF_DEFAULTS: return createPostinstGconfDefaults();
			case MancoosiPackage.POSTINST_ICONS: return createPostinstIcons();
			case MancoosiPackage.POSTINST_INFO: return createPostinstInfo();
			case MancoosiPackage.POSTINST_INIT: return createPostinstInit();
			case MancoosiPackage.POSTINST_INIT_NOSTART: return createPostinstInitNostart();
			case MancoosiPackage.POSTINST_INIT_RESTART: return createPostinstInitRestart();
			case MancoosiPackage.POSTINST_MAKESHLIBS: return createPostinstMakeshlibs();
			case MancoosiPackage.POSTINST_MENU: return createPostinstMenu();
			case MancoosiPackage.POSTINST_MENU_METHOD: return createPostinstMenuMethod();
			case MancoosiPackage.POSTINST_MIME: return createPostinstMime();
			case MancoosiPackage.POSTINST_MODULES: return createPostinstModules();
			case MancoosiPackage.POSTINST_PYTHON: return createPostinstPython();
			case MancoosiPackage.POSTINST_SCROLLKEEPER: return createPostinstScrollkeeper();
			case MancoosiPackage.POSTINST_SGMLCATALOG: return createPostinstSgmlcatalog();
			case MancoosiPackage.POSTINST_SHAREDMIMEINFO: return createPostinstSharedmimeinfo();
			case MancoosiPackage.POSTINST_SUID: return createPostinstSuid();
			case MancoosiPackage.POSTINST_UDEV: return createPostinstUdev();
			case MancoosiPackage.POSTINST_USRLOCAL: return createPostinstUsrlocal();
			case MancoosiPackage.POSTINST_WM: return createPostinstWm();
			case MancoosiPackage.POSTINST_WM_NOMAN: return createPostinstWmNoman();
			case MancoosiPackage.POSTINST_XFONTS: return createPostinstXfonts();
			case MancoosiPackage.POSTRM_DEBCONF: return createPostrmDebconf();
			case MancoosiPackage.POSTRM_DESKTOP: return createPostrmDesktop();
			case MancoosiPackage.POSTRM_GCONF: return createPostrmGconf();
			case MancoosiPackage.POSTRM_GCONF_DEFAULTS: return createPostrmGconfDefaults();
			case MancoosiPackage.POSTRM_ICONS: return createPostrmIcons();
			case MancoosiPackage.POSTRM_INIT: return createPostrmInit();
			case MancoosiPackage.POSTRM_MAKESHLIBS: return createPostrmMakeshlibs();
			case MancoosiPackage.POSTRM_MENU: return createPostrmMenu();
			case MancoosiPackage.POSTRM_MENU_METHOD: return createPostrmMenuMethod();
			case MancoosiPackage.POSTRM_MIME: return createPostrmMime();
			case MancoosiPackage.POSTRM_MODULES: return createPostrmModules();
			case MancoosiPackage.POSTRM_SCROLLKEEPER: return createPostrmScrollkeeper();
			case MancoosiPackage.POSTRM_SGMLCATALOG: return createPostrmSgmlcatalog();
			case MancoosiPackage.POSTRM_SHAREDMIMEINFO: return createPostrmSharedmimeinfo();
			case MancoosiPackage.POSTRM_SUID: return createPostrmSuid();
			case MancoosiPackage.POSTRM_XFONTS: return createPostrmXfonts();
			case MancoosiPackage.PREINST_UDEV: return createPreinstUdev();
			case MancoosiPackage.PREINST_USER: return createPreinstUser();
			case MancoosiPackage.PRERM_DOC_BASE: return createPrermDocBase();
			case MancoosiPackage.PRERM_EMACSEN: return createPrermEmacsen();
			case MancoosiPackage.PRERM_GCONF: return createPrermGconf();
			case MancoosiPackage.PRERM_INFO: return createPrermInfo();
			case MancoosiPackage.PRERM_INIT: return createPrermInit();
			case MancoosiPackage.PRERM_INIT_NORESTART: return createPrermInitNorestart();
			case MancoosiPackage.PRERM_PYTHON: return createPrermPython();
			case MancoosiPackage.PRERM_SGMLCATALOG: return createPrermSgmlcatalog();
			case MancoosiPackage.PRERM_USRLOCAL: return createPrermUsrlocal();
			case MancoosiPackage.PRERM_WM: return createPrermWm();
			case MancoosiPackage.PARAM: return createParam();
			case MancoosiPackage.STRING_PARAM: return createStringParam();
			case MancoosiPackage.INT_PARAM: return createIntParam();
			case MancoosiPackage.SINGLE_CONFLICT: return createSingleConflict();
			case MancoosiPackage.AND_CONFLICT: return createAndConflict();
			case MancoosiPackage.OR_CONFLICT: return createOrConflict();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MancoosiPackage.PRIORITY_TYPE:
				return createPriorityTypeFromString(eDataType, initialValue);
			case MancoosiPackage.STATUS_TYPE:
				return createStatusTypeFromString(eDataType, initialValue);
			case MancoosiPackage.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
			case MancoosiPackage.RETURN_STATEMENT_VALUE:
				return createReturnStatementValueFromString(eDataType, initialValue);
			case MancoosiPackage.CASE_PRERM_CONDITION_VALUE:
				return createCasePrermConditionValueFromString(eDataType, initialValue);
			case MancoosiPackage.CASE_POSTRM_CONDITION_VALUE:
				return createCasePostrmConditionValueFromString(eDataType, initialValue);
			case MancoosiPackage.CASE_PREINST_CONDITION_VALUE:
				return createCasePreinstConditionValueFromString(eDataType, initialValue);
			case MancoosiPackage.CASE_POSTINST_CONDITION_VALUE:
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MancoosiPackage.PRIORITY_TYPE:
				return convertPriorityTypeToString(eDataType, instanceValue);
			case MancoosiPackage.STATUS_TYPE:
				return convertStatusTypeToString(eDataType, instanceValue);
			case MancoosiPackage.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			case MancoosiPackage.RETURN_STATEMENT_VALUE:
				return convertReturnStatementValueToString(eDataType, instanceValue);
			case MancoosiPackage.CASE_PRERM_CONDITION_VALUE:
				return convertCasePrermConditionValueToString(eDataType, instanceValue);
			case MancoosiPackage.CASE_POSTRM_CONDITION_VALUE:
				return convertCasePostrmConditionValueToString(eDataType, instanceValue);
			case MancoosiPackage.CASE_PREINST_CONDITION_VALUE:
				return convertCasePreinstConditionValueToString(eDataType, instanceValue);
			case MancoosiPackage.CASE_POSTINST_CONDITION_VALUE:
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
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstalledPackage createInstalledPackage() {
		InstalledPackageImpl installedPackage = new InstalledPackageImpl();
		return installedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotInstalledPackage createNotInstalledPackage() {
		NotInstalledPackageImpl notInstalledPackage = new NotInstalledPackageImpl();
		return notInstalledPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcPackage createSrcPackage() {
		SrcPackageImpl srcPackage = new SrcPackageImpl();
		return srcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinPackage createBinPackage() {
		BinPackageImpl binPackage = new BinPackageImpl();
		return binPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualPackage createVirtualPackage() {
		VirtualPackageImpl virtualPackage = new VirtualPackageImpl();
		return virtualPackage;
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
	public Invariant createInvariant() {
		InvariantImpl invariant = new InvariantImpl();
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom createAtom() {
		AtomImpl atom = new AtomImpl();
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndInv createAndInv() {
		AndInvImpl andInv = new AndInvImpl();
		return andInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrInv createOrInv() {
		OrInvImpl orInv = new OrInvImpl();
		return orInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotInv createNotInv() {
		NotInvImpl notInv = new NotInvImpl();
		return notInv;
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
	public AdditionFileSytemStatement createAdditionFileSytemStatement() {
		AdditionFileSytemStatementImpl additionFileSytemStatement = new AdditionFileSytemStatementImpl();
		return additionFileSytemStatement;
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
	public UpdateFileSytemStatement createUpdateFileSytemStatement() {
		UpdateFileSytemStatementImpl updateFileSytemStatement = new UpdateFileSytemStatementImpl();
		return updateFileSytemStatement;
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
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSystem createFileSystem() {
		FileSystemImpl fileSystem = new FileSystemImpl();
		return fileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GConf createGConf() {
		GConfImpl gConf = new GConfImpl();
		return gConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMenuCatalog createApplicationMenuCatalog() {
		ApplicationMenuCatalogImpl applicationMenuCatalog = new ApplicationMenuCatalogImpl();
		return applicationMenuCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuEntry createMenuEntry() {
		MenuEntryImpl menuEntry = new MenuEntryImpl();
		return menuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boot createBoot() {
		BootImpl boot = new BootImpl();
		return boot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
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
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageSetting createPackageSetting() {
		PackageSettingImpl packageSetting = new PackageSettingImpl();
		return packageSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconCache createIconCache() {
		IconCacheImpl iconCache = new IconCacheImpl();
		return iconCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesktopDB createDesktopDB() {
		DesktopDBImpl desktopDB = new DesktopDBImpl();
		return desktopDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeTypeHandlerCache createMimeTypeHandlerCache() {
		MimeTypeHandlerCacheImpl mimeTypeHandlerCache = new MimeTypeHandlerCacheImpl();
		return mimeTypeHandlerCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeTypeHandler createMimeTypeHandler() {
		MimeTypeHandlerImpl mimeTypeHandler = new MimeTypeHandlerImpl();
		return mimeTypeHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeType createMimeType() {
		MimeTypeImpl mimeType = new MimeTypeImpl();
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XFontCache createXFontCache() {
		XFontCacheImpl xFontCache = new XFontCacheImpl();
		return xFontCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XFont createXFont() {
		XFontImpl xFont = new XFontImpl();
		return xFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryCache createLibraryCache() {
		LibraryCacheImpl libraryCache = new LibraryCacheImpl();
		return libraryCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedLibrary createSharedLibrary() {
		SharedLibraryImpl sharedLibrary = new SharedLibraryImpl();
		return sharedLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleCache createModuleCache() {
		ModuleCacheImpl moduleCache = new ModuleCacheImpl();
		return moduleCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGMLCatalog createSGMLCatalog() {
		SGMLCatalogImpl sgmlCatalog = new SGMLCatalogImpl();
		return sgmlCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGMLDocument createSGMLDocument() {
		SGMLDocumentImpl sgmlDocument = new SGMLDocumentImpl();
		return sgmlDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkeeperCatalog createSkeeperCatalog() {
		SkeeperCatalogImpl skeeperCatalog = new SkeeperCatalogImpl();
		return skeeperCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkeeperDocument createSkeeperDocument() {
		SkeeperDocumentImpl skeeperDocument = new SkeeperDocumentImpl();
		return skeeperDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmacsPackage createEmacsPackage() {
		EmacsPackageImpl emacsPackage = new EmacsPackageImpl();
		return emacsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
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
	public StatusType createStatusTypeFromString(EDataType eDataType, String initialValue) {
		StatusType result = StatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypeToString(EDataType eDataType, Object instanceValue) {
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
	public MancoosiPackage getMancoosiPackage() {
		return (MancoosiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static MancoosiPackage getPackage() {
		return MancoosiPackage.eINSTANCE;
	}

} //MancoosiFactoryImpl
