package assignment3;
import java.util.*;

public class sici {



	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		double n=sc.nextDouble();
		double t=sc.nextDouble();
		
		internest a=new internest();
		System.out.print(a.simpleinterest(p,r,n));
		System.out.print("\n");
		System.out.print(a.compoundinterest(p,r,t));
	}
}
