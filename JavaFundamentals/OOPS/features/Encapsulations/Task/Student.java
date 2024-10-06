package com.JavaFundamentals.OOPS.features.Encapsulations.Task;

public class Student {
    String Name;
    int Age;
    double Grade;

    public Student(String name, int age, double grade) {
        this.Name = name;
        this.Age = age;
        this.Grade = grade;
    }
    String getName(){
        return Name;
    }
    public void setName(String name){
        Name = name;
    }

    int getAge(){
        return Age;
    }
    public void setAge(int age){
        Age = age;
    }
    double getGrade(){
        return  Grade;
    }
    public  void setGrade(double grade){
        Grade = grade;
    }

    void displayInfo(){
        System.out.println("Student Name : "+Name);
        System.out.println("Student Age : "+Age);
        System.out.println("Student Grade : "+Grade);
    }
}
