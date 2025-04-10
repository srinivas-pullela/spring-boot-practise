package com.sri.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sri.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{
}
