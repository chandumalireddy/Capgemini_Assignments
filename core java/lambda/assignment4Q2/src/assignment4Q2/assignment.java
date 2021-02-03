package assignment4Q2;

import java.util.ArrayList;
import java.util.List;

public class assignment {
	
	
	  private int totalPrice;
	    private String status;
	    
	    
	    public assignment(int totalprice, String status) {
		this.totalPrice=totalprice;
		this.status=status;
		}

		public static ArrayList<assignment> listOfOrders(ArrayList<assignment> abc) {
			
	    	abc.forEach(i -> {
	    	    if(i.totalPrice> 10000 && i.status.equals("completed")) {
	    	        System.out.println("oredered :: " + i.totalPrice+" "+i.status);
	    	    } 
	    	});
	    		
	    	return null;
	    }
	 
	public static void main(String args[])
	{
		 assignment a1=new assignment(100000,"completed");
		 assignment a2=new assignment(5000,"incomplete");
		 assignment a3=new assignment(12000,"completed");
		 assignment a4=new assignment(15000,"completed");
		 
		ArrayList<assignment>abc=new ArrayList<>();
		abc.add(a1);
		abc.add(a2);
		abc.add(a3);
		abc.add(a4);
		listOfOrders(abc);
		
		
	}
}
