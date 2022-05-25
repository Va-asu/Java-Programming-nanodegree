import java.util.*;

public class Main{
  
  public static void main(String[] a)
  {
     Vehicle[] vehicle=new Vehicle[3];
     vehicle[0]=new Car();
     vehicle[1]=new Plane();
     vehicle[2]=new Boat();
     
     for(int i=0;i<vehicle.length;i++)
     {
        Vehicle v=vehicle[i];
        v.speed();
     }
  }
  
    
}
