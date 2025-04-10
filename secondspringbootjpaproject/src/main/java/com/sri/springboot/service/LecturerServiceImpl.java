package com.sri.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sri.springboot.entity.Lecturer;
import com.sri.springboot.repository.LecturerRepository;

@Service
public class LecturerServiceImpl implements LecturerService 
{
	@Autowired
	private LecturerRepository lecturerRepository;
	
	public Lecturer saveLecturer(Lecturer lecturer) 
	{
		return lecturerRepository.save(lecturer);
	}

	public Lecturer updateLecturer(Lecturer lecturer) 
	{
		return lecturerRepository.save(lecturer);
	}

	public void deleteLecturer(Lecturer lecturer) 
	{
		lecturerRepository.delete(lecturer);
	}

	public List<Lecturer> findAll() 
	{
		return lecturerRepository.findAll();
	}

	public Lecturer findById(long id) 
	{
		return lecturerRepository.findById(id).get();
	}

}
