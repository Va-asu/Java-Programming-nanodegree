import java.util.*;

public class Car extends Vehicle{
   public Car(){
     super("car starts","car stops","car moving","car direction");
   }
   
   @Override
   public void stop()
   {
       System.out.println("car is stopping.......");
   }
}
