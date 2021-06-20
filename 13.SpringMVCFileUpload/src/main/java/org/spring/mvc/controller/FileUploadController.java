package org.spring.mvc.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping(path = "/fileform")
	public String showForm() {
		
		return "file_form";
	}
	
	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("fileData") CommonsMultipartFile file, HttpSession session, Model model) {
		
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getName());
		System.out.println(file.getSize());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getClass());

		String realPath = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
				+ File.separator + "images" + File.separator + file.getOriginalFilename();
		
		System.out.println("RealPath----: "+realPath);
		
		byte[] data = file.getBytes();
		
		try {
			FileOutputStream stream = new FileOutputStream(realPath);
			stream.write(data);
			stream.close();
			System.out.println("File Uplpaded at location---: "+realPath);
			
			model.addAttribute("msg", "File uploaded successfully");
			model.addAttribute("filename", file.getOriginalFilename());
			
		} catch (Exception e) {
			model.addAttribute("msg", "Failed to uploade File");
			e.printStackTrace();
		}
		
		return "success";
	}
}
