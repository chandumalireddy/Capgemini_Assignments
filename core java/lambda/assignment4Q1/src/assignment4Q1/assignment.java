package assignment4Q1;
import java.util.*;
import java.util.function.Function;
public class assignment {

	
	 public double addition(double a,double b){
		 
		return add.hello(a,b);
	 }
	  public double subtraction(double a,double b){
		  
		  return sub.hello(a, b);
		  
	  }
	   public double multiplication(double a,double b){
		   
		   return mul.hello(a, b);
		   
	   }
	    public double division(double a,double b){
	    	
	    	 return div.hello(a, b);
	    	
	    }
	    static functional add=(double a,double b)->a+b;
		  static functional sub=(double a,double b)->a-b;
		  static functional mul=(double a,double b)->a*b;
		  static functional div=(double a,double b)->a/b;
		  
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	
	
	  assignment obj1=new assignment();
	  System.out.println("Addition "+obj1.addition(13,5));
	  
	  assignment obj2=new assignment();
	  System.out.println("sub "+obj2.subtraction(13,5));
	  
	  assignment obj3=new assignment();
	  System.out.println("mul "+obj3.multiplication(13,5));
	    	
	  
	  assignment obj4=new assignment();
	  System.out.println("div "+obj4.division(13,5));
	    	
	    }
	
	}

