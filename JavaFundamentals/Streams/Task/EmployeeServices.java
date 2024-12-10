package com.JavaFundamentals.Streams.Task;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeServices {

    private EmployeeRepository employeeRepository;

    public EmployeeServices(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployeesList(){
        return this.employeeRepository.getEmployeeList();
    }
                                //Distinct : Remove duplicate employees based on their IDs.
    public List<Employee> removeDuplicates(){
        return this.employeeRepository.getEmployeeList()
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

                                // Limit: Get the first three employees from the list

    public List<Employee> getFirstThreeEmployees(){
        return this.employeeRepository.getEmployeeList().stream()
                .limit(3)
                .collect(Collectors.toList());
    }

                                //Skip: Skip the first two employees and get the rest.

    public List<Employee> skipFirstTwoEmployees(){
        return this.employeeRepository.getEmployeeList().stream()
                .skip(2)
                .collect(Collectors.toList());
    }

                                //Peek: Log each employee's information before collecting them into a list
    public List<Employee> logEmployeeBeforeCollecting(){
        return this.employeeRepository.getEmployeeList().stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

                        //Terminal Operations
                        //Count
    public long countEmployees(){
        return this.employeeRepository.getEmployeeList().size();
    }

                    //anymatch
    public boolean salaryGreaterThan(double salary){
        return this.employeeRepository.getEmployeeList().stream()
                .anyMatch(employee -> employee.getSalary()>=salary);
    }
    public List<Employee> salaryGreaterThan2( double salary){
        return this.employeeRepository.getEmployeeList().stream()
                .filter(employee -> employee.getSalary() >= salary)
                .collect(Collectors.toList());
    }

                //allMatch
    public boolean checkAllItDept(String dept){
        return this.employeeRepository.getEmployeeList().stream()
                .allMatch(employee -> employee.getDepartment() == "IT");
    }

    public boolean isNotLessThenSalary(double salary){
        return this.employeeRepository.getEmployeeList().stream()
                .noneMatch(employee -> employee.getSalary() <salary);
    }

    public List<Employee> isNotLessThenSalary1(double salary){
        return this.employeeRepository.getEmployeeList().stream()
                .filter(employee -> employee.getSalary()<=salary)
                .collect(Collectors.toList());
    }

    public Optional<Employee> findFirstEmployee(){
        return this.employeeRepository.getEmployeeList().stream().findFirst();
    }

    public Optional<Employee> findAnyEmployee(){
        return this.employeeRepository.getEmployeeList().stream().findAny();
    }

    public Employee getStudentById(int id) throws EmployeeExceptionError {
        Optional<Employee> optionalEmployee =this.employeeRepository.getEmployeeById(id);
        if(optionalEmployee.isPresent())
            return optionalEmployee.get();
        else
            throw new EmployeeExceptionError("Employee not found based on id:"+id);
    }

}
