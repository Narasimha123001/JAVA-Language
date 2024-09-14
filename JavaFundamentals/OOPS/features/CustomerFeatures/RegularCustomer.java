package com.JavaFundamentals.OOPS.features.CustomerFeatures;

public class RegularCustomer extends Customers {

    int cashBackDetails ;

    // default
    public RegularCustomer() {
        System.out.println("RegularCustomer is called..");
    }
    //arg constructor
    public RegularCustomer(String phoNo, String email, byte age, double productPrize, String customerName, int customerId, int cashBackDetails) {
        super(phoNo, email, age, productPrize, customerName, customerId);
        this.cashBackDetails = cashBackDetails;
    }
    //display details
    void displayCustomerDetails(){
        super.displayCustomerDetails();         //when we use super keyword ,Calls the display method of Parent class  || otherwise no chance
        System.out.println("CashBackPoints: "+cashBackDetails);
    }
}
