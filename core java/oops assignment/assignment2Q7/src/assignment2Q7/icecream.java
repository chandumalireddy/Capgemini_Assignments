package assignment2Q7;
import java.util.*;

public class icecream extends desertitem {
	int totalicecream=0;  
	public String addicecream(int icecream){
		   totalicecream+=icecream;
		   return "total candies"+totalicecream;
	   }

	static int totalbill=0;
	   public int getCost() {
	
		   return totalbill+=100;
	   }
}
