package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Class1 {
    public static void main(String[] args) {
        List<Integer> value= Arrays.asList(1,2,3,4,5,6);


        Function<Integer,Integer>f=new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };

        //create a stream
        Stream s=value.stream();

        //map stream with double of stream
        Stream s1=s.map(f);

        //print the stream
        // s1.forEach(System.out::println);

        //reduce function required a binary operator
        BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };

        //reduce stream
        Integer result=(Integer) s1.reduce(0,b);

        System.out.println(result);
    }
}
