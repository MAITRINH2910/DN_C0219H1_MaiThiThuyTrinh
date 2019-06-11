package com.selfstudy.librarymanagement.service;

import com.selfstudy.librarymanagement.entity.Province;
import com.selfstudy.librarymanagement.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    //List<Student> findAllStudents();
    Page<Student> findAllStudents(Pageable pageable);

     Optional<Student> findByIdStudent(int id);

    void saveStudent(Student student);

    void removeStudent(int idStudent);

    Iterable<Student> findAllByProvince(Province province);

   // List<Student> findStudent(String firstName);
    Page<Student> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
