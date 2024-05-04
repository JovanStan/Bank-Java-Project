package bank;

import java.util.ArrayList;
import java.util.List;

import bank.accounts.Account;
import bank.accounts.Current;
import bank.accounts.Savings;
import bank.customer.ICustomer;

public class Bank implements IBank {

	private String name;
	private String address;
	private List<ICustomer> customers = new ArrayList<>();
	private List<Account> accounts = new ArrayList<>();

	public Bank() {

	}

	public Bank(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Bank(Bank bank) {
		this.name = bank.getName();
		this.address = bank.getAddress();
		this.customers = bank.getCustomers();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<ICustomer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<ICustomer> customers) {
		this.customers = customers;
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	/**
	 * Metoda za dodavanje korisnika u baknu
	 * @param customer
	 */
	@Override
	public void addCustomer(ICustomer customer) {
		getCustomers().add(customer);
	}

	/**
	 * Metoda za dodavanje naloga u banku
	 * @param account
	 */
	@Override
	public void addAccount(Account account) {
		getAccounts().add(account);
	}

	/**
	 * Metoda za nalazenje naloga preko broja
	 * @param accNumber
	 * @return
	 */
	@Override
	public Account getAccountByNumber(String accNumber) {
		for (Account account : accounts) {
			if (account.getAccountNumber().equals(accNumber)) {
				return account;
			}
		}
		return null;
	}

	/**
	 * Metoda za nalazenje korisinka preko jmbg
	 * @param personalId
	 * @return
	 */
	@Override
	public ICustomer getCustomerById(String personalId) {
		for (ICustomer customer : customers) {
			if (customer.getPersonalIdNumber().equals(personalId)) {
				return customer;
			}
		}
		return null;
	}

	/**
	 * Metoda za nalazene svih Current naloga
	 * @return
	 */
	@Override
	public List<Account> getAllCurrentAccounts() {
		List<Account> currentAccounts = new ArrayList<Account>();
		for (Account account : accounts) {
			if (account instanceof Current) {
				currentAccounts.add(account);
			}
		}
		
		return currentAccounts;
	}

	/**
	 * Metoda za nalazenje svih Saving naloga
	 * @return
	 */
	@Override
	public List<Account> getAllSavingsAccounts() {
		List<Account> savingAccounts = new ArrayList<Account>();
		for (Account account : accounts) {
			if (account instanceof Savings) {
				savingAccounts.add(account);
			}
		}
		
		return savingAccounts;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", address=" + address + ", customers=" + customers + "]";
	}

	

}
