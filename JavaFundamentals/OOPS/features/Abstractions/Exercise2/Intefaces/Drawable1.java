package com.JavaFundamentals.OOPS.features.Abstractions.Exercise2.Intefaces;

// java 8 introduced default method which allow a method in an interface to have a body


interface Drawable1 {
    void draw();

    default  void message(){
        System.out.println("Drawing Shape..");
    }
}

class Rectangle1 implements Drawable1{

    @Override
    public void draw() {
        System.out.println("Drawing rectangle...");
    }
}