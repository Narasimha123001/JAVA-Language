package com.JavaFundamentals.java8Features.Exercise.BuiltinFunctions;

import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {

        Supplier<String> stringSuppliers  = () -> "Hello ,World";
        System.out.println(stringSuppliers.get());
    }
}
