package com.JavaFundamentals.Exceptions.Exercise.CustomsExceptions;

public class CustomsExceptions {
    public static void main(String[] args) {
        try{
            validAge(15);
        }catch (InvalidAgeExceptions e){
            System.out.println(e.getMessage());
        }
    }

    private static void validAge(int age) throws InvalidAgeExceptions{

        if(age < 18)
            throw new InvalidAgeExceptions("Age must be or above 18");

        System.out.println("age is valid");
    }
}
