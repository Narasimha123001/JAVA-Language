package com.JavaFundamentals.java8Features.Task.ReverseAString;


public class Main {
    public static void main(String[] args) {
        StringModifier stringModifier = (str) -> {
            return new StringBuilder(str).reverse().toString();
        };
        System.out.println(stringModifier.modify("narasimhan"));
    }
}
