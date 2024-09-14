package com.JavaFundamentals.OOPS.features.CustomerFeatures;

public class PremiumCustomer extends Customers {

    String MemberShip ;

    //no args
    public PremiumCustomer() {
        System.out.println("MembershipCustomer is called...");
    }
    // display method
    void displayCustomerDetails(){
        super.displayCustomerDetails();
        System.out.println("Membership of Customer : "+MemberShip);
    }
    // args constructor
    public PremiumCustomer(String phoNo, String email, byte age, double productPrize, String customerName, int customerId, String memberShip) {
        super(phoNo, email, age, productPrize, customerName, customerId);
        MemberShip = memberShip;
    }
}
