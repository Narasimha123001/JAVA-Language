package com.JavaFundamentals.DAY3CodingQuestions.Task;
// fibonacciSeries of given number
public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        System.out.println(num1+ " " +num2);
        int sum = num1 + num2;

        while(sum <= 1000){
            System.out.println(sum);
            num1 = num2;
            num2 = sum;
            sum = num1 + num2;
        }
    }
}
