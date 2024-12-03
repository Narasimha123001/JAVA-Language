package com.JavaFundamentals.collections.Exercise.MAP;

import java.util.LinkedHashMap;


public class MainLinkedMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Customer> customerLinkedHashMap = new LinkedHashMap<>();
        customerLinkedHashMap.put(1,new Customer(111,"nani"));
        customerLinkedHashMap.put(2,new Customer(222,"ravi"));
        customerLinkedHashMap.put(3,new Customer(333,"sai"));

        System.out.println(customerLinkedHashMap);

    }
}
