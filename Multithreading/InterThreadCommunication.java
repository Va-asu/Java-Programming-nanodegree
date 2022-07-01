package Multithreading;

class Q{
    int num;
    boolean val=false;
    public synchronized void set(int num) throws InterruptedException {
        while(val)
        {
            try{
                wait();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        this.num=num;
        System.out.println("Set: "+num);
        val=true;
        notify();
    }
    public synchronized void get() throws InterruptedException {
        while(!val)
        {
            try{
                wait();
            }catch (Exception e){
                System.out.println(e);
            }

        }
        System.out.println("Get: "+num);
        val=false;
        notify();
    }
}

class producer implements  Runnable{
    Q q;
    public producer(Q q)
    {
        this.q=q;
        Thread t=new Thread(this,"producer");
        t.start();
    }
    @Override
    public void run() {
           int i=0;
           while(true)
           {
               try {
                   q.set(i++);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               try{
                   Thread.sleep(10);
               }catch (Exception e)
               {
                   System.out.println(e);
               }
           }
    }
}

class consumer implements  Runnable{
    Q q;

    public consumer(Q q)
    {
        this.q=q;
        Thread t=new Thread(this,"consumer");
        t.start();
    }
    @Override
    public void run() {
        while(true)
        {
            try {
                q.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try{
                Thread.sleep(1000);
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) throws Exception {
        Q q=new Q();
        new producer(q);
        new consumer(q);
    }
}
