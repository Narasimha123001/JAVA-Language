package com.JavaFundamentals.Exceptions.Exercise;

public class Finally {
    public static void main(String[] args) {

        try{
            int[] ids = {1,2,3,4};
            System.out.println(ids[9]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally{

            System.out.println("finally block code was excepted ");
        }
    }

}
