package com.JavaFundamentals.java8Features.Exercise.BuiltinFunctions;

import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {

        Predicate<Integer>  isPositive= (num) -> num >0;
        System.out.println(isPositive.test(5));
    }
}
