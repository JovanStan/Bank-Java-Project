package bank.customer;

import java.util.ArrayList;
import java.util.List;

import bank.accounts.Account;

public class Customer implements ICustomer {

	private String name;
	private String lastName;
	private String address;
	private String personalIdNumber;
	private List<Account> accounts = new ArrayList<>();

	public Customer() {
		super();
	}

	public Customer(String name, String lastName, String address, String personalIdNumber) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.personalIdNumber = personalIdNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public void setPersonalIdNumber(String personalIdNumber) {
		this.personalIdNumber = personalIdNumber;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	/**
	 * Metoda da dodavanje naloga korisniku
	 * @param account
	 */
	@Override
	public void addAccount(Account account) {
		getAccounts().add(account);
	}

	/**
	 * Metoda za projnalazenje jmbg
	 * @return
	 */
	@Override
	public String getPersonalIdNumber() {
		return personalIdNumber;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", lastName=" + lastName + ", address=" + address
				+ ", personalIdNumber=" + personalIdNumber + ", accounts=" + accounts + "]";
	}

	
}
