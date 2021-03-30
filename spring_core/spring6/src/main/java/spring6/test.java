package spring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test {

	public static void main(String args[])
	{
		ApplicationContext c=new FileSystemXmlApplicationContext("spring.xml");
		 student s=(student)c.getBean("obj");
		 s.toString();
		 System.out.println(c.getMessage("message", null, "default message", null));
   
}
}
