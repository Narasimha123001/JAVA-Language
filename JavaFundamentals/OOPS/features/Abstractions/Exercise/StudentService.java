package com.JavaFundamentals.OOPS.features.Abstractions.Exercise;

public abstract class StudentService {

     abstract void addStudentToDB(Student student);

     public void displayStudentDetails(Student student){

         System.out.println("Student Name :"+student.name);
         System.out.println("Student Age :"+student.age);
         System.out.println("Student Reg No : "+student.regNo);
         System.out.println("Student Dept :"+student.Dept);
         System.out.println("Student Specialization :"+student.Specialization);
         System.out.println("Student Year :"+student.year);
         System.out.println(" ");

     }
}
