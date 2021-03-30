package bankapp1;

public class bankaccountrepoimpl implements bankaccountrepo 
{
		
	public double getBalance(long accountId) {
		bankaccount a=new bankaccount();
			if(a.getAccountId()==accountId)
		System.out.println(a.getAccountBalance());
			return (Double) null;
	}

	public double updateBalance(long accountId, double newBalance) {
		bankaccount a=new bankaccount();
		if(a.getAccountId()==accountId)
		{
			a.setAccountBalance(newBalance);
		}
	System.out.println( a.getAccountBalance());
	return (Double) null;
	}

}
