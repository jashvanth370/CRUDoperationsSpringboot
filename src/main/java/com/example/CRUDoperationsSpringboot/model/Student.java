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
    @Column(name = "Roll_Number")
    private int rollno;

    @Column(name = "Student_Name")
    private String stuName;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Email")
    private String email;


}
