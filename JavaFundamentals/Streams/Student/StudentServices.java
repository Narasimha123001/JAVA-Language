package com.JavaFundamentals.Streams.Student;


import com.JavaFundamentals.Streams.Employee.Employee;
import com.JavaFundamentals.Streams.Employee.EmployeeNotFoundExceptions;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class StudentServices {

    public StudentRepository studentRepository;

    public StudentServices(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudentDetails(){
        return this.studentRepository.getStudentsList();
    }

    public List<Student> getFilterByAge(byte age){
        return this.studentRepository.getStudentsList().stream()
                .filter(student -> student.getAge()>=age)
                .collect(Collectors.toList());
    }

    public List<Student> getFilterByDepartment(String dept){
        return this.studentRepository.getStudentsList().stream()
                .filter(student -> student.getDepartment() == dept)
                .collect(Collectors.toList());
    }
    public List<Student> getFilterByAgeAndDept(byte Age, String dept){
        return this.studentRepository.getStudentsList().stream()
                .filter(student -> student.getDepartment() == dept)
                .filter(student -> student.getAge() >= Age)
                .collect(Collectors.toList());
    }

    public Student getStudentById(int regNo) throws StudentException {
        Optional<Student> optionalStudent=this.studentRepository.getStudentById(regNo);
        if(optionalStudent.isPresent())
            return optionalStudent.get();
        else
            throw new StudentException("No Student present on this regno :"+regNo);
    }
}
