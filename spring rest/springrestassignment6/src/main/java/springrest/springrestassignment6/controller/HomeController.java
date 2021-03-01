package springrest.springrestassignment6.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	@ResponseBody
	@RequestMapping(value="/add/{a}/{b}",method=RequestMethod.GET)
	public  int uodatesgetstudentlist2(@PathVariable("a") int a,@PathVariable("b") int b)
	{
		cal c=new cal();
		c.setA(a);
		c.setB(b);
		
		return c.getA()+c.getB();
		
		
	}
	
	

	@ResponseBody
	@RequestMapping(value="/sub/{a}/{b}",method=RequestMethod.GET)
	public  int uodatesgetstudentlist3(@PathVariable("a") int a,@PathVariable("b") int b)
	{
		cal c=new cal();
		c.setA(a);
		c.setB(b);
		
		return c.getA()-c.getB();
		
		
	}
	
	@ResponseBody
	@RequestMapping(value="/mul/{a}/{b}",method=RequestMethod.GET)
	public  int uodatesgetstudentlist4(@PathVariable("a") int a,@PathVariable("b") int b)
	{
		cal c=new cal();
		c.setA(a);
		c.setB(b);
		
		return c.getA()*c.getB();
		
		
	}
	@ResponseBody
	@RequestMapping(value="/div/{a}/{b}",method=RequestMethod.GET)
	public  int uodatesgetstudentlist5(@PathVariable("a") int a,@PathVariable("b") int b)
	{
		cal c=new cal();
		c.setA(a);
		c.setB(b);
		
		return c.getA()/c.getB();
		
		
	}
	
	
}
