package com.navishka.studentregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navishka.studentregister.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long>{

}
