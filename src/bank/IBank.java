package bank;

import java.util.List;

import bank.accounts.Account;
import bank.customer.ICustomer;

public interface IBank {

	 void addCustomer(ICustomer customer);
	 void addAccount(Account account);
	 Account getAccountByNumber(String accNumber);
	 ICustomer getCustomerById(String personalId);
	 List<Account> getAllCurrentAccounts();
	 List<Account> getAllSavingsAccounts();
}
