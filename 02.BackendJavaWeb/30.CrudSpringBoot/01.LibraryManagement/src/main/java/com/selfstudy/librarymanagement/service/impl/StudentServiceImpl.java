package com.selfstudy.librarymanagement.service.impl;

import com.selfstudy.librarymanagement.entity.Student;
import com.selfstudy.librarymanagement.repository.StudentRepository;
import com.selfstudy.librarymanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudents(){
       return (List<Student>)studentRepository.findAll();
    }

    @Override
    public List<Student> findStudent(String name){
        return studentRepository.findByFirstName(name);
    }

    @Override
    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    @Override
    public void removeStudent(int idStudent){
        studentRepository.deleteById(idStudent);
    }

    @Override
    public Optional<Student> findByIdStudent(int id){
        return studentRepository.findById(id);
    }
}
