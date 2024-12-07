package com.JavaFundamentals.Streams.Student;


import java.util.List;

public class Main {
    public static void main(String[] args){
        StudentRepository studentRepository = new StudentRepository();
        StudentServices studentServices = new StudentServices(studentRepository);

        List<Student> studentList = studentServices.getStudentDetails();
        studentList.forEach(System.out::println);
        System.out.println("**********by Age*********");
        studentServices.getFilterByAge((byte)21).forEach(System.out::println);
        System.out.println("***********ECE dept********");
        studentServices.getFilterByDepartment("ECE").forEach(System.out::println);
        System.out.println("***********CSE dept********");
        studentServices.getFilterByDepartment("CSE").forEach(System.out::println);
        System.out.println("***********ME dept********");
        studentServices.getFilterByDepartment("ME").forEach(System.out::println);
        System.out.println("***********IT dept********");
        studentServices.getFilterByDepartment("IT").forEach(System.out::println);
        System.out.println("***********EEE dept********");
        studentServices.getFilterByDepartment("EEE").forEach(System.out::println);

        System.out.println("******dept and age **********");
        studentServices.getFilterByAgeAndDept((byte)21,"ECE").forEach(System.out::println);

        try{
            System.out.println(studentServices.getStudentById(1002));
        } catch (StudentException e) {
            System.out.println(e.getMessage());
        }

    }
}
