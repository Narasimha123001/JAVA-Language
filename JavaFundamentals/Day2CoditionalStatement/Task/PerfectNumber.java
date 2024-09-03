package com.JavaFundamentals.Day2CoditionalStatement.Task;
/*
        Exercise 6:
        Task: Write the code to find if the given number is a perfect number or not?
        (Perfect number: A perfect number is a positive integer that is equal to the sum of its
        proper divisors, excluding itself. For example, 6 is a perfect number because its proper
        divisors are 1, 2, and 3, and their sum is 6.)
 */
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        int sum = 0;
        //find the divisor and calculate their sum
        for (int i = 1 ; i <= number/2 ; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        // check whether sum and number are equal are not
        if(number == sum ){
            System.out.println(number+ " is perfect number");
        }else{
            System.out.println(number+ " is not a perfect number");
        }

        scanner.close();
    }
}
