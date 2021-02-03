package assignment3Q2;

import java.util.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class assignment {


	  public static LinkedHashSet<String> ordered(LinkedHashSet<String> linkedHashSet){ 
	    	
	    	
	    	return linkedHashSet;
	    }
	
	
	  public static HashSet<String> unordered(HashSet<String> hashSet){
	    	
	    	return hashSet;
	    }
	    
	    
	public static void main(String args[])
	{
		
		  System.out.println("hashset\n");
		HashSet<String> h=new HashSet<>();
		h.add("b");
		h.add("a");
		h.add("c");
		h.add("d");
		
		System.out.println("hash set");
		System.out.println(unordered(h));
		
		
		LinkedHashSet<String>h1=new LinkedHashSet<>();
		h1.add("b");
		h1.add("a");
		h1.add("c");
		h1.add("d");
		
		
		System.out.println("linked hash set");
		System.out.println(ordered(h1));
        
			
        
      
	}
}
