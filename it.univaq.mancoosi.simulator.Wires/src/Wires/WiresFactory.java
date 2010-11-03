/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Wires;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Wires.WiresPackage
 * @generated
 */
public interface WiresFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WiresFactory eINSTANCE = Wires.impl.WiresFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query</em>'.
	 * @generated
	 */
	Query createQuery();

	/**
	 * Returns a new object of class '<em>Atomic Model Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Model Transformation</em>'.
	 * @generated
	 */
	AtomicModelTransformation createAtomicModelTransformation();

	/**
	 * Returns a new object of class '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Type</em>'.
	 * @generated
	 */
	ModelType createModelType();

	/**
	 * Returns a new object of class '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Node</em>'.
	 * @generated
	 */
	DecisionNode createDecisionNode();

	/**
	 * Returns a new object of class '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow</em>'.
	 * @generated
	 */
	DataFlow createDataFlow();

	/**
	 * Returns a new object of class '<em>Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Type</em>'.
	 * @generated
	 */
	QueryType createQueryType();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Basic Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Data</em>'.
	 * @generated
	 */
	BasicData createBasicData();

	/**
	 * Returns a new object of class '<em>Composite Transformation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Transformation Type</em>'.
	 * @generated
	 */
	CompositeTransformationType createCompositeTransformationType();

	/**
	 * Returns a new object of class '<em>Composite Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Transformation</em>'.
	 * @generated
	 */
	CompositeTransformation createCompositeTransformation();

	/**
	 * Returns a new object of class '<em>Basic Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Data Type</em>'.
	 * @generated
	 */
	BasicDataType createBasicDataType();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	WiresSpecification createWiresSpecification();

	/**
	 * Returns a new object of class '<em>Library Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Ref</em>'.
	 * @generated
	 */
	LibraryRef createLibraryRef();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Input Formal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Formal Parameter</em>'.
	 * @generated
	 */
	InputFormalParameter createInputFormalParameter();

	/**
	 * Returns a new object of class '<em>Output Formal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Formal Parameter</em>'.
	 * @generated
	 */
	OutputFormalParameter createOutputFormalParameter();

	/**
	 * Returns a new object of class '<em>Input Actual Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Actual Parameter</em>'.
	 * @generated
	 */
	InputActualParameter createInputActualParameter();

	/**
	 * Returns a new object of class '<em>Output Actual Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Actual Parameter</em>'.
	 * @generated
	 */
	OutputActualParameter createOutputActualParameter();

	/**
	 * Returns a new object of class '<em>Atomic Model Transfomation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Model Transfomation Type</em>'.
	 * @generated
	 */
	AtomicModelTransfomationType createAtomicModelTransfomationType();

	/**
	 * Returns a new object of class '<em>Identity Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity Transformation</em>'.
	 * @generated
	 */
	IdentityTransformation createIdentityTransformation();

	/**
	 * Returns a new object of class '<em>Generic Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Transformation</em>'.
	 * @generated
	 */
	GenericTransformation createGenericTransformation();

	/**
	 * Returns a new object of class '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Parameter</em>'.
	 * @generated
	 */
	TypeParameter createTypeParameter();

	/**
	 * Returns a new object of class '<em>Generic Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Query</em>'.
	 * @generated
	 */
	GenericQuery createGenericQuery();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WiresPackage getWiresPackage();

} //WiresFactory
