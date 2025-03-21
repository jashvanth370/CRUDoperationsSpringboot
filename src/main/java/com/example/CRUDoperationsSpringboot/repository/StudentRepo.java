package com.example.CRUDoperationsSpringboot.repository;

import com.example.CRUDoperationsSpringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    public List<Student> findByGender(String gender);

    @Query(nativeQuery = true,
            value = "SELECT * FROM STUDENT WHERE gender =: gender AND stuName=:stuName")
            public List<Student> findByGenderAndStuname(
            @Param("gender") String gender,
            @Param("stuName") String stuName
    );
}
