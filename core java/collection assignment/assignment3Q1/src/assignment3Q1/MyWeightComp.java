package assignment3Q1;

import java.util.Comparator;

public class MyWeightComp implements Comparator<person>{
	 
    @Override
    public int compare(person p1, person p2) {
    	if(p1.getnum() < p2.getnum())
    	{
    	return 1;
 
           
         } else {
             return -1;
         }
    }
}
 