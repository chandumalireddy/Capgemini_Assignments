package bankapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bankaccountserviceimpl implements bankaccountservice {

	
	@Autowired
	private bankaccountrepoimpl bankAccountRepoImpl;
	
	// for withdraw
	public double withdraw(long accountId, double balance) {
		
		double newbalance = bankAccountRepoImpl.getBalance(accountId) - balance;
		bankAccountRepoImpl.updateBalance(accountId, newbalance);
		System.out.println("Remaining Balance : "+ bankAccountRepoImpl.getBalance(accountId));
		return accountId;
	}

	// for deposit
	public double deposit(long accountId, double balance) {
		
		double newbalance = bankAccountRepoImpl.getBalance(accountId) + balance;
		bankAccountRepoImpl.updateBalance(accountId, newbalance);
		System.out.println("Remaining Balance : "+ bankAccountRepoImpl.getBalance(accountId));
		return accountId;
	}

	// for fetching balance
	public double getBalance(long accountId) {
		
		System.out.println("Balance : "+ bankAccountRepoImpl.getBalance(accountId));
		return accountId;
	}

	

}
