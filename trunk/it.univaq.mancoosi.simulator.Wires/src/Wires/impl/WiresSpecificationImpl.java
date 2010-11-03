 package Wires.impl;
 
 import Wires.ConnectableElement;
 import Wires.DataFlow;
 import Wires.InputActualParameter;
import Wires.InputFormalParameter;
 import Wires.Model;
 import Wires.Transformation;
 import Wires.WiresElement;
import Wires.WiresPackage;
 import Wires.WiresSpecification;
 import Wires.exep.InitialModelsNotFoundException;
 import java.util.Collection;
 import java.util.LinkedList;
 import java.util.List;
 import org.eclipse.emf.common.notify.NotificationChain;
 import org.eclipse.emf.common.util.EList;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.emf.ecore.InternalEObject;
 import org.eclipse.emf.ecore.impl.EObjectImpl;
 import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
 
 public class WiresSpecificationImpl extends EObjectImpl
   implements WiresSpecification
 {
   protected EList<WiresElement> els;
 
   public static void execute(List<InputFormalParameter> list, ConnectableElement initialIncoming)
     throws Exception
   {
     for (ConnectableElement element : list)
     {
       if (initialIncoming != null) {
         ((ConnectableElementImpl)element).execute(initialIncoming);
       }
 
       List<ConnectableElement> targetElements = getTargetElements(element);
       for (ConnectableElement targetElement : targetElements)
       {
         ((ConnectableElementImpl)targetElement).execute(element);
         if ((targetElement instanceof InputActualParameter))
           continue;
         List targetOutgoingEls = getTargetElements(targetElement);
         execute(targetOutgoingEls, targetElement);
       }
     }
   }
 
   private static List<ConnectableElement> getTargetElements(ConnectableElement element)
   {
     List<DataFlow> outgoing = element.getOutgoing();
     List targets = new LinkedList();
     for (DataFlow df : outgoing) {
       targets.add(df.getTarget());
     }
     return targets;
   }
 
   private List<ConnectableElement> getInitialModels()
   {
     List res = new LinkedList();
     for (WiresElement el : this.els) {
       if (((el instanceof Model)) && ((((Model)el).getIncoming() == null) || (((Model)el).getIncoming().isEmpty()))) {
         res.add((Model)el);
       }
 
       if (((el instanceof Transformation)) && (((Transformation)el).getControlNode() != null)) {
         ((TransformationImpl)el).setActive(Boolean.valueOf(false));
       }
     }
     return res;
   }
 
   public void runExecution() throws Exception {
     List initialModels = getInitialModels();
     if ((initialModels == null) || (initialModels.isEmpty()))
       throw new InitialModelsNotFoundException();
     execute(initialModels, null);
   }
 
   public Model getModelByName(String modelName) {
     Model m = null;
     for (WiresElement el : getEls()) {
       if (((el instanceof Model)) && (((Model)el).getName().equals(modelName))) {
         m = (Model)el;
         return m;
       }
     }
     return m;
   }
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.WIRES_SPECIFICATION;
   }
 
   public EList<WiresElement> getEls()
   {
     if (this.els == null) {
       this.els = new EObjectContainmentEList(WiresElement.class, this, 0);
     }
     return this.els;
   }
 
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
     switch (featureID) {
     case 0:
       return ((InternalEList)getEls()).basicRemove(otherEnd, msgs);
     }
     return super.eInverseRemove(otherEnd, featureID, msgs);
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 0:
       return getEls();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 0:
       getEls().clear();
       getEls().addAll((Collection)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 0:
       getEls().clear();
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 0:
       return (this.els != null) && (!this.els.isEmpty());
     }
     return super.eIsSet(featureID);
   }
 }
