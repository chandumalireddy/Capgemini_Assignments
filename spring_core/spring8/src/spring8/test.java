package spring8;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String args[]) {
		      AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring8.xml");

		      init obj = (init) context.getBean(");
		      obj.getMessage();
		      context.registerShutdownHook();
		
		   }
	}


