package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EfficientLambda {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(9,8,7,6);
        /***
         *  Consumer<Integer> c=new Consumer<Integer>(){
         *             public void accept(Integer t)
         *             {
         *                 System.out.println(t);
         *             }
         *         };
         ***/
         //so this anonymous class has only one method so we can cut all the extra code
        /***
         *  Consumer<Integer> c=(Integer i)->System.out.println(t);
         ***/
        //now this in only expression and we know consumer is type of Integer so there is no need to
        //specify the Integer again (Only if there is one parameter)
        Consumer<Integer> c=i->System.out.println(i);
        list.forEach(c);
    }
}


/**
 * Lambda Expressions works only for the functional Interfaces
 * FunctionalInterface is SAM(Single Abstract Method) Interface
 */