package assignment2Q2;

public class Labour extends employee{
	static int totalsal=0;
    public int getSalary(int salary) {
    	 int overtime = 500;
	     totalsal= salary+overtime;
	     return totalsal;
        
    }
}
