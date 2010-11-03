 package Wires.impl;
 
 import Wires.ConnectableElement;
 import Wires.DataFlow;
import Wires.WiresPackage;
 import java.util.Collection;
 import org.eclipse.emf.common.notify.NotificationChain;
 import org.eclipse.emf.common.util.EList;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.emf.ecore.InternalEObject;
 import org.eclipse.emf.ecore.impl.ENotificationImpl;
 import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
 
 public abstract class ConnectableElementImpl extends WiresElementImpl
   implements ConnectableElement
 {
   protected EList<DataFlow> incoming;
   protected EList<DataFlow> outgoing;
/*  80 */   protected static final String NAME_EDEFAULT = null;
 
/*  90 */   protected String name = NAME_EDEFAULT;
 
   public void execute(ConnectableElement incoming)
     throws Exception
   {
   }
 
   protected EClass eStaticClass()
   {
/* 108 */     return WiresPackage.Literals.CONNECTABLE_ELEMENT;
   }
 
   public EList<DataFlow> getIncoming()
   {
/* 117 */     if (this.incoming == null) {
/* 118 */       this.incoming = new EObjectWithInverseResolvingEList(DataFlow.class, this, 0, 0);
     }
/* 120 */     return this.incoming;
   }
 
   public EList<DataFlow> getOutgoing()
   {
/* 129 */     if (this.outgoing == null) {
/* 130 */       this.outgoing = new EObjectWithInverseResolvingEList(DataFlow.class, this, 1, 1);
     }
/* 132 */     return this.outgoing;
   }
 
   public String getName()
   {
/* 141 */     return this.name;
   }
 
   public void setName(String newName)
   {
/* 150 */     String oldName = this.name;
/* 151 */     this.name = newName;
/* 152 */     if (eNotificationRequired())
/* 153 */       eNotify(new ENotificationImpl(this, 1, 2, oldName, this.name));
   }
 
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
/* 164 */     switch (featureID) {
     case 0:
/* 166 */       return ((InternalEList)getIncoming()).basicAdd(otherEnd, msgs);
     case 1:
/* 168 */       return ((InternalEList)getOutgoing()).basicAdd(otherEnd, msgs);
     }
/* 170 */     return super.eInverseAdd(otherEnd, featureID, msgs);
   }
 
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
/* 180 */     switch (featureID) {
     case 0:
/* 182 */       return ((InternalEList)getIncoming()).basicRemove(otherEnd, msgs);
     case 1:
/* 184 */       return ((InternalEList)getOutgoing()).basicRemove(otherEnd, msgs);
     }
/* 186 */     return super.eInverseRemove(otherEnd, featureID, msgs);
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
/* 196 */     switch (featureID) {
     case 0:
/* 198 */       return getIncoming();
     case 1:
/* 200 */       return getOutgoing();
     case 2:
/* 202 */       return getName();
     }
/* 204 */     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
/* 215 */     switch (featureID) {
     case 0:
/* 217 */       getIncoming().clear();
/* 218 */       getIncoming().addAll((Collection)newValue);
/* 219 */       return;
     case 1:
/* 221 */       getOutgoing().clear();
/* 222 */       getOutgoing().addAll((Collection)newValue);
/* 223 */       return;
     case 2:
/* 225 */       setName((String)newValue);
/* 226 */       return;
     }
/* 228 */     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
/* 238 */     switch (featureID) {
     case 0:
/* 240 */       getIncoming().clear();
/* 241 */       return;
     case 1:
/* 243 */       getOutgoing().clear();
/* 244 */       return;
     case 2:
/* 246 */       setName(NAME_EDEFAULT);
/* 247 */       return;
     }
/* 249 */     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
/* 259 */     switch (featureID) {
     case 0:
/* 261 */       return (this.incoming != null) && (!this.incoming.isEmpty());
     case 1:
/* 263 */       return (this.outgoing != null) && (!this.outgoing.isEmpty());
     case 2:
/* 265 */       return this.name != null;
     }
/* 267 */     return super.eIsSet(featureID);
   }
 
   public String toString()
   {
/* 277 */     if (eIsProxy()) return super.toString();
 
/* 279 */     StringBuffer result = new StringBuffer(super.toString());
/* 280 */     result.append(" (name: ");
/* 281 */     result.append(this.name);
/* 282 */     result.append(')');
/* 283 */     return result.toString();
   }
 }
