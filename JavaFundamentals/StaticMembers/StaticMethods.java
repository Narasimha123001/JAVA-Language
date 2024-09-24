package com.JavaFundamentals.StaticMembers;

public class StaticMethods {
    //static method
   public static int add(int a ,int b){
       return a+b;
   }

    public static void main(String[] args) {
        int result = StaticMethods.add(5,7);
        System.out.println("result: " +result);
    }

}
/*
Static methods belongs to the class rather than instance of the class.
 they can call without instance of the class .Static methods can only
 access static variables and other static methods directly.
 */