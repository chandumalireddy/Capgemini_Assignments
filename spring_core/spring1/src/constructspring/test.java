package constructspring;


	
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.FileSystemXmlApplicationContext;


	public class test{
		public static void main(String args[]) throws Exception
		{
			  ApplicationContext c = new FileSystemXmlApplicationContext("construct.xml");
			 customer m=(customer)c.getBean("obj");
			m.displayInfo();
		}
	}
