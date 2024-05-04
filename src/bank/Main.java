package bank;

import java.util.Scanner;

import bank.management.*;

public class Main {

    private Bank bank = new Bank("Narodna Banka Srbije", "Beograd");

    public static void main(String[] args) {
        Main main = new Main();
        main.runApp();
    }

    private void runApp() {
        printHeader();
        while (true) {
            int choice = getInput();
            performAction(choice);
        }
    }

    private void printHeader() {
        System.out.println("----- WELCOME to Bank App ----");
    }

    private void printBankMenu() {
        System.out.println("1 - Create a new Account");
        System.out.println("2 - Create a new Customer");
        System.out.println("3 - Link Account to Customer");
        System.out.println("4 - Save bank data in a file");
        System.out.println("5 - Print all Current accounts");
        System.out.println("6 - Print all Savings accounts");
        System.out.println("7 - Deposit to an Account");
        System.out.println("8 - Withdraw from Account");
        System.out.println("9- Read from Bank archive");
        System.out.println("0 - Exit");
        System.out.println();
    }

    private int getInput() {
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Please make a selection: ");
            printBankMenu();
            try {
                choice = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection, please enter numbers only!");
            }

            if (choice < 0 || choice > 9) {
                System.out.println("Selection is outside of range. Please choose again!");
            }
        } while (choice < 0 || choice > 9);

        return choice;
    }

    private void performAction(int choice) {

        switch (choice) {
            case 0:
                System.out.println("Thank you for using our bank app!");
                System.exit(0);
                break;
            case 1:
                AccountManagement.createAccount(bank);
                break;
            case 2:
                CustomerManagement.createCustomer(bank);
                break;
            case 3:
                LinkManagement.linkAcc(bank);
                break;
            case 4:
                FileManagement.saveToFile(bank);
                break;
            case 5:
                BankPrinter.printAllCurrentAccounts(bank);
                break;
            case 6:
                BankPrinter.printAllSavingsAccounts(bank);
                break;
            case 7:
                TransactionManagement.deposit(bank);
                break;
            case 8:
                TransactionManagement.withdraw(bank);
                break;
            case 9:
                FileManagement.readFromFile();
        }
    }
}

