package restassignmnt3;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controoler {

	
	@RequestMapping(value="zip")
	public void m(@RequestBody add a)
	{
		a.setCity("vij");
		a.setCountry("India");
		a.setState("AP");
		a.setZip(1234);
	}
  @RequestMapping(value="zip/{id}",method=RequestMethod.POST)
  public void m2(@PathVariable(value="id")int id,@RequestBody add a)
  { 
	  System.out.println(a.getCity()+" "+a.getCountry()+" "+a.getState());
			  } 
  }
 
