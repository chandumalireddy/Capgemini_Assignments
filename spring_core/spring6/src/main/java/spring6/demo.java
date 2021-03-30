package spring6;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
@Component
@PropertySource("classpath:db.properties")
public class demo {
	private String name;
	private student student;
	@Autowired
	Environment e;
	public student getStudent() {
		return student;
	}
	@Value("spring core")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStudent(student student) {
		this.student = student;
	}
	public String toString() {
		return e.getProperty("user.Name")+" Project Name=" + name + ", \nstudent=" + student ;	
}
}