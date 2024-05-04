package bank.accounts;

import bank.enums.Currency;

public class Current extends Account {

	public Current() {
	}
	
	// initialize MinBalance and WithdrawalLimit limit when Account is created
	public Current(String accountNumber, Currency currency, double balance) {
		super(accountNumber, currency, balance);
		setWithdrawalLimit(1000, 50000);
	}

	@Override
	void setWithdrawalLimit(double minWithdrawal, double maxWithdrawal) {
		this.minWithdrawal = minWithdrawal;
		this.maxWithdrawal = maxWithdrawal;
	}

	@Override
	public String toString() {
		return "Current{}";
	}

}
