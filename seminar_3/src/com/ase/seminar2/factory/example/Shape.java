package com.ase.seminar2.factory.example;


interface Shape {
    public abstract void draw();
}

class Square implements  Shape {

    public void draw() {
        System.out.println("Squaring");
    }
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Circleing");
    }
}

class ShapeFactory {

    public static Shape createShape(String type){
        if("Square".equalsIgnoreCase(type)){
            return new Square();
        }
        if("Circle".equalsIgnoreCase(type)){
            return new Circle();
        }
        else {
            throw new IllegalArgumentException("Invalid animal type");
        }
    }
}

class MainEx2 {
    public static void main(String[] args){
        Shape square = ShapeFactory.createShape("Square");
        square.draw();

        Shape circle = ShapeFactory.createShape("Circle");
        circle.draw();
    }
}

// Factory method & abstract method