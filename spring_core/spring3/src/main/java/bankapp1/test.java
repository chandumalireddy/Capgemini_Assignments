package bankapp1;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class test {

	public static void main(String[] args) {
		

		ApplicationContext context = new FileSystemXmlApplicationContext("bank.xml");
		
		bankaccount bankaccount = (bankaccount)context.getBean("obj");
		bankaccountcontroller bankControl = (bankaccountcontroller)context.getBean("obj1");
		bankControl.getBalance(bankaccount.getAccountId());
		bankControl.withdraw(bankaccount.getAccountId(), 10);

	   
		
	}



}