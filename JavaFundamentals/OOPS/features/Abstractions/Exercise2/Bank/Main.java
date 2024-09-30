package com.JavaFundamentals.OOPS.features.Abstractions.Exercise2.Bank;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        savingAccount.deposit(5000);
        savingAccount.withdraw(250);

    }
}
