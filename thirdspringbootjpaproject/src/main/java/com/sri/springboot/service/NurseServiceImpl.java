package com.sri.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sri.springboot.entity.Nurse;
import com.sri.springboot.repository.NurseRepository;

@Service
public class NurseServiceImpl implements NurseService 
{
	@Autowired
	private NurseRepository nurseRepository;
	
	public Nurse saveNurse(Nurse nurse) 
	{
		return nurseRepository.save(nurse);
	}

	public Nurse updateNurse(Nurse nurse) 
	{
		return nurseRepository.save(nurse);
	}

	public void delete(Nurse nurse) 
	{
		nurseRepository.delete(nurse);
	}

	public Nurse findById(long id) 
	{
		return nurseRepository.findById(id).get();
	}

	public List<Nurse> findAll() 
	{
		return nurseRepository.findAll();
	}

}
