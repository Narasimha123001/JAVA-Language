package com.JavaFundamentals.OOPS.ClassAndObject.Exercise;

public class Student {

    int id=25;
    String name ;
    String Gender = "Male";


    public static void main(String[] args) {


        Student S1 = new Student();
        System.out.println(S1.id);
        System.out.println(S1.name);
        System.out.println(S1.Gender);
    }
}
