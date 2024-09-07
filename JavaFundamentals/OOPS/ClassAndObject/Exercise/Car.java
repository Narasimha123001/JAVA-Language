package com.JavaFundamentals.OOPS.ClassAndObject.Exercise;

class Bike {
    String color = "Black"; // Instance variable
    byte speed = 120; // Instance variable
}

public class Car {
    public static void main(String[] args) {

        Bike myCar = new Bike(); // Creating an instance of bike

        // Accessing instance variables
        String carColor = myCar.color;
        int carSpeed = myCar.speed;

        // Printing the values
        System.out.println("Color of myCar: " + carColor);
        System.out.println("Speed of myCar: " + carSpeed);
    }
}