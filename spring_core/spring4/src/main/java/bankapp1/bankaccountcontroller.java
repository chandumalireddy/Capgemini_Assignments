package bankapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class bankaccountcontroller {

	@Autowired
	private bankaccountserviceimpl bankAccountServiceImpl;
	
	
	bankaccount b1 = new bankaccount();
	
	@ResponseBody
	public double withdraw(long accountId, double balance) {
		
		// WITHDRAW from service layer
		bankAccountServiceImpl.withdraw(accountId, balance);
		return accountId;
	}
	@ResponseBody
	public double deposit(long accountId, double balance) {
		
		// DEPOSIT from service layer
		bankAccountServiceImpl.deposit(accountId, balance);
		return accountId;
	}
	@ResponseBody
	public double getBalance(long accountId) {
		
		// GET BALANCE from service layer
		bankAccountServiceImpl.getBalance(accountId);
		return accountId;
	}
}