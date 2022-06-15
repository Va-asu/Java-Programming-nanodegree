@FunctionalInterface
interface helper{
    void show();
}
class NewClass implements helper{

    @Override
    public void show() {
        System.out.println("i am here to display");
    }
}
public class Lambda {
    public static void main(String[] args) {
        NewClass obj=new NewClass();
        obj.show();
    }
}

