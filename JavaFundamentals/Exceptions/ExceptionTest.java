package com.JavaFundamentals.Exceptions;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st no: ");
        int num1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the 2st no: ");
        int num2 = scanner1.nextInt();
        try {
            int sum = num1/num2;
            System.out.println(sum);
            int[] ids = {1,2,3};
            System.out.println(ids[4]);
        }catch (Exception e){
            System.out.println("some error ocurru please  try again");

            e.printStackTrace();  // if you to print the complete error message

            System.out.println(e.getMessage());  // only exceptions message
        }

        System.out.println("hello");
    }

    private static void input() {
        System.out.println("going to input");
    }
}
