package springbootdemoproj.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class topiccontroller {
	
	/*
	 * @Autowired public topicservice topiceservice;
	 * 
	 * 
	 * 
	 * 
	 * @RequestMapping("/topics")
	 * 
	 * @ResponseBody public List<topic> gettopic() { return
	 * topiceservice.getalltopic(); }
	 * 
	 * @RequestMapping(method=RequestMethod.POST,value="/topics")
	 * 
	 * @ResponseBody public void addtopic(@RequestBody topic t) {
	 * topicservice.addtopic(t); }
	 * 
	 * 
	 * @RequestMapping("/topics/{id}")
	 * 
	 * @ResponseBody public topic gettopic1(@PathVariable("id") String id) { return
	 * topiceservice.gettopicid(id); }
	 * 
	 * @RequestMapping(method=RequestMethod.PUT,value="/topics/{id}") public void
	 * update(@RequestBody topic t,@PathVariable String id) {
	 * topicservice.updatetopic(id,t); }
	 * 
	 * @RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}") public void
	 * delete(@RequestBody topic t,@PathVariable String id) {
	 * topicservice.deletetopic(id); }
	 */
	
	@GetMapping("/")
	public String home()
	{
		return ("<h1>welcome</h1>");
		}
	@GetMapping("/user")
	public String home1()
	{
		return ("<h1>welcome user</h1>");
		}
	@GetMapping("/admin")
	public String home3()
	{
		return ("<h1>welcome admin</h1>");
		}
	
}
