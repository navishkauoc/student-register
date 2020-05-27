package com.navishka.studentregister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navishka.studentregister.entities.StudentContact;

public interface StudentContactRepository extends JpaRepository<StudentContact, Long>{

}
