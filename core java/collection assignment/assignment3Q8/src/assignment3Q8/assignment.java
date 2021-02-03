package assignment3Q8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class assignment {

	  public static void failFast(Map<String, String> cityCode){
		  
		  Iterator<String> iterator = cityCode.keySet().iterator();
		  
	        while (iterator.hasNext()) {
	            System.out.println(cityCode.get(iterator.next()));
	 
	            cityCode.put("paris", "france");
	  }
	  }
	    public static void main(String[] args) {
	    	
	    	Map<String, String> cityCode = new HashMap<String, String>();
	        cityCode.put("Delhi", "India");
	        cityCode.put("Moscow", "Russia");
	        cityCode.put("New York", "USA");
	        
	        failFast(cityCode);
	    }
	    
}
