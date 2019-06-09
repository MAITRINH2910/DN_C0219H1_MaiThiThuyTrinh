package com.selfstudy.librarymanagement.service;

import com.selfstudy.librarymanagement.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> findAllStudents();

    List<Student> findStudent(String firstName);

     Optional<Student> findByIdStudent(int id);

    void saveStudent(Student student);

    void removeStudent(int idStudent);
}
