package com.JavaFundamentals.Streams.Exercise.Customer;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();
        CustomerServices customerServices = new CustomerServices(customerRepository);


        customerServices.getCustomerList().forEach(System.out::println);
        System.out.println("************Filter By older By Age*********");
        customerServices.getCustomerByAge((byte) 19).forEach(System.out::println);
        System.out.println("*******************");
        System.out.println("Customers Names:");
        customerServices.getCustomerNames().forEach(System.out::println);
        System.out.println("****************");
        System.out.println("SortedByCustomerAge");
        customerServices.getSortedCustomerByAge().forEach(System.out::println);
        System.out.println("****************");
        System.out.println("Sum of the ages  ");
        System.out.println(customerServices.getSumOfAges());
        System.out.println("return the names in list");
        System.out.println(customerServices.customerNamesInList());
        System.out.println("joining the names by combing by ,");
        System.out.println(customerServices.customerNameJoined());
        System.out.println("group the customers by cities using Map fun");
        System.out.println(customerServices.groupByCities());
        System.out.println("partitioning the customer by cities using Map fun");
        System.out.println(customerServices.partitionedByAge());

    }
}
