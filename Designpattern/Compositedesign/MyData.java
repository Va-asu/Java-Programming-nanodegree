package Designpattern.Compositedesign;

import java.util.ArrayList;
import java.util.List;

public class MyData implements Person{
    List<Person> list=new ArrayList<>();

    public void addPerson(Person p)
    {
        list.add(p);
    }

    public void show()
    {
        for(Person P:list)
        {
            P.show();
        }
    }
}
