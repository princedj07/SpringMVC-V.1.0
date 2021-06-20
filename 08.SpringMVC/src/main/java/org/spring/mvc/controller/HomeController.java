package org.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String homePage(Model model) {
		System.out.println("HomeController.homePage()");
		
		model.addAttribute("name", "Prince D");
	
		List<String> friends = new ArrayList<>();
		friends.add("Roshan");
		friends.add("Mayank");
		friends.add("Suraj");
		friends.add("Akshay");
		friends.add("Pranay");
		
		model.addAttribute("friend", friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String aboutPage() {
		System.out.println("HomeController.aboutPage()");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView helpPage() {
		System.out.println("HomeController.helpPage()");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Prince D");
		modelAndView.addObject("id", 935);
		modelAndView.addObject("work", "Software Engineer");

		List<Integer> marks = new ArrayList<>();
		marks.add(89);
		marks.add(75);
		marks.add(63);
		marks.add(92);
		marks.add(76);

		modelAndView.addObject("marks", marks);
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
}
