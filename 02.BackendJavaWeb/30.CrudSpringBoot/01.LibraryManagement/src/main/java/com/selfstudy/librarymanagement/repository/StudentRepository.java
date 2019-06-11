package com.selfstudy.librarymanagement.repository;

import com.selfstudy.librarymanagement.entity.Province;
import com.selfstudy.librarymanagement.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {
   // List<Student> findByFirstName(String name);

    Iterable<Student> findAllByProvince(Province province);

    Page<Student> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
