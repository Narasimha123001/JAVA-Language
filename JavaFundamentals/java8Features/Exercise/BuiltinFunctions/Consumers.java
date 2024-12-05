package com.JavaFundamentals.java8Features.Exercise.BuiltinFunctions;

import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {

        Consumer<String> printUpperCase = (s) -> System.out.println(s.toUpperCase());
        printUpperCase.accept("Hello");
    }
}
