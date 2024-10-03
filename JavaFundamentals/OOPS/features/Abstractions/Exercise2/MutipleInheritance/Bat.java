package com.JavaFundamentals.OOPS.features.Abstractions.Exercise2.MutipleInheritance;

public class Bat implements Animal,Bird{
    @Override
    public void eat() {
        System.out.println("bats eats");
    }

    @Override
    public void fly() {
        System.out.println("Bats can fly...");
    }
}
