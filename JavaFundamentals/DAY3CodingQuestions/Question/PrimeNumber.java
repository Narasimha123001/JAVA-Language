package com.JavaFundamentals.DAY3CodingQuestions.Question;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int FactorCount = 0;
        for (int i = 1; i <= number ; i++){
            if (number % i == 0){
                FactorCount++;
            }
        }
        if (FactorCount == 2){
            System.out.println(number+" is a prime number");
        }else{
            System.out.println(number+" is not a prime nummber");
        }
        scanner.close();
    }
}
