package com.JavaFundamentals.OOPS.features.Abstractions.Task.AnimalClassificationSystem;

public class AnimalImp extends Animal{


    public AnimalImp(String name, byte age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Animal is stars making Sound....");
    }

    @Override
    void move() {
        System.out.println("Animal is start moving .....");
    }
}
