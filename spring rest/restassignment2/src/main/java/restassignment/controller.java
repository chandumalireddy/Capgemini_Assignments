package restassignment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@ResponseBody
	@RequestMapping(value="check/{name}/{password}",method=RequestMethod.POST)
	public void m(@PathVariable(value="name") String name, @PathVariable(value="password") String password, @RequestBody user u )
	{
		if(u.getUsername().equals(name) && u.getPassword().equals(password))
{
	System.out.println("login");
}
else
	System.out.println("error");
		
	}
}
