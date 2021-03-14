package com.codingdojo.java.bankaccount;

public class BankAccountTest {
    public static void main (String[] args) {
        //Create 3 new accounts with amount in their checking and saving accounts:
        BankAccount Bob = new BankAccount(12.32, 44.55);
        BankAccount Ali = new BankAccount(2000, 5000);
        BankAccount Megan = new BankAccount(400, 1500);

        //Account balance of each account:
        Bob.accountBalance();
        Ali.accountBalance();
        Megan.accountBalance();
        System.out.println();

        //Total number of accounts in the bank:
        System.out.println("Bank total number of customers: " + BankAccount.accountsCount());
        System.out.println();


        //Do some transactions:
        Bob.deposit(500, "checking");
        Ali.withdraw(350.73, "saving");
        Megan.withdraw(405.13, "checking");
        System.out.println();


        //Account balance of each account after transactions are made:
        Bob.accountBalance();
        Ali.accountBalance();
        Megan.accountBalance();
        System.out.println();

        //Total amount stored in the bank balance:
        System.out.println("Amount in bank's balance is: $" + BankAccount.amountStoredCount());
    }
}