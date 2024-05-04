package bank.management;

import bank.Bank;
import bank.accounts.Account;


public class BankPrinter {

    public BankPrinter() {
    }

    /**
     * Metoda za stampanje svih Current naloga
     * @param bank
     * @return
     */
    public static boolean printAllCurrentAccounts(Bank bank) {
        if (bank.getAllCurrentAccounts().isEmpty()) {
            System.out.println("There is no any Current account created yet.");
            return false;
        }

        for (Account acc : bank.getAllCurrentAccounts()) {
            System.out.println(acc);
        }

        return true;
    }

    /**
     * Metoda za stampanje svih Saving naloga
     * @param bank
     * @return
     */
    public static boolean printAllSavingsAccounts(Bank bank) {
        if (bank.getAllSavingsAccounts().isEmpty()) {
            System.out.println("There is no any Savings account created yet.");
            return false;
        }

        for (Account acc : bank.getAllSavingsAccounts()) {
            System.out.println(acc);
        }

        return true;
    }
}
