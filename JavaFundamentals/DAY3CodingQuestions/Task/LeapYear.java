package com.JavaFundamentals.DAY3CodingQuestions.Task;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        boolean isLeap = false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                isLeap = true;
            }else{
                isLeap = true;
            }
        }
        if(isLeap){
            System.out.println(year+ " is a leap year");
        }else{
            System.out.println(year+ " is not a leap year");
        }
    }
}