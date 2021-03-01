package restassignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class test {
	

	public static void main(String[] args) {
	SpringApplication.run(test.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "hello world";
	}
	}

