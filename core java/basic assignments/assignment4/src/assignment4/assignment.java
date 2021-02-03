package assignment4;
import java.util.Scanner;
public class assignment {


public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int sub1=sc.nextInt();
	int sub2=sc.nextInt();
	int sub3=sc.nextInt();
	result a=new result();
	System.out.print(a.dec(sub1,sub2,sub3));
}
}
