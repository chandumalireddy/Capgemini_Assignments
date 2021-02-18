package spring9;
import javax.annotation.PostConstruct; 
import javax.annotation.PreDestroy; 
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class demo /*implements InitializingBean, DisposableBean*/{
	
/*By Xml method:	public void init() throws Exception 
	    { 
	        System.out.println( "init methid"); 
	    } 
	 public void destroy() throws Exception 
	    { 
	        System.out.println("destroy method"); 
	    }*///
	
	
	
	/* by programming approach
	public void afterPropertiesSet() throws Exception {
		 System.out.println( "init methid");
		
	}

	public void destroy1() throws Exception {
		  System.out.println("destroy method"); }
		*/
	 @PostConstruct
	    public void init() throws Exception 
	    { 
	        System.out.println("init");
	            
	    } 
	  
	 
	    @PreDestroy
	    public void destroy() throws Exception 
	    { 
	        System.out.println("destoy");
	           
	    } 
	} 

