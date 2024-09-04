package com.JavaFundamentals.DAY3CodingQuestions.Question;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int sum =0;
        while(num > 0){
            sum += num % 10;;
            num /= 10;
        }
        System.out.println("The sum of the digit is: "+sum);
        scanner.close();
    }
}
