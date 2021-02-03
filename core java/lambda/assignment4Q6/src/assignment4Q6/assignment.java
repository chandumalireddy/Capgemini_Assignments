package assignment4Q6;

import java.util.ArrayList;

import java.util.List;
import java.util.function.UnaryOperator;

public class assignment {
	
	public static void convertToUpperCase(List<String> list) {
		UnaryOperator<String> p = a -> a.replaceAll(a,a.toUpperCase()); 
		  for (String t : list) {
        System.out.println(p.apply(t));
		  }
		 
	
	}  
	
	public static void main(String args[])
	{
		List<String >a=new ArrayList<>();
		a.add("hi");
		a.add("hello");
		a.add("good morning");
		convertToUpperCase(a);
		
	}

}
