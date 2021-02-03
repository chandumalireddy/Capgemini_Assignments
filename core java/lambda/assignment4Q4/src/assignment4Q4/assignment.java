package assignment4Q4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class assignment {
	
	 public static ArrayList<String> removeOddLength(ArrayList<String> a){
	
		
		 a.removeIf(n -> (n.length()%2 != 0)); 
		return a;
		 
		 
	 }
	public static void main(String args[])
	
	{
		
		
		 ArrayList<String> a = new ArrayList<>();
		 a.add("abcd");
		 a.add("names");
		 a.add("hello");
		 a.add("hii");
		 a.add("goodmorning");
		 a.add("everything is good");
		 System.out.println(removeOddLength(a));
		
	
	}
	interface fun{
		public String hello(String b);
		
	}


}
