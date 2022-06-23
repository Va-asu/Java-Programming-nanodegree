package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Class2 {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(12,20,35,48,55,65,78);

        int result=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)%5==0)
            {
                result+=list.get(i);
            }
        }
        System.out.println("using for loop "+result);

        //same thing using Stream API
        System.out.println("using stream api "+list.stream().filter(integer -> integer%5==0).reduce(0,(i,j)->i+j));

    }
}
