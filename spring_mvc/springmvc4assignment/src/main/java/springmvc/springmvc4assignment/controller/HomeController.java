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


@Controller
public class HomeController {

	@RequestMapping(value="admin.html",method=RequestMethod.GET)
	public ModelAndView test() {
		ModelAndView m=new ModelAndView("home");

		
		return m;
	}
	
	@RequestMapping(value="adminlogin",method=RequestMethod.POST)
	public ModelAndView test2(@ModelAttribute("s1") User s1) {
	
	ArrayList<User>ll=connectdb.getDetails();
	System.out.println(ll);
	for(User u:ll) {
		if(u.getUser().equals(s1.getUser()))
		{
			ModelAndView mv=new ModelAndView("success");
			return mv;
		}
	}
		ModelAndView m=new ModelAndView("error");
		return m;

}
}