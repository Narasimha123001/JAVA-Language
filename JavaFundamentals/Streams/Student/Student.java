package com.JavaFundamentals.Streams.Student;

import java.util.Objects;

public class Student {

    private String name;
    private int regNo;
    private byte age;
    private String Department;
    private String Stream;
    private String email;

    public Student(String name, int regNo, byte age, String department, String stream, String email) {
        this.name = name;
        this.regNo = regNo;
        this.age = age;
        Department = department;
        Stream = stream;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return regNo == student.regNo && age == student.age && Objects.equals(name, student.name) && Objects.equals(Department, student.Department) && Objects.equals(Stream, student.Stream) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regNo, age, Department, Stream, email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", regNo=" + regNo +
                ", age=" + age +
                ", Department='" + Department + '\'' +
                ", Stream='" + Stream + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
