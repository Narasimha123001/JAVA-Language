package com.JavaFundamentals.java8Features.Task.Consumer;

import java.util.function.Consumer;

public class Uppercase {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = (s)-> System.out.println(s.toUpperCase());
        stringConsumer.accept("narasimhan");
    }
}
