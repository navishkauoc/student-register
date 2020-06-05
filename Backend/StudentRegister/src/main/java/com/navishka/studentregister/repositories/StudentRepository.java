package com.navishka.studentregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navishka.studentregister.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
