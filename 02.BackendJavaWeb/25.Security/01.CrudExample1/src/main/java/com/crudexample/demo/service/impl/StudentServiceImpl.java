package com.crudexample.demo.service.impl;

import com.crudexample.demo.entity.Student;
import com.crudexample.demo.repository.StudentRepository;
import com.crudexample.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Email;
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
