package Designpattern.Compositedesign;

public class Teacher implements Person{

    String name;
    String Id;

    public Teacher(String name,String Id)
    {
        this.name=name;
        this.Id=Id;
    }
    @Override
    public void show() {
        System.out.println(name+" : "+Id);
    }
}
