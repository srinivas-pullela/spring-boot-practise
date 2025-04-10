package com.sri.springboot.service;

import java.util.List;

import com.sri.springboot.entity.Employee;

public interface EmployeeService 
{
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee findById(long id);
	public List<Employee> findAll();
}
