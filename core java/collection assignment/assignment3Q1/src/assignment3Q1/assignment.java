package assignment3Q1;

import java.util.*;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Comparator;
import java.util.Map.Entry;
public class assignment {

		public static void main(String args[])
		{
			person p1=new person("baahubali","prabhas","anushka","drama");
			person p2=new person("rrr","rc","ab","historic");
			
		
			
			 TreeMap<person,String> abc = new TreeMap<person, String>(new MyWeightComp());
			
					
				abc.put(p1,"hello chandu");
				abc.put(p2,"hello lucky  ");
				
			        Set<Entry<person,String>>entryset=abc.entrySet();
			        for(Entry<person,String>entry:entryset) {
			        	person person=entry.getKey();
			        	String a=entry.getValue();
			        	System.out.println(person);	
			        	
			        }
			        
			        
			        }

	
		
		}
		
			   
			      
	
		

