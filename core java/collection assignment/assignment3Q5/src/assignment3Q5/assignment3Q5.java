package assignment3Q5;

import java.util.HashMap;

public class assignment3Q5 {
	public static void main(String args[])
	{
		HashMap<emplooyee,String >m=new HashMap<>();
		emplooyee e1=new emplooyee(1,"abc");
		emplooyee e2=new emplooyee(2,"aaa");
		
		m.put(e1, "hello employeee one");
		m.put(e2, "hello employee two");
	
		System.out.println(m.get(e1));
		System.out.println(m.get(e2));
		
		
	}
}
