package com.test.hotelmanagement.repository;

import com.test.hotelmanagement.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    List<Employee> findByFullNameContainingOrIdEmployeeContaining(String fullName,String id);


}
