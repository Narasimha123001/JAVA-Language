package com.JavaFundamentals.OOPS.features.Polymorphism.Overload;

public class Calculator {
    void add (int a ,int b){
        System.out.println("the addition of a and b is :"+(a+b));
    }
    void add(int a, int b, int c ){
        System.out.println("the addition of a and b is :"+(a+b+c));
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5,4,7);
        calc.add(5,5);
    }
}


            /*
            out:the float addition of a and b is :11.2
                the int addition of a and b is :10
             */