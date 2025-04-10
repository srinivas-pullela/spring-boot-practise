package com.sri.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	@GetMapping("/sayhello")
	public String sayHello()
	{
		return "This is my first spring boot project";
	}
}
