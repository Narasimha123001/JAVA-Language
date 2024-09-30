package com.JavaFundamentals.OOPS.features.Abstractions.Exercise2.Bank;

public abstract class Account {

    abstract void deposit(double amount);
    abstract  void withdraw(double amount);


    void displayBalance(double balance){
        System.out.println("Current Balance: " +balance);
    }
}
