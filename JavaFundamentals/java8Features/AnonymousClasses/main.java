package com.JavaFundamentals.java8Features.AnonymousClasses;

public class main {
    public static void main(String[] args) {
        Greet greet = new Greet() {
            @Override
            public void greet() {
                System.out.println("greet");
            }

            @Override
            public void great(String smg) {
                System.out.println(smg);
            }
        };
        greet.greet();
        greet.great("hi");

        // lambda expression
        // is the implementation of functional interface (instance of the functional interface)
        Hello hello = (helloHi) -> System.out.println(helloHi);

        hello.say("HI. how are you?");


    }
}
