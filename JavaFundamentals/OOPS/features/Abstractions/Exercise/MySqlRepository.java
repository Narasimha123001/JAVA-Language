package com.JavaFundamentals.OOPS.features.Abstractions.Exercise;

public class MySqlRepository extends Repository{


    @Override
    void connectToDb() {
        System.out.println("Successfully connect to MySql database.....");
    }

    @Override
    void addStudentToDb(Student student) {
        System.out.println("Students details add to MySql database...");
    }
}
