package com.JavaFundamentals.OOPS.features.Abstractions.Task.AnimalClassificationSystem;

public class Bird extends AnimalImp{

    public Bird(String name, byte age) {
        super(name, age);
    }

    @Override
    void makeSound() {
         System.out.println("Bird is making a sound........");
    }

    @Override
    void move() {
        System.out.println("bird was fly on the sky...");
    }
}
