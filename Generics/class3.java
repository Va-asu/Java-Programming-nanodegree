package Generics;

import java.util.ArrayList;
import java.util.Collection;

public class class3 {
    public static void main(String[] args) {
        Object value[] =new Object[3];
        value[0]=1;
        value[1]="abc";
        value[2]=2.8;

        for(Object i:value)
        {
            System.out.println(i);
        }

        Collection val=new ArrayList();
        //Collection is interface and ArrayList provides implementation to its methods
        val.add(11);
        val.add("xyz");
        val.add(9.9);



        for(Object i:val)
        {
            System.out.println(i);
        }

        Collection<Integer> vals=new ArrayList<>();
        //Collection is interface and ArrayList provides implementation to its methods
        vals.add(11);
        vals.add(22);
        vals.add(33);
//        Collections.sort(vals);

        //vals.add("xyz");  string
        //vals.add(9.9);    double
        //vals.add(1,44);   Collection does not have any method to add number at particular index but list has some  extra features
        for(int i:vals)
        {
            System.out.println(i);
        }

    }
}
