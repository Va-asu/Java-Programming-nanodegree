import java.util.regex.*;  

public class Student  {
    private String name;
    private String email;
    private String studentId; 
    
    
    
    private final String emailregex="^(.+)@(.+).com$";
    // ^ means starting, () means consider whatever in between, . means any character and + mean more and .+ mean more than one character, $ means end    
    private final Pattern pattern=Pattern.compile(emailregex);
    //constructor
    public Student(String name,String email,String studentId)
    {
      if(!pattern.matcher(email).matches()){
          throw new IllegalArgumentException("invalid email");
      }
      this.name=name;
      this.email=email;
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
    
        //setter methods
    public void setname(String name)
    {
      this.name=name;
    }
   
    //getter methods
    public String getname()
    {
      return name;
    }
    
        //setter methods
    public void setemail(String email)
    {
      this.email=email;
    }
   
    //getter methods
    public String getemail()
    {
      return email;
    }
    
    
    @Override
    public String toString()
    {
      return "name: "+name+" email: "+email+ " ID: "+studentId;
    }
    
}
