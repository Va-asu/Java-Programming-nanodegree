package Multithreading;

class C{
    int count;
    public synchronized void increament()
    {
        count=count+1;
    }
}

public class SynchronizedFunctionClass  {
    public static void main(String[] args) throws Exception {
        C obj=new C();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++)
            {
                obj.increament();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++)
            {
                obj.increament();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(obj.count);
    }

}
