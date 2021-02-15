package assignment3Q7;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class ownerdet {
	   static int levels = 3;
	    static int sections = 4;
	   static int slots = 20;
	  
	
	Scanner sc=new Scanner(System.in);


	     private  List<parkedcar>a=new ArrayList<>();
	    public void add_new_car(asssignment obj){
	 
	    	for(int i=1;i<4;i++) {
	    		for(int j=1;j<5;j++) {
	    			for(int k=1;k<21;k++) {
	    				parkedcar all = null;
	    				if(a.size()==0) {
					    	all= new parkedcar(obj.getName(),obj.getCarNo(),(i*100+j*10+k),i,j,k);
					    }
	    				else {
	    					for(parkedcar c:a) {
	    	    				if(c.getLevel()!=(i) || c.getSection()!=j || c.getSlot()!=k) {
	    	    					all= new parkedcar(obj.getName(),obj.getCarNo(),(i*100+j*10+k),i,j,k);
	    					    
	    	    				}
	    	    			}
	    				}
	    				a.add(all);
	    			}
	    		}
	    	}			
	    }
	    	
	    	 
	    		
	    
	 public void remove_car(String name,int carno)
	 {
		a.removeIf(p->p.getOwnerName().equals(name) && p.getCarNumber()==carno);
	 }
	
		public void get_parked_car_location(int i) {
			String s="";
			
		for(parkedcar p:a)
		{
			if(p.getToken()==i)
				System.out.println(p.getOwnerName()+" "+p.getCarNumber()+" "+p.getLevel()+" "+p.getSection()+" "+p.getSlot());
		}
			
		}
	    	
	    	
	    	
	    	
	    }
