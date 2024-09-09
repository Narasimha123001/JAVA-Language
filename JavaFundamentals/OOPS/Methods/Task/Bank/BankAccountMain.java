package com.JavaFundamentals.OOPS.Methods.Task.Bank;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount();

        obj1.accountNumber="12569875";
        obj1.accountHolderName="Shiva";
        obj1.accountBalance =250000;
        obj1.depositAmount(2500);
        obj1.withdrawAmount(1000);
        obj1.displayAccountDetails();

    }
}
