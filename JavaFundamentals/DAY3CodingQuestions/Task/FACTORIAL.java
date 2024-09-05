package com.JavaFundamentals.DAY3CodingQuestions.Task;

import java.util.Scanner;

public class FACTORIAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int sum = 1;
        if(num == 0){
            System.out.println(1);
        } else if (num < 0) {
            System.out.println(0);
        }else{
            for (int i = 1; i <= num; i++){
                sum *= i;
            }
            System.out.println(sum);
        }

    }


}
