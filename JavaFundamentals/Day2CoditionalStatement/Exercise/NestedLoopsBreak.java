package com.JavaFundamentals.Day2CoditionalStatement.Exercise;

public class NestedLoopsBreak {
    public static void main(String[] args) {
        for (byte i =1; i <= 3; i++){
            for(byte j=1; j <= 3; j++){
                if (i==j)
                    break;   //break antey a condition true ithey a loop excteue avadhu .malli taravatha loop li welli.
                System.out.println(i +" "+ j);
            }
        }
    }
}
