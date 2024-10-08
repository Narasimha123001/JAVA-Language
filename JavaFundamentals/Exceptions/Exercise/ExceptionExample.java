package com.JavaFundamentals.Exceptions.Exercise;


public class ExceptionExample {
    public static void main(String[] args) {
        try{
            int[] number = {1,2,3,4};
            System.out.println(number[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occur: "+ e.getMessage());
            System.out.println("the range of array in between  0-3");

        }
    }
}
