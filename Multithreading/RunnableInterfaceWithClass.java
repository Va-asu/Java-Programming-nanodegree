package Multithreading;


class Hii implements Runnable{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Hii ");
            try
            {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Helloo implements Runnable{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Hellooo");
            try
            {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

/**
 * using Thread there is problem caused due to multithreading
 * Ex:-  Class A is extending Thread but also there is need to extend Class B with Class A
 *       java doesn't support multiple inheritance that why we will not use Thread class here
 * Instead Runnable interface will help us here
 * Runnable interface is also a functional interface and has only one method which is run().....
 **/
public class RunnableInterfaceWithClass {
    public static void main(String[] args) {
/**
 *         Hi1 obj1=new Hi();
 *         Hello1 obj2=new Hello();
 *
 *         obj1.start();
 *         obj2.start();
 *
 *         starts method is not in Runnable interface, so it will cause the error
 *         that's why object of Thread class will be created
 */
           Runnable r1=new Hii();
           Runnable r2=new Helloo();
         /**
         * public Thread(     Runnable target )
         *     target – the object whose run method is invoked when this thread is started. If null, this classes run method does nothing.
         **/
           Thread t1=new Thread(r1);
           Thread t2=new Thread(r2);

         //now using Thread object, start method is called
        t1.start();
        t2.start();
    }
}
