/*

    • Declare an instance variable named instanceVar of type int.
    • In the main method, initialize instanceVar with any integer value of your choice.
    • Print the value of instanceVar to the console.
 */

package com.JavaFundamentals.Day1WorkingWithPrimitives.Task;

public class VariablePrinter {

    static int Variable =30;

    int instanceVar;                                          //Declare instance Variable

    public static void main(String[] args) {                  //main method
        VariablePrinter obj1 = new VariablePrinter();        // obj creation

        obj1.instanceVar =10;                               //initialize the variable value
        System.out.println(obj1.instanceVar);               //print the value in console
        System.out.println(Variable);

    }
}
