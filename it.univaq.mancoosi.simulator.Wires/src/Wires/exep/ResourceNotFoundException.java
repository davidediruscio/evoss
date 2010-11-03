 package Wires.exep;
 
 import Wires.WiresElement;
 
 public class ResourceNotFoundException extends WiresException
 {
   private static final long serialVersionUID = 1892172767871721582L;
 
   public ResourceNotFoundException()
   {
   }
 
   public ResourceNotFoundException(WiresElement wEl)
   {
     super(wEl);
   }
 }
