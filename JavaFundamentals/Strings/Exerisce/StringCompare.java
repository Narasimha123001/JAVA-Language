package com.JavaFundamentals.Strings.Exerisce;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";
        String str4 = new String("Hello");
        //using ==
        System.out.println("Str1==str2 : " +(str1 == str2) );
        System.out.println("Str1==str2 : " +(str1 == str3) );
        //using equals()
        System.out.println("Str1.equals(Str2): " +(str1.equals(str2)));
        System.out.println("Str3.equals(Str4): " +(str3.equals(str4)));
        //using compareTo
        System.out.println("Str1.compareTo(str2): " +(str1.compareTo(str2)));
        System.out.println("Str2.compareTo(str3): " +(str2.compareTo(str3)));
        System.out.println("Str4.compareTo(str3): " +(str4.compareTo(str3)));
    }
}

        /*
            Str1==str2 : false
            Str1==str2 : true
            Str1.equals(Str2): false
            Str3.equals(Str4): true
            Str1.compareTo(str2): -15
            Str2.compareTo(str3): 15
            Str4.compareTo(str3): 0
         */
