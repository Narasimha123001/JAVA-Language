package com.JavaFundamentals.Day2CoditionalStatement.Task;

import java.util.Scanner;

public class GradeAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        byte marks = scanner.nextByte();
        if(marks >= 90){
            System.out.println("Grade A");
        }else if(marks >= 80){
            System.out.println("Grade B");
        }else if(marks >= 70){
            System.out.println("Grade C");
        }else if(marks >= 60){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
        scanner.close();
    }
}
