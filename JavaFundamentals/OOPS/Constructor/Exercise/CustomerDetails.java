package com.JavaFundamentals.OOPS.Constructor.Exercise;


public class CustomerDetails {
    int CustomerId;
    public String CustomerName;
    byte Age;
    String Email;
    String PhoNo;
    final static String VENDOR_NAME ="Vikas";
    final static String VENDOR_Pho ="+916985885554"; // static member

    // default Constructor; no args
    public CustomerDetails() {
        System.out.println("Customer constructor is called");
        CustomerId = 1001;
        CustomerName = "svvi";
        Age=32;
        Email="anfiahf@nishe.com";
        PhoNo="6843446468";
        displayCustomerDetails();
        configruation();// we can apply logics in the Constructor only
        // when we want any logic to work on calling the object .by performing this, we can write that logic in the constructor
        //then it will Work.
    }

    private void configruation() {

        System.out.println("Any thing we can create");
    }

    //args constructor;

    public CustomerDetails(int customerId, String customerName, byte age, String email, String phoNo) {
        CustomerId = customerId;
        CustomerName = customerName;
        Age = age;
        Email = email;
        PhoNo = phoNo;
    }

    public void displayCustomerDetails(){
       System.out.println("Customer Id:" + CustomerId);
        System.out.println("Customer Name:" + CustomerName);
        System.out.println("Age: "+Age);
        System.out.println("Membership: "+Email);
        System.out.println("Phone no: "+PhoNo);
         // we can use static member
        CustomerDetails.displayVenderDetails(); //DISPLAY STATIC METHODS 
    }
    //STATIC METHODS
    static  void displayVenderDetails(){
        System.out.println("VenderName : "+CustomerDetails.VENDOR_NAME);
        System.out.println("VenderPho : "+CustomerDetails.VENDOR_Pho);
    }


}
