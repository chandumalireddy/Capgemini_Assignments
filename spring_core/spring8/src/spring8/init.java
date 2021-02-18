package spring8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class init {
	
	
	private String message;

	   public void setMessage(String message){
	      this.message = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   public void initi(){
	      System.out.println("Bean is going through init.");
	   }
	   public void destroy() {
	      System.out.println("Bean will destroy now.");
	   }
	    

}
