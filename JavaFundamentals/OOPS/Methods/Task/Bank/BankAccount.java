package com.JavaFundamentals.OOPS.Methods.Task.Bank;

public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double accountBalance;

    double depositAmount(double deposit){
         accountBalance += deposit;
        //System.out.println(accountBalance);
        return  accountBalance;
    }

    double withdrawAmount(double withDraw){
        accountBalance -= withDraw;
        //System.out.println(accountBalance);
        return accountBalance;
    }

    void displayAccountDetails(){
        System.out.println("BankAccount Number: "+accountNumber);
        System.out.println("BankAccount Name: "+accountHolderName);
        System.out.println("Account Balance: "+accountBalance);

    }

}
