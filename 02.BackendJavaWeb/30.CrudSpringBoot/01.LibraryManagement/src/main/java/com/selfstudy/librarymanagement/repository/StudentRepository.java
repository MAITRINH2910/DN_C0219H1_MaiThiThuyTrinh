package com.selfstudy.librarymanagement.repository;

import com.selfstudy.librarymanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    List<Student> findByFirstName(String name);
}
