package bank.management;

import bank.Bank;
import bank.accounts.Account;
import bank.accounts.Current;
import bank.accounts.Savings;
import bank.enums.Currency;

import java.util.Scanner;

public class AccountManagement {



    public AccountManagement() {
    }

    /**
     * Metoda za pravljenje naloga
     * @param bank
     * @return
     */
    public static boolean createAccount(Bank bank) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account number:");
        String accNum = scan.nextLine();
        System.out.println("Enter account curency (RSD or EUR):");
        String ccy = scan.nextLine();
            while (!ccy.equalsIgnoreCase("RSD") && !ccy.equalsIgnoreCase("EUR")) {
            System.out.println("Enter account curency (RSD or EUR:");
            ccy = scan.nextLine();
        }

        System.out.println("Enter account type (C for Current or S for Saving):");
        String accType = scan.nextLine();
        while (!accType.equalsIgnoreCase("C") && !accType.equalsIgnoreCase("S")) {
            System.out.println("Enter account type (C for Current or S for Saving):");
            accType = scan.nextLine();
        }

        Account account;
        if (accType.equalsIgnoreCase("C")) {
           account = new Current(accNum, Currency.valueOf(ccy.toUpperCase()), 0); // create Currency enum from String
        } else {
           account = new Savings(accNum, Currency.valueOf(ccy.toUpperCase()), 0); // create Currency enum from String
        }

        bank.addAccount(account);
        System.out.println("New Account is created");
        return true;
    }

}
