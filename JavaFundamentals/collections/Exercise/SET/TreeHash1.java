package com.JavaFundamentals.collections.Exercise.SET;

import java.util.TreeSet;

public class TreeHash1 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Banana");
        set.add("Banana");
        set.add("pineApple");
        set.add("Apple");

        System.out.println(set);
    }
}
