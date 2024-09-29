package com.JavaFundamentals.OOPS.features.Abstractions.Exercise2;
//implementations of abstract class
public abstract class Animal {  // abstract class

    abstract void makeSound();


    void sleep(){
        System.out.println("Now its sleeping.......");
    }
}


class Cat extends Animal{

    @Override
    void makeSound() {
        System.out.println("cat sound like meow...");
    }

}

class Main{
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.makeSound();
        cat.sleep();
    }
}