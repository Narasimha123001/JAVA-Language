package com.JavaFundamentals.collections.Exercise.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(101,"Nani"));
        customerList.add(new Customer(102,"Aai"));
        customerList.add(new Customer(102,"Sai"));

        Collections.sort(customerList,new Customer());
        System.out.println(customerList);

    }
}
