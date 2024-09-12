package com.JavaFundamentals.Strings.Task;



public class StringConcatenation {
    public static void main(String[] args) {

        String str1 = "narasi";
        String str2 = "mha";

        String result = concatenate(str1,str2);
        System.out.println(result);
    }

    private static String concatenate(String str1, String str2) {
        return  str1+str2;
    }
}
