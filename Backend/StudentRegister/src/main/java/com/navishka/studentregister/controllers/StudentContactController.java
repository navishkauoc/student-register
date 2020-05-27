package com.navishka.studentregister.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navishka.studentregister.entities.StudentContact;
import com.navishka.studentregister.repositories.StudentContactRepository;

@RestController
public class StudentContactController {
	
	@Autowired
	StudentContactRepository studentContactRepository;
	
	@GetMapping("/studentcontacts")
	public List<StudentContact> getStudentContacts() {
		return studentContactRepository.findAll();
	}
	
	@GetMapping("/studentcontacts/{id}")
	public StudentContact getStudentContact(@PathVariable Long id) {
		return studentContactRepository.findById(id).get();
	}
	
	@PostMapping("/studentcontact")
	public StudentContact creatStudentContact(StudentContact studentContact) {
		return studentContactRepository.save(studentContact);
	}
	
	@DeleteMapping("/studentcontact/{id}")
	public boolean deleteStudentContact(@PathVariable Long id) {
		return true;
	}

}
