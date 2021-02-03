package assignment2Q2;

import java.util.ArrayList;
import java.util.*;

public class employee {
	int sal=10000;
	public int getSalary(int salary){
		return salary;
	
	}
	static int k=0,l=0;
    public static void total(ArrayList<Integer> employeeSalaries){
    	 System.out.println(" Salary : ");
    	 if(a==1)
    	 {
    	    for(int h : employeeSalaries) {
    	    	employee q =new manager();
    	k+=q.getSalary(h);
    	    
    	
    	    }	
    }
    	 System.out.println(k);
    	  System.out.println("manager salary is "+k);
    	 if(a==2)
    	 {
    		   for(int h : employeeSalaries) {
       	    	employee y =new Labour();
       	    	l+=y.getSalary(h);
       	     
    	 }
    }
    	 System.out.println("labour total sal "+l);
    }
 
  public static int a;
 
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
 
    	ArrayList<Integer> i = new ArrayList<>();
    	
    while(true)
    {
    		System.out.print("enter the employyeee\n1.manager \n2.labour \n0.exit");
    	 int n=sc.nextInt();
    	 if(n==0)
    		 break;
    	
    		    	 
a=n;
if(n==1)
    	{
    	  	int m=0;
	employee r =new manager();

	System.out.println("how many managers u need to enter");
	
	int p=sc.nextInt();
	while(m<p)
	{
		System.out.println("please enter salary for manager");
		int o=sc.nextInt();
		i.add(o);
		r.total(i);
		m++;
	}
	
    	}
    	if(n==2)
    	{
    	  	int m=0;
	employee l =new Labour();
	
	System.out.println("how many labours u need to enter");
	
	int p=sc.nextInt();
	while(m<p)
	{
		System.out.println("please enter salary for labour");
		int o=sc.nextInt();
		i.add(o);
		l.total(i);
		m++;
	
    	}
    	 
    	}
    }
    	
    
    }

}
