package com.JavaFundamentals.OOPS.features.Abstractions.Exercise;

public class StudentServiceImpl extends StudentService {

    Repository repository;

    public StudentServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    void addStudentToDB(Student student) {
        repository.connectToDb();
        repository.addStudentToDb(student);
    }
}
