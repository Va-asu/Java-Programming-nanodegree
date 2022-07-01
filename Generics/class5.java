package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class5 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(767);
        list.add(876);
        list.add(999);
        list.add(821);

        Collections.sort(list);//sort collection in ascending order
        System.out.println("sorting 1: "+list);
        Collections.reverse(list);//sort in descending order
        System.out.println("sorting 2: "+list);
        Comparator<Integer>com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10)
                {
                    return 1;
                }
                return -1;
            }
        };

        Collections.sort(list,com);
        System.out.println("sorting 3: "+list);
    }

}
