package Generics;
//ArrayList-(implements)->List-(Extends)->Collection-(
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class4 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(88);
        list.add(54);
        list.add(1,33);

        //Collections.sort() this will give error for Collection but not for List
        Collections.sort(list);

        list.forEach(System.out::println);
    }
}
