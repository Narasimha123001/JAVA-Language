package com.JavaFundamentals.OOPS.Methods.Task.Cricle;

public class Circle {
    double radius;
    String Color;
    //default parameterized constructor
    public Circle(String Color,double radius){
        this.Color=Color;
        this.radius=radius;

    }
    double getArea(double radius){

        return 3.14*radius*radius;
    }
    double getCircumference(double radius){

        return 2*3.14*radius;
    }
    void displayInfo(){
        System.out.println("Color of circle: "+Color);
        System.out.println("Area of a circle: " +getArea(radius));
        System.out.println( "Circumference of a circle: " +getCircumference(radius));
    }
}
