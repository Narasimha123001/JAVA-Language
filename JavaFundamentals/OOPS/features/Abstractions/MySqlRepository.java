package com.JavaFundamentals.OOPS.features.Abstractions;

public class MySqlRepository extends Repository{


    @Override
    void connectToDb() {
        System.out.println("connect to the MySql database....");
    }

    @Override
    void addCustomerToDb(Customer customer) {
        System.out.println("customer add to mySql Database...");
    }
}
