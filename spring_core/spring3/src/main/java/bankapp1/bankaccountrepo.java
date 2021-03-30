package bankapp1;

public interface bankaccountrepo {
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
}
