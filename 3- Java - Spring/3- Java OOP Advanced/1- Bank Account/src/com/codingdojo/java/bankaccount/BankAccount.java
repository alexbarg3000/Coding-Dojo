package com.codingdojo.java.bankaccount;

import java.util.Random;


public class BankAccount {
    // Set human's default attributes:
    private String accountNumber;
    private Double checkingBalance;
    private Double savingsBalance;
    private static int numberOfAccounts = 0;
    private static int totalAmountStored = 0;
    private static Random random = new Random();


    //Empty constructor
    public BankAccount() {
        this.accountNumber = BankAccount.randomNumberGenerator();
        this.checkingBalance = 0.00;
        this.savingsBalance = 0.00;
        numberOfAccounts += 1;
        System.out.println("New user created with account number: " + accountNumber + ".");
        System.out.println("Total accounts created: " + numberOfAccounts + ".");
    }


    public BankAccount(double checkingBalance, double savingBalance) {
        this.accountNumber = BankAccount.randomNumberGenerator();
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingBalance;
        numberOfAccounts += 1;
        totalAmountStored += (this.checkingBalance + this.savingsBalance);
        System.out.println("New user created with account number: " + accountNumber + ".");
        System.out.println("Total accounts created: " + numberOfAccounts + ".");
        System.out.println("Total amount stored: " + totalAmountStored + ".");
    }

    //static methods

    public static int accountsCount() {
        return numberOfAccounts;
    }

    public static int amountStoredCount() {
        return totalAmountStored;
    }

    //New account random number generator
    private static String randomNumberGenerator() {
        return Integer.toString(random.nextInt((1000000000) + 1000000000));
    }

    //getters and setter

    public Double getCheckingBalance() {
        return checkingBalance;
    }

    public Double getSavingsBalance() {
        return savingsBalance;
    }

    public void setCheckingBalance(Double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public void setSavingsBalance(Double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    //Method that will allow a user to deposit money into either the checking or saving,
    //and add to total amount stored.

    public void deposit(double depositAmount, String accountType) {
        if (accountType == "checkingBalance") {
            this.checkingBalance += depositAmount;
            totalAmountStored += depositAmount;
            System.out.println("$" + depositAmount + " was deposited into your checkings account #" + this.accountNumber);
        } else if (accountType == "savingBalance") {
            this.savingsBalance += depositAmount;
            totalAmountStored += depositAmount;
            System.out.println("$" + depositAmount + " was deposited into your savings account #" + this.accountNumber);

        }
    }

    public void withdraw(double withdrawAmount, String accountType) {
        if (accountType == "checkingBalance") {
            if (withdrawAmount <= checkingBalance) {
                this.checkingBalance -= withdrawAmount;
                totalAmountStored -= withdrawAmount;
                System.out.println("$" + withdrawAmount + " was withdrawn from your checking account #" + this.accountNumber);
            }
            else {
                System.out.println("Oh dear, your checking account has not enough funds to proceed :(");
                System.out.println("Your checking account balance is: $" + this.getCheckingBalance());
            }
        }
        else if (accountType == "savingBalance") {
            if (withdrawAmount <= this.savingsBalance) {
                this.savingsBalance -= withdrawAmount;
                totalAmountStored -= withdrawAmount;
                System.out.println("$" + withdrawAmount + " was withdrawn from your saving account #" + this.accountNumber);
            }
            else {
                System.out.println("Oh dear, your saving account has not enough funds to proceed :(");
                System.out.println("Your saving account balance is: $" + this.getSavingsBalance());
            }
        }
        else {
            System.out.println ("Are you sure you are not giving me a bulls**t?!?!");
        }

    }

    //Total account balance in the bank:
    public void accountBalance() {
        System.out.println("Total balance is: $" + (this.getCheckingBalance() + this.getSavingsBalance()));
    }
}
