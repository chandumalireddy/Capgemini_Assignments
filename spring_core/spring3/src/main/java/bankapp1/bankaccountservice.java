package bankapp1;

import org.springframework.stereotype.Component;

@Component
public interface bankaccountservice {
	public double withdraw(long accountId, double balance);
	public double deposit(long accountId, double balance);
	public double getBalance(long accountId);



}
