package com.oop.bank;

public class CurrentAccount extends Account{

    private double overdraftLimit = 200;

    public CurrentAccount(String accountNumber, String owner){

        //Le mot clé super fait référence au contructeur de la classe Account
        super(accountNumber,owner);
    }

    public CurrentAccount(String accountNumber, String owner, double overdraftLimit){
        super(accountNumber, owner);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }

    // Pour que nous puissions avoir les détails en plus pour chaque type de compte on utilisera la méthode suivante
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The overdraft limit is: "+ overdraftLimit);
    }

    @Override
    public void withdraw(double amount){
        if(amount < getBalance() + overdraftLimit){
            setBalance(getBalance()-amount);
        }else System.err.println("Insufficient funds !");
    }
}
