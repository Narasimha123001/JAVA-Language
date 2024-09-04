package com.JavaFundamentals.DAY3CodingQuestions.Question;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the base number: ");
        int base = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a power digit: ");
        int power = scanner1.nextInt();

        int ans = 1;

        if(base == 0 || power == 0){
            System.out.println(1);
        }else{
            for(int i= 1; i <= power;i++){
                ans *= base;
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}
