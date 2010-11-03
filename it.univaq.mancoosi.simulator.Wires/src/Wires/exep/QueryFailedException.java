 package Wires.exep;
 
 import Wires.WiresElement;
 
 public class QueryFailedException extends WiresException
 {
   private static final long serialVersionUID = 2222340336192078611L;
 
   public QueryFailedException()
   {
   }
 
   public QueryFailedException(WiresElement wEl)
   {
     super(wEl);
   }
 }
