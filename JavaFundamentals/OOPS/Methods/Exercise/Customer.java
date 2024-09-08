package com.JavaFundamentals.OOPS.Methods.Exercise;

public class Customer {
    int CustomerId;
    String CustomerName;
    double ProductPrize;
    byte Age;
    String Email;
    String PhoNo;

  
    /*
        method 1 no returnType and No parameters
         */
    void displayCustomerDetails(){
        System.out.println("Customer Id:" + CustomerId);
        System.out.println("Customer Name:" + CustomerName);
        System.out.println("Age: "+Age);
        System.out.println("Membership: "+Email);
        System.out.println("Phone no: "+PhoNo);
    }
    /*
    method 2: with return type and no parameter
     */
    byte discountOnCustomerAge(){
        byte discountPercentage = 0;
        if (Age <= 65 && 60 <= Age){
            discountPercentage = 35;
        } else if (Age <= 59 && 50 <= Age) {
            discountPercentage = 25;
        } else if (Age <= 49 && 40 <= Age) {
            discountPercentage = 15;
        } else if (Age <= 39 && 30 <= Age) {
            discountPercentage = 10;
        }else {
            discountPercentage = 3;
        }
        return discountPercentage;
    }
    /*
    method 3: No return type and with parameter
     */
    void displayProductBasedOnMembership(String Membership){
        System.out.println("Membership of the Customer: " +Membership+ " Memberships");
    }

    /*
    method 4: returnType and parameters

    finalPrize of product
    AfterDiscount the prize of project
    print the finalPrize
     */
    double finalPrizeAfterDiscount(double ProductPrize){
        byte productDiscount = discountOnCustomerAge();
        return ProductPrize - (ProductPrize*productDiscount)/100;

    }

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        customer1.CustomerId = 59865;
        customer1.CustomerName = "Shiva";
        customer1.Age=56;
        customer1.PhoNo="56987452";
        customer1.Email="noehuwb@orgog.com";
        customer1.ProductPrize =25000;

        customer2.CustomerId = 65696;
        customer2.CustomerName = "Vamsi";
        customer2.Age=64;
        customer2.PhoNo="659635982";
        customer2.Email="gewdfssb@orgog.com";
        customer2.ProductPrize=65000;


        customer1.displayCustomerDetails();
        customer1.displayProductBasedOnMembership("Gold");
        System.out.println("The customer "+customer1.CustomerName+" have the "+customer1.discountOnCustomerAge()+" % Discount on this product");
        System.out.println("The final Prize of product after the discount "+customer1.finalPrizeAfterDiscount(customer1.ProductPrize));

        customer2.displayCustomerDetails();
        customer2.displayProductBasedOnMembership("Gold");
        System.out.println("The customer "+customer2.CustomerName+" have the "+customer1.discountOnCustomerAge()+" % Discount on this product");
        System.out.println("The final Prize of product after the discount "+customer1.finalPrizeAfterDiscount(customer2.ProductPrize));
    }
}
