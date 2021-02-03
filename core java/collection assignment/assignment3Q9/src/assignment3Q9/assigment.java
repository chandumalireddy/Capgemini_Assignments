package assignment3Q9;

import java.util.TreeSet;

public class assigment  {
	
	public static void main(String args[])
	{
	
		bankacc treeSet=new bankacc();
		 savingaac s1=new savingaac(10000,111,"chandu",true);	
			savingaac s3=new savingaac(20000,121,"LUCKY",true);
			savingaac s5=new savingaac(30000,112,"srinivas",true);
			
		treeSet.addSavingAccount(s1);
		treeSet.addSavingAccount(s3);
		treeSet.addSavingAccount(s5);
		
		
		
		s1.deposit(10000);
		s3.withdraw(500);
		
		System.out.println(treeSet.displaySavingAccountIds());
		
		
		
		
	
	}

}
