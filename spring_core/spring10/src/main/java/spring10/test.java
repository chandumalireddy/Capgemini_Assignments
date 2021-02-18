package spring10;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class test {
	public static void main(String args[]) {
	ApplicationContext context=new FileSystemXmlApplicationContext("spring10.xml");

	init t = (init) context.getBean("obj");
	t.draw();
}
}
