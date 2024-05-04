package bank.management;

import bank.Bank;
import bank.accounts.Account;
import bank.customer.ICustomer;

import java.util.Scanner;

public class TransactionManagement {


    public TransactionManagement() {
    }

    /**
     * Metoda za ostavljanje novca
     *
     * @param bank
     * @return
     */
    public static boolean deposit(Bank bank) {
        Scanner scan = new Scanner(System.in);
        if (bank.getAccounts().isEmpty()) {
            System.out.println("There is no any account created yet.");
            return false;
        }

        System.out.println("Enter amount:");
        double amount = Double.valueOf(scan.nextLine());

        System.out.println("Enter account number:");
        String accNumber = scan.nextLine();
        Account account = bank.getAccountByNumber(accNumber);

        while (account == null) {
            System.out.println("Invalid account number. Please enter a valid account number:");
            accNumber = scan.nextLine();
            account = bank.getAccountByNumber(accNumber);
        }

        account.depositMoney(amount);

        System.out.println("Deposit successful");
        return true;
    }

    /**
     * Metoda za podizanje novca
     *
     * @param bank
     * @return
     */
    public static boolean withdraw(Bank bank) {
        Scanner scan = new Scanner(System.in);
        if (bank.getAccounts().isEmpty()) {
            System.out.println("There is no any account created yet.");
            return false;
        }

        System.out.println("Enter amount:");
        double amount = Double.valueOf(scan.nextLine());

        System.out.println("Enter account number:");
        String accNumber = scan.nextLine();
        Account account = bank.getAccountByNumber(accNumber);

        while (account == null) {
            System.out.println("Invalid account number. Please enter a valid account number:");
            accNumber = scan.nextLine();
            account = bank.getAccountByNumber(accNumber);
        }

        try {
            account.withdrawMoney(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Withdraw successful");

        return true;
    }
}
