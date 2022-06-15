interface iFace{
    void math1();
    void math2();
}

class Myclass implements iFace{

    @Override
    public void math1() {
        System.out.println("I am Math1");
    }

    @Override
    public void math2() {
        System.out.println("I am Math2");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        Myclass obj=new Myclass();
        obj.math1();
    }
}

