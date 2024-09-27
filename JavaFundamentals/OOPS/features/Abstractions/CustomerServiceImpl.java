package com.JavaFundamentals.OOPS.features.Abstractions;

public class CustomerServiceImpl extends CustomerService{

    Repository repository;

    public CustomerServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    void addCustomerDb(Customer customer) {

        repository.connectToDb();
        repository.addCustomerToDb(customer);
    }
}
