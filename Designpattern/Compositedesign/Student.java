package Designpattern.Compositedesign;

public class Student implements Person {

    private String name;
    private String rollNo;

    public Student(String name,String rollNo) {
        this.name=name;
        this.rollNo=rollNo;
    }

    @Override
    public void show() {
        System.out.println(name+" : "+rollNo);
    }
}
