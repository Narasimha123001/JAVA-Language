package com.JavaFundamentals.OOPS.features.Abstractions.Task.AnimalClassificationSystem;

public abstract class Animal {

    String name;
    byte age;

    public Animal(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    abstract void  makeSound();
    abstract void move();

    void displayDetails(){
        System.out.println("Name of animal :"+name);
        System.out.println("Age of the Animal :"+age);
    }
}
