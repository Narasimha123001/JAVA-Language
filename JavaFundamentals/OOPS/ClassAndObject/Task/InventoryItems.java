package com.JavaFundamentals.OOPS.ClassAndObject.Task;

public class InventoryItems {
    String ItemName;
    byte ItemCode;
    int QuantityInStock;
    String ExpDate;

    public static void main(String[] args) {
        InventoryItems obj1 = new InventoryItems();
        InventoryItems obj2 = new InventoryItems();

        obj1.ItemCode= 100;
        obj1.ItemName="maggie";
        obj1.QuantityInStock= 25000;
        obj1.ExpDate = "31/10/2024";
        obj2.ItemCode=22;
        obj2.ItemName="beer";
        obj2.QuantityInStock=30000;
        obj2.ExpDate="30/02/2026";

        System.out.println(obj1.ItemCode);
        System.out.println(obj1.ItemName);
        System.out.println(obj1.QuantityInStock);
        System.out.println(obj1.ExpDate);

        System.out.println(obj1.ItemCode);
        System.out.println(obj1.ItemName);
        System.out.println(obj1.QuantityInStock);
        System.out.println(obj1.ExpDate);
    }

}
