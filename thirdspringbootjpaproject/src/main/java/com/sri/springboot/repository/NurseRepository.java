package com.sri.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sri.springboot.entity.Nurse;

public interface NurseRepository extends JpaRepository<Nurse, Long> 
{

}
