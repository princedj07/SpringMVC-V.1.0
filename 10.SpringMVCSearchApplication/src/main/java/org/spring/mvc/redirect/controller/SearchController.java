package org.spring.mvc.redirect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		
		System.out.println("I am Going to home view.....");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		RedirectView redirectView = new RedirectView();
		String url = "https://www.google.com/search?q="+query;

		if(query!=null && !query.isEmpty())
			redirectView.setUrl(url);
		else
			redirectView.setUrl("home");
		System.out.println("I am Redirect to home view.....");
		return redirectView;
	}
}
