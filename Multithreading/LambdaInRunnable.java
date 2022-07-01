package Multithreading;

public class LambdaInRunnable {
    public static void main(String[] args) throws Exception{
        Thread t1=new Thread(()-> {

            for (int i=0;i<5;i++)
            {
                System.out.println("hii");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"Hi Thread");
        System.out.println(t1.getName());
        Thread t2=new Thread(()->{
            for (int i=0;i<5;i++) {
                System.out.println("Helloo");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
        t2.setName("Hello Thread");
        System.out.println(t2.getName());

//        threads also have priority from 1 to 10 scale.
//        Thread.MIN_PRIORITY=1
//        Thread.MAX_PRIORITY=10
//        Thread.NORM_PRIORITY=5
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
    }
}
