package com.JavaFundamentals.collections.Exercise.LIST;

import java.util.LinkedList;
import java.util.List;

public class LinkList {
    public static void main(String[] args) {
        List<Customer> customerLinkedList = new LinkedList<>();
        customerLinkedList.add(new Customer(101,"nani"));
        customerLinkedList.add(new Customer(102,"sai"));
        customerLinkedList.add(new Customer(103,"ravi"));
        customerLinkedList.add(new Customer(103,"ravi"));

        System.out.println(customerLinkedList);
        System.out.println("size: "+customerLinkedList.size());

        //operation 1: Add to the beginning
        customerLinkedList.add(0,new Customer(100,"Narasimhan"));
        System.out.println(customerLinkedList);
        System.out.println("size: "+customerLinkedList.size());

        //operation 2: retrieve the first customer
        System.out.println("Fist Customer :"+ customerLinkedList.get(0));


        
        //operation 3: remove the  element
        System.out.println("After removal");
        customerLinkedList.remove(2);
        System.out.println(customerLinkedList);
        System.out.println("size :"+customerLinkedList.size());
    }
}
