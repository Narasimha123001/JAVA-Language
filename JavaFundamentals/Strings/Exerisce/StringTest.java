package com.JavaFundamentals.Strings;

public class StringTest {
    public static void main(String[] args) {

        String str = new String("hello");
        String str1 = new String("hello");
        System.out.println(str);

        boolean isValid = false;
        if (str.length() > 4 && str.length() <= 10) {     //here length() is method
            isValid = true;
        }
        System.out.println(isValid);

        // string literals
        String str2 = "HelLo";
        String str3 = "bye";
        System.out.println(str2.equals(str3));
        System.out.println(str.equals(str1));

        boolean isLoginSuccess =    false;
        if (str1.equalsIgnoreCase(str2))                   // we want ignore the case sensitive we use IgnoreCase
            isLoginSuccess = true;
        System.out.println("login success :" +isLoginSuccess);

        str2 = str2.toUpperCase();
        System.out.println(str2);

        //csv file convert into string
        String empDetails = "11121,sai@h=gmail.com,siva,male, 25,Vja,521137";
        String[]  info  = empDetails.split(",");
        for (int i =0 ;i <info.length ; i++){
            System.out.print(info[i]+" ");
        }
    }
}
