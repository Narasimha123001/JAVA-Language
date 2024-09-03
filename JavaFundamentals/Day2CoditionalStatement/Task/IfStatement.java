package com.JavaFundamentals.Day2CoditionalStatement.Task;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age : ");
        byte age = scanner.nextByte();
        if(age >= 18){
            System.out.println("The person is eligible for voting");
        }else{
            System.out.println("Not eligible for voting");
        }
        scanner.close();
    }
}
