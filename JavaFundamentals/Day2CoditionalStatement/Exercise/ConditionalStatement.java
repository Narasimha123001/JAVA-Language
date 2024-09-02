package com.JavaFundamentals.Day2CoditionalStatement.Exercise;

import java.sql.SQLOutput;

public class ConditionalStatement {
    /*
    discount for customers based on membership type
    diamond -20
    gold-15
    silver-10
    normal -5
     */
    public static void main(String[] args) {
        int ProductPrize;
        ProductPrize = 300000;
        int Discount;
        int ProductDiscount;
        char Membership;
        int FinalPrize;
        Membership = 'D';
        if (Membership == 'D'){
            ProductDiscount =20;
        } else if(Membership == 'G'){
            ProductDiscount = 15;
        } else if(Membership == 'S'){
            ProductDiscount = 10;
        } else {
            ProductDiscount = 5;
        }
        Discount = ProductPrize * ProductDiscount / 100;
        FinalPrize = ProductPrize - Discount;
        System.out.println("Discount: $" +Discount);
        System.out.println("Final Prize: $" +FinalPrize);

    }
}
