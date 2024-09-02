package com.JavaFundamentals.Day2CoditionalStatement.Exercise;

public class SwitchCondition {
    /*
    brand:iQoo,Apple,Nokia.
    Membership:Diamond,Gold,Silver,Bronze.
     */
    public static void main(String[] args) {
        String Brand;
        Brand = "Samsung";
        int ProductPrize;
        ProductPrize = 300000;
        int finalPrize;
        int ProductDiscount;
        char Membership = 'D'; // D for Diamond, G for Gold, S for Silver
        int Discount;
        ProductDiscount = 1;

        switch (Brand) {
            case "Apple":
                if (Membership == 'D') {
                    ProductDiscount = 20;
                } else if (Membership == 'G') {
                    ProductDiscount = 15;
                } else if (Membership == 'S') {
                    ProductDiscount = 10;
                } else {
                    ProductDiscount = 5;
                }
                break;
            case "Samsung":
                if (Membership == 'D') {
                    ProductDiscount = 30;
                } else if (Membership == 'G') {
                    ProductDiscount = 55;
                } else if (Membership == 'S') {
                    ProductDiscount = 12;
                } else {
                    ProductDiscount = 25;
                }
                break;  // Added break statement here to avoid falling through to default case
            default:
                ProductDiscount = 5;
                break;
        }

        Discount = ProductPrize * ProductDiscount / 100;
        finalPrize = ProductPrize - Discount;

        System.out.println("Brand: " + Brand);
        System.out.println("ProductDiscount: " + ProductDiscount);
        System.out.println("Discount: " + Discount);
        System.out.println("FinalPrize: " + finalPrize);
    }
}
