package com.JavaFundamentals.OOPS.features.Abstractions;

public class MongoDbRepository extends Repository {
    @Override
    void connectToDb() {
        System.out.println("Connect to the MongoDb database");
    }

    @Override
    void addCustomerToDb(Customer customer) {
        System.out.println("customer add to the MongoDb database");
    }
}
