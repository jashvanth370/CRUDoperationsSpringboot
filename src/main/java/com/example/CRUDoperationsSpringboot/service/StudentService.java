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
        List<Student> students = studentRepo.findAll();
        for(Student student:students){
            System.out.println(student.getStuName());
        }
        return students;
    }

    public void addStudent(Student student){
        studentRepo.save(student);
    }

    public Student getStudentById(int rollno){
        return studentRepo.findById(rollno).orElse(new Student());
    }


    public void updateStudentById(Student student){
        studentRepo.save(student);
    }

    public void deleteStudentById(int rollno) {
        studentRepo.deleteById(rollno);
    }

    public void deleteAllstudents() {
        studentRepo.deleteAll();
    }

    public List<Student> getStudentByGender(String gender) {
        return studentRepo.findByGender(gender);
    }

    public List<Student> getStudentByGenderAndstuName(String gender,String stuName) {
        return studentRepo.findByGenderAndStuname(gender,stuName);
    }
}
