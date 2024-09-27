package com.JavaFundamentals.OOPS.features.Abstractions;

public class Customer {
    int CustomerId;
    String CustomerName;
    double ProductPrize;
    byte Age;
    String Email;
    String PhoNo;

    //default or no arg constructor
    public  Customer() {

        System.out.println("default Constructor is called......");
    }

    // arg constructor
    public Customer(String phoNo, String email, byte age, double productPrize, String customerName, int customerId) {

        PhoNo = phoNo;
        Email = email;
        Age = age;
        ProductPrize = productPrize;
        CustomerName = customerName;
        CustomerId = customerId;
    }


}
