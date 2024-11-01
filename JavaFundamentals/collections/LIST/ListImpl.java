package com.JavaFundamentals.collections.LIST;

import com.JavaFundamentals.collections.BeanClass.Customer;

import java.util.ArrayList;

public class ListImpl {
    public static void main(String[] args) {
        ArrayList<Customer> customersList = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.setName("Customer1");
        customer1.setId(111);
        customer1.setEmail("Customer1@gmail.com");

        Customer customer2 = new Customer();
        customer2.setName("Customer2");
        customer2.setId(222);
        customer2.setEmail("Customer2@gmail.com");

        Customer customer3 = new Customer();
        customer3.setName("Customer3");
        customer3.setId(333);
        customer3.setEmail("Customer3@gmail.com");

        Customer customer4 = new Customer();
        customer4.setName("Customer3");
        customer4.setId(333);
        customer4.setEmail("Customer3@gmail.com");

        customersList.add(customer1);
        customersList.add(customer2);
        customersList.add(customer3);
        customersList.add(customer4);

        System.out.println("ArrayList");

        ListServiceClass listServiceClass = new ListServiceClass();

        for(Customer customer : customersList){
            //System.out.println(customer);
            listServiceClass.displayCustomerDetails(customer);
        }


    }
}
