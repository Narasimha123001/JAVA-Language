package com.JavaFundamentals.OOPS.features.Exercise.Hiechericallnheritance;

public class Main {
    public static void main(String[] args) {
        Product product = new Laptop();
        Product product1 = new Iphone();


        product.displayInfo();
        product1.displayInfo();
    }
}
