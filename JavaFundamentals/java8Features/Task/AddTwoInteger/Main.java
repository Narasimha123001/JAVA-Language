package com.JavaFundamentals.java8Features.Task.AddTwoInteger;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Additions additions = (x,y)->x+y;
        int y =additions.add(5,5);
        System.out.println(y);
        Predicate<Integer> isEven = (sum) -> sum % 2==0;
        System.out.println(isEven.test(y));

    }
}
