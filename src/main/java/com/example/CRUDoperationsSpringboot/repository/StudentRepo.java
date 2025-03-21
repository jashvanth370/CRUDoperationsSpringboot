package com.example.CRUDoperationsSpringboot.repository;

import com.example.CRUDoperationsSpringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
