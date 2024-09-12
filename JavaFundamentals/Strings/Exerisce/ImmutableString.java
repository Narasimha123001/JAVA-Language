package com.JavaFundamentals.Strings.Exerisce;

public class ImmutableString {
    public static void main(String[] args) {
        String str = "Hello ";
        str.concat("World");
        System.out.println("The string after concat :"+str); //output:Hello
        str = str.concat("World");
        System.out.println("The string after concat: "+str); // now refer to a new string object
        //output: Hello World
    }
}
