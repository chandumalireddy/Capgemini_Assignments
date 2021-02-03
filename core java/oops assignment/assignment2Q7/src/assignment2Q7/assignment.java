package assignment2Q7;
			import java.util.*;
			import java.util.ArrayList;
public class assignment {
	  Scanner sc=new Scanner(System.in);
	 private void selectRoles() {
		 String a="owner";
		  String b="customers";
	    System.out.println("1.owner");
	    System.out.println("2.customer");
	int n=sc.nextInt();
	if(n==1)
		orders(a);
	else 
		orders(b);
	 }
	 private void orders(String a)
	 {
		 if(a.equals("owner"))
		 {
			 System.out.print("welcome owner");
			 addItems();
		 }
		 else
		 {
			 System.out.print("welcome customer");
			 placeOrder();
			 
		 }
	 }
	 private void placeOrder() {
    	 {
 	    	while(true)
 	    	{
    		    System.out.println("dear please select and place ur order ");
    		    
    		
    		    System.out.println("1.	place order candy items");
    			
    			System.out.println("2.	place order cookie items");
    		
    			System.out.println("3.	place order icecreams");
    			
    			System.out.println("0 to exit");
    			int c=sc.nextInt();
    			if(c==0)
    				break;
    			placeOrderOperation(c);
 	    	}	
    				
    				    }
		
	}
	 private void addItems() {
	    	
	    	System.out.println("which item u need to add");
 	
 		while(true)
 		{
 			System.out.println("1.	add candy items");
 	 		
 	 		System.out.println("2.	add cookie items");
 	 	
 	 		System.out.println("3.	add icecreams");
 			int m=sc.nextInt();
 			if(m==0)
 				break;
 			addItemsOperation(m);
 			
 		}
 		
	    }
	 
	 private void addItemsOperation(int choice) {
	  
		 candy u=new candy();
		 int n=sc.nextInt();
		 u.addcandy(n);
		 
		 
		 
	 }
	 static int a=0;
	 private void placeOrderOperation(int c) {
			
	    	
			switch(c)
			{
			case 1:
				desertitem p= new candy();
				a+=p.getCost();
				
				break;
			case 2:
				desertitem r= new cookie();
				a+=r.getCost();
				break;
			case 3:
				desertitem y= new icecream();
				a+=y.getCost();
				break;
			}
			System.out.println("total bill "+a);

}

	
	

	 public static void main(String[] args) {
	
	  
	  assignment a=new assignment();
	  a.selectRoles();
	
	 
	 }
}
	