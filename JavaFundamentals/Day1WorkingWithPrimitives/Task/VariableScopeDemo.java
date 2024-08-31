
 /*
    Write a program that demonstrates variable scope by declaring variables with the same
name in different scopes (local, instance, class), then accessing and displaying them.
 */

package com.JavaFundamentals.Day1WorkingWithPrimitives.Task;

public class VariableScopeDemo {

    static int variable =10;  // class variable and also static Variable

    int  variableInstance =20; // instance variable

    public void method() {
        //local variable
        int variable=30;

        System.out.println("Local Variable: " +variable);  //local Variable

        System.out.println("Instance Variable: "+ this.variableInstance); //instance variable

        System.out.println("Class Variable: "+VariableScopeDemo.variable); //class variable

    }
    public static void main(String[] args) {

        VariableScopeDemo obj1= new VariableScopeDemo();

        obj1.method();
    }
}