package com.JavaFundamentals.collections.Exercise.Comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMAin {
    public static void main(String[] args) {

        Customer customer =new Customer();
        Customer customer1 =new Customer();
        Customer customer2 =new Customer();

        customer.setId(100);
        customer.setName("Nani");

        customer1.setId(101);
        customer1.setName("Ravi");

        customer2.setId(102);
        customer2.setName("Sai");

        List<Customer> customerList = new ArrayList<>();

        customerList.add(customer2);
        customerList.add(customer);
        customerList.add(customer1);


        for (Customer str : customerList){
            System.out.println(str);
        }

        System.out.println("After sorting");
        Collections.sort(customerList);
        System.out.println(customerList);

    }
}
