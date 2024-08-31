package com.JavaFundamentals.Day1WorkingWithPrimitives.Exercise;
public class VariableExample {
    //instance Variables
    int instanceVar;
    //initialized to default value 0
    String name;
    //initialized to default value null

    //Class Variables
    static int ClassVar; // initialized default value zero
    static String className = "VariableExample"; // initialized value is "VariableExample"

    public void method() {  //local variable
        int localVar = 10; //initialized the value is 10


        System.out.println("local Variable: " +localVar);
        System.out.println("Instance Variable: "+ instanceVar);
        System.out.println("Class Variable: "+ className);
    }

    public static void main(String[] args) {
        VariableExample obj1 = new VariableExample();
        VariableExample obj2 = new VariableExample();

        obj1.instanceVar = 5;
        obj2.instanceVar =7;

        VariableExample.ClassVar = 100;

        System.out.println("Object 1 Instance Variable: " +obj1.instanceVar);
        System.out.println("object 2 Instance Variable: " +obj2.instanceVar);
        System.out.println("Class Variable: " + VariableExample.ClassVar);
        System.out.println("Class Name: "+ VariableExample.className);
    }

}
