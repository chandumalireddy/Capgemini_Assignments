package assignment1;
import java.util.*;
public class assignment {
	public static void main(String args[])
	{
	int min=100;
	int max=1000;
		armstrong a=new armstrong();
		while(min<max)
		{
			int d=(a.abc(min));
			if(d==min)
				System.out.println(d);
		min++;
	}
	}

}
