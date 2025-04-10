package com.sri.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.springboot.entity.Employee;
import com.sri.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//Implemented code
	public Employee saveEmployee(Employee employee) 
	{
		return employeeRepository.save(employee);
	}
	
	public Employee updateEmployee(Employee employee) 
	{
		return employeeRepository.save(employee);
	}

	public void deleteEmployee(Employee employee) 
	{
		employeeRepository.delete(employee);
	}
	
	public Employee findById(long id) 
	{
		return employeeRepository.findById(id).get();
	}

	public List<Employee> findAll() 
	{
		return employeeRepository.findAll();
	}

}
