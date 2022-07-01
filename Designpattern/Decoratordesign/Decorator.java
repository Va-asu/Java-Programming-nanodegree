package Designpattern.Decoratordesign;

public class Decorator extends ShapeDecorator{


    public Decorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorder(decoratedShape);
    }

    public void setBorder(Shape decortatedShape)
    {
        System.out.println("border has been set....");
    }
}
