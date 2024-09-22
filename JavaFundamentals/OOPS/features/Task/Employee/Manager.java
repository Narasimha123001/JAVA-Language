package com.JavaFundamentals.OOPS.features.Task.Employee;

public class Manager extends Employee{

    double bonusPercentage;

    public Manager(String name, double salary, double bonusPercentage) {
        super(name, salary);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    double calculateBonus() {
        return salary * bonusPercentage /100;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus percentage" + bonusPercentage +"%");
    }
}
