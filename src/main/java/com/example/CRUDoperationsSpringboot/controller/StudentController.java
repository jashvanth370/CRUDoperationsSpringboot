package com.example.CRUDoperationsSpringboot.controller;

import com.example.CRUDoperationsSpringboot.model.Student;
import com.example.CRUDoperationsSpringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @PostMapping("/students/add")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return new ResponseEntity<>("Added....",HttpStatus.CREATED);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") int id){
        Student student= studentService.getStudentById(id);
        if(student==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    @PutMapping("students/update/{id}")
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudentById(student);
        return "Updated ....";
    }

    @DeleteMapping("students/delete/{id}")
    public String deleteStudentById(@PathVariable int id){
        studentService.deleteStudentById(id);
        return "Delete ......";
    }

    @DeleteMapping("students/deleteAll")
    public String deleteAllstudent(){
        studentService.deleteAllstudents();
        return "Delete All Students";
    }

    @GetMapping("students/gender/{gender}")
    public List<Student> getStudentbyGender(@PathVariable String gender){
        return studentService.getStudentByGender(gender);
    }

    @PostMapping("students/filter")
    public List<Student> getStudentsByGenderAndstuName(
            @Param("gender") String gender,
            @Param("stuName") String stuName){
        return studentService.getStudentByGenderAndstuName(gender, stuName);
    }
}
