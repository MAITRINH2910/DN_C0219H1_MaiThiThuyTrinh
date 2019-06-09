package com.selfstudy.librarymanagement.controller;

import com.selfstudy.librarymanagement.entity.Student;
import com.selfstudy.librarymanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String DisplayStudent(Model model) {
        List<Student> studentList = studentService.findAllStudents();
        model.addAttribute("students", studentList);
        return "display";
    }

    @GetMapping("/create-student")
    public String createNewStudent(Model model){
        model.addAttribute("student",new Student());
        return "create";
    }

    @PostMapping("/create-student")
    public String saveNewStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model, RedirectAttributes redirect ) {
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            studentService.saveStudent(student);
            redirect.addFlashAttribute("success", "Create new student successfully!!!");
            return "redirect:/";
        }
    }

    @PostMapping("/search-student")
    public String FindStudentByFirstName(@RequestParam("search") String seachFirstName, Model model) {
        List<Student> studentName = studentService.findStudent(seachFirstName);
        if (studentName.size() == 0) {
            return "error";
        } else {
            model.addAttribute("students", studentName);
            return "search";
       }
    }

    //    @GetMapping("/edit-student/{idStudent}")
//    public String EditStudent(@PathVariable int idStudent, Model model){
//        Optional<Student> student = studentService.findByIdStudent(idStudent);
//        model.addAttribute("students", student);
//        return "edit";
//    }
    @GetMapping("/edit-student/{id}")
    public String editStudent(@PathVariable int id, Model model) {
        //Cách 1
//         Optional<Student> studentEdit = studentService.findByIdStudent(id);
//        studentEdit.ifPresent(student ->model.addAttribute("student", student));
//        return "edit";
        //Cách 2
        model.addAttribute("student", studentService.findByIdStudent(id));
        return "edit";

//        //Cach 3
//        Optional<Student> student = studentService.findByIdStudent(id);
//        if (student != null) {
//        ModelAndView modelAndView = new ModelAndView("/edit");
//        modelAndView.addObject("student", student);
//        return modelAndView;
//        }else {
//        ModelAndView modelAndView = new ModelAndView("/error");
//        return modelAndView;
//        }
    }

    @PostMapping("/edit-student")
    public String saveStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, RedirectAttributes redirectAttributes){
            if(bindingResult.hasErrors()){
                return "edit";
            }
                studentService.saveStudent(student);
                redirectAttributes.addFlashAttribute("success","Student updated successfully!");
                return "redirect:/";

//        studentService.saveStudent(student);
//        ModelAndView modelAndView = new ModelAndView("/edit");
//        modelAndView.addObject("student", student);
//        modelAndView.addObject("message", "Customer updated successfully");
//        return modelAndView;

    }


    @GetMapping("/delete-student/{id}")
    public String showDeleteForm(@PathVariable int id, Model model){
        model.addAttribute("student", studentService.findByIdStudent(id));
        return "delete";
    }

    @PostMapping("/delete-student")
    public String deleteStudent(@ModelAttribute("student") Student student, RedirectAttributes redirectAttributes){
        studentService.removeStudent(student.getId());
        redirectAttributes.addFlashAttribute("success","Remove succesfully");
        return "redirect:/";
    }

}
