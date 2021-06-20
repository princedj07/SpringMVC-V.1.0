package org.spring.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ExceptionHandlerController {


//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = { NullPointerException.class })
//	public String nullPointerHandle(Model model) {
//		model.addAttribute("msg", "Null Pointer Exception Has Occered....");
//		return "error";
//	}
//
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = { NumberFormatException.class })
//	public String numberFormatHandle(Model model) {
//		model.addAttribute("msg", "Number Format Exception Has Occered....");
//		return "error";
//	}
//
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = { Exception.class })
//	public String genricExceptionHandle(Model model) {
//		model.addAttribute("msg", "Exception Has Occered....");
//		return "error";
//	}
	
//	@RequestMapping(path = "/test1")
//	public String test1() {
//		String str = null;
//		System.out.println(str.length());
//		return "success";
//	}
//
//	@RequestMapping(path = "/test2")
//	public String test2() {
//		String str = "prince";
//		Integer.parseInt(str);
//		System.out.println(str.length());
//		return "success";
//	}
	
}
