package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(18,29,30,41);
        /**
         *  list.forEach((i)-> System.out.println(i));
         *  taking the value of i from collection and printing so why specify i two times
         *  forEach knows we are taking value from collection
         *  here comes the method reference concept
         *  we have heard of call by value ,call by reference
         *  java provide call by method that is called method reference
         **/
         list.forEach(System.out::println);
        /**
         * forEach method is accessing the value, and we are passing println reference to it.
         * to specify what println is we have to tell forEach to what object or class println belongs
         * out is static object of System class
         **/
    }
}
