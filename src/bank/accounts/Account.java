package bank.accounts;

import bank.exceptions.MaxWidException;
import bank.exceptions.MinWidException;
import bank.enums.Currency;

public abstract class Account {

	private String accountNumber;
	private Currency currency;
	private double balance;
	protected double minWithdrawal;
	protected double maxWithdrawal;
	// mogu da budu private

	public Account() {
		super();
	}

	public Account(String accountNumber, Currency currency, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.currency = currency;
		this.balance = balance;
	}
	public Account(Account ac) {
		this.accountNumber = ac.accountNumber;
		this.currency = ac.currency;
		this.balance = ac.balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Metoda za ostavljanje novca
	 * @param amount
	 */
	public void depositMoney(double amount) {
		this.balance += amount;
	}

	/**
	 * Metoda za postavljanje min i max moguceg novca za podizanje sa racuna
	 * @param minWithdrawal
	 * @param maxWithdrawal
	 */
	 abstract void setWithdrawalLimit(double minWithdrawal, double maxWithdrawal); // potpuno abstractna klasa

	/**
	 * Metoda za podizanje novca
	 * @param amount
	 * @throws Exception
	 */
	public void withdrawMoney(double amount) throws MinWidException, MaxWidException,IllegalArgumentException {
		if (amount < minWithdrawal)
			throw new MinWidException("Minimum withdrawal amount is " + minWithdrawal + " " + currency.toString());
		if (amount > maxWithdrawal)
			throw new MaxWidException("Maximum withdrawal amount is " + maxWithdrawal + " " + currency.toString());
		if (balance - amount < 0)
			throw new IllegalArgumentException("You don't have enough money on your account!");

		balance -= amount;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", currency=" + currency + ", balance=" + balance + "]";
	}
}
