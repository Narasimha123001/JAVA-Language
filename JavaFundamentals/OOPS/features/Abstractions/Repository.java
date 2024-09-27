package com.JavaFundamentals.OOPS.features.Abstractions;

public abstract class Repository {

    abstract  void  connectToDb();

    abstract  void addCustomerToDb(Customer customer);
}
