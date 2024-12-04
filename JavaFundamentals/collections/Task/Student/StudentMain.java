package com.JavaFundamentals.collections.Task.Student;

import java.util.HashMap;

public class StudentMain {
    public static void main(String[] args) {
        HashMap<Integer,Student> studentHashMap = new HashMap<>();
        studentHashMap.put(1,new Student(100,"Nani"));
        studentHashMap.put(2,new Student(101,"sushi"));
        studentHashMap.put(3,new Student(102,"Parveen"));
        studentHashMap.put(4,new Student(103,"Sai"));
        studentHashMap.put(5,new Student(104,"Ravi"));

        //Print
        System.out.println(studentHashMap);

        //Modify
        studentHashMap.replace(2,new Student(102,"Narasimhan"));
        studentHashMap.remove(3);

        //Iterate
        for(Student student : studentHashMap.values()){
            System.out.println(student);
        }

        //checks
        if(studentHashMap.containsKey(1)){
            System.out.println("Student found");
        }else{
            System.out.println("Student not found");
        }

    }


}
