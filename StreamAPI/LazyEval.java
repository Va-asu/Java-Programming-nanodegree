package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class LazyEval {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(12,20,38,45,50,65);

        //traditional method
        int result=0;
        for(int i:list)
        {
            if(i%5==0)
            {
                result=i*2;
                break;
            }
        }
        System.out.println(result);

        /**
         *  Stream API
         *  System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(0));
            This is the lazy function and here find function will send signal,need only one element which should be
            mapped twice for its value so map function will map the first value it will get from filer function
            which it will filter till this did not get the first value that is satisfying condition i%5==0.
            so it will be efficient than the traditional method for doing the same;
         **/
        System.out.println(list.stream().filter(LazyEval::Filter).map(LazyEval::doubleIt).findFirst().orElse(0));

    }
    public static boolean Filter(int u)
    {
        System.out.println("From filter"+u);
        return u%5==0;
    }

    public static int doubleIt(int i)
    {
        System.out.println("From doubleIt"+i);
        return i*2;
    }
}
