package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {
    private int rollNo;
    private int marks;

    public Students(int rollNo,int marks)
    {
        this.marks=marks;
        this.rollNo=rollNo;
    }

    public String toString()
    {
        return "[ student rollNo: "+rollNo+" and marks: "+marks+"]";
    }

    @Override
    public int compareTo(Students s) {
        return this.marks>s.marks?-1:1;
    }
}
public class class7 {
    public static void main(String[] args) {
        List<Students> studentList=new ArrayList<>();
        studentList.add(new Students(2,67));
        studentList.add(new Students(1,48));
        studentList.add(new Students(4,49));
        studentList.add(new Students(3,54));

        studentList.forEach(System.out::println);
        System.out.println("after sorting");

        Collections.sort(studentList);

        studentList.forEach(System.out::println);
    }
}
