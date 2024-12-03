package com.JavaFundamentals.collections.Exercise.SET;

import java.util.LinkedHashSet;

public class LInkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Customer> customerLinkedHashSet = new LinkedHashSet<>();
        customerLinkedHashSet.add(new Customer(101,"sai"));
        customerLinkedHashSet.add(new Customer(102,"Nani"));
        customerLinkedHashSet.add(new Customer(103,"HAri"));
        customerLinkedHashSet.add(new Customer(104,"njnjb"));

        System.out.println(customerLinkedHashSet);
    }
}
