 package Wires.util;
 
import Wires.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
 
 public class WiresAdapterFactory extends AdapterFactoryImpl
 {
   protected static WiresPackage modelPackage;
   protected WiresSwitch<Adapter> modelSwitch = new WiresSwitch<Adapter>()
   {
     public Adapter caseTransformation(Transformation object) {
       return WiresAdapterFactory.this.createTransformationAdapter();
     }
 
     public Adapter caseQuery(Query object) {
       return WiresAdapterFactory.this.createQueryAdapter();
     }
 
     public Adapter caseAtomicModelTransformation(AtomicModelTransformation object) {
       return WiresAdapterFactory.this.createAtomicModelTransformationAdapter();
     }
 
     public Adapter caseTypedElement(TypedElement object) {
       return WiresAdapterFactory.this.createTypedElementAdapter();
     }
 
     public Adapter caseType(Type object) {
       return WiresAdapterFactory.this.createTypeAdapter();
     }
 
     public Adapter caseModelType(ModelType object) {
       return WiresAdapterFactory.this.createModelTypeAdapter();
     }
 
     public Adapter caseDataType(DataType object) {
      return WiresAdapterFactory.this.createDataTypeAdapter();
     }
 
     public Adapter caseActualParameter(ActualParameter object) {
       return WiresAdapterFactory.this.createActualParameterAdapter();
     }
 
     public Adapter caseDecisionNode(DecisionNode object) {
       return WiresAdapterFactory.this.createDecisionNodeAdapter();
     }
 
     public Adapter caseDataFlow(DataFlow object) {
       return WiresAdapterFactory.this.createDataFlowAdapter();
     }
 
     public Adapter caseTransformationType(TransformationType object) {
       return WiresAdapterFactory.this.createTransformationTypeAdapter();
     }
 
     public Adapter caseFormalParameter(FormalParameter object) {
       return WiresAdapterFactory.this.createFormalParameterAdapter();
     }
 
     public Adapter caseQueryType(QueryType object) {
       return WiresAdapterFactory.this.createQueryTypeAdapter();
     }
 
     public Adapter caseConnectableElement(ConnectableElement object) {
       return WiresAdapterFactory.this.createConnectableElementAdapter();
     }
 
     public Adapter caseModel(Model object) {
       return WiresAdapterFactory.this.createModelAdapter();
     }
 
     public Adapter caseBasicData(BasicData object) {
       return WiresAdapterFactory.this.createBasicDataAdapter();
     }
 
     public Adapter caseCompositeTransformationType(CompositeTransformationType object) {
       return WiresAdapterFactory.this.createCompositeTransformationTypeAdapter();
     }
 
     public Adapter caseCompositeTransformation(CompositeTransformation object) {
       return WiresAdapterFactory.this.createCompositeTransformationAdapter();
     }
 
     public Adapter caseBasicDataType(BasicDataType object) {
       return WiresAdapterFactory.this.createBasicDataTypeAdapter();
     }
 
     public Adapter caseWiresSpecification(WiresSpecification object) {
       return WiresAdapterFactory.this.createWiresSpecificationAdapter();
     }
 
     public Adapter caseWiresElement(WiresElement object) {
       return WiresAdapterFactory.this.createWiresElementAdapter();
     }
 
     public Adapter caseLibraryRef(LibraryRef object) {
       return WiresAdapterFactory.this.createLibraryRefAdapter();
     }
 
     public Adapter caseLibrary(Library object) {
       return WiresAdapterFactory.this.createLibraryAdapter();
     }
 
     public Adapter caseInputFormalParameter(InputFormalParameter object) {
      return WiresAdapterFactory.this.createInputFormalParameterAdapter();
     }
 
     public Adapter caseOutputFormalParameter(OutputFormalParameter object) {
       return WiresAdapterFactory.this.createOutputFormalParameterAdapter();
     }
 
     public Adapter caseInputActualParameter(InputActualParameter object) {
       return WiresAdapterFactory.this.createInputActualParameterAdapter();
     }
 
     public Adapter caseOutputActualParameter(OutputActualParameter object) {
       return WiresAdapterFactory.this.createOutputActualParameterAdapter();
     }
 
     public Adapter caseAtomicModelTransfomationType(AtomicModelTransfomationType object) {
       return WiresAdapterFactory.this.createAtomicModelTransfomationTypeAdapter();
     }
 
     public Adapter caseIdentityTransformation(IdentityTransformation object) {
       return WiresAdapterFactory.this.createIdentityTransformationAdapter();
     }
 
     public Adapter caseGenericTransformation(GenericTransformation object) {
       return WiresAdapterFactory.this.createGenericTransformationAdapter();
     }
 
     public Adapter caseTypeParameter(TypeParameter object) {
       return WiresAdapterFactory.this.createTypeParameterAdapter();
     }
 
     public Adapter defaultCase(EObject object) {
       return WiresAdapterFactory.this.createEObjectAdapter();
     }
   };

   public WiresAdapterFactory()
   {
     if (modelPackage == null)
       modelPackage = WiresPackage.eINSTANCE;
   }
 
   public boolean isFactoryForType(Object object)
   {
     if (object == modelPackage) {
       return true;
     }
     if ((object instanceof EObject)) {
       return ((EObject)object).eClass().getEPackage() == modelPackage;
     }
     return false;
   }
 
   public Adapter createAdapter(Notifier target)
   {
     return (Adapter)this.modelSwitch.doSwitch((EObject)target);
   }
 
   public Adapter createTransformationAdapter()
   {
     return null;
   }
 
   public Adapter createQueryAdapter()
   {
     return null;
   }
 
   public Adapter createAtomicModelTransformationAdapter()
   {
     return null;
   }
 
   public Adapter createTypedElementAdapter()
   {
     return null;
   }
 
   public Adapter createTypeAdapter()
   {
     return null;
   }
 
   public Adapter createModelTypeAdapter()
   {
     return null;
   }
 
   public Adapter createDataTypeAdapter()
   {
     return null;
   }
 
   public Adapter createActualParameterAdapter()
   {
     return null;
   }
 
   public Adapter createDecisionNodeAdapter()
   {
     return null;
   }
 
   public Adapter createDataFlowAdapter()
   {
     return null;
   }
 
   public Adapter createTransformationTypeAdapter()
   {
     return null;
   }
 
   public Adapter createFormalParameterAdapter()
   {
     return null;
   }
 
   public Adapter createQueryTypeAdapter()
   {
     return null;
   }
 
   public Adapter createConnectableElementAdapter()
   {
     return null;
   }
 
   public Adapter createModelAdapter()
   {
     return null;
   }
 
   public Adapter createBasicDataAdapter()
   {
     return null;
   }
 
   public Adapter createCompositeTransformationTypeAdapter()
   {
     return null;
   }
 
   public Adapter createCompositeTransformationAdapter()
   {
     return null;
   }
 
   public Adapter createBasicDataTypeAdapter()
   {
     return null;
   }
 
   public Adapter createWiresSpecificationAdapter()
   {
     return null;
   }
 
   public Adapter createWiresElementAdapter()
   {
     return null;
   }
 
   public Adapter createLibraryRefAdapter()
   {
     return null;
   }
 
   public Adapter createLibraryAdapter()
   {
     return null;
   }
 
   public Adapter createInputFormalParameterAdapter()
   {
     return null;
   }
 
   public Adapter createOutputFormalParameterAdapter()
   {
     return null;
   }
 
   public Adapter createInputActualParameterAdapter()
   {
     return null;
   }
 
   public Adapter createOutputActualParameterAdapter()
   {
     return null;
   }
 
   public Adapter createAtomicModelTransfomationTypeAdapter()
   {
     return null;
   }
 
   public Adapter createIdentityTransformationAdapter()
   {
     return null;
   }
 
   public Adapter createGenericTransformationAdapter()
   {
     return null;
   }
 
   public Adapter createTypeParameterAdapter()
   {
     return null;
   }
 
   public Adapter createEObjectAdapter()
   {
     return null;
   }
 }
