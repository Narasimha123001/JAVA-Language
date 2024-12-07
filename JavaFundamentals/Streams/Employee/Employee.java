package com.JavaFundamentals.Streams.Employee;

import java.util.Objects;

public class Employee {

    private String name;
    private int id;
    private String department;
    private String email;
    private double salary;
    private byte age;

    public Employee(String name, int id, String department, String email, double salary, byte age) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && age == employee.age && Objects.equals(name, employee.name) && Objects.equals(department, employee.department) && Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, department, email, salary, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
