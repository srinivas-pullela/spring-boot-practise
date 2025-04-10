package com.sri.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.sri.springboot.entity.Lecturer;
import com.sri.springboot.service.LecturerService;

@Controller
public class HomeController 
{
	@Autowired
	private LecturerService lecturerService;
	
	@GetMapping("/")
	public String insertlecturer(Model model)
	{
		Lecturer lecturer = new Lecturer();
		lecturer.setExp(15);
		lecturer.setDepartment("ME");
		lecturer.setDesignation("Professor");
		lecturer.setName("Sanju");
		Lecturer lect = lecturerService.saveLecturer(lecturer);
		String msg="Lecturer "+lect.getName()+" id "+lect.getId()+" is saved successfully";
		
		model.addAttribute("message", msg);
		model.addAttribute("lecturer", lect);
		
		return "home";
	}
}
