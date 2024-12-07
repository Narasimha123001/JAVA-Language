package com.JavaFundamentals.Streams.Student;

import com.JavaFundamentals.Streams.Employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository {

    private List<Student> studentsList;


    public StudentRepository() {
        this.studentsList = new ArrayList<>();
        studentsList.add(new Student("Alice Johnson", 1001, (byte) 18, "CSE", "Engineering", "alice.johnson@example.com"));
        studentsList.add(new Student("Bob Smith", 1002, (byte) 19, "ECE", "Engineering", "bob.smith@example.com"));
        studentsList.add(new Student("Charlie Brown", 1003, (byte) 20, "EEE", "Engineering", "charlie.brown@example.com"));
        studentsList.add(new Student("Diana Prince", 1004, (byte) 21, "ME", "Engineering", "diana.prince@example.com"));
        studentsList.add(new Student("Ethan Hunt", 1005, (byte) 22, "CSE", "Engineering", "ethan.hunt@example.com"));
        studentsList.add(new Student("Fiona Clark", 1006, (byte) 18, "IT", "Engineering", "fiona.clark@example.com"));
        studentsList.add(new Student("George Harris", 1007, (byte) 19, "CSE", "Engineering", "george.harris@example.com"));
        studentsList.add(new Student("Hannah Lee", 1008, (byte) 20, "CIVIL", "Engineering", "hannah.lee@example.com"));
        studentsList.add(new Student("Ian Wright", 1009, (byte) 21, "ECE", "Engineering", "ian.wright@example.com"));
        studentsList.add(new Student("Julia Adams", 1010, (byte) 22, "ME", "Engineering", "julia.adams@example.com"));
        studentsList.add(new Student("Kevin Scott", 1011, (byte) 18, "EEE", "Engineering", "kevin.scott@example.com"));
        studentsList.add(new Student("Laura King", 1012, (byte) 19, "CSE", "Engineering", "laura.king@example.com"));
        studentsList.add(new Student("Mike Davis", 1013, (byte) 20, "CSE", "Engineering", "mike.davis@example.com"));
        studentsList.add(new Student("Nina Thomas", 1014, (byte) 21, "ECE", "Engineering", "nina.thomas@example.com"));
        studentsList.add(new Student("Oscar Evans", 1015, (byte) 22, "ME", "Engineering", "oscar.evans@example.com"));
        studentsList.add(new Student("Paula Baker", 1016, (byte) 18, "IT", "Engineering", "paula.baker@example.com"));
        studentsList.add(new Student("Quentin Reed", 1017, (byte) 19, "CSE", "Engineering", "quentin.reed@example.com"));
        studentsList.add(new Student("Rachel Carter", 1018, (byte) 20, "ECE", "Engineering", "rachel.carter@example.com"));
        studentsList.add(new Student("Steve Wilson", 1019, (byte) 21, "ME", "Engineering", "steve.wilson@example.com"));
        studentsList.add(new Student("Tina Foster", 1020, (byte) 22, "CIVIL", "Engineering", "tina.foster@example.com"));
        studentsList.add(new Student("Uma Green", 1021, (byte) 18, "EEE", "Engineering", "uma.green@example.com"));
        studentsList.add(new Student("Victor Hall", 1022, (byte) 19, "CSE", "Engineering", "victor.hall@example.com"));
        studentsList.add(new Student("Wendy Bell", 1023, (byte) 20, "ECE", "Engineering", "wendy.bell@example.com"));
        studentsList.add(new Student("Xander Young", 1024, (byte) 21, "ME", "Engineering", "xander.young@example.com"));
        studentsList.add(new Student("Yara Sanders", 1025, (byte) 22, "CSE", "Engineering", "yara.sanders@example.com"));
    }

    public List<Student> getStudentsList(){
        return studentsList;
    }

    public Optional<Student> getStudentById(int regNo){
        return this.studentsList.stream().filter(student -> student.getRegNo()== regNo).findFirst();
    }
}
