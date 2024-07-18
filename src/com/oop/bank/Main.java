package com.oop.bank;


public class Main {
    public static void main(String[] args) {

        // En vrai nous avons deuwx types de compte épargne et courant donc nous n'avons plus besoin de l'objet account et la classe Account passe en abstraite.

        /*Account account = new Account("12345.4321.6789", "John DOE");
        account.deposit(5000);
        account.withdraw(1250);
        account.displayInfo();*/

        CurrentAccount currentAccount = new CurrentAccount("2456.1234.3300","Duck JACKMAN");
        currentAccount.deposit(500);
        currentAccount.withdraw(600);
        currentAccount.displayInfo();

        SavingsAccount savingsAccount = new SavingsAccount("09876.12345.0000","Bojack HORSMAN");
        savingsAccount.deposit(400);
        savingsAccount.withdraw(270);
        savingsAccount.displayInfo();

    }
}