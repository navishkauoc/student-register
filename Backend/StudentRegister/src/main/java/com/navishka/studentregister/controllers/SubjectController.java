package com.navishka.studentregister.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navishka.studentregister.entities.Subject;
import com.navishka.studentregister.repositories.SubjectRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
public class SubjectController {
	
	@Autowired
	SubjectRepository subjectRepository;
	
	@GetMapping("/subjects")
	public List<Subject> getSubjects(){
		return subjectRepository.findAll();
	}
	
	@GetMapping("/subjects/{id}")
	public Subject getSubject(@PathVariable Long id) {
		return subjectRepository.findById(id).get();
	}
	
	@PostMapping("/subject")
	public Subject createSubject(Subject subject) {
		return subjectRepository.save(subject);
	}
	
	@DeleteMapping("/subject/{id}")
	public boolean deleteSubject(@PathVariable Long id) {
		return true;
	}

}
