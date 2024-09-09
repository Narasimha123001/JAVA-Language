package com.JavaFundamentals.OOPS.Constructor.Exercise;

public class CustomerMain {
    public static void main(String[] args) {
        CustomerDetails customerDetails = new CustomerDetails();
        System.out.println("with out args");
        customerDetails.displayCustomerDetails();


        System.out.println("with args");
        CustomerDetails customerDetails1 = new CustomerDetails(3333,"swebue",(byte)55,"yuyvc7asg@hava.coom","5992694");
        customerDetails1.displayCustomerDetails();


    }
}
