package bank.management;

import bank.Bank;
import bank.accounts.Account;
import bank.customer.ICustomer;

import java.util.Scanner;

public class LinkManagement {


    public LinkManagement() {
    }

    /**
     * Metoda za povezivanje account-a sa customer-om
     * @param bank
     * @return
     */
    public static boolean linkAcc(Bank bank) {
        Scanner scan = new Scanner(System.in);
        if (bank.getAccounts().isEmpty()) {
            System.out.println("There is no any account created yet. Pelase create account before you link it to a Customer");
            return false;
        }

        if (bank.getCustomers().isEmpty()) {
            System.out.println("There is no any customer created yet. Pelase create customer before you link it to an Account.");
            return false;
        }

        System.out.println("Enter customer personal id:");
        String customerId = scan.nextLine();
        ICustomer customer = bank.getCustomerById(customerId);
        while (customer == null) {
            System.out.println("Invalid customer id. Please enter a valid customer personal id:");
            customerId = scan.nextLine();
            customer = bank.getCustomerById(customerId);
        }

        System.out.println("Enter account number:");
        String accNumber = scan.nextLine();
        Account account = bank.getAccountByNumber(accNumber);

        while (account == null) {
            System.out.println("Invalid account number. Please enter a valid account number:");
            accNumber = scan.nextLine();
            account = bank.getAccountByNumber(accNumber);
        }

        customer.addAccount(account);

        return true;
    }
}
