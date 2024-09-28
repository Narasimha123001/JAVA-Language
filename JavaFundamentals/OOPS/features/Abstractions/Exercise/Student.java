package com.JavaFundamentals.OOPS.features.Abstractions.Exercise;

public class Student {

    String name;
    int regNo;
    String Dept;
    String Specialization;
    byte year;
    byte age;


    public Student(){
        System.out.println("default Student constructor is called .......");
    }

    public Student(String name, int regNo, String dept, String specialization, byte year, byte age) {
        this.name = name;
        this.regNo = regNo;
        this.Dept = dept;
        this.Specialization = specialization;
        this.year = year;
        this.age = age;
    }
}
