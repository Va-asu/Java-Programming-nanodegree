package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(9,8,7,6);
        //Since 1.8 function package is added to the java
        //here anonymous class is created
        //here it has only one method inside it so that we can use the Lambda expression
        Consumer<Integer>c=new Consumer<Integer>(){
            public void accept(Integer t)
            {
                System.out.println(t);
            }
        };
        list.forEach(c);
    }
}
