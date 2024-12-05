package com.JavaFundamentals.java8Features.Exercise.BuiltinFunctions;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<Integer,String> intToString = (x)-> "number: "+x;
        System.out.println(intToString.apply(5));

    }
}
