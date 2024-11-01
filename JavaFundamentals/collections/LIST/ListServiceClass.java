package com.JavaFundamentals.collections.LIST;


import com.JavaFundamentals.collections.BeanClass.Customer;

public class ListServiceClass {
    void displayCustomerDetails(Customer customer){
        System.out.println("Name:" +customer.getName());
        System.out.println("Id:" +customer.getId());
        System.out.println("gmail"+customer.getEmail());
    }
}
