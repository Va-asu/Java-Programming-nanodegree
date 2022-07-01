package Multithreading;

public class ParallelThread {

    public static void main(String[] args) throws Exception {
//        Thread t=new Thread(()-> System.out.println("world!"));
//        //t.start();
//        System.out.println("Hello,");
//        t.start();
        Thread a = new Thread(() -> System.out.print("a"));
        Thread b = new Thread(() -> System.out.print("b"));
        Thread c = new Thread(() -> System.out.print("c"));

//        a.run();
//        b.run();
//        a.join();
//        c.run();
//        c.join();
//        b.join();
        /***
         Thread class directly is that calling the run() method doesn't actually start the thread in parallel,
         it runs it synchronously. Since all the threads call run() in order, abc will print in the order that
         the run() methods were called. If you want to run a thread in parallel, the correct method to call is start().
         ***/

        a.start();
        b.start();
        a.join();
        c.start();
        c.join();
        b.join();
       /**
        * Since the a thread is joined before c is started, a is always printed before c.
        * Parallel threads can execute in almost any order. You can force the order by calling
        * the join() method on one thread before start()-ing another, but then you might lose some parallelism.
        ***/
    }
}
