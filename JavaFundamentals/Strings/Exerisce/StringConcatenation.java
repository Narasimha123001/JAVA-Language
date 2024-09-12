package com.JavaFundamentals.Strings.Exerisce;

public class StringConcatenation {
    public static void main(String[] args) {
        String str ="Hello";
        String str1 = "World";
        String result = str + " " + str1; // using (+) operator
        System.out.println(result);
        String result1 = str.concat(",").concat(str1).concat("!"); // using concatenate
        System.out.println(result1);


    }
}
