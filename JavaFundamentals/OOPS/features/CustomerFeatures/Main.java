package com.JavaFundamentals.OOPS.features.CustomerFeatures;



public class Main {
    public static void main(String[] args) {
        //no arg Constructor
        RegularCustomer regularCustomer = new RegularCustomer();
        regularCustomer.displayCustomerDetails();
        // args Constructor
        RegularCustomer regularCustomer1 = new RegularCustomer("342424","eddadf@ug.com",(byte) 45,(double) 2500,"narsu",4589,5);
        regularCustomer1.displayCustomerDetails();


        //no arg Constructor
        PremiumCustomer premiumCustomer1 = new PremiumCustomer();
        premiumCustomer1.displayCustomerDetails();

        // args Constructor
        PremiumCustomer premiumCustomer = new PremiumCustomer("4589","edd458@fefom.vom",(byte) 85,(double) 24850,"hhrww",78489,"gold");
        premiumCustomer.displayCustomerDetails();

        //overloading
        CustomerServices customerServices = new CustomerServices();
        customerServices.displayCustomerDetails(premiumCustomer);

    }
}
