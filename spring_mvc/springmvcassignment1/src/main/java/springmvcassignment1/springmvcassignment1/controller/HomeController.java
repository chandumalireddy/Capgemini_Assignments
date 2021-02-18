package springmvcassignment1.springmvcassignment1.controller;

import java.io.IOException;


import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@RequestMapping(value="helllo.html")
	public ModelAndView test() {
		ModelAndView m=new ModelAndView("home");

		
		return m;
	}
	@RequestMapping(value="adminsuccess.html")
	public ModelAndView test2() {

		ModelAndView m=new ModelAndView("helloworld");
		m.addObject("msg"," HelloWorld");
	
		return m;

	}
	
}
