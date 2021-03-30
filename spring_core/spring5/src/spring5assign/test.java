package spring5assign;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class test {
	public static void main(String args[]) {

	 BeanFactory c = new XmlBeanFactory(new FileSystemResource("springassign.xml"));
	 init a=(init)c.getBean("obj");
	 a.method();
	}
}
