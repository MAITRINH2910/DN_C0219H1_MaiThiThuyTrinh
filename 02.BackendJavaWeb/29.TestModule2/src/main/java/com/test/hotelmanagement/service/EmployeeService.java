package com.test.hotelmanagement.service;

import com.test.hotelmanagement.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAllEmployees();

    List<Employee> findEmployee(String fullName);

    Optional<Employee> findByIdEmployee(Long id);

    void saveEmployee(Employee employee);

    void removeEmployee(Long id);
}
