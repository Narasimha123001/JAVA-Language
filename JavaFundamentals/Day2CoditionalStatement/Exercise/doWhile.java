package com.JavaFundamentals.Day2CoditionalStatement.Exercise;

public class doWhile {
    public static void main(String[] args) {
        byte no;
        no = 1;
        do {
            System.out.println(no);
            no++; //here first the code will excetute then its checks the condition
        }
        while(no <= 100);
    }
}
