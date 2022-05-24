import java.util.*;

public class Student extends Person {
    private String studentId; 
    
    //constructor
    public Student(String fname,String sname,String studentId)
    {
      super(fname,sname);
      this.studentId=studentId;
    }
   
   
    //setter methods
    public void setStudentId(String studentId)
    {
      this.studentId=studentId;
    }
   
    //getter methods
    public String getStudentId()
    {
      return studentId;
    }
    
    
    @Override
    public String toString()
    {
      return super.toString()+" ID: "+studentId;
    }
    
}
