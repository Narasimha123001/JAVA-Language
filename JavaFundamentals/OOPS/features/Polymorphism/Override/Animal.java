package com.JavaFundamentals.OOPS.features.Polymorphism.Override;

public class Animal {
    void makeSound(){
        System.out.println("Some sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog sound Bow bow");
    }
}
class cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("cat sound meow meow");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal1 = new cat();  //Allows methods to be invoked dynamically at runtime based on the object type...

        animal.makeSound();
        animal1.makeSound();
    }
}
/*
output:
        Dog sound Bow bow
        cat sound meow meow
 */