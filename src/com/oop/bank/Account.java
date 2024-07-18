package com.oop.bank;

public abstract class Account {

    private String accountNumber;
    private String owner;
    private double balance = 0.0; //Avec une balance à 0 comme ça toute personne créant son compte bancaire sera à 0 par défaut

    protected Account(String accountNumber, String owner, double balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    // Overloading de la fonction Account tout juste en haut pour passer une paramètre par défaut

    protected Account(String accountNumber, String owner){
        this.accountNumber = accountNumber;
        this.owner = owner;
    }

    // Créons une méthode pour facilier l'affichage des information sans surcharger le Main

    public void displayInfo(){
        System.out.println("Your account number is: "+ accountNumber);
        System.out.println("The owner is: "+ owner);
        System.out.println("Your balance is: "+ balance);
    }

    // Maintenant que les attributs sont sur private on utilisera la méthode suivante pour y accéder depuis notre classe main

    // Getter pour avoir accès aux attributs et le Setter pour avoir la possibilité de les modifier si besoin

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){

        balance+= amount;

    }
    // Vu qu'on a plus besoin d'instancier la classe Account la version de la méthode ci-dessous ne sera jamais utilisée, on la rendra alors abstraite
    public abstract void withdraw(double amount)/*{
        if (amount < balance){
            balance -=amount;
        }else System.err.println("Insufficient funds !");
    }*/;
}
