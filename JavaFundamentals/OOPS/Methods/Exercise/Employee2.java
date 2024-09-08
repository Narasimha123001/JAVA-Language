package com.JavaFundamentals.OOPS.Methods.Exercise;
//without return type and with parameters
public class Employee2 {
    void employeeDetails(String Name, int id, byte Age){
        System.out.println("Employee Name: "+ Name);
        System.out.println("Employee id: "+ id);
        System.out.println("Employee Age: "+Age);
    }

    public static void main(String[] args) {
        Employee2 obj = new Employee2();
        obj.employeeDetails("employeeName",59102,(byte) 58);
    }
}
