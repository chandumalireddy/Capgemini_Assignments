package assignment2Q4;

abstract class abcd{
	int a;
}

abstract class add extends abcd{
	public abstract void add();
}

public class assignment extends abcd {
	public void add() {
	// TODO Auto-generated method stub
		System.out.print(1+2);
	}
	public static void main(String args[])
	{
		assignment cal =new assignment();
		cal.add();
	}
}