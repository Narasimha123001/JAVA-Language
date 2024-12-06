package com.JavaFundamentals.java8Features.Exercise.FunctionalInterface;

public class main {
    public static void main(String[] args) {
        //lambda Function
        MyFunction myFunction = (msg -> System.out.println("Message :"+msg));

        myFunction.execute("Hello World!");
    }
}
