package com.JavaFundamentals.collections.Exercise.SET;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class MainHashSet {
    public static void main(String[] args) {
        HashSet<Customer> customerHashSet = new HashSet<>();
        customerHashSet.add(new Customer(101,"sai"));
        customerHashSet.add(new Customer(102,"Nani"));
        customerHashSet.add(new Customer(103,"HAri"));


        //operation 1: checks whether the customer is there or not
        System.out.println("Contains sai?"+customerHashSet.contains(new Customer(101,"sai")));
        System.out.println("Total customers :" +customerHashSet.size());
        for (Customer customer : customerHashSet){
            System.out.println(customer);
        }

       //operation 2: remove a customer
        customerHashSet.remove(new Customer(101,"sai"));
        System.out.println("After deletions total customer :" +customerHashSet.size());
        for (Customer customer : customerHashSet){
            System.out.println(customer);
        }



    }
}
