package com.JavaFundamentals.DAY3CodingQuestions.Task;

public class FloydTriangle {
    public static void main(String[] args) {
        int n = 5;  //initialize the start row
        int num = 1;   //initialize the starting number
        for (int i = 1; i <= n; i++ ) {  // outer loop for row
            for (int j = 1; j <= i; j++) {  // inner loop for inner to print numbers
                System.out.print(num + " "); // print the current loop
                num++; //increment the number
            }
            System.out.println(); //move to the next line
        }
    }
}
