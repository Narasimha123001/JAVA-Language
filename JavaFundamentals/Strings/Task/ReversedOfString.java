package com.JavaFundamentals.Strings.Task;

public class ReversedOfString {
    public static void main(String[] args) {
        String str = "Narasimhan";
        String Reversed = "";
        for (int i = str.length()-1; i >=0 ;i--){
            Reversed += str.charAt(i);
        }
        System.out.println(Reversed);
    }
}
