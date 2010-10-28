/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.util;

import java.util.List;

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
import mancoosi.Case;
import mancoosi.CasePostinst;
import mancoosi.CasePostinstCondition;
import mancoosi.CasePostrm;
import mancoosi.CasePostrmCondition;
import mancoosi.CasePreinst;
import mancoosi.CasePreinstCondition;
import mancoosi.CasePrerm;
import mancoosi.CasePrermCondition;
import mancoosi.Comment;
import mancoosi.Condition;
import mancoosi.ConfigScript;
import mancoosi.Configuration;
import mancoosi.Conflict;
import mancoosi.ControlStatement;
import mancoosi.DefaultCaseCondition;
import mancoosi.DeletionEnvironmentStatement;
import mancoosi.DeletionFileSystemStatement;
import mancoosi.DeletionPackageSettingStatement;
import mancoosi.Dependence;
import mancoosi.DesktopDB;
import mancoosi.DirectoryIterator;
import mancoosi.DocumentationFile;
import mancoosi.EmacsPackage;
import mancoosi.Enumeration;
import mancoosi.EnumerationElement;
import mancoosi.EnumerationIterator;
import mancoosi.Environment;
import mancoosi.EnvironmentStatement;
import mancoosi.File;
import mancoosi.FileContentIterator;
import mancoosi.FileSystem;
import mancoosi.FileSystemStatement;
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
import mancoosi.Iterator;
import mancoosi.LibraryCache;
import mancoosi.MancoosiPackage;
import mancoosi.Menu;
import mancoosi.MenuEntry;
import mancoosi.Message;
import mancoosi.MimeType;
import mancoosi.MimeTypeHandler;
import mancoosi.MimeTypeHandlerCache;
import mancoosi.Module;
import mancoosi.ModuleCache;
import mancoosi.NamedElement;
import mancoosi.NeutralStatement;
import mancoosi.NotInstalledPackage;
import mancoosi.NotInv;
import mancoosi.OrConflict;
import mancoosi.OrDep;
import mancoosi.OrInv;
import mancoosi.PackageSetting;
import mancoosi.PackageSettingStatement;
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
import mancoosi.Return;
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
import mancoosi.Statement;
import mancoosi.StringIterator;
import mancoosi.StringParam;
import mancoosi.UpdateEnvironmentStatement;
import mancoosi.UpdateFileSytemStatement;
import mancoosi.UpdatePackageSettingStatement;
import mancoosi.User;
import mancoosi.VirtualPackage;
import mancoosi.XFont;
import mancoosi.XFontCache;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mancoosi.MancoosiPackage
 * @generated
 */
