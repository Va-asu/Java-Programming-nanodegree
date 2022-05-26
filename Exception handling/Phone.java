import java.util.*;

public class Phone {
    String phoneType;
    String phoneNumber;
    public Phone(String phoneType,String phoneNumber)
    {
      if(phoneNumber==null||phoneType==null)
      {
        throw new IllegalArgumentException("The type and number can not be null");
      }
      this.phoneNumber=phoneNumber;
      this.phoneType=phoneType;
    }
    public void setNumber(String phoneNumber){
      this.phoneNumber=phoneNumber;
    }
    public void setType(String phoneType){
      this.phoneNumber=phoneType;
    }
    
    public String getType(){
      return phoneType;
    }
     public String getNumber(){
      return phoneNumber;
    }
    
    @Override
    public String toString()
    {
      return "phoneNumber: "+phoneNumber+" phoneType: "+phoneType;
    }
    
}