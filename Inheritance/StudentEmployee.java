import java.util.*;

public class StudentEmployee extends Student {
    private double rateOfPayPerHour;
    private String employeeId;
    
    //constructor
    public Student(String fname,String sname,String studentId,double rateOfPayPerHour,String employeeId)
    {
      super(fname,sname,studentId);
      this.rateOfPayPerHour=rateOfPayPerHour;
      this.employeeId=employeeId;
    }
   
   
    //setter methods
    public void setRate(double rateOfPayPerHour)
    {
      this.rateOfPayPerHour=rateOfPayPerHour;
    }
    public void setEmployeeId(String  employeeId)
    {
      this.employeeId=employeeId;
    }
    //getter methods
    public double getRate()
    {
      return rateOfPayPerHour;
    }
    public String getEmployeeId()
    {
      return employeeId;
    }
    
    @Override
    public String toString()
    {
      return super.toString()+" employeeID: "+employeeId+" pay: "+rateOfPayPerHour;
    }
    
}
