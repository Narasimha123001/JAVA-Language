package com.JavaFundamentals.Streams.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository {

    private List<Employee> employeeList;

    public EmployeeRepository() {
        this.employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alice", 1, "HR", "alice@company.com", 55000.50, (byte) 30));
        employeeList.add(new Employee("Bob", 2, "Finance", "bob@company.com", 60000.00, (byte) 28));
        employeeList.add(new Employee("Charlie", 3, "IT", "charlie@company.com", 72000.75, (byte) 35));
        employeeList.add(new Employee("Diana", 4, "Marketing", "diana@company.com", 48000.25, (byte) 25));
        employeeList.add(new Employee("Eve", 5, "IT", "eve@company.com", 65000.80, (byte) 32));
        employeeList.add(new Employee("Frank", 6, "Operations", "frank@company.com", 57000.40, (byte) 27));
        employeeList.add(new Employee("Grace", 7, "HR", "grace@company.com", 52000.30, (byte) 29));
        employeeList.add(new Employee("Hank", 8, "Finance", "hank@company.com", 75000.00, (byte) 40));
        employeeList.add(new Employee("Ivy", 9, "IT", "ivy@company.com", 68000.60, (byte) 31));
        employeeList.add(new Employee("John", 10, "Marketing", "john@company.com", 49000.90, (byte) 26));

    }

    public List<Employee> getEmployeeList(){
        return employeeList;
    }

    public Optional<Employee> getEmployeeById(int id){
        return this.employeeList.stream().filter(employee -> employee.getId() == id).findFirst();
    }
}
