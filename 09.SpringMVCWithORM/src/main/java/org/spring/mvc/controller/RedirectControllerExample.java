package org.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectControllerExample {

//---------------------------------------------------------------------------------
// Using redirect prefix
//---------------------------------------------------------------------------------
	
	@RequestMapping("/one")
	public String getFirstReq() {
		
		System.out.println("RedirectControllerExample.getFirstReq()");
		return "redirect:/enjoy";	//redirect prefix
		
	}
	
	@RequestMapping("/enjoy")
	public String redirectControl() {
		
		System.out.println("RedirectControllerExample.redirectControl()");
		return "register";
		
	}	

//---------------------------------------------------------------------------------
// Using redirect view
//---------------------------------------------------------------------------------

	@RequestMapping("/two")
	public RedirectView getFirstReq1() {
		
		System.out.println("RedirectControllerExample.getFirstReq()");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("send");	//redirect-view
		return redirectView;
		
	}
	
	@RequestMapping("/send")
	public String redirectControl1() {
		
		System.out.println("RedirectControllerExample.redirectControl()");
		return "register";
		
	}
	
}
