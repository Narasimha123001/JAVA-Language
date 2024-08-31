/*
Automatic Conversion:
    1 Declare an integer variable and assign it a value.
    2 Declare a double variable and assign it the value of the integer variable (implicit conversion).
    3 Print both variables to observe the conversion.
 */
package com.JavaFundamentals.Day1WorkingWithPrimitives.Task;

public class AutomaticConversion {

    public static void main(String[] args) {

        int age;
        age =15;

        double Age;
        Age = age;

        System.out.println(age);
        System.out.println(Age);

    }

}

/*
op:
    15
    15.0
 */