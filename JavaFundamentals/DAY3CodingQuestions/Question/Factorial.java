package com.JavaFundamentals.DAY3CodingQuestions.Question;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();
        int ans;
        ans=1;
        if(num == 0){
            System.out.println(1);
        } else if (num < 0) {
            System.out.println(0);
        }else{
            for (int i=1; i <= num; i++){
                ans *= i;
            }
            System.out.println(ans+ " is factorial of num :" +num);
        }
        scanner.close();
    }
}
