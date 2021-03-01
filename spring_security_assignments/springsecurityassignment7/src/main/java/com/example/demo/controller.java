package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class controller {

	
	@GetMapping("/")
	public String home()
	{
		return ("<h1>welcome</h1>");
		}
	@GetMapping("user")
	public ModelAndView home1()
	{
		return new ModelAndView("login.html");
		}
	@GetMapping("admin")
	public ModelAndView home3()
	{
		return new ModelAndView("welcome.html");
		}
	
}

