package com.JavaFundamentals.Day1WorkingWithPrimitives.Exercise;

public class TypeCasting {
    public static void main(String[] args) {

        //implicit
        byte age;
        age = 30;

        float Age;  //Automatic conversion of data from a smaller data type to a larger data type.
        Age = age;   //No data loss

        //Explicit
        short AgeValue; //Manual conversion of data from a larger data type to a smaller data type.
        AgeValue = (short)Age; //Data loss

        System.out.println("Age:"+Age);
        System.out.println("Age after Explicit: "+AgeValue);
    }
}
