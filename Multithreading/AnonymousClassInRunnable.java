package Multithreading;

public class AnonymousClassInRunnable {

    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++)
                {
                    System.out.println("hii");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Runnable r2=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++)
                {
                    System.out.println("Helloo");
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e)
                    {
                        System.out.println(e);
                    }
                }
            }
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();
    }
}
