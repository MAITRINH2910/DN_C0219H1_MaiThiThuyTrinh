package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;

import java.util.List;


public interface StudentService {
    List<Student> getAllUser();

    List<Student> findByName(String firstName);
}
