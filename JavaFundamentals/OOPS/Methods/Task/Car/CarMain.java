package com.JavaFundamentals.OOPS.Methods.Task.Car;

public class CarMain {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        myCar1.brand = "Mahindra Thar";
        myCar1.Color = "Black";
        myCar1.year = 2019;
        myCar1.model = "2019Model";
        myCar1.price = 2000000;

        myCar1.display();

        myCar2.brand = "Audi";
        myCar2.Color = "white";
        myCar2.year = 2017;
        myCar2.model = "2017Model";
        myCar2.price = 30000000;

        myCar2.display();
    }
}
