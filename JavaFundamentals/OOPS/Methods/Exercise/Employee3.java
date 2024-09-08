package com.JavaFundamentals.OOPS.Methods.Exercise;
//ith return type and without parameter
public class Employee3 {
    int Salary;
    byte Experience = 3;

    int salaryIncrementByExperience() {
        int increment = 1;
        if (Experience >= 2 && Experience < 3) {
            increment = 10;
        } else if (Experience >= 3 && Experience < 5) {
            increment = 15;
        } else {
            increment = 5;
        }
        System.out.println("Salary Increment: " + increment);
        return increment;
    }

    public static void main(String[] args) {
        Employee3 obj = new Employee3();
        obj.salaryIncrementByExperience();
    }
}
