package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MethodRef2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        MethodRef2 obj=new MethodRef2();
        list.forEach(obj::doubleIt);
        //obj is object of the class MethodRef2 and method reference is passed to the forEach
    }
    public void doubleIt(int i)
    {
        System.out.println(i*2);
    }
}
