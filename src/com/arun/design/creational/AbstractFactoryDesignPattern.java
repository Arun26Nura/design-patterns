package com.arun.design.creational;

interface Shape{
     void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

interface  Factory{
    Shape getShape(String shape);

}

class ShapeFactory implements Factory{

    @Override
    public Shape getShape(String shape) {
        if(shape.equals("circle"))
            return new Circle();
        else
            return new Rectangle();
    }


}

class FactoryImplementation {

    static  Factory getFactory(){
        return new  ShapeFactory();
    }
}


public class AbstractFactoryDesignPattern {
    public static void main(String[] args) {
        Factory shapeFactory= FactoryImplementation.getFactory();
        Shape shape=shapeFactory.getShape("circle");
        shape.draw();
    }

}