public class MancoosiSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MancoosiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MancoosiSwitch() {
		if (modelPackage == null) {
			modelPackage = MancoosiPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MancoosiPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				Object result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				Object result = caseConfiguration(configuration);
				if (result == null) result = caseNamedElement(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.INSTALLED_PACKAGE: {
				InstalledPackage installedPackage = (InstalledPackage)theEObject;
				Object result = caseInstalledPackage(installedPackage);
				if (result == null) result = casePackage(installedPackage);
				if (result == null) result = caseNamedElement(installedPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.NOT_INSTALLED_PACKAGE: {
				NotInstalledPackage notInstalledPackage = (NotInstalledPackage)theEObject;
				Object result = caseNotInstalledPackage(notInstalledPackage);
				if (result == null) result = casePackage(notInstalledPackage);
				if (result == null) result = caseNamedElement(notInstalledPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SRC_PACKAGE: {
				SrcPackage srcPackage = (SrcPackage)theEObject;
				Object result = caseSrcPackage(srcPackage);
				if (result == null) result = caseInstalledPackage(srcPackage);
				if (result == null) result = casePackage(srcPackage);
				if (result == null) result = caseNamedElement(srcPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.BIN_PACKAGE: {
				BinPackage binPackage = (BinPackage)theEObject;
				Object result = caseBinPackage(binPackage);
				if (result == null) result = caseInstalledPackage(binPackage);
				if (result == null) result = casePackage(binPackage);
				if (result == null) result = caseNamedElement(binPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.VIRTUAL_PACKAGE: {
				VirtualPackage virtualPackage = (VirtualPackage)theEObject;
				Object result = caseVirtualPackage(virtualPackage);
				if (result == null) result = caseInstalledPackage(virtualPackage);
				if (result == null) result = casePackage(virtualPackage);
				if (result == null) result = caseNamedElement(virtualPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.DEPENDENCE: {
				Dependence dependence = (Dependence)theEObject;
				Object result = caseDependence(dependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.AND_DEP: {
				AndDep andDep = (AndDep)theEObject;
				Object result = caseAndDep(andDep);
				if (result == null) result = caseDependence(andDep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.OR_DEP: {
				OrDep orDep = (OrDep)theEObject;
				Object result = caseOrDep(orDep);
				if (result == null) result = caseDependence(orDep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SINGLE_DEP: {
				SingleDep singleDep = (SingleDep)theEObject;
				Object result = caseSingleDep(singleDep);
				if (result == null) result = caseDependence(singleDep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SCRIPT: {
				Script script = (Script)theEObject;
				Object result = caseScript(script);
				if (result == null) result = caseNamedElement(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.INPUT_PARAMETER: {
				InputParameter inputParameter = (InputParameter)theEObject;
				Object result = caseInputParameter(inputParameter);
				if (result == null) result = caseNamedElement(inputParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PREINST_SCRIPT: {
				PreinstScript preinstScript = (PreinstScript)theEObject;
				Object result = casePreinstScript(preinstScript);
				if (result == null) result = caseScript(preinstScript);
				if (result == null) result = caseNamedElement(preinstScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_SCRIPT: {
				PostinstScript postinstScript = (PostinstScript)theEObject;
				Object result = casePostinstScript(postinstScript);
				if (result == null) result = caseScript(postinstScript);
				if (result == null) result = caseNamedElement(postinstScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PRERM_SCRIPT: {
				PrermScript prermScript = (PrermScript)theEObject;
				Object result = casePrermScript(prermScript);
				if (result == null) result = caseScript(prermScript);
				if (result == null) result = caseNamedElement(prermScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_SCRIPT: {
				PostrmScript postrmScript = (PostrmScript)theEObject;
				Object result = casePostrmScript(postrmScript);
				if (result == null) result = caseScript(postrmScript);
				if (result == null) result = caseNamedElement(postrmScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CONFIG_SCRIPT: {
				ConfigScript configScript = (ConfigScript)theEObject;
				Object result = caseConfigScript(configScript);
				if (result == null) result = caseScript(configScript);
				if (result == null) result = caseNamedElement(configScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.INVARIANT: {
				Invariant invariant = (Invariant)theEObject;
				Object result = caseInvariant(invariant);
				if (result == null) result = caseNamedElement(invariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ATOM: {
				Atom atom = (Atom)theEObject;
				Object result = caseAtom(atom);
				if (result == null) result = caseNamedElement(atom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.AND_INV: {
				AndInv andInv = (AndInv)theEObject;
				Object result = caseAndInv(andInv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.OR_INV: {
				OrInv orInv = (OrInv)theEObject;
				Object result = caseOrInv(orInv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.NOT_INV: {
				NotInv notInv = (NotInv)theEObject;
				Object result = caseNotInv(notInv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				Object result = caseStatement(statement);
				if (result == null) result = caseNamedElement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CONTROL_STATEMENT: {
				ControlStatement controlStatement = (ControlStatement)theEObject;
				Object result = caseControlStatement(controlStatement);
				if (result == null) result = caseStatement(controlStatement);
				if (result == null) result = caseNamedElement(controlStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CASE: {
				Case case_ = (Case)theEObject;
				Object result = caseCase(case_);
				if (result == null) result = caseControlStatement(case_);
				if (result == null) result = caseStatement(case_);
				if (result == null) result = caseNamedElement(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				Object result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.DEFAULT_CASE_CONDITION: {
				DefaultCaseCondition defaultCaseCondition = (DefaultCaseCondition)theEObject;
				Object result = caseDefaultCaseCondition(defaultCaseCondition);
				if (result == null) result = caseCondition(defaultCaseCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CASE_PRERM: {
				CasePrerm casePrerm = (CasePrerm)theEObject;
				Object result = caseCasePrerm(casePrerm);
				if (result == null) result = caseCase(casePrerm);
				if (result == null) result = caseControlStatement(casePrerm);
				if (result == null) result = caseStatement(casePrerm);
				if (result == null) result = caseNamedElement(casePrerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CASE_PRERM_CONDITION: {
				CasePrermCondition casePrermCondition = (CasePrermCondition)theEObject;
				Object result = caseCasePrermCondition(casePrermCondition);
				if (result == null) result = caseCondition(casePrermCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CASE_POSTRM: {
				CasePostrm casePostrm = (CasePostrm)theEObject;
				Object result = caseCasePostrm(casePostrm);
				if (result == null) result = caseCase(casePostrm);
				if (result == null) result = caseControlStatement(casePostrm);
				if (result == null) result = caseStatement(casePostrm);
				if (result == null) result = caseNamedElement(casePostrm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CASE_POSTRM_CONDITION: {
				CasePostrmCondition casePostrmCondition = (CasePostrmCondition)theEObject;
				Object result = caseCasePostrmCondition(casePostrmCondition);
				if (result == null) result = caseCondition(casePostrmCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CASE_PREINST: {
				CasePreinst casePreinst = (CasePreinst)theEObject;
				Object result = caseCasePreinst(casePreinst);
				if (result == null) result = caseCase(casePreinst);
				if (result == null) result = caseControlStatement(casePreinst);
				if (result == null) result = caseStatement(casePreinst);
				if (result == null) result = caseNamedElement(casePreinst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CASE_PREINST_CONDITION: {
				CasePreinstCondition casePreinstCondition = (CasePreinstCondition)theEObject;
				Object result = caseCasePreinstCondition(casePreinstCondition);
				if (result == null) result = caseCondition(casePreinstCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CASE_POSTINST: {
				CasePostinst casePostinst = (CasePostinst)theEObject;
				Object result = caseCasePostinst(casePostinst);
				if (result == null) result = caseCase(casePostinst);
				if (result == null) result = caseControlStatement(casePostinst);
				if (result == null) result = caseStatement(casePostinst);
				if (result == null) result = caseNamedElement(casePostinst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CASE_POSTINST_CONDITION: {
				CasePostinstCondition casePostinstCondition = (CasePostinstCondition)theEObject;
				Object result = caseCasePostinstCondition(casePostinstCondition);
				if (result == null) result = caseCondition(casePostinstCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.BASIC_CASE: {
				BasicCase basicCase = (BasicCase)theEObject;
				Object result = caseBasicCase(basicCase);
				if (result == null) result = caseControlStatement(basicCase);
				if (result == null) result = caseStatement(basicCase);
				if (result == null) result = caseNamedElement(basicCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.BASIC_CASE_CONDITION: {
				BasicCaseCondition basicCaseCondition = (BasicCaseCondition)theEObject;
				Object result = caseBasicCaseCondition(basicCaseCondition);
				if (result == null) result = caseCondition(basicCaseCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.IF: {
				If if_ = (If)theEObject;
				Object result = caseIf(if_);
				if (result == null) result = caseControlStatement(if_);
				if (result == null) result = caseStatement(if_);
				if (result == null) result = caseNamedElement(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				Object result = caseBooleanExpression(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.RETURN: {
				Return return_ = (Return)theEObject;
				Object result = caseReturn(return_);
				if (result == null) result = caseControlStatement(return_);
				if (result == null) result = caseStatement(return_);
				if (result == null) result = caseNamedElement(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ITERATOR: {
				Iterator iterator = (Iterator)theEObject;
				Object result = caseIterator(iterator);
				if (result == null) result = caseControlStatement(iterator);
				if (result == null) result = caseStatement(iterator);
				if (result == null) result = caseNamedElement(iterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.DIRECTORY_ITERATOR: {
				DirectoryIterator directoryIterator = (DirectoryIterator)theEObject;
				Object result = caseDirectoryIterator(directoryIterator);
				if (result == null) result = caseIterator(directoryIterator);
				if (result == null) result = caseControlStatement(directoryIterator);
				if (result == null) result = caseStatement(directoryIterator);
				if (result == null) result = caseNamedElement(directoryIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.FILE_CONTENT_ITERATOR: {
				FileContentIterator fileContentIterator = (FileContentIterator)theEObject;
				Object result = caseFileContentIterator(fileContentIterator);
				if (result == null) result = caseIterator(fileContentIterator);
				if (result == null) result = caseControlStatement(fileContentIterator);
				if (result == null) result = caseStatement(fileContentIterator);
				if (result == null) result = caseNamedElement(fileContentIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.INPUT_PARAMETER_ITERATOR: {
				InputParameterIterator inputParameterIterator = (InputParameterIterator)theEObject;
				Object result = caseInputParameterIterator(inputParameterIterator);
				if (result == null) result = caseIterator(inputParameterIterator);
				if (result == null) result = caseControlStatement(inputParameterIterator);
				if (result == null) result = caseStatement(inputParameterIterator);
				if (result == null) result = caseNamedElement(inputParameterIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ENUMERATION_ITERATOR: {
				EnumerationIterator enumerationIterator = (EnumerationIterator)theEObject;
				Object result = caseEnumerationIterator(enumerationIterator);
				if (result == null) result = caseIterator(enumerationIterator);
				if (result == null) result = caseControlStatement(enumerationIterator);
				if (result == null) result = caseStatement(enumerationIterator);
				if (result == null) result = caseNamedElement(enumerationIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.STRING_ITERATOR: {
				StringIterator stringIterator = (StringIterator)theEObject;
				Object result = caseStringIterator(stringIterator);
				if (result == null) result = caseIterator(stringIterator);
				if (result == null) result = caseControlStatement(stringIterator);
				if (result == null) result = caseStatement(stringIterator);
				if (result == null) result = caseNamedElement(stringIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				Object result = caseEnumeration(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ENUMERATION_ELEMENT: {
				EnumerationElement enumerationElement = (EnumerationElement)theEObject;
				Object result = caseEnumerationElement(enumerationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.FILE_SYSTEM_STATEMENT: {
				FileSystemStatement fileSystemStatement = (FileSystemStatement)theEObject;
				Object result = caseFileSystemStatement(fileSystemStatement);
				if (result == null) result = caseStatement(fileSystemStatement);
				if (result == null) result = caseNamedElement(fileSystemStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ADDITION_FILE_SYTEM_STATEMENT: {
				AdditionFileSytemStatement additionFileSytemStatement = (AdditionFileSytemStatement)theEObject;
				Object result = caseAdditionFileSytemStatement(additionFileSytemStatement);
				if (result == null) result = caseFileSystemStatement(additionFileSytemStatement);
				if (result == null) result = caseStatement(additionFileSytemStatement);
				if (result == null) result = caseNamedElement(additionFileSytemStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.DELETION_FILE_SYSTEM_STATEMENT: {
				DeletionFileSystemStatement deletionFileSystemStatement = (DeletionFileSystemStatement)theEObject;
				Object result = caseDeletionFileSystemStatement(deletionFileSystemStatement);
				if (result == null) result = caseFileSystemStatement(deletionFileSystemStatement);
				if (result == null) result = caseStatement(deletionFileSystemStatement);
				if (result == null) result = caseNamedElement(deletionFileSystemStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.UPDATE_FILE_SYTEM_STATEMENT: {
				UpdateFileSytemStatement updateFileSytemStatement = (UpdateFileSytemStatement)theEObject;
				Object result = caseUpdateFileSytemStatement(updateFileSytemStatement);
				if (result == null) result = caseFileSystemStatement(updateFileSytemStatement);
				if (result == null) result = caseStatement(updateFileSytemStatement);
				if (result == null) result = caseNamedElement(updateFileSytemStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ENVIRONMENT_STATEMENT: {
				EnvironmentStatement environmentStatement = (EnvironmentStatement)theEObject;
				Object result = caseEnvironmentStatement(environmentStatement);
				if (result == null) result = caseStatement(environmentStatement);
				if (result == null) result = caseNamedElement(environmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ADDITION_ENVIRONMENT_STATEMENT: {
				AdditionEnvironmentStatement additionEnvironmentStatement = (AdditionEnvironmentStatement)theEObject;
				Object result = caseAdditionEnvironmentStatement(additionEnvironmentStatement);
				if (result == null) result = caseEnvironmentStatement(additionEnvironmentStatement);
				if (result == null) result = caseStatement(additionEnvironmentStatement);
				if (result == null) result = caseNamedElement(additionEnvironmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.DELETION_ENVIRONMENT_STATEMENT: {
				DeletionEnvironmentStatement deletionEnvironmentStatement = (DeletionEnvironmentStatement)theEObject;
				Object result = caseDeletionEnvironmentStatement(deletionEnvironmentStatement);
				if (result == null) result = caseEnvironmentStatement(deletionEnvironmentStatement);
				if (result == null) result = caseStatement(deletionEnvironmentStatement);
				if (result == null) result = caseNamedElement(deletionEnvironmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.UPDATE_ENVIRONMENT_STATEMENT: {
				UpdateEnvironmentStatement updateEnvironmentStatement = (UpdateEnvironmentStatement)theEObject;
				Object result = caseUpdateEnvironmentStatement(updateEnvironmentStatement);
				if (result == null) result = caseEnvironmentStatement(updateEnvironmentStatement);
				if (result == null) result = caseStatement(updateEnvironmentStatement);
				if (result == null) result = caseNamedElement(updateEnvironmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PACKAGE_SETTING_STATEMENT: {
				PackageSettingStatement packageSettingStatement = (PackageSettingStatement)theEObject;
				Object result = casePackageSettingStatement(packageSettingStatement);
				if (result == null) result = caseStatement(packageSettingStatement);
				if (result == null) result = caseNamedElement(packageSettingStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ADDITION_PACKAGE_SETTING_STATEMENT: {
				AdditionPackageSettingStatement additionPackageSettingStatement = (AdditionPackageSettingStatement)theEObject;
				Object result = caseAdditionPackageSettingStatement(additionPackageSettingStatement);
				if (result == null) result = casePackageSettingStatement(additionPackageSettingStatement);
				if (result == null) result = caseStatement(additionPackageSettingStatement);
				if (result == null) result = caseNamedElement(additionPackageSettingStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.DELETION_PACKAGE_SETTING_STATEMENT: {
				DeletionPackageSettingStatement deletionPackageSettingStatement = (DeletionPackageSettingStatement)theEObject;
				Object result = caseDeletionPackageSettingStatement(deletionPackageSettingStatement);
				if (result == null) result = casePackageSettingStatement(deletionPackageSettingStatement);
				if (result == null) result = caseStatement(deletionPackageSettingStatement);
				if (result == null) result = caseNamedElement(deletionPackageSettingStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.UPDATE_PACKAGE_SETTING_STATEMENT: {
				UpdatePackageSettingStatement updatePackageSettingStatement = (UpdatePackageSettingStatement)theEObject;
				Object result = caseUpdatePackageSettingStatement(updatePackageSettingStatement);
				if (result == null) result = casePackageSettingStatement(updatePackageSettingStatement);
				if (result == null) result = caseStatement(updatePackageSettingStatement);
				if (result == null) result = caseNamedElement(updatePackageSettingStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.NEUTRAL_STATEMENT: {
				NeutralStatement neutralStatement = (NeutralStatement)theEObject;
				Object result = caseNeutralStatement(neutralStatement);
				if (result == null) result = caseStatement(neutralStatement);
				if (result == null) result = caseNamedElement(neutralStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MESSAGE: {
				Message message = (Message)theEObject;
				Object result = caseMessage(message);
				if (result == null) result = caseNeutralStatement(message);
				if (result == null) result = caseStatement(message);
				if (result == null) result = caseNamedElement(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				Object result = caseComment(comment);
				if (result == null) result = caseNeutralStatement(comment);
				if (result == null) result = caseStatement(comment);
				if (result == null) result = caseNamedElement(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ENVIRONMENT: {
				Environment environment = (Environment)theEObject;
				Object result = caseEnvironment(environment);
				if (result == null) result = caseNamedElement(environment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.FILE_SYSTEM: {
				FileSystem fileSystem = (FileSystem)theEObject;
				Object result = caseFileSystem(fileSystem);
				if (result == null) result = caseNamedElement(fileSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.GCONF: {
				GConf gConf = (GConf)theEObject;
				Object result = caseGConf(gConf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.APPLICATION_MENU_CATALOG: {
				ApplicationMenuCatalog applicationMenuCatalog = (ApplicationMenuCatalog)theEObject;
				Object result = caseApplicationMenuCatalog(applicationMenuCatalog);
				if (result == null) result = caseNamedElement(applicationMenuCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MENU: {
				Menu menu = (Menu)theEObject;
				Object result = caseMenu(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MENU_ENTRY: {
				MenuEntry menuEntry = (MenuEntry)theEObject;
				Object result = caseMenuEntry(menuEntry);
				if (result == null) result = caseNamedElement(menuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.BOOT: {
				Boot boot = (Boot)theEObject;
				Object result = caseBoot(boot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SERVICE: {
				Service service = (Service)theEObject;
				Object result = caseService(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.FILE: {
				File file = (File)theEObject;
				Object result = caseFile(file);
				if (result == null) result = caseNamedElement(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.DOCUMENTATION_FILE: {
				DocumentationFile documentationFile = (DocumentationFile)theEObject;
				Object result = caseDocumentationFile(documentationFile);
				if (result == null) result = caseFile(documentationFile);
				if (result == null) result = caseNamedElement(documentationFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.INFORMATION_FILE: {
				InformationFile informationFile = (InformationFile)theEObject;
				Object result = caseInformationFile(informationFile);
				if (result == null) result = caseFile(informationFile);
				if (result == null) result = caseNamedElement(informationFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ALTERNATIVE: {
				Alternative alternative = (Alternative)theEObject;
				Object result = caseAlternative(alternative);
				if (result == null) result = caseNamedElement(alternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PACKAGE_SETTING: {
				PackageSetting packageSetting = (PackageSetting)theEObject;
				Object result = casePackageSetting(packageSetting);
				if (result == null) result = caseNamedElement(packageSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ICON_CACHE: {
				IconCache iconCache = (IconCache)theEObject;
				Object result = caseIconCache(iconCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.DESKTOP_DB: {
				DesktopDB desktopDB = (DesktopDB)theEObject;
				Object result = caseDesktopDB(desktopDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE: {
				MimeTypeHandlerCache mimeTypeHandlerCache = (MimeTypeHandlerCache)theEObject;
				Object result = caseMimeTypeHandlerCache(mimeTypeHandlerCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MIME_TYPE_HANDLER: {
				MimeTypeHandler mimeTypeHandler = (MimeTypeHandler)theEObject;
				Object result = caseMimeTypeHandler(mimeTypeHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MIME_TYPE: {
				MimeType mimeType = (MimeType)theEObject;
				Object result = caseMimeType(mimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.XFONT_CACHE: {
				XFontCache xFontCache = (XFontCache)theEObject;
				Object result = caseXFontCache(xFontCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.XFONT: {
				XFont xFont = (XFont)theEObject;
				Object result = caseXFont(xFont);
				if (result == null) result = caseNamedElement(xFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.LIBRARY_CACHE: {
				LibraryCache libraryCache = (LibraryCache)theEObject;
				Object result = caseLibraryCache(libraryCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SHARED_LIBRARY: {
				SharedLibrary sharedLibrary = (SharedLibrary)theEObject;
				Object result = caseSharedLibrary(sharedLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MODULE_CACHE: {
				ModuleCache moduleCache = (ModuleCache)theEObject;
				Object result = caseModuleCache(moduleCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MODULE: {
				Module module = (Module)theEObject;
				Object result = caseModule(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SGML_CATALOG: {
				SGMLCatalog sgmlCatalog = (SGMLCatalog)theEObject;
				Object result = caseSGMLCatalog(sgmlCatalog);
				if (result == null) result = caseNamedElement(sgmlCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SGML_DOCUMENT: {
				SGMLDocument sgmlDocument = (SGMLDocument)theEObject;
				Object result = caseSGMLDocument(sgmlDocument);
				if (result == null) result = caseNamedElement(sgmlDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SKEEPER_CATALOG: {
				SkeeperCatalog skeeperCatalog = (SkeeperCatalog)theEObject;
				Object result = caseSkeeperCatalog(skeeperCatalog);
				if (result == null) result = caseNamedElement(skeeperCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SKEEPER_DOCUMENT: {
				SkeeperDocument skeeperDocument = (SkeeperDocument)theEObject;
				Object result = caseSkeeperDocument(skeeperDocument);
				if (result == null) result = caseNamedElement(skeeperDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.EMACS_PACKAGE: {
				EmacsPackage emacsPackage = (EmacsPackage)theEObject;
				Object result = caseEmacsPackage(emacsPackage);
				if (result == null) result = caseNamedElement(emacsPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.USER: {
				User user = (User)theEObject;
				Object result = caseUser(user);
				if (result == null) result = caseNamedElement(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.GROUP: {
				Group group = (Group)theEObject;
				Object result = caseGroup(group);
				if (result == null) result = caseNamedElement(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_DESKTOP: {
				PostinstDesktop postinstDesktop = (PostinstDesktop)theEObject;
				Object result = casePostinstDesktop(postinstDesktop);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstDesktop);
				if (result == null) result = caseEnvironmentStatement(postinstDesktop);
				if (result == null) result = caseStatement(postinstDesktop);
				if (result == null) result = caseNamedElement(postinstDesktop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_DOC_BASE: {
				PostinstDocBase postinstDocBase = (PostinstDocBase)theEObject;
				Object result = casePostinstDocBase(postinstDocBase);
				if (result == null) result = caseAdditionEnvironmentStatement(postinstDocBase);
				if (result == null) result = caseEnvironmentStatement(postinstDocBase);
				if (result == null) result = caseStatement(postinstDocBase);
				if (result == null) result = caseNamedElement(postinstDocBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_EMACSEN: {
				PostinstEmacsen postinstEmacsen = (PostinstEmacsen)theEObject;
				Object result = casePostinstEmacsen(postinstEmacsen);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstEmacsen);
				if (result == null) result = caseUpdatePackageSettingStatement(postinstEmacsen);
				if (result == null) result = caseEnvironmentStatement(postinstEmacsen);
				if (result == null) result = casePackageSettingStatement(postinstEmacsen);
				if (result == null) result = caseStatement(postinstEmacsen);
				if (result == null) result = caseNamedElement(postinstEmacsen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_GCONF: {
				PostinstGconf postinstGconf = (PostinstGconf)theEObject;
				Object result = casePostinstGconf(postinstGconf);
				if (result == null) result = caseUpdatePackageSettingStatement(postinstGconf);
				if (result == null) result = casePackageSettingStatement(postinstGconf);
				if (result == null) result = caseStatement(postinstGconf);
				if (result == null) result = caseNamedElement(postinstGconf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_GCONF_DEFAULTS: {
				PostinstGconfDefaults postinstGconfDefaults = (PostinstGconfDefaults)theEObject;
				Object result = casePostinstGconfDefaults(postinstGconfDefaults);
				if (result == null) result = caseUpdatePackageSettingStatement(postinstGconfDefaults);
				if (result == null) result = casePackageSettingStatement(postinstGconfDefaults);
				if (result == null) result = caseStatement(postinstGconfDefaults);
				if (result == null) result = caseNamedElement(postinstGconfDefaults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_ICONS: {
				PostinstIcons postinstIcons = (PostinstIcons)theEObject;
				Object result = casePostinstIcons(postinstIcons);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstIcons);
				if (result == null) result = caseEnvironmentStatement(postinstIcons);
				if (result == null) result = caseStatement(postinstIcons);
				if (result == null) result = caseNamedElement(postinstIcons);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_INFO: {
				PostinstInfo postinstInfo = (PostinstInfo)theEObject;
				Object result = casePostinstInfo(postinstInfo);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstInfo);
				if (result == null) result = caseEnvironmentStatement(postinstInfo);
				if (result == null) result = caseStatement(postinstInfo);
				if (result == null) result = caseNamedElement(postinstInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_INIT: {
				PostinstInit postinstInit = (PostinstInit)theEObject;
				Object result = casePostinstInit(postinstInit);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstInit);
				if (result == null) result = caseEnvironmentStatement(postinstInit);
				if (result == null) result = caseStatement(postinstInit);
				if (result == null) result = caseNamedElement(postinstInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_INIT_NOSTART: {
				PostinstInitNostart postinstInitNostart = (PostinstInitNostart)theEObject;
				Object result = casePostinstInitNostart(postinstInitNostart);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstInitNostart);
				if (result == null) result = caseEnvironmentStatement(postinstInitNostart);
				if (result == null) result = caseStatement(postinstInitNostart);
				if (result == null) result = caseNamedElement(postinstInitNostart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_INIT_RESTART: {
				PostinstInitRestart postinstInitRestart = (PostinstInitRestart)theEObject;
				Object result = casePostinstInitRestart(postinstInitRestart);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstInitRestart);
				if (result == null) result = caseEnvironmentStatement(postinstInitRestart);
				if (result == null) result = caseStatement(postinstInitRestart);
				if (result == null) result = caseNamedElement(postinstInitRestart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_MAKESHLIBS: {
				PostinstMakeshlibs postinstMakeshlibs = (PostinstMakeshlibs)theEObject;
				Object result = casePostinstMakeshlibs(postinstMakeshlibs);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstMakeshlibs);
				if (result == null) result = caseEnvironmentStatement(postinstMakeshlibs);
				if (result == null) result = caseStatement(postinstMakeshlibs);
				if (result == null) result = caseNamedElement(postinstMakeshlibs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_MENU: {
				PostinstMenu postinstMenu = (PostinstMenu)theEObject;
				Object result = casePostinstMenu(postinstMenu);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstMenu);
				if (result == null) result = caseEnvironmentStatement(postinstMenu);
				if (result == null) result = caseStatement(postinstMenu);
				if (result == null) result = caseNamedElement(postinstMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_MENU_METHOD: {
				PostinstMenuMethod postinstMenuMethod = (PostinstMenuMethod)theEObject;
				Object result = casePostinstMenuMethod(postinstMenuMethod);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstMenuMethod);
				if (result == null) result = caseEnvironmentStatement(postinstMenuMethod);
				if (result == null) result = caseStatement(postinstMenuMethod);
				if (result == null) result = caseNamedElement(postinstMenuMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_MIME: {
				PostinstMime postinstMime = (PostinstMime)theEObject;
				Object result = casePostinstMime(postinstMime);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstMime);
				if (result == null) result = caseEnvironmentStatement(postinstMime);
				if (result == null) result = caseStatement(postinstMime);
				if (result == null) result = caseNamedElement(postinstMime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_MODULES: {
				PostinstModules postinstModules = (PostinstModules)theEObject;
				Object result = casePostinstModules(postinstModules);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstModules);
				if (result == null) result = caseEnvironmentStatement(postinstModules);
				if (result == null) result = caseStatement(postinstModules);
				if (result == null) result = caseNamedElement(postinstModules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_PYTHON: {
				PostinstPython postinstPython = (PostinstPython)theEObject;
				Object result = casePostinstPython(postinstPython);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstPython);
				if (result == null) result = caseEnvironmentStatement(postinstPython);
				if (result == null) result = caseStatement(postinstPython);
				if (result == null) result = caseNamedElement(postinstPython);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_SCROLLKEEPER: {
				PostinstScrollkeeper postinstScrollkeeper = (PostinstScrollkeeper)theEObject;
				Object result = casePostinstScrollkeeper(postinstScrollkeeper);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstScrollkeeper);
				if (result == null) result = caseEnvironmentStatement(postinstScrollkeeper);
				if (result == null) result = caseStatement(postinstScrollkeeper);
				if (result == null) result = caseNamedElement(postinstScrollkeeper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_SGMLCATALOG: {
				PostinstSgmlcatalog postinstSgmlcatalog = (PostinstSgmlcatalog)theEObject;
				Object result = casePostinstSgmlcatalog(postinstSgmlcatalog);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstSgmlcatalog);
				if (result == null) result = caseEnvironmentStatement(postinstSgmlcatalog);
				if (result == null) result = caseStatement(postinstSgmlcatalog);
				if (result == null) result = caseNamedElement(postinstSgmlcatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_SHAREDMIMEINFO: {
				PostinstSharedmimeinfo postinstSharedmimeinfo = (PostinstSharedmimeinfo)theEObject;
				Object result = casePostinstSharedmimeinfo(postinstSharedmimeinfo);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstSharedmimeinfo);
				if (result == null) result = caseEnvironmentStatement(postinstSharedmimeinfo);
				if (result == null) result = caseStatement(postinstSharedmimeinfo);
				if (result == null) result = caseNamedElement(postinstSharedmimeinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_SUID: {
				PostinstSuid postinstSuid = (PostinstSuid)theEObject;
				Object result = casePostinstSuid(postinstSuid);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstSuid);
				if (result == null) result = caseUpdateFileSytemStatement(postinstSuid);
				if (result == null) result = caseEnvironmentStatement(postinstSuid);
				if (result == null) result = caseFileSystemStatement(postinstSuid);
				if (result == null) result = caseStatement(postinstSuid);
				if (result == null) result = caseNamedElement(postinstSuid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_UDEV: {
				PostinstUdev postinstUdev = (PostinstUdev)theEObject;
				Object result = casePostinstUdev(postinstUdev);
				if (result == null) result = caseUpdateFileSytemStatement(postinstUdev);
				if (result == null) result = caseFileSystemStatement(postinstUdev);
				if (result == null) result = caseStatement(postinstUdev);
				if (result == null) result = caseNamedElement(postinstUdev);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_USRLOCAL: {
				PostinstUsrlocal postinstUsrlocal = (PostinstUsrlocal)theEObject;
				Object result = casePostinstUsrlocal(postinstUsrlocal);
				if (result == null) result = caseUpdateFileSytemStatement(postinstUsrlocal);
				if (result == null) result = caseFileSystemStatement(postinstUsrlocal);
				if (result == null) result = caseStatement(postinstUsrlocal);
				if (result == null) result = caseNamedElement(postinstUsrlocal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_WM: {
				PostinstWm postinstWm = (PostinstWm)theEObject;
				Object result = casePostinstWm(postinstWm);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstWm);
				if (result == null) result = caseEnvironmentStatement(postinstWm);
				if (result == null) result = caseStatement(postinstWm);
				if (result == null) result = caseNamedElement(postinstWm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_WM_NOMAN: {
				PostinstWmNoman postinstWmNoman = (PostinstWmNoman)theEObject;
				Object result = casePostinstWmNoman(postinstWmNoman);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstWmNoman);
				if (result == null) result = caseEnvironmentStatement(postinstWmNoman);
				if (result == null) result = caseStatement(postinstWmNoman);
				if (result == null) result = caseNamedElement(postinstWmNoman);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTINST_XFONTS: {
				PostinstXfonts postinstXfonts = (PostinstXfonts)theEObject;
				Object result = casePostinstXfonts(postinstXfonts);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstXfonts);
				if (result == null) result = caseEnvironmentStatement(postinstXfonts);
				if (result == null) result = caseStatement(postinstXfonts);
				if (result == null) result = caseNamedElement(postinstXfonts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_DEBCONF: {
				PostrmDebconf postrmDebconf = (PostrmDebconf)theEObject;
				Object result = casePostrmDebconf(postrmDebconf);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmDebconf);
				if (result == null) result = caseEnvironmentStatement(postrmDebconf);
				if (result == null) result = caseStatement(postrmDebconf);
				if (result == null) result = caseNamedElement(postrmDebconf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_DESKTOP: {
				PostrmDesktop postrmDesktop = (PostrmDesktop)theEObject;
				Object result = casePostrmDesktop(postrmDesktop);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmDesktop);
				if (result == null) result = caseEnvironmentStatement(postrmDesktop);
				if (result == null) result = caseStatement(postrmDesktop);
				if (result == null) result = caseNamedElement(postrmDesktop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_GCONF: {
				PostrmGconf postrmGconf = (PostrmGconf)theEObject;
				Object result = casePostrmGconf(postrmGconf);
				if (result == null) result = caseDeletionFileSystemStatement(postrmGconf);
				if (result == null) result = caseFileSystemStatement(postrmGconf);
				if (result == null) result = caseStatement(postrmGconf);
				if (result == null) result = caseNamedElement(postrmGconf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_GCONF_DEFAULTS: {
				PostrmGconfDefaults postrmGconfDefaults = (PostrmGconfDefaults)theEObject;
				Object result = casePostrmGconfDefaults(postrmGconfDefaults);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmGconfDefaults);
				if (result == null) result = caseEnvironmentStatement(postrmGconfDefaults);
				if (result == null) result = caseStatement(postrmGconfDefaults);
				if (result == null) result = caseNamedElement(postrmGconfDefaults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_ICONS: {
				PostrmIcons postrmIcons = (PostrmIcons)theEObject;
				Object result = casePostrmIcons(postrmIcons);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmIcons);
				if (result == null) result = caseEnvironmentStatement(postrmIcons);
				if (result == null) result = caseStatement(postrmIcons);
				if (result == null) result = caseNamedElement(postrmIcons);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_INIT: {
				PostrmInit postrmInit = (PostrmInit)theEObject;
				Object result = casePostrmInit(postrmInit);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmInit);
				if (result == null) result = caseDeletionFileSystemStatement(postrmInit);
				if (result == null) result = caseEnvironmentStatement(postrmInit);
				if (result == null) result = caseFileSystemStatement(postrmInit);
				if (result == null) result = caseStatement(postrmInit);
				if (result == null) result = caseNamedElement(postrmInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_MAKESHLIBS: {
				PostrmMakeshlibs postrmMakeshlibs = (PostrmMakeshlibs)theEObject;
				Object result = casePostrmMakeshlibs(postrmMakeshlibs);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmMakeshlibs);
				if (result == null) result = caseEnvironmentStatement(postrmMakeshlibs);
				if (result == null) result = caseStatement(postrmMakeshlibs);
				if (result == null) result = caseNamedElement(postrmMakeshlibs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_MENU: {
				PostrmMenu postrmMenu = (PostrmMenu)theEObject;
				Object result = casePostrmMenu(postrmMenu);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmMenu);
				if (result == null) result = caseEnvironmentStatement(postrmMenu);
				if (result == null) result = caseStatement(postrmMenu);
				if (result == null) result = caseNamedElement(postrmMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_MENU_METHOD: {
				PostrmMenuMethod postrmMenuMethod = (PostrmMenuMethod)theEObject;
				Object result = casePostrmMenuMethod(postrmMenuMethod);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmMenuMethod);
				if (result == null) result = caseUpdateFileSytemStatement(postrmMenuMethod);
				if (result == null) result = caseEnvironmentStatement(postrmMenuMethod);
				if (result == null) result = caseFileSystemStatement(postrmMenuMethod);
				if (result == null) result = caseStatement(postrmMenuMethod);
				if (result == null) result = caseNamedElement(postrmMenuMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_MIME: {
				PostrmMime postrmMime = (PostrmMime)theEObject;
				Object result = casePostrmMime(postrmMime);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmMime);
				if (result == null) result = caseEnvironmentStatement(postrmMime);
				if (result == null) result = caseStatement(postrmMime);
				if (result == null) result = caseNamedElement(postrmMime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_MODULES: {
				PostrmModules postrmModules = (PostrmModules)theEObject;
				Object result = casePostrmModules(postrmModules);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmModules);
				if (result == null) result = caseEnvironmentStatement(postrmModules);
				if (result == null) result = caseStatement(postrmModules);
				if (result == null) result = caseNamedElement(postrmModules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_SCROLLKEEPER: {
				PostrmScrollkeeper postrmScrollkeeper = (PostrmScrollkeeper)theEObject;
				Object result = casePostrmScrollkeeper(postrmScrollkeeper);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmScrollkeeper);
				if (result == null) result = caseEnvironmentStatement(postrmScrollkeeper);
				if (result == null) result = caseStatement(postrmScrollkeeper);
				if (result == null) result = caseNamedElement(postrmScrollkeeper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_SGMLCATALOG: {
				PostrmSgmlcatalog postrmSgmlcatalog = (PostrmSgmlcatalog)theEObject;
				Object result = casePostrmSgmlcatalog(postrmSgmlcatalog);
				if (result == null) result = caseUpdateFileSytemStatement(postrmSgmlcatalog);
				if (result == null) result = caseFileSystemStatement(postrmSgmlcatalog);
				if (result == null) result = caseStatement(postrmSgmlcatalog);
				if (result == null) result = caseNamedElement(postrmSgmlcatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_SHAREDMIMEINFO: {
				PostrmSharedmimeinfo postrmSharedmimeinfo = (PostrmSharedmimeinfo)theEObject;
				Object result = casePostrmSharedmimeinfo(postrmSharedmimeinfo);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmSharedmimeinfo);
				if (result == null) result = caseEnvironmentStatement(postrmSharedmimeinfo);
				if (result == null) result = caseStatement(postrmSharedmimeinfo);
				if (result == null) result = caseNamedElement(postrmSharedmimeinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_SUID: {
				PostrmSuid postrmSuid = (PostrmSuid)theEObject;
				Object result = casePostrmSuid(postrmSuid);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmSuid);
				if (result == null) result = caseEnvironmentStatement(postrmSuid);
				if (result == null) result = caseStatement(postrmSuid);
				if (result == null) result = caseNamedElement(postrmSuid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.POSTRM_XFONTS: {
				PostrmXfonts postrmXfonts = (PostrmXfonts)theEObject;
				Object result = casePostrmXfonts(postrmXfonts);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmXfonts);
				if (result == null) result = caseEnvironmentStatement(postrmXfonts);
				if (result == null) result = caseStatement(postrmXfonts);
				if (result == null) result = caseNamedElement(postrmXfonts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PREINST_UDEV: {
				PreinstUdev preinstUdev = (PreinstUdev)theEObject;
				Object result = casePreinstUdev(preinstUdev);
				if (result == null) result = caseDeletionFileSystemStatement(preinstUdev);
				if (result == null) result = caseFileSystemStatement(preinstUdev);
				if (result == null) result = caseStatement(preinstUdev);
				if (result == null) result = caseNamedElement(preinstUdev);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PREINST_USER: {
				PreinstUser preinstUser = (PreinstUser)theEObject;
				Object result = casePreinstUser(preinstUser);
				if (result == null) result = caseUpdateFileSytemStatement(preinstUser);
				if (result == null) result = caseFileSystemStatement(preinstUser);
				if (result == null) result = caseStatement(preinstUser);
				if (result == null) result = caseNamedElement(preinstUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PRERM_DOC_BASE: {
				PrermDocBase prermDocBase = (PrermDocBase)theEObject;
				Object result = casePrermDocBase(prermDocBase);
				if (result == null) result = caseUpdateEnvironmentStatement(prermDocBase);
				if (result == null) result = caseEnvironmentStatement(prermDocBase);
				if (result == null) result = caseStatement(prermDocBase);
				if (result == null) result = caseNamedElement(prermDocBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PRERM_EMACSEN: {
				PrermEmacsen prermEmacsen = (PrermEmacsen)theEObject;
				Object result = casePrermEmacsen(prermEmacsen);
				if (result == null) result = caseUpdateEnvironmentStatement(prermEmacsen);
				if (result == null) result = caseUpdatePackageSettingStatement(prermEmacsen);
				if (result == null) result = caseEnvironmentStatement(prermEmacsen);
				if (result == null) result = casePackageSettingStatement(prermEmacsen);
				if (result == null) result = caseStatement(prermEmacsen);
				if (result == null) result = caseNamedElement(prermEmacsen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PRERM_GCONF: {
				PrermGconf prermGconf = (PrermGconf)theEObject;
				Object result = casePrermGconf(prermGconf);
				if (result == null) result = caseUpdatePackageSettingStatement(prermGconf);
				if (result == null) result = casePackageSettingStatement(prermGconf);
				if (result == null) result = caseStatement(prermGconf);
				if (result == null) result = caseNamedElement(prermGconf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PRERM_INFO: {
				PrermInfo prermInfo = (PrermInfo)theEObject;
				Object result = casePrermInfo(prermInfo);
				if (result == null) result = caseUpdateEnvironmentStatement(prermInfo);
				if (result == null) result = caseDeletionPackageSettingStatement(prermInfo);
				if (result == null) result = caseEnvironmentStatement(prermInfo);
				if (result == null) result = casePackageSettingStatement(prermInfo);
				if (result == null) result = caseStatement(prermInfo);
				if (result == null) result = caseNamedElement(prermInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PRERM_INIT: {
				PrermInit prermInit = (PrermInit)theEObject;
				Object result = casePrermInit(prermInit);
				if (result == null) result = caseUpdateEnvironmentStatement(prermInit);
				if (result == null) result = caseEnvironmentStatement(prermInit);
				if (result == null) result = caseStatement(prermInit);
				if (result == null) result = caseNamedElement(prermInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PRERM_INIT_NORESTART: {
				PrermInitNorestart prermInitNorestart = (PrermInitNorestart)theEObject;
				Object result = casePrermInitNorestart(prermInitNorestart);
				if (result == null) result = caseUpdateEnvironmentStatement(prermInitNorestart);
				if (result == null) result = caseEnvironmentStatement(prermInitNorestart);
				if (result == null) result = caseStatement(prermInitNorestart);
				if (result == null) result = caseNamedElement(prermInitNorestart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PRERM_PYTHON: {
				PrermPython prermPython = (PrermPython)theEObject;
				Object result = casePrermPython(prermPython);
				if (result == null) result = caseDeletionFileSystemStatement(prermPython);
				if (result == null) result = caseFileSystemStatement(prermPython);
				if (result == null) result = caseStatement(prermPython);
				if (result == null) result = caseNamedElement(prermPython);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PRERM_SGMLCATALOG: {
				PrermSgmlcatalog prermSgmlcatalog = (PrermSgmlcatalog)theEObject;
				Object result = casePrermSgmlcatalog(prermSgmlcatalog);
				if (result == null) result = caseUpdateEnvironmentStatement(prermSgmlcatalog);
				if (result == null) result = caseDeletionPackageSettingStatement(prermSgmlcatalog);
				if (result == null) result = caseEnvironmentStatement(prermSgmlcatalog);
				if (result == null) result = casePackageSettingStatement(prermSgmlcatalog);
				if (result == null) result = caseStatement(prermSgmlcatalog);
				if (result == null) result = caseNamedElement(prermSgmlcatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PRERM_USRLOCAL: {
				PrermUsrlocal prermUsrlocal = (PrermUsrlocal)theEObject;
				Object result = casePrermUsrlocal(prermUsrlocal);
				if (result == null) result = caseDeletionFileSystemStatement(prermUsrlocal);
				if (result == null) result = caseFileSystemStatement(prermUsrlocal);
				if (result == null) result = caseStatement(prermUsrlocal);
				if (result == null) result = caseNamedElement(prermUsrlocal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PRERM_WM: {
				PrermWm prermWm = (PrermWm)theEObject;
				Object result = casePrermWm(prermWm);
				if (result == null) result = caseDeletionPackageSettingStatement(prermWm);
				if (result == null) result = casePackageSettingStatement(prermWm);
				if (result == null) result = caseStatement(prermWm);
				if (result == null) result = caseNamedElement(prermWm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PARAM: {
				Param param = (Param)theEObject;
				Object result = caseParam(param);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.STRING_PARAM: {
				StringParam stringParam = (StringParam)theEObject;
				Object result = caseStringParam(stringParam);
				if (result == null) result = caseParam(stringParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.INT_PARAM: {
				IntParam intParam = (IntParam)theEObject;
				Object result = caseIntParam(intParam);
				if (result == null) result = caseParam(intParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SINGLE_CONFLICT: {
				SingleConflict singleConflict = (SingleConflict)theEObject;
				Object result = caseSingleConflict(singleConflict);
				if (result == null) result = caseConflict(singleConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CONFLICT: {
				Conflict conflict = (Conflict)theEObject;
				Object result = caseConflict(conflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.AND_CONFLICT: {
				AndConflict andConflict = (AndConflict)theEObject;
				Object result = caseAndConflict(andConflict);
				if (result == null) result = caseConflict(andConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.OR_CONFLICT: {
				OrConflict orConflict = (OrConflict)theEObject;
				Object result = caseOrConflict(orConflict);
				if (result == null) result = caseConflict(orConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PACKAGE: {
				mancoosi.Package package_ = (mancoosi.Package)theEObject;
				Object result = casePackage(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Installed Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Installed Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstalledPackage(InstalledPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackage(mancoosi.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Installed Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Installed Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNotInstalledPackage(NotInstalledPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSrcPackage(SrcPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bin Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bin Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBinPackage(BinPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVirtualPackage(VirtualPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDependence(Dependence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Dep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Dep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAndDep(AndDep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Dep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Dep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrDep(OrDep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Dep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Dep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSingleDep(SingleDep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputParameter(InputParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preinst Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preinst Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePreinstScript(PreinstScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstScript(PostinstScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrermScript(PrermScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmScript(PostrmScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfigScript(ConfigScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInvariant(Invariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAtom(Atom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Inv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Inv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAndInv(AndInv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Inv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Inv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrInv(OrInv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Inv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Inv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNotInv(NotInv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseControlStatement(ControlStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCase(Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Case Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Case Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDefaultCaseCondition(DefaultCaseCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Prerm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Prerm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCasePrerm(CasePrerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Prerm Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Prerm Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCasePrermCondition(CasePrermCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Postrm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Postrm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCasePostrm(CasePostrm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Postrm Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Postrm Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCasePostrmCondition(CasePostrmCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Preinst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Preinst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCasePreinst(CasePreinst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Preinst Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Preinst Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCasePreinstCondition(CasePreinstCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Postinst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Postinst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCasePostinst(CasePostinst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Postinst Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Postinst Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCasePostinstCondition(CasePostinstCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBasicCase(BasicCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Case Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Case Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBasicCaseCondition(BasicCaseCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReturn(Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIterator(Iterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDirectoryIterator(DirectoryIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Content Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Content Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFileContentIterator(FileContentIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Parameter Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Parameter Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInputParameterIterator(InputParameterIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumerationIterator(EnumerationIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringIterator(StringIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumerationElement(EnumerationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File System Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File System Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFileSystemStatement(FileSystemStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition File Sytem Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition File Sytem Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdditionFileSytemStatement(AdditionFileSytemStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deletion File System Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deletion File System Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeletionFileSystemStatement(DeletionFileSystemStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update File Sytem Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update File Sytem Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUpdateFileSytemStatement(UpdateFileSytemStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnvironmentStatement(EnvironmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Environment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Environment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdditionEnvironmentStatement(AdditionEnvironmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deletion Environment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deletion Environment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeletionEnvironmentStatement(DeletionEnvironmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Environment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Environment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUpdateEnvironmentStatement(UpdateEnvironmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Setting Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Setting Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackageSettingStatement(PackageSettingStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Package Setting Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Package Setting Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdditionPackageSettingStatement(AdditionPackageSettingStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deletion Package Setting Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deletion Package Setting Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeletionPackageSettingStatement(DeletionPackageSettingStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Package Setting Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Package Setting Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUpdatePackageSettingStatement(UpdatePackageSettingStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neutral Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neutral Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNeutralStatement(NeutralStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFileSystem(FileSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GConf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GConf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGConf(GConf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Menu Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Menu Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseApplicationMenuCatalog(ApplicationMenuCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMenu(Menu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMenuEntry(MenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBoot(Boot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumentationFile(DocumentationFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInformationFile(InformationFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAlternative(Alternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackageSetting(PackageSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIconCache(IconCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Desktop DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Desktop DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDesktopDB(DesktopDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mime Type Handler Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mime Type Handler Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMimeTypeHandlerCache(MimeTypeHandlerCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mime Type Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mime Type Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMimeTypeHandler(MimeTypeHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mime Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mime Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMimeType(MimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XFont Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XFont Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXFontCache(XFontCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XFont</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XFont</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseXFont(XFont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLibraryCache(LibraryCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSharedLibrary(SharedLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModuleCache(ModuleCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGML Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGML Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSGMLCatalog(SGMLCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGML Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGML Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSGMLDocument(SGMLDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skeeper Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skeeper Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSkeeperCatalog(SkeeperCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skeeper Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skeeper Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSkeeperDocument(SkeeperDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emacs Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emacs Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEmacsPackage(EmacsPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Desktop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Desktop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstDesktop(PostinstDesktop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Doc Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Doc Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstDocBase(PostinstDocBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Emacsen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Emacsen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstEmacsen(PostinstEmacsen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Gconf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Gconf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstGconf(PostinstGconf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Gconf Defaults</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Gconf Defaults</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstGconfDefaults(PostinstGconfDefaults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Icons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Icons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstIcons(PostinstIcons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstInfo(PostinstInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstInit(PostinstInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Init Nostart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Init Nostart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstInitNostart(PostinstInitNostart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Init Restart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Init Restart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstInitRestart(PostinstInitRestart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Makeshlibs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Makeshlibs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstMakeshlibs(PostinstMakeshlibs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstMenu(PostinstMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Menu Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Menu Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstMenuMethod(PostinstMenuMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Mime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Mime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstMime(PostinstMime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Modules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Modules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstModules(PostinstModules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Python</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Python</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstPython(PostinstPython object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Scrollkeeper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Scrollkeeper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstScrollkeeper(PostinstScrollkeeper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Sgmlcatalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Sgmlcatalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstSgmlcatalog(PostinstSgmlcatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Sharedmimeinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Sharedmimeinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstSharedmimeinfo(PostinstSharedmimeinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Suid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Suid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstSuid(PostinstSuid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Udev</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Udev</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstUdev(PostinstUdev object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Usrlocal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Usrlocal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstUsrlocal(PostinstUsrlocal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Wm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Wm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstWm(PostinstWm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Wm Noman</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Wm Noman</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstWmNoman(PostinstWmNoman object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Xfonts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Xfonts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostinstXfonts(PostinstXfonts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Debconf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Debconf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmDebconf(PostrmDebconf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Desktop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Desktop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmDesktop(PostrmDesktop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Gconf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Gconf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmGconf(PostrmGconf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Gconf Defaults</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Gconf Defaults</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmGconfDefaults(PostrmGconfDefaults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Icons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Icons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmIcons(PostrmIcons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmInit(PostrmInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Makeshlibs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Makeshlibs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmMakeshlibs(PostrmMakeshlibs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmMenu(PostrmMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Menu Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Menu Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmMenuMethod(PostrmMenuMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Mime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Mime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmMime(PostrmMime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Modules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Modules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmModules(PostrmModules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Scrollkeeper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Scrollkeeper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmScrollkeeper(PostrmScrollkeeper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Sgmlcatalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Sgmlcatalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmSgmlcatalog(PostrmSgmlcatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Sharedmimeinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Sharedmimeinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmSharedmimeinfo(PostrmSharedmimeinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Suid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Suid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmSuid(PostrmSuid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Xfonts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Xfonts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostrmXfonts(PostrmXfonts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preinst Udev</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preinst Udev</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePreinstUdev(PreinstUdev object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preinst User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preinst User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePreinstUser(PreinstUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Doc Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Doc Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrermDocBase(PrermDocBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Emacsen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Emacsen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrermEmacsen(PrermEmacsen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Gconf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Gconf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrermGconf(PrermGconf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrermInfo(PrermInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrermInit(PrermInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Init Norestart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Init Norestart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrermInitNorestart(PrermInitNorestart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Python</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Python</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrermPython(PrermPython object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Sgmlcatalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Sgmlcatalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrermSgmlcatalog(PrermSgmlcatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Usrlocal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Usrlocal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrermUsrlocal(PrermUsrlocal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Wm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Wm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrermWm(PrermWm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParam(Param object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringParam(StringParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntParam(IntParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSingleConflict(SingleConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConflict(Conflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAndConflict(AndConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOrConflict(OrConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //MancoosiSwitch
