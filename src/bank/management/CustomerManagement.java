package bank.management;

import bank.Bank;
import bank.accounts.Account;
import bank.customer.Customer;
import bank.customer.ICustomer;

import java.util.Scanner;

public class CustomerManagement {


    public CustomerManagement() {
    }

    /**
     * Metoda za prijavljivanje u banku
     * @param bank
     * @return
     */
    public static boolean createCustomer(Bank bank) {
        Scanner scan = new Scanner(System.in);
        if (bank.getAccounts().isEmpty()) {
            System.out.println("There is no any account created yet. Pelase create account before you add a new Customer.");
            return false;
        }

        System.out.println("Enter name:");
        String name = scan.nextLine();
        System.out.println("Enter last name:");
        String lastName = scan.nextLine();
        System.out.println("Enter address:");
        String address = scan.nextLine();
        System.out.println("Enter personal id:");
        String id = scan.nextLine();

        // ogranicava da koristis samo metode iz interfejsa
        ICustomer customer = new Customer(name, lastName, address, id);
        bank.addCustomer(customer);

        System.out.println("New Customer is created");

        return true;
    }

}
