package com.JavaFundamentals.OOPS.Methods.Exercise;
//without return type and without parameterrs
import java.util.Scanner;

public class Employee1 {

    byte EmployeeId;
    String EmployeeName;
    byte EmployeeAge;

    void displayEmployeeDetails(){
        System.out.println("Employee Id: "+ EmployeeId);
        System.out.println("Employee Name: "+ EmployeeName);
        System.out.println("Employee Age: "+ EmployeeAge);
    }

    public static void main(String[] args) {
        Employee1 obj = new Employee1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the id: ");
        obj.EmployeeId = scanner.nextByte();
        System.out.println("enter the name: ");
        obj.EmployeeName = scanner.next();
        System.out.println("enter the age: ");
        obj.EmployeeAge = scanner.nextByte();

        obj.displayEmployeeDetails();
    }
}

/*
        enter the id:
        112
        enter the name:
        namhi
        enter the age:
        56
        Employee Id: 112
        Employee Name: namhi
        Employee Age: 56
 */