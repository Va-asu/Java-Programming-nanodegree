package StreamAPI;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        System.out.println("with for loop");
        //for loop
        for (int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println(" ");
        System.out.println("with List iterator");
        //Iterator
        Iterator<Integer>i= list.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
        System.out.println(" ");
        System.out.println("with Lambda exp");
        //enhanced forEach with lambda expressions
        list.forEach(val-> System.out.print(val+" "));


    }
}
