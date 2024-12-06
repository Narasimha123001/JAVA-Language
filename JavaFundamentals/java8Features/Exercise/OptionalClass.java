package com.JavaFundamentals.java8Features.Exercise;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        Optional<String> nonEmptyOptional = Optional.of("Hello,World");
        Optional<String> emptyOptional = Optional.empty();

        nonEmptyOptional.ifPresent(System.out::println);
        System.out.println(emptyOptional.orElse("Default Value"));

        String result = nonEmptyOptional.map(String::toUpperCase).orElse("no value");
        System.out.println(result);
    }
}
