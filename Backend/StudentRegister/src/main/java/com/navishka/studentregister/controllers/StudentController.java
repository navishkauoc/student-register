package com.navishka.studentregister.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navishka.studentregister.entities.Student;
import com.navishka.studentregister.repositories.StudentRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return studentRepository.findAll();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable Long id) {
		return studentRepository.findById(id).get();
	}
	
	@PostMapping("/student")
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	@DeleteMapping("/student/{id}")
	public boolean deleteStudent(@PathVariable Long id) {
		return true;
	}

}
