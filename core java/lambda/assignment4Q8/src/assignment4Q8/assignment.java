package assignment4Q8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;



public class assignment implements Runnable {
	

	public static void main(String args[])
	{
	assignment a=new assignment();
	Thread t=new Thread(a);
	t.start();
	
	}

	@Override
	public void run() {
		Consumer <Integer>c=(a)->{
			for(int i=0;i<a;i++)
				System.out.print(i);
		};
		c.accept(10);
		
	}
}
	


