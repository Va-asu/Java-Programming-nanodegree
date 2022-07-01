package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    private int rollNo;
    private int marks;

    public Student(int rollNo,int marks)
    {
        this.marks=marks;
        this.rollNo=rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString()
    {
        return "[ student rollNo: "+rollNo+" and marks: "+marks+"]";
    }
}
public class class6 {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(2,67));
        studentList.add(new Student(1,48));
        studentList.add(new Student(4,48));
        studentList.add(new Student(3,57));

        studentList.forEach(System.out::println);
       System.out.println("after sorting");

        Comparator<Student> com=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getMarks()<o2.getMarks())
                {
                    return 1;//1 means swap
                }
                if(o1.getMarks()==o2.getMarks())
                {
                    if(o1.getRollNo()<o2.getRollNo())
                    {
                        return 1;
                    }
                }
                return -1;//-1 means don't swap
            }
        };
        Collections.sort(studentList,com);

        studentList.forEach(System.out::println);
    }
}
