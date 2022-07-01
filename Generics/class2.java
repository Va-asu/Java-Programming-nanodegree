package Generics;

class Container1<T extends Number>
{
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void show(){
        System.out.println(value+" is of type "+value.getClass().getName());
    }
}

public class class2{
    public static void main(String[] args) {
        Container1<Integer> obj=new Container1<>();
        obj.setValue(77);
        obj.show();

        Container1<Double>obj1=new Container1<>();
        obj1.setValue(9.9);
        obj1.show();
    }
}
