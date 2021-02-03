package assignment2Q3;

import java.util.ArrayList;

public class assignment {
    public int totalCashInBank(ArrayList<Integer> cash){
    	int sum=0;
    	for(int i=0;i<cash.size();i++)
    		sum+=cash.get(i);
    	return sum;
    		
    }
    public int getCash(){
    	return 0;
    }
    public static void main(String[] args) {
    	
    	
    	
    	current ca=new current();
    	savings sa=new savings();
    	int current=ca.getCash();
    	int savings=sa.getCash();
    	
    	ArrayList<Integer>amount=new ArrayList<>();
    	amount.add(current);
    	amount.add(savings);
    	
    	assignment a=new assignment();
    	System.out.println(a.totalCashInBank(amount));
    	
    }
}

