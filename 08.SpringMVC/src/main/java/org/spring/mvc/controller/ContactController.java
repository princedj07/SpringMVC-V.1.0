package org.spring.mvc.controller;

import org.spring.mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@ModelAttribute
	public void addCommonHeader(Model model) {
	
		model.addAttribute("headerName", "Register Form");
		model.addAttribute("desc", "Please fill the details below");
		
	}
	
	@RequestMapping(path = "/contact")
	public String showForm(Model model) {
	
		return "contact";
	}
	
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail, 
			@RequestParam("userName") String userName, Model model) {
		
		System.out.println("EmailId---------: "+userEmail);
		System.out.println("UserName--------: "+userName);
		
		model.addAttribute("email", userEmail);
		model.addAttribute("userName", userName);
		
		return "success";
	}
	
	
	@RequestMapping(path = "/register")
	public String signUpForm() {
		
		return "register";
	}
	
	@RequestMapping(path = "/registerForm", method = RequestMethod.POST)
	public String registerForm(@ModelAttribute User user, Model model) {
		
		System.out.println("UserData---: "+user);
		return "dashboard";
	}
}
