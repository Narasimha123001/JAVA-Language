package com.JavaFundamentals.OOPS.features.CustomerFeatures;

public class Customers {

        int CustomerId;
        String CustomerName;
        double ProductPrize;
        byte Age;
        String Email;
        String PhoNo;

    //default or no arg constructor
    public Customers() {
        System.out.println("default Constructor is called......");
    }

    // arg constructor
    public Customers(String phoNo, String email, byte age, double productPrize, String customerName, int customerId) {
        System.out.println("Customer(String phoNo, String email, byte age, double productPrize, String customerName, int customerId) is called.... ");
        PhoNo = phoNo;
        Email = email;
        Age = age;
        ProductPrize = productPrize;
        CustomerName = customerName;
        CustomerId = customerId;
    }
    // display method
    void displayCustomerDetails(){
            System.out.println("Customer Id:" + CustomerId);
            System.out.println("Customer Name:" + CustomerName);
            System.out.println("Age: "+Age);
            System.out.println("Membership: "+Email);
            System.out.println("Phone no: "+PhoNo);
    }
}
