package com.JavaFundamentals.OOPS.Constructor.Task.BankAccount;

public class BankAccount {
    // instance Variables
    String accountNumber;
    double balance;
    String bankBranch;

    // static Variables
    static String bankName = "star bank";

    //parameterized Constructor
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        displayDetails();
    }
    //default Constructor
    public BankAccount(){
        accountNumber="Unknown";
        balance = 0.0;
        displayDetails();
    }
    public static String getBankName(){

        return bankName;
    }
    //display method
    void displayDetails(){
        System.out.println("Bank Account number: "+accountNumber);
        System.out.println("Account balance: "+balance);
        System.out.println("Bank name:"+BankAccount.getBankName());

    }

}
