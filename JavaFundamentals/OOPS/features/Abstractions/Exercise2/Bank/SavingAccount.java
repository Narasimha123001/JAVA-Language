package com.JavaFundamentals.OOPS.features.Abstractions.Exercise2.Bank;

public class SavingAccount extends Account {

    private double balance;

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance :"+balance);
    }

    @Override
    void withdraw(double amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdraw Amount :"+amount);
        }else{
            System.out.println("Insufficient balance");
        }
        super.displayBalance(balance);
    }
}
