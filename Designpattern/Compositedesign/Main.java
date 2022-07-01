package Designpattern.Compositedesign;

public class Main {
    public static void main(String[] args) {
        MyData StudentsDetails1=new MyData();

        Class11 s1=new Class11("mohit","123");
        Class11 s2=new Class11("rohit","122");
        Class11 s3=new Class11("ajay","121");
        StudentsDetails1.addPerson(s1);
        StudentsDetails1.addPerson(s2);
        StudentsDetails1.addPerson(s3);

        MyData StudentsDetails2=new MyData();

        Class12 sa=new Class12("mohit","12");
        Class12 sb=new Class12("rohit","11");
        Class12 sc=new Class12("ajay","13");
        StudentsDetails2.addPerson(sa);
        StudentsDetails2.addPerson(sb);
        StudentsDetails2.addPerson(sc);

        MyData ClassDetails=new MyData();
        ClassDetails.addPerson(StudentsDetails1);
        ClassDetails.addPerson(StudentsDetails2);

        MyData TeachersDetails=new MyData();

        Teacher t1=new Teacher("suresh","001");
        Teacher t2=new Teacher("mahesh","002");
        Teacher t3=new Teacher("rakesh","003");
        TeachersDetails.addPerson(t1);
        TeachersDetails.addPerson(t2);
        TeachersDetails.addPerson(t3);

        MyData AllData=new MyData();
        AllData.addPerson(TeachersDetails);
        AllData.addPerson(ClassDetails);


        //AllData.show();
        s1.show();

    }
}
