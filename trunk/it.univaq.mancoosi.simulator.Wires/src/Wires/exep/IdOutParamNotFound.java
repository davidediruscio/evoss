 package Wires.exep;
 
 import Wires.WiresElement;
 
 public class IdOutParamNotFound extends WiresException
 {
   private static final long serialVersionUID = 7336876889311707823L;
 
   public IdOutParamNotFound()
   {
   }
 
   public IdOutParamNotFound(WiresElement wEl)
   {
    super(wEl);
   }
 }
