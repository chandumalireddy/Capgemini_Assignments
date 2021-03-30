package bankapp1;

public class bankaccount {

	
	private int accountId;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double totalAmount) {
		this.accountBalance = totalAmount;
	}
	public void display() {
	
	System.out.println(getAccountBalance()+" "+getAccountType()+" "+getAccountId()+" "+getAccountHolderName());
	}
	

}
