package bank.customer;

import bank.accounts.Account;

public interface ICustomer {

	 void addAccount(Account account);
	 String getPersonalIdNumber();
}
