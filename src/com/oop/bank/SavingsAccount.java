package com.oop.bank;

public class SavingsAccount extends Account {

    private double interestRate = 0.8;

    public SavingsAccount(String accountNumber, String owner) {
        super(accountNumber, owner);
    }

    public SavingsAccount(String accountNumber, String owner, double interestRate) {
        super(accountNumber, owner);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The interest rate is: " + interestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < getBalance() + getBalance() * interestRate) {
            setBalance(getBalance() - amount);
        } else System.err.println("Insufficient funds !");
    }
}
