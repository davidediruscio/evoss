 package Wires.exep;
 
 import Wires.WiresElement;
 
 public class TypeNotFoundException extends WiresException
 {
   private static final long serialVersionUID = 3885317561656245154L;
 
   public TypeNotFoundException()
   {
   }
 
   public TypeNotFoundException(WiresElement wEl)
   {
     super(wEl);
   }
 }
