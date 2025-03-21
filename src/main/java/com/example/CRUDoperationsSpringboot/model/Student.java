package com.example.CRUDoperationsSpringboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Student_Details")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String stuName;

    private String gender;

    private String email;
    public Student(String stuName, String gender, String email) {
        this.stuName = stuName;
        this.gender = gender;
        this.email = email;
    }
}
