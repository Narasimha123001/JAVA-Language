package com.JavaFundamentals.Exceptions.Exercise;

public class TryCatchExample {

    public static void main(String[] args) {
        try{
            int result = divide(10,0);
            System.out.println("Result: "+result);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception "+e.getMessage());
        }

    }
    private static int divide(int i, int i1) throws ArithmeticException{
        return i/i1;
    }
}
