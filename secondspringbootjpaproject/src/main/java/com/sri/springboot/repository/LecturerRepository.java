package com.sri.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sri.springboot.entity.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Long> 
{

}
