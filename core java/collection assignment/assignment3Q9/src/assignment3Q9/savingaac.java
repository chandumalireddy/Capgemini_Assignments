package assignment3Q9;

import java.util.Comparator;

public class savingaac  extends assigment {
	
	   private double acc_balance;
	    private int acc_ID;
	    private String accountHolderName;
	    boolean isSalaryAccount;
	    
	    public savingaac(double acc_balance,int acc_ID, String   accountHolderName,boolean isSalaryAccount)
	    {
	    	this.acc_balance=acc_balance;
	    	this.acc_ID=acc_ID;
	    	this.accountHolderName=accountHolderName;
	    	this.isSalaryAccount=isSalaryAccount;
	    }

		public double getAcc_balance() {
			return acc_balance;
		}

		public void setAcc_balance(double acc_balance) {
			this.acc_balance = acc_balance;
		}

		public int getAcc_ID() {
			return acc_ID;
		}

		public void setAcc_ID(int acc_ID) {
			this.acc_ID = acc_ID;
		}

		public String getAccountHolderName() {
			return accountHolderName;
		}

		public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
		}

		public boolean isSalaryAccount() {
			return isSalaryAccount;
		}

		public void setSalaryAccount(boolean isSalaryAccount) {
			this.isSalaryAccount = isSalaryAccount;
		}
	    
	    public double deposit(int mny)
	    {
	    	return this.acc_balance+=mny;
	    }
	    public double withdraw(int mny)
	    {
	    	return this.acc_balance-=mny;
	    }
	    public String toString() 
	    { 
	        return "name{"
	            + "name='" +accountHolderName + '\'' + ", id='"
	            + acc_ID + '\'' + ", balance=" + acc_balance + '}'+" saving acc :"+ isSalaryAccount; 
	    } 
	} 
		




