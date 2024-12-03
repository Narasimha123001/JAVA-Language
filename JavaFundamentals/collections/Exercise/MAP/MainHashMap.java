package com.JavaFundamentals.collections.Exercise.MAP;

import java.util.HashMap;

public class MainHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Customer> customerHashMap = new HashMap<>();

        customerHashMap.put(1,new Customer(111,"nani"));
        customerHashMap.put(2,new Customer(222,"ravi"));
        customerHashMap.put(3,new Customer(333,"sai"));

        System.out.println("customer id:222" +customerHashMap.get(2));

        customerHashMap.put(2,new Customer(444,"hau"));   // its delete the old data to new data
        System.out.println(customerHashMap);

        customerHashMap.remove(3);
        System.out.println(customerHashMap);
    }
}
