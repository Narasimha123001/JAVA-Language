package com.JavaFundamentals.OOPS.features.Abstractions.Exercise;

public class Main {
    public static void main(String[] args) {


        Student student = new Student("Narasimha",41435,"CSE","AIML",(byte) 3,(byte) 21);

        MySqlRepository mySqlRepository = new MySqlRepository();
        StudentServiceImpl studentService = new StudentServiceImpl(mySqlRepository);
        studentService.addStudentToDB(student);
        studentService.displayStudentDetails(student);

    }
}
