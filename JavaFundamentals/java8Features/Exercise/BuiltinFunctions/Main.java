package com.JavaFundamentals.java8Features.Exercise.BuiltinFunctions;

public class Main{
    public static void main(String[] args) {
        MyFunction myFunction = (msg -> System.out.println(msg));

        myFunction.execute("hello world");
    }
}
