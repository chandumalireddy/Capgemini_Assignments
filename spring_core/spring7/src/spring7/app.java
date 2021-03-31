package spring7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
	 public static void main( String[] args ) {
	    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring7.xml");
	    	SpelOperators spelOperators = (SpelOperators) context.getBean("spelOperators");
	    	Car car =(Car)context.getBean("someCar");
	    	Engine engine= (Engine)context.getBean("engine");
	    }
}
