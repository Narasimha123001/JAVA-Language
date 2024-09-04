package com.JavaFundamentals.DAY3CodingQuestions.Question;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a the range: ");
        int num = scanner.nextInt();

        int sum = 0;

        for(int i=0;i<=num;i++){
            if( i % 2 ==0){
                sum += i;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
