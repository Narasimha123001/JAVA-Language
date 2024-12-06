package com.JavaFundamentals.java8Features.Exercise;

public  class Greets {

    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, hi ra");
            }
        };

        greeting.greet();
    }

}
