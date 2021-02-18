package spring9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test {
	public static void main(String args[])
	{
		ApplicationContext cap = new FileSystemXmlApplicationContext ("spring.xml"); 
		 demo d=(demo)cap.getBean("obj");
	((ConfigurableApplicationContext) cap).close();
	}

}
