package com.JavaFundamentals.OOPS.features.Polymorphism.Overload;

public class Display {
    void show(String name){
        System.out.println("The name is : "+name);
    }
    void show(byte age){
        System.out.println("The age is : "+age);
    }
    void show(int salary){
        System.out.println("his salary is :"+salary+" per year");
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.show("narasimha");
        display.show((byte) 21);
        display.show(2500000);
    }
}
/*
output:
        The name is : narasimha
        The age is : 21
        his salary is :2500000 per year
 */