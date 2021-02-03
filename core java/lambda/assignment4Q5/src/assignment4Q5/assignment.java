package assignment4Q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer; 

public class assignment {

	

	static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
	static String b="";
	    public static void main(String[] args) { 
	    	
	    	processWords(list);
	    }
	    public static void processWords(List<String> list) {
	    	
	    	Consumer<List<String> > 
            dispList = list1 -> list.stream().forEach(a ->{
	    	 StringBuilder  str 
	           = new StringBuilder(a);
	    	 b+=a.charAt(0);
	   
	    });
	  
	    dispList.accept(list);
	    System.out.print(b);
	    	
	            
	    }
	    }
