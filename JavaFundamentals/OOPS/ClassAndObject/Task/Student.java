package com.JavaFundamentals.OOPS.ClassAndObject.Task;

public class Student {
    byte RollNo;
    String Name;
    byte Age;
    float grade;
    String Dept;

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.RollNo=126;
        student1.Name="Shiva";
        student1.Age=21;
        student1.Dept="CSE";
        student1.grade=8.45f;

        student2.RollNo=126;
        student2.Name="ravi";
        student2.Age=22;
        student2.Dept="ECE";
        student2.grade=9.45f;

        student3.RollNo=116;
        student3.Name="Hema";
        student3.Age=23;
        student3.Dept="IT";
        student3.grade=9.65f;

        System.out.println("Reg No: " +student1.RollNo);
        System.out.println("Name: " +student1.Name);
        System.out.println("Age: " +student1.Age);
        System.out.println("Dept: " +student1.Dept);
        System.out.println("Grade: " +student1.grade);

        System.out.println("Reg No: " +student2.RollNo);
        System.out.println("Name: " +student2.Name);
        System.out.println("Age: " +student2.Age);
        System.out.println("Dept: " +student2.Dept);
        System.out.println("Grade: " +student2.grade);

        System.out.println("Reg No: " +student3.RollNo);
        System.out.println("Name: " +student3.Name);
        System.out.println("Age: " +student3.Age);
        System.out.println("Dept: " +student3.Dept);
        System.out.println("Grade: " +student3.grade);
    }

}
