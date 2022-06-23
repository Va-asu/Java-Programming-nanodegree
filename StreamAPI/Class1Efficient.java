package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Class1Efficient {
    public static void main(String[] args) {
        List<Integer> value= Arrays.asList(1,2,3,4,5,6);

     /***  these are three reduces streams steps
        //create a stream
        Stream s=value.stream();

        //map stream with double of stream
        Stream s1=s.map((integer)-> { return (int)integer*2; });

        //reduce stream
        Integer result=(Integer) s1.reduce(0,(integer,integer2)-> { return (int)integer+(int)integer2; });

        System.out.println(result);
     ***/
        //final remaining code after reducing all the extra elements
        Integer result=value.stream().map(i-> i*2).reduce(0,(i,j)->  i+j);
        System.out.println(result);
    }
}
