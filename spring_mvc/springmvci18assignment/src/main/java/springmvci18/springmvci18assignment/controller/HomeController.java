package springmvci18.springmvci18assignment.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

 @RequestMapping(value = "/login1")
 public String login1(Model model) {
     return "home";
 }

}