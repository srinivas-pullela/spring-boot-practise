package com.sri.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.sri.springboot.entity.Nurse;
import com.sri.springboot.service.NurseService;

@Controller
public class HomeController 
{
	@Autowired
	private NurseService nurseService;
	
	@GetMapping("/")
	public String insertNurse(Model model)
	{
		Nurse nurse = new Nurse();
		nurse.setName("Sahil");
		nurse.setAddress("Hyderabad");
		nurse.setContact("222334555666");
		nurse.setExp(11);
		Nurse nur = nurseService.saveNurse(nurse);
		String msg="Nurse "+nur.getName()+" id "+nur.getId()+" is saved successfully";
		model.addAttribute("message", msg);
		model.addAttribute("nurse", nur);
		return "home";
	}
}
