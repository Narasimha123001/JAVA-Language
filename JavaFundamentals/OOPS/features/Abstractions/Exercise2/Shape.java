package com.JavaFundamentals.OOPS.features.Abstractions.Exercise2;

//Implementations of Abstract methods in java

public abstract class Shape {
    abstract void draw();                      //abstract methods
}

class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Circle is drawing........");
    }
}

class  Main3{
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();

    }
}