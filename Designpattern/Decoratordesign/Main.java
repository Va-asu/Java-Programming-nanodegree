package Designpattern.Decoratordesign;

public class Main {
    public static void main(String[] args) {
        Shape c1=new Circle();
        Shape borderedCircle=new Decorator(new Circle());
        Shape borderedRectangle=new Decorator(new Rectangle());

        System.out.println("Normal circle");
        c1.draw();

        System.out.println("decorated shapes");
        borderedCircle.draw();
        borderedRectangle.draw();

    }
}
