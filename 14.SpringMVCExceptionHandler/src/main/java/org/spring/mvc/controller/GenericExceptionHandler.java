package org.spring.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GenericExceptionHandler {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = { NullPointerException.class })
	public String nullPointerHandle(Model model) {
		model.addAttribute("msg", "Null Pointer Exception Has Occered....");
		return "error";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = { NumberFormatException.class })
	public String numberFormatHandle(Model model) {
		model.addAttribute("msg", "Number Format Exception Has Occered....");
		return "error";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = { Exception.class })
	public String genricExceptionHandle(Model model) {
		model.addAttribute("msg", "Exception Has Occered....");
		return "error";
	}
	
}
