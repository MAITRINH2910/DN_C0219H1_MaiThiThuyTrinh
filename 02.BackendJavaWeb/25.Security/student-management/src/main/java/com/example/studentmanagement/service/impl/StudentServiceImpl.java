package com.example.studentmanagement.service.impl;


import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllUser(){
        return studentRepository.findAll();
    }

    public List<Student> findByName(String firstName){
        return studentRepository.findByFirstName(firstName);
    }
}
