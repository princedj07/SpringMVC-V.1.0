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
		System.out.println(student.getAddress());
		
		return "success";
	}
	
	@RequestMapping(path = "/test1")
	public String test1() {
		String str = null;
		System.out.println(str.length());
		return "success";
	}

	@RequestMapping(path = "/test2")
	public String test2() {
		String str = "prince";
		Integer.parseInt(str);
		System.out.println(str.length());
		return "success";
	}

	@RequestMapping(path = "/test3")
	public String test3() {
		String str[] = {"10", "20", "30"} ;
		System.out.println(str[3]);
		return "success";
	}
	
}
