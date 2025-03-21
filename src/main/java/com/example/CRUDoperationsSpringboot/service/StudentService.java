package com.example.CRUDoperationsSpringboot.service;

import com.example.CRUDoperationsSpringboot.model.Student;
import com.example.CRUDoperationsSpringboot.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

    public Student getSrudentById(int rollno){
        return studentRepo.findById(rollno).get();
    }

    public Student updateStudentById(Student student){
        return studentRepo.save(student);
    }

    public void deleteStudentById(int rollno) {
        studentRepo.deleteById(rollno);
    }
}
