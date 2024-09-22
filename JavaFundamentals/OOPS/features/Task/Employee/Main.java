package com.JavaFundamentals.OOPS.features.Task.Employee;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("narasimha",(double)65000,(double)15 );
        Developer developer = new Developer("Sai",(double) 38000,6500);

        manager.calculateBonus();
        manager.displayInfo();

        developer.calculateBonus();
        developer.displayInfo();
    }
}
