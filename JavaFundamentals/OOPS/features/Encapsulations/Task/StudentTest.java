package com.JavaFundamentals.OOPS.features.Encapsulations.Task;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Narasihan",21,(double) 8.98);

        student.displayInfo();

        student.setName("Sai");
        student.setAge(25);
        student.setGrade(8.95);
        System.out.println("\nUpdated student Details");
        student.displayInfo();


    }
}
