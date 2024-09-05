package com.JavaFundamentals.DAY3CodingQuestions.Task;

public class ZeroAndOneTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0;i <= n;i++){
            for(int j = 1;j <= i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
