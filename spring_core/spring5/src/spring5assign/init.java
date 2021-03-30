package spring5assign;

import org.springframework.beans.factory.annotation.Required;
import javax.annotation.Resource;


public class init {
	private int age;

	   private String name;
	public int getAge() {
		return age;
	}
@Resource
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}

	   public void method()
	   {
		   System.out.println(age+" "+name);
	   }
}
