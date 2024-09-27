package com.JavaFundamentals.OOPS.features.Abstractions;

public abstract class CustomerService {



    abstract void addCustomerDb(Customer customer);     // abstract method

    void displayCustomerDetails(Customer customer){                   // nonAbstract method
        System.out.println("Customer Id:" + customer.CustomerId);
        System.out.println("Customer Name:" + customer.CustomerName);
        System.out.println("Age: "+customer.Age);
        System.out.println("Membership: "+customer.Email);
        System.out.println("Phone no: "+customer.PhoNo);

        System.out.println(" ");
    }

}
