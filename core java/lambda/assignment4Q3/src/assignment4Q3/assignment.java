package assignment4Q3;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier; 
public class assignment {
	
	  static void modifyValue(){
		  
		  person p=new person();
		  Consumer<person>setName=t->t.setName("java");
		  setName.accept(p);
		  System.out.println((p.getName()));
	  }
	  
	  static void display() { 
		  
		  Supplier<Double> randomValue = () -> Math.random(); 
		  System.out.println(randomValue.get()); 
	  }
	  static Product n=new Product(1);
	  static class Product { 
		  
		  int a;
		  Product(int a)
		  {
			  this.a=a;
		  }
		  public int getnum()
		  {
			  return this.a;
		  }
		  public void setnum(int a)
		  {
			  this.a=a;
		  }
		  
	  }
	    
	    
	    public static void main(String[] args) {
	    	
	    
	    	
	    	modifyValue();
	    	display();
	    }

}
