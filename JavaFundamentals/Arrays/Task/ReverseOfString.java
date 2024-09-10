package com.JavaFundamentals.Arrays.Task;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String word = scanner.nextLine();
        ReverseOfString ros = new ReverseOfString();
        String ReverseString = ros.reverse(word);
        System.out.println("Reverse String: "+ReverseString);

    }
    public String reverse(String Word){
        String Reversed = "";
        for( int index = Word.length() - 1; index >= 0 ; index--){
            Reversed += Word.charAt(index);
        }
        return  Reversed;
    }
}
