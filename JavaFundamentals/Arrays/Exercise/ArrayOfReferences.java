package com.JavaFundamentals.Arrays.Exercise;


import com.JAVAFUNDAMENTALS.java.OOPS.Constructor.CustomerDetails;

public class ArrayOfReferences {
    public static void main(String[] args) {
        CustomerDetails[] customerDetails = {
                new CustomerDetails(), // default constructor
                new CustomerDetails(3333, "swebue", (byte) 55, "yuyvc7asg@hava.coom", "5992694"),//with args
                new CustomerDetails(444, "uyebue", (byte) 75, "tdyzgfxrhava.coom", "89654794")//with args
        };

        System.out.println(customerDetails.length);

        for (CustomerDetails customerDetails1 : customerDetails) {
            //
            customerDetails1.CustomerName = customerDetails1.CustomerName.toUpperCase();
            customerDetails1.displayCustomerDetails();
        }
    }
}

