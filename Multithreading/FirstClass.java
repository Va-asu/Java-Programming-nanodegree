package Multithreading;

class  A{
    public void show()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("HI");
        }
    }
}

class Z{
    public void show()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Hello");
        }
    }
}

public class FirstClass  {
    public static void main(String[] args) {
        A a=new A();
        Z z=new Z();
        a.show();
        z.show();
    }
}
