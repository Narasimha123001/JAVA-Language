package com.JavaFundamentals.collections.BeanClass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Customer customer4 = new Customer();
        customer4.setName("Customer4");
        customer4.setId(444);
        customer4.setEmail("Customer4@gmail.com");

        Customer customer1 = new Customer();
        customer1.setName("Customer1");
        customer1.setId(111);
        customer1.setEmail("Customer1@gmail.com");

        Customer customer2 = new Customer();
        customer2.setName("Customer3");
        customer2.setId(333);
        customer2.setEmail("Customer3@gmail.com");

        Customer customer3 = new Customer();
        customer3.setName("Customer3");
        customer3.setId(333);
        customer3.setEmail("Customer3@gmail.com");


        HashSet<Customer> customerSet = new HashSet<>();

        customerSet.add(customer1);
        customerSet.add(customer2);
        customerSet.add(customer3);
        customerSet.add(customer4);
        System.out.println("HashSet");
        System.out.println(customerSet);

        LinkedHashSet<Object> customerSet1 = new LinkedHashSet<>();

        customerSet1.add(customer1);
        customerSet1.add(customer2);
        customerSet1.add(customer3);
        customerSet1.add(customer4);
        System.out.println("LinkedHashSet");
        System.out.println(customerSet1);


        TreeSet<Object> customerSet2 = new TreeSet<>();
        customerSet2.add(customer1);
        customerSet2.add(customer2);
        customerSet2.add(customer4);
        customerSet2.add(customer3);
        System.out.println("TreeSet");
        System.out.println(customerSet2);


    }
}
