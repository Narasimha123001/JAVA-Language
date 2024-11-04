package com.JavaFundamentals.collections.Exercise.LIST;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Customer> customerList = new java.util.ArrayList<>();
        customerList.add(new Customer(101,"nani"));
        customerList.add(new Customer(102,"sai"));
        customerList.add(new Customer(103,"ravi"));
        customerList.add(new Customer(103,"ravi"));  //its allow duplicates

        System.out.println(customerList);
        System.out.println("size before update :"+customerList.size());

        //operation 1:Retrieve
        System.out.println(customerList.get(1));

        //operation 2:update
        customerList.add(4,new Customer(104,"shiva"));
        customerList.add(2,new Customer(105,"hari"));
        System.out.println(customerList);
        System.out.println("Size after update: " +customerList.size());

        //operation 3: Remove
        customerList.remove(3);
        System.out.println(customerList);
        System.out.println("Size after removal: " +customerList.size());


    }
}
