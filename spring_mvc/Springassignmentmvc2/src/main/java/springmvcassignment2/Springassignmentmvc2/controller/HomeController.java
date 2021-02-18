package springmvcassignment2.Springassignmentmvc2.controller;


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

	@RequestMapping(value="admin.html",method=RequestMethod.GET)
	public ModelAndView test() {
		ModelAndView m=new ModelAndView("home");

		
		return m;
	}
	
	@RequestMapping(value="simath",method=RequestMethod.POST)
	public ModelAndView test2(@ModelAttribute("s1") simple s1,BindingResult result) {
		/*valid is used for conditions*/
	
		
		if(result.hasErrors()) {
			ModelAndView m=new ModelAndView("home");
			return m;
		}
		ModelAndView m=new ModelAndView("si");
		m.addObject("hello"," everything is good");
	
		return m;

	}
}
