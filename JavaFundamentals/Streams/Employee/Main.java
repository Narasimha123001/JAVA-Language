package com.JavaFundamentals.Streams.Employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        EmployeeServices employeeServices = new EmployeeServices(employeeRepository);

        List<Employee> employeesList=employeeServices.getEmployees();
        employeesList.forEach(System.out::println);

        System.out.println("____Filter by Age Above 35_____");
        employeeServices.getFilterByAge((byte)35).forEach(System.out::println);
        System.out.println("____Filter by Age Above 40 and salary above 65000_____");
        employeeServices.getFilterByAgeAndSalary(65000,(byte) 40).forEach(System.out::println);
        System.out.println("##################### Employee Details #####################");
        employeeServices.displayEmployeeDetails();

        employeeServices.getAllEMails().forEach(System.out::println);

        try{
            System.out.println(employeeServices.getEmployeeById(10));
        }catch (EmployeeNotFoundExceptions e){
            System.out.println(e.getMessage());
        }
    }
}
