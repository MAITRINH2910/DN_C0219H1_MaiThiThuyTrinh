package com.example.studentmanagement.controller;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
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
        return "display";
    }

    @PostMapping("/search-student")
    public String SearchStudent(@RequestParam("search") String search, Model model){
        List<Student> students = studentService.findByName(search);
        model.addAttribute("students",students);
        return "display";
    }
}
