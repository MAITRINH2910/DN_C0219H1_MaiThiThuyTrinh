package com.crudexample.demo.service;

import com.crudexample.demo.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllUser();

    List<Student> findByName(String firstName);
}
