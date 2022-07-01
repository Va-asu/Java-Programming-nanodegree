package ReflectionAPI;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        //instantiate a class using forName method
        Class c=Class.forName("ReflectionAPI.Test");
        Test t=(Test)c.newInstance();

        Method m=c.getDeclaredMethod("show",null);
        m.setAccessible(true);
        m.invoke(t,null);




        //if we want to lowercase the string
        Method m1="Method".getClass().getMethod("toLowerCase");
        System.out.println(m1.invoke("Method"));

        //Lines 19 and 20 are equivalent to System.out.println("Method".toLowerCase());

        
    }
}
