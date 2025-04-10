package com.sri.springboot.service;

import java.util.List;

import com.sri.springboot.entity.Lecturer;

public interface LecturerService 
{
	public Lecturer saveLecturer(Lecturer lecturer);
	public Lecturer updateLecturer(Lecturer lecturer);
	public void deleteLecturer(Lecturer lecturer);
	public Lecturer findById(long id);
	public List<Lecturer> findAll();
}
