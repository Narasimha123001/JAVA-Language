package com.JavaFundamentals.java8Features.AnonymousClasses;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        //Predicate
        Predicate<Integer> isEvenPredicate = (num) -> num % 2 ==0;
        System.out.println(isEvenPredicate.test(101));

        //Consumer

        List<String> CustomersName =  Arrays.asList("customer1" , "customer2" , "customer3");
        CustomersName.forEach(name -> System.out.println(name));  // without method reference

        // with method reference
        CustomersName.forEach(System.out::println);

        Function<String , String > upperCaseFunction = name -> {
            name = name.toUpperCase();
            return name;
        };

        CustomersName.forEach(name -> System.out.println(upperCaseFunction.apply(name)));
    }
}
