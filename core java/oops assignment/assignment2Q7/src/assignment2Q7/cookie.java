package assignment2Q7;
import java.util.*;

public class cookie extends desertitem{
	int totalcandies=0; 
	   public String addcookies(int candies){
		   
		   totalcandies+=candies;
		   return "totalcandies"+totalcandies;
	   }
	   static int totalbill=0;
	   public int getCost() {
		  
		   return totalbill+=70;
	   }
}
