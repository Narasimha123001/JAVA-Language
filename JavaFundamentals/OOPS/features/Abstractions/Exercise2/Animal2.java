package com.JavaFundamentals.OOPS.features.Abstractions.Exercise2;

// implementation of java interface

interface Animal2 {
    void eat();
    void travel();
}

class Cat2 implements  Animal2{

    @Override
    public void eat() {
        System.out.println("cat is eating....");
    }

    @Override
    public void travel() {
        System.out.println("Cat is sleeping");
    }
}

class Main2{
    public static void main(String[] args) {
        Cat2 cat2 = new Cat2();

        cat2.eat();
        cat2.travel();

    }
}