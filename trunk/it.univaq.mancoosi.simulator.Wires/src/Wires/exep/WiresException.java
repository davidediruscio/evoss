 package Wires.exep;
 
 import Wires.WiresElement;
 
 public class WiresException extends RuntimeException
 {
   private static final long serialVersionUID = 5260030637100531477L;
   private WiresElement wEl;
 
   public WiresException()
   {
/* 13 */     this.wEl = null;
   }
 
   public WiresException(String msg) {
/* 17 */     super(msg);
/* 18 */     this.wEl = null;
   }
 
   public WiresException(WiresElement wEl)
   {
/* 23 */     this.wEl = wEl;
   }
 
   public WiresException(String msg, WiresElement wEl) {
/* 27 */     super(msg);
/* 28 */     this.wEl = wEl;
   }
 
   public WiresElement getWiresElement() {
/* 32 */     return this.wEl;
   }
 
   public void setWiresElement(WiresElement wEl) {
/* 36 */     this.wEl = wEl;
   }
 }
