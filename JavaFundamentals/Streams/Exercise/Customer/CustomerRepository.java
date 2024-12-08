package com.JavaFundamentals.Streams.Exercise.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    private List<Customer> customerList;

    public CustomerRepository() {
        this.customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Nani", (byte) 21, "Vijayawada"));
        customerList.add(new Customer(2, "Mohana", (byte) 17, "Ongole"));
        customerList.add(new Customer(3, "Harika", (byte) 18, "Hyderabad"));
        customerList.add(new Customer(4, "Sashi", (byte) 19, "Vijayawada"));
        customerList.add(new Customer(5, "hari", (byte) 20, "Ongole"));

    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
