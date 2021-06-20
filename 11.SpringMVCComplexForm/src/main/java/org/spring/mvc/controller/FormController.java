package org.spring.mvc.controller;

import org.spring.mvc.entities.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm() {
		System.out.println("FormController.showForm()***********");
		return "complex_form";
	}
	

//*************************************************************************************************
// First way
//*************************************************************************************************
	
//	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("name") String name, @RequestParam("id") Long id) {
		System.out.println("FormController.handleForm()");
		System.out.println("Name--: "+name);
		System.out.println("Id----: "+id);
		return "success";
	}

//*************************************************************************************************
// Second way
//*************************************************************************************************	

	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String handleForm2(@ModelAttribute("student") Student student) {
		System.out.println("FormController.handleForm2()");
		System.out.println(student);
		
		System.out.println(student.getDate());
		
		return "success";
	}
	
	
}
