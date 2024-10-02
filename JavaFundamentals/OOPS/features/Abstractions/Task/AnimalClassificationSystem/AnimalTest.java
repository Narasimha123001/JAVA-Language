package com.JavaFundamentals.OOPS.features.Abstractions.Task.AnimalClassificationSystem;

public class AnimalTest {

    public static void main(String[] args) {



        AnimalImp animalImp = new Dog("sai",(byte) 9);
        animalImp.displayDetails();
        animalImp.makeSound();
         animalImp.move();

        AnimalImp animalImp1 = new Bird("ravi",(byte) 5);
        animalImp1.displayDetails();
        animalImp1.makeSound();
        animalImp1.move();


    }
}
