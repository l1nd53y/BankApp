package com.example.bank_app;

public class BankAccount {
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;
    private final double checkingOpeningDeposit;
    private final double savingsOpeningDeposit;
}

public BankAccount (double checkingOpeningDeposit, double savingsOpeningDeposit) {
    this.checkingOpeningDeposit = checkingOpeningDeposit;
    this.savingsOpeningDeposit = savingsOpeningDeposit;
}

    public double getCheckingBalance() {
        System.out.println("Your checking balance is " + checkingOpeningDeposit+".");
    }

    public double getSavingsBalance() {
        System.out.println("Your savings balance is " + savingsOpeningDeposit+".");
    }
}