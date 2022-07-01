package Designpattern.Decoratordesign;

public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape)
    {
        decoratedShape=shape;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
