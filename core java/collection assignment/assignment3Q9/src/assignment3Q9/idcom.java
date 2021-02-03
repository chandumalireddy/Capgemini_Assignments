package assignment3Q9;

import java.util.Comparator;

class idcomp implements Comparator<savingaac> { 
	  
   

	@Override
	public int compare(savingaac o1, savingaac o2) {
	if(o1.getAcc_ID() > o2.getAcc_ID() )
		return 1;
	else 
		return -1;
	} 
} 