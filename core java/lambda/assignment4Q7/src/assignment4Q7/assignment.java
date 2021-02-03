package assignment4Q7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class assignment {

	
    public static void main(String[] args) {
    	
    	Map<String,Integer>abc=new HashMap<>();
    	abc.put("one", 1);
    	abc.put("two", 2);
    	abc.put("three", 3);
    	
convertKeyValueToString(abc);
    }
    public static void convertKeyValueToString(Map<String, Integer> abc) {
    	
    	Set  convert=abc.entrySet();
    	StringBuilder a=new StringBuilder();
    	Iterator i=convert.iterator();
    	while(i.hasNext())
    	{
    		a.append(i.next());
    	}
    	String b=a.toString();
    	System.out.println(b);
    	
    	
    	 }
    	
    	
    }
