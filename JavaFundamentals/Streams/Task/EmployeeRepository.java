package com.JavaFundamentals.Streams.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository {

    private List<Employee> employeeList;

    public EmployeeRepository(){
        this.employeeList = new ArrayList<>();
        employeeList.add(new Employee(116, "Alice", 60000, "IT"));
        employeeList.add(new Employee(117, "Bob", 45000, "HR"));
        employeeList.add(new Employee(118, "Charlie", 75000, "Finance"));
        employeeList.add(new Employee(129, "Diana", 80000, "IT"));
        employeeList.add(new Employee(130, "Eve", 20000, "IT"));
        employeeList.add(new Employee(131, "Alice", 60000, "IT")); // Duplicate for testing distinct
        employeeList.add(new Employee(122, "Frank", 90000, "Finance"));
        employeeList.add(new Employee(123, "Grace", 55000, "HR"));
        employeeList.add(new Employee(124, "Hank", 21000, "IT"));
        employeeList.add(new Employee(125, "Narasimhan", 2500000, "Java Developer"));
        employeeList.add(new Employee(126, "Arjun", 150000, "IT"));
        employeeList.add(new Employee(127, "Meena", 75000, "HR"));
        employeeList.add(new Employee(128, "Priya", 45000, "Finance"));
        employeeList.add(new Employee(129, "Karthik", 30000, "IT"));
        employeeList.add(new Employee(130, "Anjali", 250000, "IT"));
        employeeList.add(new Employee(131, "Rahul", 2500000, "IT")); // Duplicate salary
        employeeList.add(new Employee(129, "DuplicateKarthik", 30000, "IT"));
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public Optional<Employee> getEmployeeById(int id){
        return this.employeeList.stream().filter(employee -> employee.getId()== id).findFirst();
    }
}
