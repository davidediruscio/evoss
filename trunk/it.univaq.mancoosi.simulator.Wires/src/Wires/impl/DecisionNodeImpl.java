 package Wires.impl;
 
 import Wires.ConnectableElement;
 import Wires.DecisionNode;
 import Wires.InputActualParameter;
 import Wires.Transformation;
import Wires.WiresPackage;
 import java.util.Collection;
 import java.util.Collections;
 import java.util.List;
 import org.eclipse.emf.common.notify.NotificationChain;
 import org.eclipse.emf.common.util.EList;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.emf.ecore.InternalEObject;
 import org.eclipse.emf.ecore.impl.ENotificationImpl;
 import org.eclipse.emf.ecore.util.EObjectContainmentEList;
 import org.eclipse.emf.ecore.util.EObjectResolvingEList;
 import org.eclipse.emf.ecore.util.InternalEList;
 import org.eclipse.m2m.atl.engine.vm.nativelib.ASMBoolean;
 import org.eclipse.m2m.atl.engine.vm.nativelib.ASMNumber;
 import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclAny;
 import org.eclipse.m2m.atl.engine.vm.nativelib.ASMString;
import org.eclipse.m2m.atl.ocl.core.OclQuery;
 
 public class DecisionNodeImpl extends WiresElementImpl
   implements DecisionNode
 {
   protected EList<Transformation> trueBranch;
   protected EList<Transformation> falseBranch;
   protected static final String EXPRESSION_EDEFAULT = null;
 
   protected String expression = EXPRESSION_EDEFAULT;
   protected EList<InputActualParameter> inParams;
 
   public void execute(ConnectableElement incoming)
     throws Exception
   {
     List<InputActualParameter> inparam = getInParams();
 
     boolean ready = false;
     for (InputActualParameter parameter : inparam) {
       ready = (ready) || (((InputActualParameterImpl)parameter).getActive().booleanValue());
     }
 
     if (ready) {
       String expression = getExpression();
       ASMOclAny value;
       for (InputActualParameter parameter : inparam) {
         String paramName = parameter.getName();
         value = ((InputActualParameterImpl)parameter).getBasicDataValue();
         if ((value instanceof ASMString))
           expression = expression.replaceAll(paramName, "'" + value.toString() + "'");
         else if (((value instanceof ASMBoolean)) || ((value instanceof ASMNumber))) {
           expression = expression.replaceAll(paramName, value.toString());
         }
       }
       OclQuery query = new OclQuery(expression);
 
       boolean decision = query.evalBoolean(Collections.EMPTY_MAP);
 
       for (Transformation t : getTrueBranch()) {
         ((TransformationImpl)t).setActive(Boolean.valueOf(decision));
         if (decision) {
           ((TransformationImpl)t).execute(null);
         }
       }
       for (Transformation t : getFalseBranch()) {
         ((TransformationImpl)t).setActive(Boolean.valueOf(!decision));
         if (!decision)
           ((TransformationImpl)t).execute(null);
       }
     }
   }
 
   protected EClass eStaticClass()
   {
     return WiresPackage.Literals.DECISION_NODE;
   }
 
   public EList<Transformation> getTrueBranch()
   {
     if (this.trueBranch == null) {
       this.trueBranch = new EObjectResolvingEList(Transformation.class, this, 0);
     }
     return this.trueBranch;
   }
 
   public EList<Transformation> getFalseBranch()
   {
     if (this.falseBranch == null) {
       this.falseBranch = new EObjectResolvingEList(Transformation.class, this, 1);
     }
     return this.falseBranch;
   }
 
   public String getExpression()
   {
     return this.expression;
   }
 
   public void setExpression(String newExpression)
   {
     String oldExpression = this.expression;
     this.expression = newExpression;
     if (eNotificationRequired())
       eNotify(new ENotificationImpl(this, 1, 2, oldExpression, this.expression));
   }
 
   public EList<InputActualParameter> getInParams()
   {
     if (this.inParams == null) {
       this.inParams = new EObjectContainmentEList(InputActualParameter.class, this, 3);
     }
     return this.inParams;
   }
 
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
     switch (featureID) {
     case 3:
       return ((InternalEList)getInParams()).basicRemove(otherEnd, msgs);
     }
     return super.eInverseRemove(otherEnd, featureID, msgs);
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 0:
       return getTrueBranch();
     case 1:
       return getFalseBranch();
     case 2:
       return getExpression();
     case 3:
       return getInParams();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 0:
       getTrueBranch().clear();
       getTrueBranch().addAll((Collection)newValue);
       return;
     case 1:
       getFalseBranch().clear();
       getFalseBranch().addAll((Collection)newValue);
       return;
     case 2:
       setExpression((String)newValue);
       return;
     case 3:
       getInParams().clear();
       getInParams().addAll((Collection)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 0:
       getTrueBranch().clear();
       return;
     case 1:
       getFalseBranch().clear();
       return;
     case 2:
       setExpression(EXPRESSION_EDEFAULT);
       return;
     case 3:
       getInParams().clear();
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 0:
       return (this.trueBranch != null) && (!this.trueBranch.isEmpty());
     case 1:
       return (this.falseBranch != null) && (!this.falseBranch.isEmpty());
     case 2:
       return this.expression != null;
     case 3:
       return (this.inParams != null) && (!this.inParams.isEmpty());
     }
     return super.eIsSet(featureID);
   }
 
   public String toString()
   {
     if (eIsProxy()) return super.toString();
 
     StringBuffer result = new StringBuffer(super.toString());
     result.append(" (expression: ");
     result.append(this.expression);
     result.append(')');
     return result.toString();
   }
 }
