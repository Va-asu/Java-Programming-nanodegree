package Generics;

//Collections @since 1.2 and generics @since 1.5


class Container<T extends Number>
{
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void show(){
       System.out.println(value);
    }

}

public class class1 {
    public static void main(String[] args) {
       // List<Integer>list=new ArrayList<>();
        Container<Double> obj=new Container<>();
        obj.value=77.9;
        obj.show();
        Container<Integer> obj1=new Container<>();
        obj1.value=77;
        obj1.show();

    }
}
