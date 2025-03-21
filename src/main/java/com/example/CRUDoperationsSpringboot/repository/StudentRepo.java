package com.example.CRUDoperationsSpringboot.repository;

import com.example.CRUDoperationsSpringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    public List<Student> findByGender(String gender);
}
