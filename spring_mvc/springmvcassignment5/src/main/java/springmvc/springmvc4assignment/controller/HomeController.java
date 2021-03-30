package springmvc.springmvc4assignment.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc.springassignmentmvc5.controller.Employee;
import springmvc.springmvcassignment10.controller.User;
import springmvc.springmvcassignment10.controller.connectdb;


@Controller
public class HomeController {

	@RequestMapping(value="admin.html",method=RequestMethod.GET)
	public ModelAndView test() {
		ModelAndView m=new ModelAndView("home");

		
		return m;
	}
	@RequestMapping(value = "/addEmployee.html",method = RequestMethod.GET)
	public ModelAndView addEmployee() {
		
		ModelAndView m = new ModelAndView("error");
		return m;
	}
	
	@RequestMapping(value ="/InsertEmployee.html")
	public ModelAndView updateEmployee(@ModelAttribute ("employee")User employee) throws Exception {
		
		connectdb.insertUser(employee);
		ModelAndView m = new ModelAndView("abc");
		return m;
	}
	@RequestMapping(value="adminlogin",method=RequestMethod.POST)
	public ModelAndView test2(@ModelAttribute("s1") User s1) {
	
		ArrayList<User>ll=connectdb.getDetails();
		ModelAndView mv=new ModelAndView("success");
		mv.addObject("msg",ll);
		return mv;
}
	@RequestMapping(value="/delete")
		public ModelAndView addEmployee1() {
			
			ModelAndView m = new ModelAndView("del");
			return m;
}
	@RequestMapping(value ="/deleteEmployee.html")
	public ModelAndView updateEmployee1(@ModelAttribute ("employee")User employee) throws Exception {
		
		connectdb.deleteuser(employee);
		ModelAndView m = new ModelAndView("abcd");
		return m;
	}
	
	@RequestMapping(value="/update")
	public ModelAndView addEmployee2() {
		
		ModelAndView m = new ModelAndView("upd");
		return m;
}
	
	@RequestMapping(value ="/UpdateEmployee.html")
	public ModelAndView updateEmployee2(@ModelAttribute ("employee")User employee) throws Exception {
		
		connectdb.update(employee);
		ModelAndView m = new ModelAndView("abcde");
		return m;
	}
	
	
}