package com.sri.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sri.springboot.entity.Employee;
import com.sri.springboot.service.EmployeeService;

@Controller
public class HomeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String insertEmployee(Model model)
	{
		Employee employee = new Employee();
		employee.setName("Ranga");
		employee.setDesignation("Manager");
		employee.setDepartment("Accounts");
		employee.setExp(10);
		Employee emp = employeeService.saveEmployee(employee);
		String msg="Employee "+emp.getName()+" with id "+emp.getId()+" is saved successfully";
		model.addAttribute("employee", emp);
		model.addAttribute("message", msg);
		return "home";
	}
}
