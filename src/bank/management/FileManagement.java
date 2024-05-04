package bank.management;

import bank.Bank;

import java.io.*;

public class FileManagement {

    private final static String FILE_NAME = "bank.txt";

    public FileManagement() {
    }

    /**
     * Metoda za upis u fajl
     *
     * @param bank
     */
    public static void saveToFile(Bank bank) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
            writer.write(bank.toString());
            writer.newLine();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Bank data saved");
    }

    /**
     * Metoda za citanje iz fajla
     * @param bank
     */
    public static void readFromFile() {
        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
