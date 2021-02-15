package assignment2Q1;

class Singletion{
	private static Singletion a=null;
	int i=0;
	Singletion() {
		i=5;	
	}
	private static Singletion b() {
		if(a==null)
			a=new Singletion();
		return a;
		
	}
}


public class assignment {
	public static void main(String args[])
	{
		Singletion s=new Singletion();
		s.i=10;
		System.out.println(s.i);
	}

}
