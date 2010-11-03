/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage
 * @generated
 */
public interface PackagemmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackagemmFactory eINSTANCE = it.univaq.mancoosi.packagemm.impl.PackagemmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script</em>'.
	 * @generated
	 */
	Script createScript();

	/**
	 * Returns a new object of class '<em>Input Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Parameter</em>'.
	 * @generated
	 */
	InputParameter createInputParameter();

	/**
	 * Returns a new object of class '<em>And Dep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Dep</em>'.
	 * @generated
	 */
	AndDep createAndDep();

	/**
	 * Returns a new object of class '<em>Or Dep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Dep</em>'.
	 * @generated
	 */
	OrDep createOrDep();

	/**
	 * Returns a new object of class '<em>Single Dep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Dep</em>'.
	 * @generated
	 */
	SingleDep createSingleDep();

	/**
	 * Returns a new object of class '<em>Preinst Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preinst Script</em>'.
	 * @generated
	 */
	PreinstScript createPreinstScript();

	/**
	 * Returns a new object of class '<em>Postinst Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Script</em>'.
	 * @generated
	 */
	PostinstScript createPostinstScript();

	/**
	 * Returns a new object of class '<em>Prerm Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerm Script</em>'.
	 * @generated
	 */
	PrermScript createPrermScript();

	/**
	 * Returns a new object of class '<em>Postrm Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Script</em>'.
	 * @generated
	 */
	PostrmScript createPostrmScript();

	/**
	 * Returns a new object of class '<em>Config Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Script</em>'.
	 * @generated
	 */
	ConfigScript createConfigScript();

	/**
	 * Returns a new object of class '<em>Default Case Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Case Condition</em>'.
	 * @generated
	 */
	DefaultCaseCondition createDefaultCaseCondition();

	/**
	 * Returns a new object of class '<em>Case Prerm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Prerm</em>'.
	 * @generated
	 */
	CasePrerm createCasePrerm();

	/**
	 * Returns a new object of class '<em>Case Prerm Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Prerm Condition</em>'.
	 * @generated
	 */
	CasePrermCondition createCasePrermCondition();

	/**
	 * Returns a new object of class '<em>Case Postrm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Postrm</em>'.
	 * @generated
	 */
	CasePostrm createCasePostrm();

	/**
	 * Returns a new object of class '<em>Case Postrm Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Postrm Condition</em>'.
	 * @generated
	 */
	CasePostrmCondition createCasePostrmCondition();

	/**
	 * Returns a new object of class '<em>Case Preinst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Preinst</em>'.
	 * @generated
	 */
	CasePreinst createCasePreinst();

	/**
	 * Returns a new object of class '<em>Case Preinst Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Preinst Condition</em>'.
	 * @generated
	 */
	CasePreinstCondition createCasePreinstCondition();

	/**
	 * Returns a new object of class '<em>Case Postinst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Postinst</em>'.
	 * @generated
	 */
	CasePostinst createCasePostinst();

	/**
	 * Returns a new object of class '<em>Case Postinst Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Postinst Condition</em>'.
	 * @generated
	 */
	CasePostinstCondition createCasePostinstCondition();

	/**
	 * Returns a new object of class '<em>Basic Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Case</em>'.
	 * @generated
	 */
	BasicCase createBasicCase();

	/**
	 * Returns a new object of class '<em>Basic Case Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Case Condition</em>'.
	 * @generated
	 */
	BasicCaseCondition createBasicCaseCondition();

	/**
	 * Returns a new object of class '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If</em>'.
	 * @generated
	 */
	If createIf();

	/**
	 * Returns a new object of class '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expression</em>'.
	 * @generated
	 */
	BooleanExpression createBooleanExpression();

	/**
	 * Returns a new object of class '<em>File Exists Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Exists Boolean</em>'.
	 * @generated
	 */
	FileExistsBoolean createFileExistsBoolean();

	/**
	 * Returns a new object of class '<em>Regular File Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular File Boolean</em>'.
	 * @generated
	 */
	RegularFileBoolean createRegularFileBoolean();

	/**
	 * Returns a new object of class '<em>File Not Zero Size Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Not Zero Size Boolean</em>'.
	 * @generated
	 */
	FileNotZeroSizeBoolean createFileNotZeroSizeBoolean();

	/**
	 * Returns a new object of class '<em>Is Directory Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Directory Boolean</em>'.
	 * @generated
	 */
	IsDirectoryBoolean createIsDirectoryBoolean();

	/**
	 * Returns a new object of class '<em>File Block Device Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Block Device Boolean</em>'.
	 * @generated
	 */
	FileBlockDeviceBoolean createFileBlockDeviceBoolean();

	/**
	 * Returns a new object of class '<em>File Character Device Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Character Device Boolean</em>'.
	 * @generated
	 */
	FileCharacterDeviceBoolean createFileCharacterDeviceBoolean();

	/**
	 * Returns a new object of class '<em>File Pipe Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Pipe Boolean</em>'.
	 * @generated
	 */
	FilePipeBoolean createFilePipeBoolean();

	/**
	 * Returns a new object of class '<em>File Symbolic Link Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Symbolic Link Boolean</em>'.
	 * @generated
	 */
	FileSymbolicLinkBoolean createFileSymbolicLinkBoolean();

	/**
	 * Returns a new object of class '<em>File Socket Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Socket Boolean</em>'.
	 * @generated
	 */
	FileSocketBoolean createFileSocketBoolean();

	/**
	 * Returns a new object of class '<em>File Terminal Device Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Terminal Device Boolean</em>'.
	 * @generated
	 */
	FileTerminalDeviceBoolean createFileTerminalDeviceBoolean();

	/**
	 * Returns a new object of class '<em>File Read Permission Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Read Permission Boolean</em>'.
	 * @generated
	 */
	FileReadPermissionBoolean createFileReadPermissionBoolean();

	/**
	 * Returns a new object of class '<em>File Write Permission Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Write Permission Boolean</em>'.
	 * @generated
	 */
	FileWritePermissionBoolean createFileWritePermissionBoolean();

	/**
	 * Returns a new object of class '<em>File Execute Permission Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Execute Permission Boolean</em>'.
	 * @generated
	 */
	FileExecutePermissionBoolean createFileExecutePermissionBoolean();

	/**
	 * Returns a new object of class '<em>Integer Equal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Equal Boolean</em>'.
	 * @generated
	 */
	IntegerEqualBoolean createIntegerEqualBoolean();

	/**
	 * Returns a new object of class '<em>Integer Not Equal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Not Equal Boolean</em>'.
	 * @generated
	 */
	IntegerNotEqualBoolean createIntegerNotEqualBoolean();

	/**
	 * Returns a new object of class '<em>Integer Greater Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Greater Boolean</em>'.
	 * @generated
	 */
	IntegerGreaterBoolean createIntegerGreaterBoolean();

	/**
	 * Returns a new object of class '<em>Integer Greater Equal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Greater Equal Boolean</em>'.
	 * @generated
	 */
	IntegerGreaterEqualBoolean createIntegerGreaterEqualBoolean();

	/**
	 * Returns a new object of class '<em>Integer Less Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Less Boolean</em>'.
	 * @generated
	 */
	IntegerLessBoolean createIntegerLessBoolean();

	/**
	 * Returns a new object of class '<em>Integer Less Equal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Less Equal Boolean</em>'.
	 * @generated
	 */
	IntegerLessEqualBoolean createIntegerLessEqualBoolean();

	/**
	 * Returns a new object of class '<em>String Equal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Equal Boolean</em>'.
	 * @generated
	 */
	StringEqualBoolean createStringEqualBoolean();

	/**
	 * Returns a new object of class '<em>String Not Equal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Not Equal Boolean</em>'.
	 * @generated
	 */
	StringNotEqualBoolean createStringNotEqualBoolean();

	/**
	 * Returns a new object of class '<em>String Greater Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Greater Boolean</em>'.
	 * @generated
	 */
	StringGreaterBoolean createStringGreaterBoolean();

	/**
	 * Returns a new object of class '<em>String Less Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Less Boolean</em>'.
	 * @generated
	 */
	StringLessBoolean createStringLessBoolean();

	/**
	 * Returns a new object of class '<em>Strin Not Null Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strin Not Null Boolean</em>'.
	 * @generated
	 */
	StrinNotNullBoolean createStrinNotNullBoolean();

	/**
	 * Returns a new object of class '<em>String Null Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Null Boolean</em>'.
	 * @generated
	 */
	StringNullBoolean createStringNullBoolean();

	/**
	 * Returns a new object of class '<em>And Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Boolean Expression</em>'.
	 * @generated
	 */
	AndBooleanExpression createAndBooleanExpression();

	/**
	 * Returns a new object of class '<em>Or Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Boolean Expression</em>'.
	 * @generated
	 */
	OrBooleanExpression createOrBooleanExpression();

	/**
	 * Returns a new object of class '<em>Statement Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Boolean</em>'.
	 * @generated
	 */
	StatementBoolean createStatementBoolean();

	/**
	 * Returns a new object of class '<em>Statement Exists Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Exists Boolean</em>'.
	 * @generated
	 */
	StatementExistsBoolean createStatementExistsBoolean();

	/**
	 * Returns a new object of class '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return</em>'.
	 * @generated
	 */
	Return createReturn();

	/**
	 * Returns a new object of class '<em>Directory Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directory Iterator</em>'.
	 * @generated
	 */
	DirectoryIterator createDirectoryIterator();

	/**
	 * Returns a new object of class '<em>File Content Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Content Iterator</em>'.
	 * @generated
	 */
	FileContentIterator createFileContentIterator();

	/**
	 * Returns a new object of class '<em>Input Parameter Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Parameter Iterator</em>'.
	 * @generated
	 */
	InputParameterIterator createInputParameterIterator();

	/**
	 * Returns a new object of class '<em>Enumeration Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Iterator</em>'.
	 * @generated
	 */
	EnumerationIterator createEnumerationIterator();

	/**
	 * Returns a new object of class '<em>String Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Iterator</em>'.
	 * @generated
	 */
	StringIterator createStringIterator();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>Enumeration Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Element</em>'.
	 * @generated
	 */
	EnumerationElement createEnumerationElement();

	/**
	 * Returns a new object of class '<em>Addition File System Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addition File System Statement</em>'.
	 * @generated
	 */
	AdditionFileSystemStatement createAdditionFileSystemStatement();

	/**
	 * Returns a new object of class '<em>Deletion File System Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deletion File System Statement</em>'.
	 * @generated
	 */
	DeletionFileSystemStatement createDeletionFileSystemStatement();

	/**
	 * Returns a new object of class '<em>Update File System Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update File System Statement</em>'.
	 * @generated
	 */
	UpdateFileSystemStatement createUpdateFileSystemStatement();

	/**
	 * Returns a new object of class '<em>Addition Environment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addition Environment Statement</em>'.
	 * @generated
	 */
	AdditionEnvironmentStatement createAdditionEnvironmentStatement();

	/**
	 * Returns a new object of class '<em>Deletion Environment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deletion Environment Statement</em>'.
	 * @generated
	 */
	DeletionEnvironmentStatement createDeletionEnvironmentStatement();

	/**
	 * Returns a new object of class '<em>Update Environment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Environment Statement</em>'.
	 * @generated
	 */
	UpdateEnvironmentStatement createUpdateEnvironmentStatement();

	/**
	 * Returns a new object of class '<em>Addition Package Setting Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addition Package Setting Statement</em>'.
	 * @generated
	 */
	AdditionPackageSettingStatement createAdditionPackageSettingStatement();

	/**
	 * Returns a new object of class '<em>Deletion Package Setting Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deletion Package Setting Statement</em>'.
	 * @generated
	 */
	DeletionPackageSettingStatement createDeletionPackageSettingStatement();

	/**
	 * Returns a new object of class '<em>Update Package Setting Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Package Setting Statement</em>'.
	 * @generated
	 */
	UpdatePackageSettingStatement createUpdatePackageSettingStatement();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Documentation File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation File</em>'.
	 * @generated
	 */
	DocumentationFile createDocumentationFile();

	/**
	 * Returns a new object of class '<em>Information File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information File</em>'.
	 * @generated
	 */
	InformationFile createInformationFile();

	/**
	 * Returns a new object of class '<em>Postinst Desktop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Desktop</em>'.
	 * @generated
	 */
	PostinstDesktop createPostinstDesktop();

	/**
	 * Returns a new object of class '<em>Postinst Doc Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Doc Base</em>'.
	 * @generated
	 */
	PostinstDocBase createPostinstDocBase();

	/**
	 * Returns a new object of class '<em>Postinst Emacsen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Emacsen</em>'.
	 * @generated
	 */
	PostinstEmacsen createPostinstEmacsen();

	/**
	 * Returns a new object of class '<em>Postinst Gconf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Gconf</em>'.
	 * @generated
	 */
	PostinstGconf createPostinstGconf();

	/**
	 * Returns a new object of class '<em>Postinst Gconf Defaults</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Gconf Defaults</em>'.
	 * @generated
	 */
	PostinstGconfDefaults createPostinstGconfDefaults();

	/**
	 * Returns a new object of class '<em>Postinst Icons</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Icons</em>'.
	 * @generated
	 */
	PostinstIcons createPostinstIcons();

	/**
	 * Returns a new object of class '<em>Postinst Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Info</em>'.
	 * @generated
	 */
	PostinstInfo createPostinstInfo();

	/**
	 * Returns a new object of class '<em>Postinst Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Init</em>'.
	 * @generated
	 */
	PostinstInit createPostinstInit();

	/**
	 * Returns a new object of class '<em>Postinst Init Nostart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Init Nostart</em>'.
	 * @generated
	 */
	PostinstInitNostart createPostinstInitNostart();

	/**
	 * Returns a new object of class '<em>Postinst Init Restart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Init Restart</em>'.
	 * @generated
	 */
	PostinstInitRestart createPostinstInitRestart();

	/**
	 * Returns a new object of class '<em>Postinst Makeshlibs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Makeshlibs</em>'.
	 * @generated
	 */
	PostinstMakeshlibs createPostinstMakeshlibs();

	/**
	 * Returns a new object of class '<em>Postinst Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Menu</em>'.
	 * @generated
	 */
	PostinstMenu createPostinstMenu();

	/**
	 * Returns a new object of class '<em>Postinst Menu Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Menu Method</em>'.
	 * @generated
	 */
	PostinstMenuMethod createPostinstMenuMethod();

	/**
	 * Returns a new object of class '<em>Postinst Mime</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Mime</em>'.
	 * @generated
	 */
	PostinstMime createPostinstMime();

	/**
	 * Returns a new object of class '<em>Postinst Modules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Modules</em>'.
	 * @generated
	 */
	PostinstModules createPostinstModules();

	/**
	 * Returns a new object of class '<em>Postinst Python</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Python</em>'.
	 * @generated
	 */
	PostinstPython createPostinstPython();

	/**
	 * Returns a new object of class '<em>Postinst Scrollkeeper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Scrollkeeper</em>'.
	 * @generated
	 */
	PostinstScrollkeeper createPostinstScrollkeeper();

	/**
	 * Returns a new object of class '<em>Postinst Sgmlcatalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Sgmlcatalog</em>'.
	 * @generated
	 */
	PostinstSgmlcatalog createPostinstSgmlcatalog();

	/**
	 * Returns a new object of class '<em>Postinst Sharedmimeinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Sharedmimeinfo</em>'.
	 * @generated
	 */
	PostinstSharedmimeinfo createPostinstSharedmimeinfo();

	/**
	 * Returns a new object of class '<em>Postinst Suid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Suid</em>'.
	 * @generated
	 */
	PostinstSuid createPostinstSuid();

	/**
	 * Returns a new object of class '<em>Postinst Udev</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Udev</em>'.
	 * @generated
	 */
	PostinstUdev createPostinstUdev();

	/**
	 * Returns a new object of class '<em>Postinst Usrlocal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Usrlocal</em>'.
	 * @generated
	 */
	PostinstUsrlocal createPostinstUsrlocal();

	/**
	 * Returns a new object of class '<em>Postinst Wm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Wm</em>'.
	 * @generated
	 */
	PostinstWm createPostinstWm();

	/**
	 * Returns a new object of class '<em>Postinst Wm Noman</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Wm Noman</em>'.
	 * @generated
	 */
	PostinstWmNoman createPostinstWmNoman();

	/**
	 * Returns a new object of class '<em>Postinst Xfonts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Xfonts</em>'.
	 * @generated
	 */
	PostinstXfonts createPostinstXfonts();

	/**
	 * Returns a new object of class '<em>Postrm Debconf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Debconf</em>'.
	 * @generated
	 */
	PostrmDebconf createPostrmDebconf();

	/**
	 * Returns a new object of class '<em>Postrm Desktop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Desktop</em>'.
	 * @generated
	 */
	PostrmDesktop createPostrmDesktop();

	/**
	 * Returns a new object of class '<em>Postrm Gconf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Gconf</em>'.
	 * @generated
	 */
	PostrmGconf createPostrmGconf();

	/**
	 * Returns a new object of class '<em>Postrm Gconf Defaults</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Gconf Defaults</em>'.
	 * @generated
	 */
	PostrmGconfDefaults createPostrmGconfDefaults();

	/**
	 * Returns a new object of class '<em>Postrm Icons</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Icons</em>'.
	 * @generated
	 */
	PostrmIcons createPostrmIcons();

	/**
	 * Returns a new object of class '<em>Postrm Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Init</em>'.
	 * @generated
	 */
	PostrmInit createPostrmInit();

	/**
	 * Returns a new object of class '<em>Postrm Makeshlibs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Makeshlibs</em>'.
	 * @generated
	 */
	PostrmMakeshlibs createPostrmMakeshlibs();

	/**
	 * Returns a new object of class '<em>Postrm Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Menu</em>'.
	 * @generated
	 */
	PostrmMenu createPostrmMenu();

	/**
	 * Returns a new object of class '<em>Postrm Menu Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Menu Method</em>'.
	 * @generated
	 */
	PostrmMenuMethod createPostrmMenuMethod();

	/**
	 * Returns a new object of class '<em>Postrm Mime</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Mime</em>'.
	 * @generated
	 */
	PostrmMime createPostrmMime();

	/**
	 * Returns a new object of class '<em>Postrm Modules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Modules</em>'.
	 * @generated
	 */
	PostrmModules createPostrmModules();

	/**
	 * Returns a new object of class '<em>Postrm Scrollkeeper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Scrollkeeper</em>'.
	 * @generated
	 */
	PostrmScrollkeeper createPostrmScrollkeeper();

	/**
	 * Returns a new object of class '<em>Postrm Sgmlcatalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Sgmlcatalog</em>'.
	 * @generated
	 */
	PostrmSgmlcatalog createPostrmSgmlcatalog();

	/**
	 * Returns a new object of class '<em>Postrm Sharedmimeinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Sharedmimeinfo</em>'.
	 * @generated
	 */
	PostrmSharedmimeinfo createPostrmSharedmimeinfo();

	/**
	 * Returns a new object of class '<em>Postrm Suid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Suid</em>'.
	 * @generated
	 */
	PostrmSuid createPostrmSuid();

	/**
	 * Returns a new object of class '<em>Postrm Xfonts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postrm Xfonts</em>'.
	 * @generated
	 */
	PostrmXfonts createPostrmXfonts();

	/**
	 * Returns a new object of class '<em>Preinst Udev</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preinst Udev</em>'.
	 * @generated
	 */
	PreinstUdev createPreinstUdev();

	/**
	 * Returns a new object of class '<em>Preinst User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preinst User</em>'.
	 * @generated
	 */
	PreinstUser createPreinstUser();

	/**
	 * Returns a new object of class '<em>Prerm Doc Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerm Doc Base</em>'.
	 * @generated
	 */
	PrermDocBase createPrermDocBase();

	/**
	 * Returns a new object of class '<em>Prerm Emacsen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerm Emacsen</em>'.
	 * @generated
	 */
	PrermEmacsen createPrermEmacsen();

	/**
	 * Returns a new object of class '<em>Prerm Gconf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerm Gconf</em>'.
	 * @generated
	 */
	PrermGconf createPrermGconf();

	/**
	 * Returns a new object of class '<em>Prerm Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerm Info</em>'.
	 * @generated
	 */
	PrermInfo createPrermInfo();

	/**
	 * Returns a new object of class '<em>Prerm Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerm Init</em>'.
	 * @generated
	 */
	PrermInit createPrermInit();

	/**
	 * Returns a new object of class '<em>Prerm Init Norestart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerm Init Norestart</em>'.
	 * @generated
	 */
	PrermInitNorestart createPrermInitNorestart();

	/**
	 * Returns a new object of class '<em>Prerm Python</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerm Python</em>'.
	 * @generated
	 */
	PrermPython createPrermPython();

	/**
	 * Returns a new object of class '<em>Prerm Sgmlcatalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerm Sgmlcatalog</em>'.
	 * @generated
	 */
	PrermSgmlcatalog createPrermSgmlcatalog();

	/**
	 * Returns a new object of class '<em>Prerm Usrlocal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerm Usrlocal</em>'.
	 * @generated
	 */
	PrermUsrlocal createPrermUsrlocal();

	/**
	 * Returns a new object of class '<em>Prerm Wm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerm Wm</em>'.
	 * @generated
	 */
	PrermWm createPrermWm();

	/**
	 * Returns a new object of class '<em>Update Python Modules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Python Modules</em>'.
	 * @generated
	 */
	UpdatePythonModules createUpdatePythonModules();

	/**
	 * Returns a new object of class '<em>Postinst Add Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postinst Add Alternative</em>'.
	 * @generated
	 */
	PostinstAddAlternative createPostinstAddAlternative();

	/**
	 * Returns a new object of class '<em>Add Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Alternative</em>'.
	 * @generated
	 */
	AddAlternative createAddAlternative();

	/**
	 * Returns a new object of class '<em>Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param</em>'.
	 * @generated
	 */
	Param createParam();

	/**
	 * Returns a new object of class '<em>String Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Param</em>'.
	 * @generated
	 */
	StringParam createStringParam();

	/**
	 * Returns a new object of class '<em>Int Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Param</em>'.
	 * @generated
	 */
	IntParam createIntParam();

	/**
	 * Returns a new object of class '<em>Single Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Conflict</em>'.
	 * @generated
	 */
	SingleConflict createSingleConflict();

	/**
	 * Returns a new object of class '<em>And Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Conflict</em>'.
	 * @generated
	 */
	AndConflict createAndConflict();

	/**
	 * Returns a new object of class '<em>Or Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Conflict</em>'.
	 * @generated
	 */
	OrConflict createOrConflict();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PackagemmPackage getPackagemmPackage();

} //PackagemmFactory
