package springrest.springrestassignment1.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import studentapp.controller.student;

@Controller
public class HomeController {

	@ResponseBody
	@RequestMapping(value="/d/{name}",method=RequestMethod.GET)
	
	
	public  address uodatesgetstudentlist2(@PathVariable("name") String studentname)
	{
		address s=new address();
		s.setName(studentname);
		s.setHobby("cricket");
		return s;
		
	}
	
	

	@ResponseBody
	@RequestMapping(value="/d/{name}",method=RequestMethod.PUT)
	
	
	public  boolean uodatesgetstudentlist1(@PathVariable("name") String studentname,@RequestBody student s)
	{
		System.out.println(studentname);
		System.out.println(s.getName()+" "+s.getHobby());
		
		return true;
		
	}
}
