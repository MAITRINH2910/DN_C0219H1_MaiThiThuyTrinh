package com.crudexample.demo.controller;

import com.crudexample.demo.entity.Student;
import com.crudexample.demo.service.StudentService;
import com.crudexample.demo.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String DisplayStudents(Model model){
        model.addAttribute("students", studentService.getAllUser());
        return "show";
    }

    @PostMapping("/search-student")
    public String SearchStudent(@RequestParam("search") String search, Model model){
        List<Student> students = studentService.findByName(search);
        model.addAttribute("students",students);
        return "show";
    }
}
