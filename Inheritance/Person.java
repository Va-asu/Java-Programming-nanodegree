import java.util.*;

public class Person {
    private String fname;
    private String sname;
    //constructor
    public Person(String fname,String sname)
    {
      this.fname=fname;
      this.sname=sname;
    }
    //setter methods
    public void setFname(String fname)
    {
      this.fname=fname;
    }
    public void setSname(String Sname)
    {
      this.sname=Sname;
    }
    //getter methods
    public String getFname()
    {
      return fname;
    }
    public String getSname()
    {
      return sname;
    }
    
    @Override
    public String toString()
    {
      return "Firstname: "+fname+" Secondname: "+sname;
    }
   
}
