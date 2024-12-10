package com.JavaFundamentals.Streams.Task;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmployeeRepository employeeRepository = new EmployeeRepository();
        EmployeeServices employeeServices = new EmployeeServices(employeeRepository);

        employeeServices.getEmployeesList().forEach(System.out::println);
        System.out.println("***********Remove Duplicates from the list**************");
        List<Employee> distinctEmployee =employeeServices.removeDuplicates();
        distinctEmployee.forEach(System.out::println);

        System.out.println("****first three employees from the list****");
        employeeServices.getFirstThreeEmployees().forEach(System.out::println);

        System.out.println("*****Skip first two Employees*****");
        employeeServices.skipFirstTwoEmployees().forEach(System.out::println);

        System.out.println("******using the peek() its checks every element and its processed before executing***********");
        employeeServices.logEmployeeBeforeCollecting();

        System.out.println("*****Count the elements in the list******");
        System.out.println("No of Employees: "+employeeServices.countEmployees());

        System.out.println("*****Salary greater then 50000***********");
        System.out.println(employeeServices.salaryGreaterThan(50000));
        employeeServices.salaryGreaterThan2(50000).forEach(System.out::println);

        System.out.println("****check all Employees are It********");
        System.out.println(employeeServices.checkAllItDept("IT"));

        System.out.println("*******Check whether the employees salary less than 20000*******");
        System.out.println(employeeServices.isNotLessThenSalary(20000));
        employeeServices.isNotLessThenSalary1(20000).forEach(System.out::println);
        System.out.println("************1st Employee***********");
        employeeServices.findFirstEmployee().ifPresent(System.out::println);
        employeeServices.findAnyEmployee().ifPresent(System.out::println);


        try{
            System.out.println(employeeServices.getStudentById(101));
        } catch (EmployeeExceptionError e) {
            System.out.println(e.getMessage());
        }
    }
}
