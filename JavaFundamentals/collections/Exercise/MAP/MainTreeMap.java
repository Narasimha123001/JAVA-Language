package com.JavaFundamentals.collections.Exercise.MAP;

import java.util.TreeMap;

public class MainTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,Customer> hashMapCustomerTreeMap = new TreeMap<>();
        hashMapCustomerTreeMap.put(1,new Customer(111,"nani"));
        hashMapCustomerTreeMap.put(2,new Customer(222,"ravi"));
        hashMapCustomerTreeMap.put(3,new Customer(333,"sai"));

        System.out.println(hashMapCustomerTreeMap);

        System.out.println(((TreeMap<Integer,Customer>)hashMapCustomerTreeMap).firstEntry());
        System.out.println(((TreeMap<Integer,Customer>)hashMapCustomerTreeMap).lastKey());
    }
}
