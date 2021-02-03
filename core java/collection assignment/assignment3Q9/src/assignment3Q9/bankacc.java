package assignment3Q9;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;




public class bankacc {
	
	
	 private  TreeSet<savingaac> sa = new TreeSet<>(new comp());
	  public boolean addSavingAccount(savingaac savingAccount) {
		  return sa.add(savingAccount);
	  }
	  
	
	  public List<Integer> displaySavingAccountIds() {
		  
		
		 
			 for(savingaac b:sa)
			 {
				 System.out.println(b.getAcc_ID());
			 }
			 return null;
		  
		  
		  
	  }
		
		
}
		 
			