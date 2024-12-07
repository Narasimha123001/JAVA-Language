package com.JavaFundamentals.Streams.Employee;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeServices {

    public EmployeeRepository employeeRepository;

    public EmployeeServices(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees(){
        return this.employeeRepository.getEmployeeList();
    }
                                            //filter and collect methods
    public List<Employee> getFilterByAge(byte minAge){
        return this.employeeRepository.getEmployeeList().stream()
                .filter(employee -> employee.getAge()>=minAge)
                .collect(Collectors.toList());
    }

    public List<Employee> getFilterByAgeAndSalary(double salary, byte minAge){
        return this.employeeRepository.getEmployeeList().stream()
                .filter(employee -> employee.getAge()>=minAge)
                .filter(employee -> employee.getSalary() >= 70000)
                .collect(Collectors.toList());
    }

    public void displayEmployeeDetails(){
        this.employeeRepository.getEmployeeList().stream().forEach(employee -> {
            System.out.println("Employee Id:"+employee.getId());
            System.out.println("Employee Name"+employee.getName());
            System.out.println("Employee Age"+employee.getAge());
            System.out.println("department"+employee.getDepartment());
            System.out.println("Employee email"+employee.getEmail());
            System.out.println("Employee Salary"+employee.getSalary());
            System.out.println("****************************************");
        });
    }
                                                                //MAP Functions
    public List<String> getAllEMails(){
        return this.employeeRepository.getEmployeeList().stream().map(Employee::getEmail).collect(Collectors.toList());
    }

    public Employee getEmployeeById(int id) throws EmployeeNotFoundExceptions {
        Optional<Employee> optionalEmployee= this.employeeRepository.getEmployeeById(id);
        if(optionalEmployee.isPresent())
            return optionalEmployee.get();
        else
            throw new EmployeeNotFoundExceptions("Employee not by id: "+id);
    }
}

