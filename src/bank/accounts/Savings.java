package bank.accounts;

import bank.enums.Currency;

public class Savings extends Account {

	public Savings() {
	}
	
	// initialize MinBalance and WithdrawalLimit limit when Account is created
	public Savings(String accountNumber, Currency currency, double balance) {
		super(accountNumber, currency, balance);
		setWithdrawalLimit(500,20000);
	}
	
	@Override
	void setWithdrawalLimit(double minWithdrawal, double maxWithdrawal) {
		this.minWithdrawal = minWithdrawal;
		this.maxWithdrawal = maxWithdrawal;
	}

	@Override
	public String toString() {
		return "Savings{}";
	}
}
