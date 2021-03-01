package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	
	@GetMapping("/")
	public String home()
	{
		return ("<h1>welcome</h1>");
		}
	@GetMapping("user")
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

