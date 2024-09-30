package com.JavaFundamentals.OOPS.features.Abstractions.Task.AnimalClassificationSystem;

public class Dog extends AnimalImp {

    public Dog(String name, byte age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("dog is barking..");
    }

    @Override
    void move() {
        System.out.println("dog is moving on the rod........");
    }
}
