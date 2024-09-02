package com.JavaFundamentals.Day2CoditionalStatement.Exercise;

public class NestesdloopsContinue {
    public static void main(String[] args) {
        for (byte i = 1; i <= 3;i++) {
            for (byte j =1; j<=3; j++) {
                if (i == j)
                    continue;
                System.out.println(i +" "+ j);
            }
        }
    }
}
