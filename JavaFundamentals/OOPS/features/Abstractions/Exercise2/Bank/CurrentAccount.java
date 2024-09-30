package com.JavaFundamentals.OOPS.features.Abstractions.Exercise2.Bank;

public class CurrentAccount extends  Account{

    private double balance;

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Current Account Balance :"+balance);
    }

    @Override
    void withdraw(double amount) {
        if(balance >= amount ){
            balance -= amount;
            System.out.println("withdraw Amount :" +amount);
        }else{
            System.out.println("Insufficient Limit");
        }
    }
}
