package assignment2Q2;

public class manager extends employee{
	 static int totalsal=0;
	 public int getSalary(int salary){

	       int incentive = 5000;
	       totalsal=salary+incentive;
	     return totalsal;
}
}