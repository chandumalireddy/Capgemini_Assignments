package spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class test {

	public static void main(String[] args) {
		  ApplicationContext c = new FileSystemXmlApplicationContext("springb.xml");
			 question m=(question)c.getBean("obj");
			m.display();
			m.display1();
			m.display2();
		}
	

	}


