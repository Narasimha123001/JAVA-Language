package com.JavaFundamentals.Day1WorkingWithPrimitives.Task;

public class ArithmeticOperations {

    public static void main(String[] args) {

        int num1;
        num1 = 55;

        double num2;
        num2 = 11;

        int add;
        add = num1+(int)num2;

        int sub;
        sub = num1 - (byte)num2;

        double Mul;
        Mul = num1 * num2;

        float Div;
        Div = num1 / (float)num2;

        System.out.println("Addition: "+add);
        System.out.println("Subtraction: "+sub);
        System.out.println("Multiplication: "+Mul);
        System.out.println("Division: "+Div);

    }
}


/*
op:
    Addition: 66
    Subtraction: 44
    Multiplication: 605.0
    Division: 5.0

 */