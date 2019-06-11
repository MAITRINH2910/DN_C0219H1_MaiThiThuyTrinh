package com.test.hotelmanagement.controller;

import com.test.hotelmanagement.entity.Employee;
import com.test.hotelmanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String DisplayEmployee(Model model) {
        List<Employee> employeeList = employeeService.findAllEmployees();
        model.addAttribute("employees", employeeList);
        return "display";
    }

    @GetMapping("/create-employee")
    public String createNewEmployee(Model model){
        model.addAttribute("employee",new Employee());
        return "create";
    }

    @PostMapping("/create-employee")
    public String saveNewEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult, Model model, RedirectAttributes redirect ) {
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            employeeService.saveEmployee(employee);
            redirect.addFlashAttribute("success", "Create new employee successfully!!!");
            return "redirect:/";
        }
    }

    @PostMapping("/search-employee")
    public String FindEmployeeByFullName(@RequestParam("search") String seach, Model model) {
        List<Employee> employee = employeeService.findEmployee(seach);
        if (employee.size() == 0) {
            return "error";
        } else {
            model.addAttribute("employees", employee);
            return "search";
        }
    }

    @GetMapping("/edit-employee/{id}")
    public String editEmployee(@PathVariable Long id, Model model) {
        model.addAttribute("employee", employeeService.findByIdEmployee(id));
        return "edit";
    }

    @PostMapping("/edit-employee")
    public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "edit";
        }
        employeeService.saveEmployee(employee);
        redirectAttributes.addFlashAttribute("success", "Student updated successfully!");
        return "redirect:/";
    }

    @GetMapping("/delete-employee/{id}")
    public String showDeleteForm(@PathVariable Long id, Model model){
        model.addAttribute("employee", employeeService.findByIdEmployee(id));
        return "delete";
    }

    @PostMapping("/delete-employee")
    public String deleteEmployee(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes){
        employeeService.removeEmployee(employee.getId());
        redirectAttributes.addFlashAttribute("success","Remove successfully!");
        return "redirect:/";
    }

}
