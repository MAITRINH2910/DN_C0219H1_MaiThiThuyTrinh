package com.test.hotelmanagement.service.impl;

import com.test.hotelmanagement.entity.Employee;
import com.test.hotelmanagement.repository.EmployeeRepository;
import com.test.hotelmanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAllEmployees(){
        return (List<Employee>)employeeRepository.findAll();
    }

    @Override
    public List<Employee> findEmployee (String fullName){
        return employeeRepository.findByFullNameContainingOrIdEmployeeContaining(fullName,fullName);
    }

    @Override
    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    @Override
    public void removeEmployee(Long id){
        employeeRepository.deleteById(id);
    }

    @Override
    public Optional<Employee> findByIdEmployee(Long id){
        return employeeRepository.findById(id);
    }
}
