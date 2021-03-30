package springmvcassignment3.springassignment3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="admin.html",method=RequestMethod.GET)
	public ModelAndView test() {
		ModelAndView m=new ModelAndView("registration");

		
		return m;
	}
	
	@RequestMapping(value="loginprocess" ,method=RequestMethod.POST)
	public ModelAndView test2(@ModelAttribute("s1")usermodel s1) {
		ModelAndView m=null;
		if(s1.getName()!=null && s1.getPassword()==null) {
			m=new ModelAndView("fail");
			m.addObject("msg","wrong login");	
		}
		else
		{
			m=new ModelAndView("success");
			m.addObject("msg","successfully ");
		}
		return m;
	}
	
	
}
