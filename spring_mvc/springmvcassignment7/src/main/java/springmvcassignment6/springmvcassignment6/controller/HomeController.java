package springmvcassignment6.springmvcassignment6.controller;

import java.io.IOException;


import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
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
	
	

	@RequestMapping(value="adminsuccess.html",method=RequestMethod.POST)
	public ModelAndView test2(@Valid @ModelAttribute("s1") customer s1,BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView m=new ModelAndView("registration");
			return m;
		}
		ModelAndView m=new ModelAndView("applicationsuccess");
		m.addObject("hello"," everything is good");
	
		return m;
}
}
