package com.sri.springboot.service;

import java.util.List;

import com.sri.springboot.entity.Nurse;

public interface NurseService 
{
	public Nurse saveNurse(Nurse nurse);
	public Nurse updateNurse(Nurse nurse);
	public void delete(Nurse nurse);
	public Nurse findById(long id);
	public List<Nurse> findAll();
}
