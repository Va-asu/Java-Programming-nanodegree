
@FunctionalInterface
interface helper{
    void show();
}

public class Lambda {
    public static void main(String[] args) {

        helper obj=()->{
            System.out.println("i am here to display lambda");
        };
        obj.show();
    }
}

