package com.JavaFundamentals.OOPS.features.Task.Employee;

public class Developer extends Employee {

    double fixedBonus;


    public Developer(String name, double salary, double fixedBonus) {
        super(name, salary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    double calculateBonus() {
        return fixedBonus;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fixed Bonus"+fixedBonus);
    }
}
