 package Wires.impl;
 
 import Wires.ConnectableElement;
 import Wires.DataFlow;
import Wires.WiresPackage;
 import org.eclipse.emf.common.notify.NotificationChain;
 import org.eclipse.emf.ecore.EClass;
 import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
 
 public class DataFlowImpl extends WiresElementImpl
   implements DataFlow
 {
   protected ConnectableElement target;
   protected ConnectableElement src;
 
   protected EClass eStaticClass()
   {
	   return WiresPackage.Literals.DATA_FLOW;
   }
 
   public ConnectableElement getTarget()
   {
     if ((this.target != null) && (this.target.eIsProxy())) {
       InternalEObject oldTarget = (InternalEObject)this.target;
       this.target = ((ConnectableElement)eResolveProxy(oldTarget));
       if ((this.target != oldTarget) && 
         (eNotificationRequired())) {
         eNotify(new ENotificationImpl(this, 9, 0, oldTarget, this.target));
       }
     }
     return this.target;
   }
 
   public ConnectableElement basicGetTarget()
   {
     return this.target;
   }
 
   public NotificationChain basicSetTarget(ConnectableElement newTarget, NotificationChain msgs)
   {
     ConnectableElement oldTarget = this.target;
     this.target = newTarget;
     if (eNotificationRequired()) {
       ENotificationImpl notification = new ENotificationImpl(this, 1, 0, oldTarget, newTarget);
       if (msgs == null) msgs = notification; else msgs.add(notification);
     }
     return msgs;
   }
 
   public void setTarget(ConnectableElement newTarget)
   {
     if (newTarget != this.target) {
       NotificationChain msgs = null;
       if (this.target != null)
         msgs = ((InternalEObject)this.target).eInverseRemove(this, 0, ConnectableElement.class, msgs);
       if (newTarget != null)
         msgs = ((InternalEObject)newTarget).eInverseAdd(this, 0, ConnectableElement.class, msgs);
       msgs = basicSetTarget(newTarget, msgs);
       if (msgs != null) msgs.dispatch();
     }
     else if (eNotificationRequired()) {
       eNotify(new ENotificationImpl(this, 1, 0, newTarget, newTarget));
     }
   }
 
   public ConnectableElement getSrc()
   {
     if ((this.src != null) && (this.src.eIsProxy())) {
       InternalEObject oldSrc = (InternalEObject)this.src;
       this.src = ((ConnectableElement)eResolveProxy(oldSrc));
       if ((this.src != oldSrc) && 
         (eNotificationRequired())) {
         eNotify(new ENotificationImpl(this, 9, 1, oldSrc, this.src));
       }
     }
     return this.src;
   }
 
   public ConnectableElement basicGetSrc()
   {
     return this.src;
   }
 
   public NotificationChain basicSetSrc(ConnectableElement newSrc, NotificationChain msgs)
   {
     ConnectableElement oldSrc = this.src;
     this.src = newSrc;
     if (eNotificationRequired()) {
       ENotificationImpl notification = new ENotificationImpl(this, 1, 1, oldSrc, newSrc);
       if (msgs == null) msgs = notification; else msgs.add(notification);
     }
     return msgs;
   }
 
   public void setSrc(ConnectableElement newSrc)
   {
     if (newSrc != this.src) {
       NotificationChain msgs = null;
       if (this.src != null)
         msgs = ((InternalEObject)this.src).eInverseRemove(this, 1, ConnectableElement.class, msgs);
       if (newSrc != null)
         msgs = ((InternalEObject)newSrc).eInverseAdd(this, 1, ConnectableElement.class, msgs);
       msgs = basicSetSrc(newSrc, msgs);
       if (msgs != null) msgs.dispatch();
     }
     else if (eNotificationRequired()) {
       eNotify(new ENotificationImpl(this, 1, 1, newSrc, newSrc));
     }
   }
 
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
     switch (featureID) {
     case 0:
       if (this.target != null)
         msgs = ((InternalEObject)this.target).eInverseRemove(this, 0, ConnectableElement.class, msgs);
       return basicSetTarget((ConnectableElement)otherEnd, msgs);
     case 1:
       if (this.src != null)
         msgs = ((InternalEObject)this.src).eInverseRemove(this, 1, ConnectableElement.class, msgs);
       return basicSetSrc((ConnectableElement)otherEnd, msgs);
     }
     return super.eInverseAdd(otherEnd, featureID, msgs);
   }
 
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
     switch (featureID) {
     case 0:
       return basicSetTarget(null, msgs);
     case 1:
       return basicSetSrc(null, msgs);
     }
     return super.eInverseRemove(otherEnd, featureID, msgs);
   }
 
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
     switch (featureID) {
     case 0:
       if (resolve) return getTarget();
       return basicGetTarget();
     case 1:
       if (resolve) return getSrc();
       return basicGetSrc();
     }
     return super.eGet(featureID, resolve, coreType);
   }
 
   public void eSet(int featureID, Object newValue)
   {
     switch (featureID) {
     case 0:
       setTarget((ConnectableElement)newValue);
       return;
     case 1:
       setSrc((ConnectableElement)newValue);
       return;
     }
     super.eSet(featureID, newValue);
   }
 
   public void eUnset(int featureID)
   {
     switch (featureID) {
     case 0:
       setTarget(null);
       return;
     case 1:
       setSrc(null);
       return;
     }
     super.eUnset(featureID);
   }
 
   public boolean eIsSet(int featureID)
   {
     switch (featureID) {
     case 0:
       return this.target != null;
     case 1:
       return this.src != null;
     }
     return super.eIsSet(featureID);
   }
 }
