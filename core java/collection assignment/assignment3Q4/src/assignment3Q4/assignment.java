package assignment3Q4;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class assignment {

	 public void  getEmployee(HashMap<date, String> dob,String employeeName){
		 
		 HashMap<String,String> Employees=new HashMap<>();
	    	String[] employeeNames=employeeName.split(",");
	    	String[] values=new String[employeeNames.length];
	    	String value="";
	    	Iterator trav=dob.entrySet().iterator();
	    	while(trav.hasNext())
	    	{
	    		Map.Entry record=(Map.Entry)trav.next();
	    		String name=(String) record.getValue();
	    		value+=name+" ";
	    	}
	    	
	    	values=value.split(" ");
	    	Arrays.sort(values);
	    	for(int i=0;i<4;i++)
	    	{
	    		Employees.put(values[i], employeeNames[i]);	
	    	}
	    	System.out.println(Employees);
		}
		 
		 
	 
	 
	public static void main(String args[])
{
	date d1=new date(1,10,1998);
	date d2=new date(20,6,1997);
	date d3=new date(21,6,1998);
	date d4=new date(7,5,1992);

	
	HashMap<date,String>empdate=new HashMap<>();
	empdate.put(d1, "chandu");
	empdate.put(d2, "lucky");
	empdate.put(d3, "raj");
	empdate.put(d4, "srini");
	
	
	String empname="chandu,lucky,raj,srini,raj";
	assignment a=new assignment();
for(Map.Entry<date, String>entry:empdate.entrySet())
{
	for(Map.Entry<date,String>entry1:empdate.entrySet()){
	if(!entry.getKey().equals(entry1.getKey()))
	{
		if(!entry.getValue().equals(entry1.getValue()))
		{
			a.getEmployee(empdate,empname);
			break;
		}
		else
		{
			System.exit(0);
		}
		break;
	}
	break;
}
	

	
	
	
}
}
	
}

