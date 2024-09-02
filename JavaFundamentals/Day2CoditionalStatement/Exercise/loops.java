package com.JavaFundamentals.Day2CoditionalStatement.Exercise;
//print all even no in given range
public class loops {
    public static void main(String[] args) {

        byte maxLimit;
        maxLimit = 100;
        for( byte number=1; number<=maxLimit; number++){ // here the loop counter or "number" is create in the loop and the memory relase after the excetue.
            if (number % 2 == 0){
                System.out.println(number);
                /*
                here the for loop used for memory scope and also simplifed code.
                 */
            }
        }






    }
}
