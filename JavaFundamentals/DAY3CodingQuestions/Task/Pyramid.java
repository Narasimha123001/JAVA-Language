package com.JavaFundamentals.DAY3CodingQuestions.Task;

public class Pyramid {
    public static void main(String[] args) {

        int n = 5; //no of rows
        for(int i = 1; i<=n; i++){ //row
            for(int j = n-i; j > 0; j--){ // for space and decrement from top to bottom
                System.out.print("  "); // print the space
            }for(int j = 1; j <= (2*i-1);j++){// no of star * each inner loop
                System.out.print("* "); // print the stars
            }
            System.out.println();
        }
    }
}
