package com.selfstudy.librarymanagement.service.impl;

import com.selfstudy.librarymanagement.entity.Province;
import com.selfstudy.librarymanagement.entity.Student;
import com.selfstudy.librarymanagement.repository.StudentRepository;
import com.selfstudy.librarymanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

   /* @Override
    public List<Student> findAllStudents(){
       return (List<Student>)studentRepository.findAll();
    }*/

   @Override
   public Page<Student> findAllStudents(Pageable pageable){
       return studentRepository.findAll(pageable);
   }

   /*@Override
    public List<Student> findStudent(String name){
        return studentRepository.findByFirstName(name);
    }*/

    @Override
    public Page<Student> findAllByFirstNameContaining(String firstname, Pageable pageable) {
        return studentRepository.findAllByFirstNameContaining(firstname, pageable);
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

    @Override
    public Iterable<Student> findAllByProvince(Province province) {
        return studentRepository.findAllByProvince(province);
    }
}
