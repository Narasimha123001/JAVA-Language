package com.JavaFundamentals.collections.MAP;

import com.JavaFundamentals.collections.BeanClass.Customer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapImpl {

    public static void main(String[] args) {

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


        System.out.println("HashMap");
        HashMap<Integer,Customer> customerHashMap = new HashMap<>();
        customerHashMap.put(111,customer1);
        customerHashMap.put(222,customer2);
        customerHashMap.put(333,customer3);
        customerHashMap.put(333,customer4);
        System.out.println(customerHashMap);

        System.out.println("LinkedHashMap");
        LinkedHashMap<Integer,Customer> customerLinkedHashMap = new LinkedHashMap<>();
        customerLinkedHashMap.put(111,customer1);
        customerLinkedHashMap.put(222,customer2);
        customerLinkedHashMap.put(333,customer3);
        customerLinkedHashMap.put(333,customer4);
        System.out.println(customerLinkedHashMap);

        System.out.println("TreeMap");
        TreeMap<Integer,Customer> customerTreeMap = new TreeMap<>();


        customerTreeMap.put(333,customer3);
        customerTreeMap.put(111,customer1);
        customerTreeMap.put(333,customer4);
        customerTreeMap.put(222,customer2);
        System.out.println(customerTreeMap);

        System.out.println(customerTreeMap.get(111));
    }

}
