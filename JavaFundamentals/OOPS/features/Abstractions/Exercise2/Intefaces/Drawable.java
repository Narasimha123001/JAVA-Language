package com.JavaFundamentals.OOPS.features.Abstractions.Exercise2.Intefaces;

interface  Drawable {
    void draw();
}

class Rectangle implements  Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle...");
    }
}

